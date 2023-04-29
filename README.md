# alura_API_SpringBoot_3
API de estudo da nova versão do SpringBoot 3 com as tecnologias: Spring Boot 3, Java 17, Lombok, MySQL/ Flyway, JPA/Hibernate, Maven e Insomnia

<h1 align="left"><strong>Alura API SpringBoot 3</strong></h1>
<p align="left">Este repositório possui dois projetos demonstrando o funcionamento do <strong> Spring Cloud Feign com Kafka no Docker</strong>. Um microservice cliente para consumir a API de CEP
 usando o Feign e produzir mensagens para o kafka e um microservice consumidor que fará a leitura e a persistencia das mensagens no banco H2 em memória.</p>
<h1 align="center">
    <a href="https://kafka.apache.org/">🔗 Kakfa</a>
</h1>

<h2 align="center"> 
	Running 🚀
</h2>
<p align="left">1º É necessário que você tenha o docker instalado em seu ambiente de trabalho</p>
<p align="left">2º Para subir o Kafka com o Zookeeper, execute o arquivo docker-compose.yml com o seguinte comando: docker-compose up -d </p>
<p align="left">3º Execute os dois projetos</p>
<p align="left">4º Envie uma requisição POST para o projeto produtor na seguinte rota: <strong> http://localhost:8081/api/v1/address </strong></p>

<p><strong>Formato do JSON</strong></p>

	{
		"cep":"String", 
		"complemento": "String",
		"numero": "Numeric"
	}

<p align="left">5º Confira no KAFDROP as mensagens que foram enviadas para o Kafka. </p>
<p align="left">6º Confira no banco H2 (em memória) as mensgagens salvas: <strong> http://localhost:8080/h2-console</strong></p>
