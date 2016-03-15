/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;

/**
 *
 * @author T-101
 */
import java.util.*;
public class GeneradorPreguntas {

  public static ArrayList<Pregunta> obtenerTodasLasPreguntas(){
    // vamos a crear una solo pregunta con 3 opciones
      Opcion o1=new Opcion ("Moscu",true);
      Opcion o2=new Opcion ("floremncia",false);
      Opcion o3=new Opcion ("paris",false);
      Opcion o4=new Opcion ("Mexico",false);
  
      Opcion op1=new Opcion ("toki0o",false);
      Opcion op2=new Opcion ("bejin",true);
      Opcion op3=new Opcion ("seul",false);
      Opcion op4=new Opcion ("toki0o",false);
      
      ArrayList<Opcion> opciones=new ArrayList<Opcion>();
      opciones.add(o1);
      opciones.add(o2);
      opciones.add(o3);
      opciones.add(o4);
      
      Pregunta p1=new Pregunta("Capital de rusia ", opciones );
    
      ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
      preguntas.add(p1);
      
      return preguntas;
    }
}
