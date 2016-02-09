/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo5.Exepciones;

/**
 *
 * @author T-101
 */
public class Cliente {
    private String email;
    private int edad ;

    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }

  
    

    /**
     * este metodo nos regresa el email ya que previamente
     * se debio haber proporcionado por el metodo set correspondiente
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * este metodo necesita que proporciones un string 
     * que va hacer el email que le vas asignar al cliente
     * @param email aqui debes de poner el string correpondientre al emailk
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoException {
        ValidarEdad validar=new ValidarEdad();
        validar.checarEdadNegativa(edad);
        this.edad = edad;
    }
    
    
}
