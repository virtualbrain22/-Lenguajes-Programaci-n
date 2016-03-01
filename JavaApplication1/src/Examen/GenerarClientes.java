/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author T-101
 */
public class GenerarClientes {
    // metodo  cliente es el tipo de retorno si no es void y el obtener cliente es el metodo con parentesis 
   public static Cliente [] obtenerClientes(){
       
     Cliente clientes[]=new Cliente [3];
     
    clientes[0]=new Cliente("Ana", "Lopez", 20, 22000, new Direccion("sur 10", 20, "Ecatepunk"));
    clientes[1]=new Cliente("pedro", "Lopez", 20, 22000, new Direccion("sur 10", 122, "neza"));
    clientes[2]=new Cliente("laura", "Lopez", 20, 22000, new Direccion("sur 10", 43, "coacalco"));
    
    // ajustar los nombres
   // clientes[0].setNombre("ana");
    
    
   // Direccion d1=new Direccion( );  
             // d1.setCalle("sur11");
             // d1.setNumero(20);
    
    
    
   return clientes;
   }

    
    
}
