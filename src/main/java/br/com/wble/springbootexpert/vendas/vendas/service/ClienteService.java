package br.com.wble.springbootexpert.vendas.vendas.service;

import br.com.wble.springbootexpert.vendas.vendas.dto.ClienteDTO;
import br.com.wble.springbootexpert.vendas.vendas.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository)
    {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDTO> listar()
    {
        //this.clienteRepository.findAll().;
        return null;
    }


}
