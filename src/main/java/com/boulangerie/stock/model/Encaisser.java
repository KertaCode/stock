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
    //Génération automatique de la valeur de la clé
    //Condition : le type doit être un numérique entier
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEncaisser")
    private Long idEncaisser;
    @Column(name = "dateEncaisser")
    private LocalDate dateEncaisser;
    @Column(name = "montantEncaisser")
    private Long montantEncaisser;
    //Création de la clé étrangère : relation ManyToOne
    @ManyToOne
    //Spécification de la colonne de liaison
    //Elle doit être une clé primaire dans la table d'origine
    @JoinColumn(name = "code")
    private Produit produit;
    @ManyToOne
    @JoinColumn(name = "matricule")
    private Agent agent;
}
