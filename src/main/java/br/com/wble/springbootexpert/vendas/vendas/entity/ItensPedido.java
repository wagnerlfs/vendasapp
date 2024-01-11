package br.com.wble.springbootexpert.vendas.vendas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "itens_pedido")
public class ItensPedido {


    @Getter
    @Column(name = "idt_itens_pedido")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idtItensPedido;

    @Getter
    @Setter
    private Pedido pedido;

    @Getter
    @Setter
    private Produto produto;

    @Column(name = "num_item_pedido")
    @Getter
    @Setter
    private int numItemPedido;


}
