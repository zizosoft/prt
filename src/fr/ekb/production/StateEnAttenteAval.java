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
public class StateEnAttenteAval extends AbstractState {
    public void messageOperateur()
    {
    System.out.println("conteneur en cours de remplissage");
    }
    void messageShuttleManager()
    {
     System.out.println("et bim");
    }
     AbstractState etatSuivant()
 {
     return null;
 }
}
