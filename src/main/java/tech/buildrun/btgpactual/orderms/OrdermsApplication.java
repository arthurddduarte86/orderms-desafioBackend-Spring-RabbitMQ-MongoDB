package tech.buildrun.btgpactual.orderms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdermsApplication.class, args);
	}

}

/*
JSON PARA TESTE

{
	"codigoPedido": 1001,
		"codigoCliente": 1,
		"itens": [
	{
		"produto": "lapis",
			"quantidade": 100,
			"preco": 1.10
	},
	{
		"produto": "caderno",
			"quantidade": 10,
			"preco": 1.00
	}
    ]
}

 */
