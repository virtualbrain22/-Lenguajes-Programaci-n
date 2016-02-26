/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads implements Runnable {
    public static void main(String[] args) {
        //ciclo de vida del thread sin contar pausa
        //1.creado
        MiPrimerThread t1=new MiPrimerThread();
        //otro thread
        Runnable r=new ProbarMisThreads();
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        
// el thread t2 tiene q hacer quw se impriman del 1 al 10
        // de 5 segundos entre impresion
        // el Thread t3 tiene q hacer q se imprima 
        // la frase "todos vamos a morir!!"hasta el final de los tiempos
        // cada segundo
//opcionalmete lo bautizamos
        t1.setName("chana");
        t2.setName("juana");
        t3.setName("pedro");
        //2.inicializado
        t1.start();
        t2.start();
        t3.start();
        //3. En ejecucio (cuando corras este programa!!! y se
        //active su metodo run
        
        //5. Muerte: cuando complete la tarea que tiene
        //el codigo del metodo run
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // primero preguntamos si es el thread t2 y si es que imprima del 1 al 10
        if(Thread.currentThread().getName().equals("juana")){
    int x=1;
    for(int i=0 ; i<30;i++){
    System.out.println(x++);
    
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }if(Thread.currentThread().getName().equals("pedro")){
    
     while(true){
     
         System.out.println("todos vamos a morir");
         try {
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
             Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    }
    
    }
}
