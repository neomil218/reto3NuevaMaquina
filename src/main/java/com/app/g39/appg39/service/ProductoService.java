/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.g39.appg39.service;

import com.app.g39.appg39.entity.Producto;
import com.app.g39.appg39.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author DELL
 */

@Service
public class ProductoService {
   @Autowired
    private ProductoRepository repository;
    
    public List<Producto> getProducto(){
        return repository.findAll();
    }
    
    public Producto saveProducto(Producto producto){
        return repository.save(producto);
    }
    
    public Producto getProductoById(int id){
        return repository.findById(id).orElse(null);
    }
    
    public Producto updateProducto(Producto producto){
        Producto existeProducto=getProductoById(producto.getId());
        existeProducto.setNombre(producto.getNombre());
        existeProducto.setPrecio(producto.getPrecio());
        existeProducto.setInventario(producto.getInventario());
        return repository.save(existeProducto);        
    }
    
    public void deleteProducto(int id){
        repository.deleteById(id);
    }
    
    
}
