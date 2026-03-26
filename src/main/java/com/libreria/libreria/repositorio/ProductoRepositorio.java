package com.libreria.libreria.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.libreria.libreria.modelo.Producto;

@Repository

public class ProductoRepositorio {
    private List<Producto>listaProducto = new ArrayList<>();

    private ProductoRepositorio(){
        listaProducto.add(new Producto("Cajón","Muebles",29000));
        listaProducto.add(new Producto("Cajonera","Muebles",19000));
    }

    public List<Producto>findAllProductos(){
        return listaProducto;
    }

    public boolean create(Producto producto){
        listaProducto.add(producto);
        return true;
    }

    public boolean delete(String nombre){
        for (Producto producto : listaProducto){
            if (producto.getNombre().equals(nombre)){
                listaProducto.remove(producto);
                return true;
            }
        }
        return false;
    }

}
