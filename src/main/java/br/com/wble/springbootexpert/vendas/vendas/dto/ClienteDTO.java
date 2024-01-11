package br.com.wble.springbootexpert.vendas.vendas.dto;

import br.com.wble.springbootexpert.vendas.vendas.entity.Cliente;
import lombok.Getter;
import lombok.Setter;

public class ClienteDTO {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String cpfcnpj;

}
