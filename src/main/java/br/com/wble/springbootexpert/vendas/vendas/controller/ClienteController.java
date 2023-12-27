package br.com.wble.springbootexpert.vendas.vendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clientes")

public class ClienteController
{
    @Autowired
    @Qualifier("ApplicationName")
    private String applicationName;
    @GetMapping("/hello")
    public  String hello()
    {
        return "Hello: " + this.applicationName;
    }
}
