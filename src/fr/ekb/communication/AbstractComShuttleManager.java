/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ekb.communication;

/**
 *
 * @author abdoulaziz
 */
public interface AbstractComShuttleManager 
{
   void demandeAppelNavette();
   public String read();
   public void write(String ligne);
    
}
