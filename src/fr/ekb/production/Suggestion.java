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
public class Suggestion {
    public  Planning suggererProduction(ArrayPlanning listPlanning)
    {
        ArrayPlanning t=new ArrayPlanning();
        ArrayPlanning j=new ArrayPlanning();
        while(true)
        {
            for(Planning planning:listPlanning.getList())
            {
                if(planning.getNbKanban()>=planning.getIndexRouge())
                {
                    t.ajouterPlanning(planning);
                }
                else if(planning.getNbKanban()<planning.getIndexRouge()) 
                {
                    j.ajouterPlanning(planning);
                }
            }
            if(!t.getList().isEmpty())
            {
                return chercherPlusCritique(t);
            }
            else if(!j.getList().isEmpty())
            {
                return chercherPlusCritique(j);
            }
        }
    }
   
    
    private Planning chercherPlusCritique(ArrayPlanning listPlanning)
    {
        Planning critique;
        critique=listPlanning.getList().get(0);
        for(Planning planning :listPlanning.getList())
        {
            if((critique.getIndexBleu()-critique.getNbKanban())>(planning.getIndexBleu()-planning.getNbKanban()))
            {
                critique=planning;
            }
            else if((critique.getIndexBleu()-critique.getNbKanban())==(planning.getIndexBleu()-planning.getNbKanban()))
            {
                if(critique.getDureeProduction()>planning.getDureeProduction())
                {
                    critique=planning;
                }
            }
        }
        return critique;
    }
}