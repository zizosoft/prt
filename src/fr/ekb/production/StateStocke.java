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
public class StateStocke extends AbstractState{
    public void messageOperateur()
    {
    System.out.println("conteneur stocké");
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
    

