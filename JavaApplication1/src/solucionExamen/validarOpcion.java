/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionExamen;

/**
 *
 * @author T-101
 */
public class validarOpcion {
 
 public void validar(opcion [] opciones)throws SoloUnaCorrectaException {
  int soloUna=0;
  for(opcion o:opciones){

if(o.isEstatus ()){
soloUna++;

if(soloUna>1)throw new SoloUnaCorrectaException(); 
}

}
 
    }
}
