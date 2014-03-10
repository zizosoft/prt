/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ekb.production;

import java.util.logging.Logger;

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

    public int getIndexBleu() {
        return indexBleu;
    }
    

    public int getIndexRouge() {
        return indexRouge;
    }

    public int getIndexVert() {
        return indexVert;
    }

    public int getNbKanban() {
        return nbKanban;
    }

    public void setIndexBleu(int indexBleu) {
        this.indexBleu = indexBleu;
    }

    public void setIndexRouge(int indexRouge) {
        this.indexRouge = indexRouge;
    }

    public void setIndexVert(int indexVert) {
        this.indexVert = indexVert;
    }

    public void setNbKanban(int nbKanban) {
        this.nbKanban = nbKanban;
    }
    
    
    
}
