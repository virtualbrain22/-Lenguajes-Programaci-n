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
public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        
        
        //declaramos un arreglo entero
        //para inicializarlo hay dos formas
        //inicializamos el de x forma explicita
        
        int x[]={1,34,6,8};
        // esta es implicita
    
        float[]y=new float[4];
        float z;
        //tyodos los arreglos son tratados por el compilador
        //como objetos 
        
        System.out.println(x[4]);
        
        A objeto=new A();
        System.out.println(objeto.m);
        System.out.println(y[2]);
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
        
        //El ciclo for para X pero mejorado
        for(int w:x){
            System.out.println(w);
        }
        
        
        
        
        
        
        
        
        
    }
}
class A{
    float m;
}