package br.com.wble.springbootexpert.vendas.vendas.repository;

import br.com.wble.springbootexpert.vendas.vendas.model.Cliente;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;


public interface ClienteRepository extends Repository<Cliente, Long> {

    List<Cliente> findByNome(String nome);

    List<Cliente> findAll();


}


