/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ekb.communication.shuttle;

import fr.ekb.communication.AbstractComShuttleManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author abdoulaziz
 */
public class ComShuttleManager implements AbstractComShuttleManager
{
    private static AbstractComShuttleManager instance=null;
    private Socket socket;
    BufferedReader in;
    PrintWriter out;
    
    public static AbstractComShuttleManager getInstance() throws IOException
    {
        if(ComShuttleManager.instance!=null)
        {
            ComShuttleManager.instance=new ComShuttleManager();
        }
        return ComShuttleManager.instance;
    }
    
   public ComShuttleManager() throws IOException
   {
       socket=new Socket("prod1.p3.teleragno.fr",2222);
       BufferedReader tmp_entree = null;
        PrintWriter tmp_sortie = null;
         try 
         {
            tmp_entree = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            tmp_sortie = new PrintWriter(this.socket.getOutputStream());
         } 
         catch (IOException e) 
         {
            System.err.println("PB création des streams");
            if (tmp_entree != null)
            {
                tmp_entree.close();
            }
            if (tmp_sortie != null) 
            {
                tmp_sortie.close();
            }
        }
    }
   
    @Override
   public String read() {
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
    @Override
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
   
    public void ajouterStation(String message)
   {
       message="MANAGER ADD STATION prod1.p3.teleragno.fr 27016 1 M1";
       write(message);
   }
    
  
    @Override
    public void demandeAppelNavette() 
    {
        String message= "MANAGER WRITE_GROUP_SHUTTLE M1 1";
        
    }
    
}
