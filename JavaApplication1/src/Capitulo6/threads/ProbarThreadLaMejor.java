/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.threads;

/**
 *
 * @author T-101
 */
public class ProbarThreadLaMejor {
    //esta es la forma No.3 LA MEJOR!!!!!
    public static void main(String[] args) {
                          //|desde aqui es la clase anonima        
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
                int x=1;
            for(int i=0;i<30;i++){
               System.out.println(x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
            
        });
      //|hasta aquie es la clase anonima
        Thread t3=new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                System.out.println("Todos vamos a moriiiirrrrrr!!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
            
        });
        t2.start();
        t3.start();
    }
}