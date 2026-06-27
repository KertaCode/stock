package com.boulangerie.stock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 *
 * @author Josephine Mayaya
 */
@Entity
@Table(name = "Produit")
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.Setter
public class Produit {
    @Id
    @Column(name = "code", length = 20, nullable = false)
    private String code;
    
    @Column(name = "libelle", length = 200)
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name = "idType", referencedColumnName = "idType")
    private TypeProduit typeProduit;
    
    @Column(name = "qteStock")
    private BigInteger qteStock;
    
    @Column(name = "prixUnit")
    private BigInteger prixUnit;
    
    @Column(name = "pourcRist")
    private Double pourcRist;
    
    @Column(name = "unitMesure")
    private UniteMesure unitMesure;
    
    @Column(name = "createdAt",columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime createdAt;
    
    @PrePersist
    public void Prepersit(){
        if(createdAt == null){
            createdAt = LocalDateTime.now();
        }
    }
    
}
