package br.com.wble.springbootexpert.vendas.vendas.model;

import br.com.wble.springbootexpert.vendas.vendas.dto.ClienteDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Cliente {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    private String email;
    private String cpfcnpj;

    public Cliente(ClienteDTO clienteDTO) {
        this.id = clienteDTO.getId();
        this.nome = clienteDTO.getNome();
    }


}
