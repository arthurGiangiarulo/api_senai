package com.api_senai.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "clientes", 
       uniqueConstraints = {
           @UniqueConstraint(name = "email_ukey", columnNames = "email"),
           @UniqueConstraint(name = "cpf_ukey", columnNames = "cpf"),
           @UniqueConstraint(name = "endereco_ukey", columnNames = "endereco"),
           @UniqueConstraint(name = "telefone_ukey", columnNames = "telefone")
       })
public class Cliente extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;

    @ManyToOne
    @JoinColumn(name = "endereco", foreignKey = @ForeignKey(name = "endereco_fkey"))
    private Endereco endereco;
}

