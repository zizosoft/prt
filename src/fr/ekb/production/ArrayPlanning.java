/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ekb.production;

import fr.ekb.Observer.Observable;
import fr.ekb.Observer.Observer;
import java.util.ArrayList;

/**
 *
 * @author abdoulaziz
 */
public class ArrayPlanning implements Observable,Observer{

    private ArrayList<Planning> list;
    
    @Override
    public void addObserver(Observer obs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void ajouterPlanning(Planning planning)
    {
        list.add(planning);
    }
    public boolean retirerPlanning(Planning planning)
    {
        boolean b;
        b=false;
        if(list.remove(planning))
            return b=true;
        return b;
    }
    
}
