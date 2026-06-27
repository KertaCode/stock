package com.boulangerie.stock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author Faustin PADINGANYI
 */
@Entity
@Table(name = "Agent")
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.Setter
public class Agent {
    @Id
    @Column(name = "matricule", length = 20, nullable = false)
    private String matricule;
    @Column(name = "nomAgent")
    private String nomAgent;
    @Column(name = "fonctionAgent")
    private String fonctionAgent;
    @Column(name = "createdAt")
    LocalDateTime createdAt;
    @Column(name = "createdBy")
    private String createdBy;
    @PrePersist
    public void prePersist(){
        if (createdAt==null) {
            createdAt = LocalDateTime.now();
        }
    }
}
