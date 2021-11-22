
package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaEjercicios2 {
    
    private static List<Ejercicio> listaEjercicios2=new ArrayList<>();
    
    public static void añadirEjercicio2(Ejercicio ejercicio)
    {
        listaEjercicios2.add(ejercicio);                    //AÑADE A LA LISTAEJERCICIOS UN OBJETO DE TIPO EJERCICIO
    }
    
    public static void reiniciarLista2()
    {
       listaEjercicios2.clear();                            //LIMPIA EL CONTENIDO DE LA LISTA
    }

    public static List<Ejercicio> getListaEjercicios2() {   //NOS DEVUELVE LA CLASE LISTAEJERCICIOS
        return listaEjercicios2;
    }
}
