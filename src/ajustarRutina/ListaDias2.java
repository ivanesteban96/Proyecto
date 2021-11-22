
package ajustarRutina;

import java.util.ArrayList;
import java.util.List;

public class ListaDias2 {
    
    private static List<Dia> listaDias2=new ArrayList<>();
    
    
    
    public static void añadirDia2(Dia dia)
    {
        listaDias2.add(dia);                    //AÑADE A LA LISTAEJERCICIOS UN OBJETO DE TIPO EJERCICIO
    }
    
    public static void reiniciarLista2()
    {
       listaDias2.clear();                            //LIMPIA EL CONTENIDO DE LA LISTA
    }
    
    public static List<Dia> getListaDias2() {   //NOS DEVUELVE LA CLASE LISTAEJERCICIOS
        return listaDias2;
    }

    public static Dia getDia2(int index) {
        return listaDias2.get(index);
    }
    
    
}