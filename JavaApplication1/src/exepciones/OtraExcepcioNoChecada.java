/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

/**
 *
 * @author T-101
 */
public class OtraExcepcioNoChecada {
    public static void main(String[] args) {
        String numero="ocho";
        int numeroBien=Integer.parseInt(numero);
        
        System.err.println(numeroBien);
    }
}
