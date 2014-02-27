/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ekb.production;

/**
 *
 * @author abdoulaziz
 */
public class StateVersPosteAval extends AbstractState{
    public void messageOperateur()
    {
    System.out.println("conteneur en d'envoi vers le poste aval");
    }
    void messageShuttleManager()
    {
     System.out.println("");
    }
     AbstractState etatSuivant()
 {
     return null;
 }
    
}
