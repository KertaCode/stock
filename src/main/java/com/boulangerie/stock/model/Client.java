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
@Table(name="Client")
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.Setter
public class Client {
    @Id
    @Column(name = "numCli", length = 20, nullable = false)
    private String numCli;
    
    @Column(name = "nomCli", length = 100, nullable = false)
    private String nomCli;
    
    @Column(name = "telCli", length = 15, nullable = false)
    private String telCli;
    
    @Column(name = "emailCli", length = 255, nullable = false)
    private String emailCli;
    
    @Column(name = "createdAt", columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime createdAt;
    
    @PrePersist
    public void prePersist() {
        if(createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }
}
