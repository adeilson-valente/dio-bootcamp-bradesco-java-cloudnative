package com.gerenciamento.service;

import com.gerenciamento.domain.model.Produto;

import java.util.List;

public interface ProdutoService {
    List<Produto> listarTodos();

    Produto buscarPorId(Long id);

    Produto criar(Produto produto);

    void deletar(Long id);

}
