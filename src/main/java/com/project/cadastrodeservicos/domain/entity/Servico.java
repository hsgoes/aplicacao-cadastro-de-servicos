package com.project.cadastrodeservicos.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_SERVICO")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private Integer id;

    @Column(name = "DS_SERVICO", nullable = false, length = 255)
    private String descricao;

    @Column(name = "VALOR")
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;

    public Servico(){
    }

    public Servico(Integer id, String descricao, Double valor, Cliente cliente) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
