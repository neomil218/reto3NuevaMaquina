/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.g39.appg39.service;

import com.app.g39.appg39.entity.Categoria;
import com.app.g39.appg39.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repository;
    
    public List<Categoria> getCategorias(){
        return repository.findAll();
    }
    
    public Categoria getCategoriaById(int id){
        return repository.findById(id).orElse(null);
    } 
    
    public Categoria saveCategoria(Categoria categoria){
        return repository.save(categoria);
    }
    
    public Categoria updateCategoria(Categoria categoria){
        Categoria existeCategoria=getCategoriaById(categoria.getIdcat());
        existeCategoria.setNomcat(categoria.getNomcat());
        return repository.save(existeCategoria);
    }
    
    public void deleteCategoria(int id){
        repository.deleteById(id);
    }
    
    
}
