/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;

import  java.net.*;
import  java.io.*;

public class MiPrimeraConexion {
    public static void main(String[] args)throws  Exception{
        //primero vamos a usar una clase que se llama URL 
        URL url = new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection    con=(HttpURLConnection)  url.openConnection();// protocolo para conectarte
        InputStream input=con.getInputStream(); // etra la infofacion de google,si quisieramos mandar informacion a google seria "outpu"
        
        InputStreamReader isr=new InputStreamReader(input);///lees la informacion q entro 
        BufferedReader reader=new BufferedReader(isr);//se hace en encadameiento del metodo anterior , el buffer va leyendo renglon por renglon 
     
        String lineaActual="No ha leido nada";
        boolean encontrado=false;
        int miLinea=0;
        
        while((lineaActual=reader.readLine())!=null){   
//el read line te rgresa el un string ocea el renglon             
//el while le renglon por renglo y debe ser distinto de nulo si es igual a nulo te lansa el numero de renglones
        if(encontrado && miLinea<=0){
            //vamos a despedazar la linea
            // el indexof empiesa a contar el renglon hasta q aparesca el simbolo q buscas
            int indice =lineaActual.indexOf(">");
            int indice2= lineaActual.indexOf("</");
            
            String tempActual=lineaActual.substring(indice+1,indice2);
            
            System.out.println(tempActual);
            miLinea++;
        }
            
    if(lineaActual.contains("Outside Temp")){
    
        encontrado=true;
        
        System.out.println("dato encontrado ");
        
    }
    
        }
    
        
        
}
}