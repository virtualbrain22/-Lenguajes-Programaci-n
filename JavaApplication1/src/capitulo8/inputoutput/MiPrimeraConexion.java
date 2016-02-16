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
        HttpURLConnection    con=(HttpURLConnection)  url.openConnection();
        InputStream input=con.getInputStream(); // si quisieramos mandar informacion a google seria "outpu"
        InputStreamReader isr=new InputStreamReader(input);
        BufferedReader reader=new BufferedReader(isr);//se hace en encadameiento del metodo anterior , el buffer va leyendo renglon por renglon 
     
        int renglones=0;
        while(reader.readLine()!=null){    //el while le renglon por renglo y debe ser distinto de nulo si es igual a nulo te lansa el numero de renglones
        renglones ++;
        
        if(renglones==90||renglones==100){  // este if imprime los renglones que quieres ver de la pagina web
            System.out.println(reader.readLine());// para ver los renglones que lee 
        
        }
    
    }
    
}
}