/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ekb.communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdoulaziz
 */
public class CommunicationClientServer {
    BufferedReader in;
    PrintWriter out;
    Socket socket=null;
    boolean onContinue = true;
    
     public CommunicationClientServer(Socket socket) throws IOException {
        this.socket = socket;

        BufferedReader tmp_entree = null;
        PrintWriter tmp_sortie = null;

        try {
            tmp_entree = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            tmp_sortie = new PrintWriter(this.socket.getOutputStream());
        } catch (IOException e) {
            System.err.println("PB création des streams");
            if (tmp_entree != null) {
                tmp_entree.close();
            }
            if (tmp_sortie != null) {
                tmp_sortie.close();
            }
            throw e;
        }

        in = tmp_entree;
        out = tmp_sortie;
    }
     
    public static CommunicationClientServer Factory(String hostName, int portNumber)
            throws
            IOException {

        CommunicationClientServer communicationClientServer;
        try {
            InetAddress adresseIP = InetAddress.getByName(hostName);
            Socket clientSocket = new Socket(adresseIP, portNumber);
            clientSocket.setTcpNoDelay(true);
            clientSocket.setKeepAlive(false);
//            clientSocket.setSendBufferSize(0);
            clientSocket.setSoTimeout(1000);
            communicationClientServer = new CommunicationClientServer(clientSocket);
        } catch (UnknownHostException e) {
            System.err.println("Server is unknown: " + hostName);
            throw e;
        } catch (SocketException e) {
            System.err.println("Connexion error / timeout");
            throw e;
        } catch (IOException e) {
            System.err.println("Connexion problem with: " + hostName);
            throw e;
        }
        System.out.println("Connexion OK with: " + hostName);

        return communicationClientServer;
    }
    String read() {
        String ligne = null;
        try {
            ligne = in.readLine();
        } catch (IOException e) {
//            System.err.println("rien a lire");
        }
        return ligne;
    }
    /**
     * Envoie des données au socket.
     *
     * @param ligne les caractères à envoyer
     */
     public void write(String ligne) {
        if (out == null) {
            System.err.println("pas de sortie !!! : écrire ?");
        } else {
            out.print(ligne);
            out.print("\r");
            out.print("\n");
            out.flush();
        }
        
    }
     public void fermer() {
        // il faut fermer "proprement" les stream avant les Sockets
        onContinue = false;
        try {
            in.close();
            out.close();
            if (socket != null) {
                socket.close();
            }
//			System.out.println("Fermeture ok");
        } catch (IOException e) {
//			System.err.println("Erreur à la fermeture des flux!");
        }
    }
    protected void finalize() {
        try {
            super.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(CommunicationClientServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        // méthode executee par le ramasse miettes avant de libérer la mémoire
        // pb : on ne sait jamais trop quand !!!
        fermer();
    }
    
}
