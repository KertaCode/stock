package com.boulangerie.stock.model;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author Faustin PADINGANYI
 */
@Entity
@Table(name = "encaisser")
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.Setter
public class Encaisser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEncaisser")
    private Long idEncaisser;
    @Column(name = "dateEncaisser")
    private LocalDate dateEncaisser;
    @Column(name = "montantEncaisser")
    private Long montantEncaisser;
    @ManyToOne
    @JoinColumn(name = "code")
    private Produit produit;
    @ManyToOne
    @JoinColumn(name = "matricule")
    private Agent agent;
}
