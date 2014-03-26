/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ekb.production.State;

/**
 *
 * @author abdoulaziz
 */
public interface AbstractState {
    
    public void messageOperateur();
    public void messageShuttleManager();
    public AbstractState etatSuivant();
}

    
