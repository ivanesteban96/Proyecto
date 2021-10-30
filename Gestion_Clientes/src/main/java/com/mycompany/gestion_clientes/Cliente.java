
package com.mycompany.gestion_clientes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    
    String nombre;
    String apellidos;
    Date fecha;
    String provincia;

    public Cliente(String nombre, String apellidos, Date fecha, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.provincia = provincia;
    }
    
    public String[] añadirDatos()
    {
        String[] string=new String[4];
        
        string[0]=nombre;
        string[1]=apellidos;
        string[2]=fecha.toString();
        string[3]=provincia;
        
        return string;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha + ", provincia=" + provincia + '}';
    }
    
    
}
