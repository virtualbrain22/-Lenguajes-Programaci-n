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
public class ProbarMisThreads {
    public static void main(String[] args) {
        //ciclo de vida del thread sin contar pausa
        //1.creado
        MiPrimerThread t1=new MiPrimerThread();
        //opcionalmete lo bautizamos
        t1.setName("chana");
        //2.inicializado
        t1.start();
        
        //3. En ejecucio (cuando corras este programa!!! y se
        //active su metodo run
        
        //5. Muerte: cuando complete la tarea que tiene
        //el codigo del metodo run
    }
}
