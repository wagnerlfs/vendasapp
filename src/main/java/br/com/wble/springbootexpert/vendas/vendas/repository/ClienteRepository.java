package br.com.wble.springbootexpert.vendas.vendas.repository;

import br.com.wble.springbootexpert.vendas.vendas.entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ClienteRepository extends Repository<Cliente, Integer> {

    List<Cliente> findAll();



    List<Cliente> findByNome(String nome);

    List<Cliente> findByEmail(String email);

    Cliente findByCpfcnpj(String cpfcnoj);

    boolean existsByNome(String nome);

    @Query(" select c from Cliente c left join fetch c.pedidos where c.idtCliente = :idt_cliente  ")
    Cliente findClienteFetchPedidos( @Param("idtCliente") Integer idtCliente );
}


