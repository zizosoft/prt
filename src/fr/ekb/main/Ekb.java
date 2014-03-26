/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ekb.main;

import fr.ekb.production.State.StateVide;
import fr.ekb.production.State.AbstractState;
import fr.ekb.production.Container;
import fr.ekb.production.*;

/**
 *
 * @author abdoulaziz
 */
public class Ekb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractState etat=new StateVide();
        Container container;
        container = new Container("test","produit","poste1","poste2",etat);
       // container.run();
        
    }
    
}
