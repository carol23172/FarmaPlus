package com.generation.farmaplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmaplus.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
