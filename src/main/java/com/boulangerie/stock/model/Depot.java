/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boulangerie.stock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author THIERRY N'SINDUKU
 */
@Entity
@Table(name="Depot")
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.Setter
public class Depot {
    @Id
    @Column(name= "Numero", length = 20, nullable = false)
    private String Numero;
    
    @Column(name="Libelle", length = 100, nullable= false)
    private String Libelle;
    
    @Column(name="Adresse", length = 200, nullable = false)
    private String Adresse;
    
    
}
