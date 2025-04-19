package com.gerenciamento.controller;

import com.gerenciamento.domain.model.MovimentacaoEstoque;
import com.gerenciamento.service.MovimentacaoEstoqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos/{produtoId}/movimentacoes")
@RequiredArgsConstructor
public class MovimentacaoEstoqueController {
    private final MovimentacaoEstoqueService movimentacaoService;

    @PostMapping
    public MovimentacaoEstoque registrar(
            @PathVariable Long produtoId,
            @RequestBody MovimentacaoEstoque movimentacao
    ) {
        return movimentacaoService.registrarMovimentacao(produtoId, movimentacao);
    }

    @GetMapping
    public List<MovimentacaoEstoque> listarPorProduto(@PathVariable Long produtoId) {
        return movimentacaoService.listarPorProduto(produtoId);
    }
}