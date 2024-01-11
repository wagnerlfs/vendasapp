package br.com.wble.springbootexpert.vendas.vendas.entity;

import br.com.wble.springbootexpert.vendas.vendas.dto.ClienteDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
public class Cliente {

    @Id
    @Getter
    private int id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String cpfcnpj;

    @Getter
    @Setter
    @OneToMany( mappedBy = "cliente" , fetch = FetchType.LAZY )
    private Set<Pedido> pedidos;




}
