/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.controller;
import poo.muni.ui.AltaUsuario;
import poo.muni.controller.gestorDeEmpleo;
/**
 *
 * @author oficina2
 */
public class MuniAdministracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      try{
          new gestorDeEmpleo().run();
      }catch(Exception e){
      
      }
        
    
       
    }
    
}
