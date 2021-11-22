
package ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Ejercicio {
    
    private String nombre;
    private String peso;
    private String series;
    private String reps;
    
    private Date fecha;
    private SimpleDateFormat fechaEntreno = new SimpleDateFormat("dd/MM/yyyy");

    public Ejercicio(String nombre,String peso, String series, String reps, Date fecha) {
        this.nombre = nombre;
        this.peso=peso;
        this.series = series;
        this.reps = reps;
        this.fecha=fecha;
    }

   /*public String[] añadirDatos(){
        String[] string=new String[5];
        
        string[0]=nombre;
        string[1]=peso;
        string[2]=series;
        string[3]=reps;
        string[4]=fechaEntreno.format(fecha);
        
        return string;
    }*/

    public String getNombre() {
        return nombre;
    }

    public String getPeso() {
        return peso;
    }

    public String getSeries() {
        return series;
    }

    public String getReps() {
        return reps;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getFechaEntreno() {
        return fechaEntreno.format(fecha);
    }
    
   
}
