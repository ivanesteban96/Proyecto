/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    
    private static List<Usuario> listaUsuarios=new ArrayList<>();
    
    public static void añadirUsuario(Usuario usuario)
    {
        listaUsuarios.add(usuario);                    //AÑADE A LA LISTAEJERCICIOS UN OBJETO DE TIPO EJERCICIO
    }

    public static List<Usuario> getListaUsuarios() {   //NOS DEVUELVE LA CLASE LISTAEJERCICIOS
        return listaUsuarios;
    }

    public int size() {
        return listaUsuarios.size();
    }

    public boolean isEmpty() {
        return listaUsuarios.isEmpty();
    }

    public Usuario get(int index) {
        return listaUsuarios.get(index);
    }
    
   
    
    
 
}
