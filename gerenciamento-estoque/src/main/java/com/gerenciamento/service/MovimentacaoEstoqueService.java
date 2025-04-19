package com.gerenciamento.service;

import com.gerenciamento.domain.model.MovimentacaoEstoque;
import com.gerenciamento.domain.model.Produto;
import com.gerenciamento.domain.model.enun.TipoMovimentacao;
import com.gerenciamento.domain.repository.MovimentacaoEstoqueRepository;
import com.gerenciamento.domain.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovimentacaoEstoqueService {

    MovimentacaoEstoque registrarMovimentacao(Long produtoId, MovimentacaoEstoque movimentacao);

    List<MovimentacaoEstoque> listarPorProduto(Long produtoId);
}