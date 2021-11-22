
package ajustarRutina;

import java.util.ArrayList;
import java.util.List;

public class ListaDias {
    
    private static List<Dia> listaDias=new ArrayList<>();
    
    
    
    public static void añadirDia(Dia dia)
    {
        listaDias.add(dia);                    //AÑADE A LA LISTAEJERCICIOS UN OBJETO DE TIPO EJERCICIO
    }
    
    public static void reiniciarLista()
    {
       listaDias.clear();                            //LIMPIA EL CONTENIDO DE LA LISTA
    }
    
    public static List<Dia> getListaDias() {   //NOS DEVUELVE LA CLASE LISTAEJERCICIOS
        return listaDias;
    }

    public static Dia getDia(int index) {
        return listaDias.get(index);
    }
    
    
}
