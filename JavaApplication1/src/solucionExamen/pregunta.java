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
public class pregunta {
    
    
    private String titulo;
    private opcion opciones[];

    public pregunta(String titulo, opcion[] opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    pregunta(String capital_de_rusia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public opcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(opcion[] opciones) {
        this.opciones = opciones;
    }
}
