/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.g39.appg39.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author DELL
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    private int idcat;
    private String nomcat;
    @OneToMany(cascade={CascadeType.PERSIST},mappedBy="categoria")
    @JsonIgnoreProperties("categoria")
    private List<Producto> productos;
}
