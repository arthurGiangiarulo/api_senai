package com.api_senai.api.entities;

import java.time.LocalDate;

public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    private String login;
    private String senha;
    private Endereco endereco;
}
