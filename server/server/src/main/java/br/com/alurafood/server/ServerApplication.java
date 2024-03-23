package br.com.alurafood.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //anotação indicando que vamos trabalhar com Eureka Server
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
/*

Eureka Server

No contexto do Service Discovery, o EurekaServer é uma implementação de um servidor de registro de serviços,
fornecido pelo projeto Spring Cloud Netflix. Ele desempenha um papel central na arquitetura de microservices
ao permitir que os serviços se registrem e se descubram dinamicamente em um ambiente distribuído.
A principal função do EurekaServer é atuar como um registro centralizado de todos os serviços disponíveis na rede.
Os serviços, ao serem iniciados, se registram no EurekaServer, informando seu nome e localização (endereço IP, porta, etc.).
O EurekaServer mantém um registro atualizado desses serviços, permitindo que outros serviços os descubram quando necessário.
Além disso, o EurekaServer pode fornecer funcionalidades adicionais, como a capacidade de monitorar a disponibilidade dos
serviços registrados e remover automaticamente serviços que não estão respondendo.
Quando um cliente precisa se comunicar com outro serviço, ele consulta o EurekaServer para obter informações sobre onde encontrar
o serviço desejado. O EurekaServer fornece ao cliente os detalhes necessários, permitindo que o cliente envie requisições diretamente
para o serviço descoberto.
Em resumo, o EurekaServer é uma parte essencial de uma arquitetura de microservices que utiliza o padrão de Service Discovery.
Ele facilita a descoberta dinâmica de serviços e a comunicação entre eles em um ambiente distribuído.
 */