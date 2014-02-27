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
public class Planning {
    int indexBleu;
    int indexRouge;
    int indexVert;
    int nbKanban;
    Planning(int indexBleu, int indexRouge, int indexVert,int nbKanban )
    {
        this.indexBleu=indexBleu;
        this.indexRouge=indexRouge;
        this.indexVert=indexVert;
        this.nbKanban=nbKanban;
    }
    
    
    
}
