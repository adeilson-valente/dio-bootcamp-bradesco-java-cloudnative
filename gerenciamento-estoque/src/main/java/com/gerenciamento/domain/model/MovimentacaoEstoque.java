package com.gerenciamento.domain.model;

import com.gerenciamento.domain.model.enun.TipoMovimentacao;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity(name = "movimentacao_estoque")
public class MovimentacaoEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @Column(nullable = false)
    private Integer quantidade;

    @Enumerated(EnumType.STRING) // Armazena o enum como String no BD
    @Column(nullable = false)
    private TipoMovimentacao tipo;

    private LocalDateTime data = LocalDateTime.now();
}