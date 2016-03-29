/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;
import java.util.*;
import javax.swing.JRadioButton;
public class GeneradorPreguntas {
    
public static ArrayList<Pregunta>obtenerTodasLasPeguntas(){
    //Vamos a craer una sola pregunta con tres opciones
    Opcion o1=new Opcion("Moscu", true);
    Opcion o2=new Opcion("Florencia",false);
    Opcion o3=new Opcion("Paris",false);
    Opcion o4=new Opcion("Londres",false);
    
    Opcion o1p2=new Opcion("Tokio",false);
    Opcion o2p2=new Opcion("Beiging",true);
    Opcion o3p2=new Opcion("Seul",false);
    Opcion o4p2=new Opcion("Pyongiang",false);
    
    
    ArrayList<Opcion> opciones=new ArrayList<Opcion>();
    opciones.add(o1);
    opciones.add(o2);
    opciones.add(o3);
     opciones.add(o4);
    
    ArrayList<Opcion> opcionesp2=new ArrayList<Opcion>();
    opcionesp2.add(o1p2);
    opcionesp2.add(o2p2);
    opcionesp2.add(o3p2);
    opcionesp2.add(o4p2);
    
    
    
      Pregunta p1=new Pregunta("Capital de Rusia", opciones);
      Pregunta p2=new Pregunta("Capital de China", opcionesp2);
      
      ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
      preguntas.add(p1);
      preguntas.add(p2);
      
      return preguntas;
      
    }
/**
 * 
 * @param p Proporciona el numero de la pregunta, inicia en cero
 * @param radios proporciona el arreglos de las opciones
 * @return  regresa la respuesta true es correcta false es incorrecta
 */
public static boolean checarRespuesta(Pregunta p, 
        JRadioButton[] radios){
    boolean respuesta=false;
     String seleccion="";
     for(JRadioButton radio:radios){
         if(radio.isSelected()){
           seleccion=  radio.getText();
         }
     }
     
    for(Opcion o:p.getOpciones()){
       if(o.isEstatus()){
           if(o.getTitulo().equals(seleccion))respuesta=true;
       }
    }
    return respuesta;
    
}
    
}
