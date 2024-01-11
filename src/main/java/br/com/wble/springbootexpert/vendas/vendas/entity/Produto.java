package br.com.wble.springbootexpert.vendas.vendas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idt_produto")
    @Getter
    private int idtProduto;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String descricao;

    @Getter
    @Setter
    private String status;

    @Getter
    @Setter
    private BigDecimal valor;

}
