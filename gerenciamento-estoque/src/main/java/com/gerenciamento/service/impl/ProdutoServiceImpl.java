package com.gerenciamento.service.impl;

import com.gerenciamento.domain.model.Produto;
import com.gerenciamento.domain.repository.ProdutoRepository;
import com.gerenciamento.service.ProdutoService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Override
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    @Override
    public Produto criar(Produto produto) {
        if (produto.getId() != null && produtoRepository.existsById(produto.getId())) {
            throw new IllegalArgumentException(String.format("O produto de id %s ja existe.", produto.getId()));
        }
        return produtoRepository.save(produto);
    }

    @Override
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}