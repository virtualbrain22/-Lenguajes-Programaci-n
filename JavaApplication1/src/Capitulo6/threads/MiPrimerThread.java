/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.threads;

/**
 *
 * @author T-101
 *Creacion de un Thread heredadando la clase Thread
 */
public class MiPrimerThread extends Thread{

    @Override
    public void run() {
        System.out.println("soy un thread y me llamo" +this.getName());
      
    }
    
    
}
