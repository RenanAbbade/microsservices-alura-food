package br.com.alurafood.pagamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PagamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagamentosApplication.class, args);
	}

}
/*
EnableEurekaClient
A anotação @EnableEurekaClient é usada em aplicativos Spring Boot que desejam se registrar no servidor Eureka
como um cliente para participar do Service Discovery.
Essa anotação ativa o registro automático do aplicativo no servidor Eureka, permitindo que outros serviços descubram e
se comuniquem com ele.

Quando você adiciona @EnableEurekaClient a uma classe de configuração ou classe principal do Spring Boot,
o aplicativo automaticamente se torna um cliente do servidor Eureka.
O aplicativo então se registra no servidor Eureka e recebe um registro único, contendo informações sobre o nome do serviço,
o endereço IP, a porta e outras informações relevantes.
 */