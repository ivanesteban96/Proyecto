
package ajustarRutina;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TablaSemanal extends AbstractTableModel{
    
    private List<Dia> lista;
    private String[] columnas={"dia","ej1","ej2","ej3","ej4","ej5","ej6"};
    
    public TablaSemanal(List<Dia> lista) {
        this.lista=lista;
    }

    @Override
    public int getRowCount() {
         return lista.size();
    }

    @Override
    public int getColumnCount() {
       return columnas.length;
       
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex)
        {
            case 0:
                return lista.get(rowIndex).getEjercicio1();
            case 1:
                return lista.get(rowIndex).getEjercicio2();
            case 2:
                return lista.get(rowIndex).getEjercicio3();
            case 3:
                return lista.get(rowIndex).getEjercicio4();
            case 4:
                return lista.get(rowIndex).getEjercicio5();
            case 5:
                return lista.get(rowIndex).getEjercicio6();
            case 6:    
                return lista.get(rowIndex).getEjercicio7();
        }
        
        return null;
    }
    
     @Override
    public String getColumnName(int column) {
        
        return columnas[column];
    }
    
}
