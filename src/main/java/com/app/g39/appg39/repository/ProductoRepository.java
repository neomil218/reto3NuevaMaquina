/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.g39.appg39.repository;

import com.app.g39.appg39.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DELL
 */
public interface ProductoRepository extends JpaRepository<Producto,Integer>{
    
    
}
