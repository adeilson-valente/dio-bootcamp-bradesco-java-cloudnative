package com.gerenciamento.service.impl;

import com.gerenciamento.domain.model.MovimentacaoEstoque;
import com.gerenciamento.domain.model.Produto;
import com.gerenciamento.domain.model.enun.TipoMovimentacao;
import com.gerenciamento.domain.repository.MovimentacaoEstoqueRepository;
import com.gerenciamento.domain.repository.ProdutoRepository;
import com.gerenciamento.service.MovimentacaoEstoqueService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovimentacaoEstoqueServiceImpl implements MovimentacaoEstoqueService {
    private final MovimentacaoEstoqueRepository movimentacaoRepository;
    private final ProdutoRepository produtoRepository;

    public MovimentacaoEstoque registrarMovimentacao(Long produtoId, MovimentacaoEstoque movimentacao) {
        Produto produto = produtoRepository.findById(produtoId)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        if (movimentacao.getTipo() == TipoMovimentacao.ENTRADA) {
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + movimentacao.getQuantidade());
        } else {
            produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - movimentacao.getQuantidade());
        }

        produtoRepository.save(produto);
        movimentacao.setProduto(produto);
        return movimentacaoRepository.save(movimentacao);
    }

    public List<MovimentacaoEstoque> listarPorProduto(Long produtoId) {
        return movimentacaoRepository.findByProdutoId(produtoId);
    }
}