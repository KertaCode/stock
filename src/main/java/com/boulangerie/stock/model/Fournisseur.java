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
@Table(name="Fournisseur")
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.Setter
public class Fournisseur {
    @Id
    @Column(name = "numFourn", length = 10, nullable = false)
    private String numFourn;
    
    @Column(name = "libeFourn", length= 50, nullable = false)
    private String libeFourn;
    
    @Column(name = "createdAt", columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime createdAt;
    
    @PrePersist
    public void prePersist() {
        if(createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }
}
