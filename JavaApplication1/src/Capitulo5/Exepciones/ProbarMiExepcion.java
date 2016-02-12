/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5.Exepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMiExepcion {
    public static void main(String[] args)  {
        try {
            Cliente c=new Cliente();
           c.setEdad(-19);
        } catch (ValorNoNegativoException ex) {
            System.out.println(ex.getMessage());
        }catch(MenorDeEdadException e ){
            System.out.println(e.getMessage());
        }
            finally{
        
            System.out.println("este se ejecuta se lane o no la e ");
        }
        
    }
}
