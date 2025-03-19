package com.generation.farmaplus.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank(message = "O atributo nome é obrigatório!")
@Size(min = 1, max = 200, message = "O atributo nome deve ter no minímo um e no máximo 200 caracter")
private String nome;

@NotBlank(message = "O atributo fabricante é obrigatório!")
@Size(min = 3, max = 200, message = "O atributo fabricante deve ter no minímo um e no máximo 200 caracter")
private String fabricante;

@NotNull(message = "O atributo preço é obrigatório!")
private Long preco;

@NotNull(message = "O atributo estoque é obrigatório!")
private Long estoque;

@NotNull(message = "O atributo validade é obrigatório!")
private LocalDate validade;

@ManyToOne
@JsonIgnoreProperties("produto")
    private Categoria categoria;

public Categoria getCategoria() {
        return categoria;
    }

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public String getFabricante() {
return fabricante;
}

public void setFabricante(String fabricante) {
this.fabricante = fabricante;
}

public Long getPreco() {
return preco;
}

public void setPreco(Long preco) {
this.preco = preco;
}

public Long getEstoque() {
return estoque;
}

public void setEstoque(Long estoque) {
this.estoque = estoque;
}

public LocalDate getValidade() {
return validade;
}

public void setValidade(LocalDate validade) {
this.validade = validade;
}



}
