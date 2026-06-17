/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boulangerie.stock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author Josephine Mayaya
 */
@Entity
@Table(name="Fonction")
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.Setter
public class Fonction {
    @Id
    @Column(name = "numFonc", length = 20, nullable = false)
    private String numFonc;
    
    @Column(name = "libeFonc", length= 100, nullable = false)
    private String libeFonc;
    
    @Column(name = "createdAt", columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime createdAt;
    
    @PrePersist
    public void prePersist() {
        if(createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }
}
