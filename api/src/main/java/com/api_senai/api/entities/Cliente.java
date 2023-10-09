package com.api_senai.api.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "clientes")
public class Cliente extends Pessoas{
    @Id
    private Long id;
    private String login;
    private String senha;
    @OneToOne
    private Endereco endereco;
}
