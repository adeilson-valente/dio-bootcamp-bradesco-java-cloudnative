package com.gerenciamento.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String nome;
}