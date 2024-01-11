package br.com.wble.springbootexpert.vendas.vendas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
public class Pedido {

    @Getter
    @Setter
    @Column(name = "idt_pedido")
    @Id
    @GeneratedValue
    private int idtPedido;


    @Getter
    @Setter
    @JoinColumn(name = "idt_cliente")
    private Cliente cliente;

    @Getter
    @Setter
    @Column(name = "data_pedido")
    private Date dataPedido;

    @Getter
    @Setter
    @Column(name = "codigo_pedido")
    private String codigoPedido;
}
