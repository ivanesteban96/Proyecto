
package ejercicios;

import ejercicios.Ejercicio;
import java.util.ArrayList;
import java.util.List;

public class ListaEjercicios {
    
    private static List<Ejercicio> listaEjercicios=new ArrayList<>();
    
    public static void añadirCliente(Ejercicio ejercicio)
    {
        listaEjercicios.add(ejercicio);                    //AÑADE A LA LISTAEJERCICIOS UN OBJETO DE TIPO EJERCICIO
    }
    
    public static void reiniciarLista()
    {
       listaEjercicios.clear();                            //LIMPIA EL CONTENIDO DE LA LISTA
    }

    public static List<Ejercicio> getListaEjercicios() {   //NOS DEVUELVE LA CLASE LISTAEJERCICIOS
        return listaEjercicios;
    }
}
