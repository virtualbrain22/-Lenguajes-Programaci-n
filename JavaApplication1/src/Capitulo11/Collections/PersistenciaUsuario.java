/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author T-101
 */
public class PersistenciaUsuario {
    ArrayList<Usuario>usuarios ;
    // primero ponemos el metodo de buscar todos

    public PersistenciaUsuario() {
    usuarios=new ArrayList<>();
    
    }
    
    ArrayList<Usuario> buscarTodos()throws Exception {
    
        //paso 1: leemos el archivo donde esta guardado el arraylist
        File f=new File("archivaldo.raton");
        // leemos el contenido
         FileInputStream fis=new FileInputStream(f);
         // descomprimimos el contenido 
         ObjectInputStream ois=new ObjectInputStream(fis);
    usuarios=(ArrayList<Usuario>)ois.readObject();
   
        return usuarios;
    }
    
    public void guardar(Usuario u)throws Exception{
    File f=new File ("archivaldo.raton");
    if(f.exists())usuarios=buscarTodos();
    FileOutputStream fos=new FileOutputStream(f);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    usuarios.add(u);
    oos.writeObject(usuarios);
    }
    
}
