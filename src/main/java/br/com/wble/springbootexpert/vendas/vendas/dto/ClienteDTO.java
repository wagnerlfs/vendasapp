package br.com.wble.springbootexpert.vendas.vendas.dto;

import br.com.wble.springbootexpert.vendas.vendas.model.Cliente;

public class ClienteDTO {

    private Long id;

    public Long getId() {
        return id;
    }

    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClienteDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
    }
}
