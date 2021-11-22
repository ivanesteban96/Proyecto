
package ejercicios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TablaProgresion extends AbstractTableModel{

    private List<Ejercicio> lista;
    private String[] columnas={"ejercicio","peso","series","repeticiones","fecha"};
    
    public TablaProgresion(List<Ejercicio> lista)
    {
        this.lista=lista;
    }

    public TablaProgresion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                return lista.get(rowIndex).getNombre();
            case 1:
                return lista.get(rowIndex).getPeso();
            case 2:
                return lista.get(rowIndex).getSeries();
            case 3:
                return lista.get(rowIndex).getReps();
            case 4:
                return lista.get(rowIndex).getFechaEntreno();
        }
        
        return null;
         
    }

    @Override
    public String getColumnName(int column) {
        
        return columnas[column];
    }

    public void addRow(ListaEjercicios list) {
        
        
        
    }
    
    
    
    
}
