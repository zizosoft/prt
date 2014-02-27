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
public class Container {
    String IDContainer;
    String nomproduit;
    String posteAmont;
    String posteAval;
    AbstractState etat;
    Container(String IDContainer, String nomproduit, String posteAmont, String posteAval, AbstractState etat)
    {
        this.IDContainer=IDContainer;
        this.nomproduit=nomproduit;
        this.posteAmont=posteAmont;
        this.posteAval=posteAval;
        this.etat=etat;    
    }
    String getIDContainer()
    {
        return IDContainer;
    }
           
    String getNomProduit()
    {
        return nomproduit;
    }
    String getPosteAmont()
    {
        return posteAmont;
    }
    String getPosteAval ()
    {
        return posteAval;
    }
    AbstractState getEtat()
    {
        return etat;
    }
}
