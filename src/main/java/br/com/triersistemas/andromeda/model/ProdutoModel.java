package br.com.triersistemas.andromeda.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class ProdutoModel {

    private String nome;
    private LocalDate niver;
    private String cpf;
    private String email;
}
