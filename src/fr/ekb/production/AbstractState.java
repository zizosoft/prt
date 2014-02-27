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
public abstract class AbstractState {
    AbstractState(){};
    abstract void messageOperateur();
    abstract void messageShuttleManager();
    abstract AbstractState etatSuivant();
}

    
