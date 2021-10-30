package com.mycompany.gestion_clientes;

import java.util.ArrayList;
import java.util.List;

public class LogicaNegocio {
       
    static List<Cliente> listaClientes=new ArrayList<>();
    
    public static void añadirCliente(Cliente cliente)
    {
        listaClientes.add(cliente);
    }

    public static List<Cliente> getListaClientes() {   //getter
        return listaClientes;
    }
    
    
    
    
}
