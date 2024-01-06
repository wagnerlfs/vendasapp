package br.com.wble.springbootexpert.vendas.vendas.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Configuration
@Profile("Development")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Development {
}
