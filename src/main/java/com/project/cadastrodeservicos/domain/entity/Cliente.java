package com.project.cadastrodeservicos.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Integer id;

    @Column(name = "NOME", nullable = false, length = 150)
    //@NotEmpty(${campo.cpf.obrigatorio})
    private String nome;

    @Column(name = "CPF",nullable = false, length = 11)
    //@CPF("${campo.cpf.obrigatorio}")
    private String cpf;

    @Column(name = "DT_CADASTRO", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @PrePersist
    public void prePersit() {
        this.dataCadastro = LocalDate.now();
    }

    public Cliente(){
    }

    public Cliente(Integer id, String nome, String cpf, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
