/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ekb.production.State;

import fr.ekb.production.State.AbstractState;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdoulaziz
 */
public class StateEnAttenteAval implements AbstractState {
    public void messageOperateur()
    {
    System.out.println("conteneur en cours de remplissage");
    }
    public void  messageShuttleManager()
    {
     System.out.println("et bim");
    }
     public AbstractState etatSuivant()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) 
        {
            Logger.getLogger(StateVide.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new StateVersPosteAmont();
    }
}
