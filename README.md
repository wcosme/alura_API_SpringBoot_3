<h1 align="left"><strong>Alura API SpringBoot 3</strong></h1>
<p align="left">API de estudo da nova versão do SpringBoot 3 com as tecnologias: Spring Boot 3, Java 17, Lombok, MySQL/ Flyway, JPA/Hibernate, Maven e Insomnia.</p>
<h1 align="center">
    <a href="https://kafka.apache.org/">🔗 Spring Boot 3</a>
</h1>

<h2 align="center"> 
	Running 🚀
</h2>
<p align="left">Envie uma requisição POST para o projeto na seguinte rota: <strong> http://localhost:8080/api/v1/doctors </strong></p>

<p><strong>Formato do JSON</strong></p>

	{
		"cep":"String", 
		"complemento": "String",
		"numero": "Numeric"
	}

<p align="left">Payload de response. </p>


<p><strong>Formato do JSON</strong></p>

{
    "content": [
        {
            "id": 1,
            "nome": "Wallace Gonçalves",
            "email": "wallace.goncalves@voll.med",
            "crm": "222545",
            "especialidade": "CARDIOLOGIA"
        },
        {
            "id": 2,
            "nome": "Teste Gonçalves",
            "email": "teste.goncalves@voll.med",
            "crm": "111222",
            "especialidade": "CARDIOLOGIA"
        },
        {
            "id": 4,
            "nome": "Viviane Gonçalves",
            "email": "viviane.goncalves@voll.med",
            "crm": "102040",
            "especialidade": "GINECOLOGIA"
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageNumber": 0,
        "pageSize": 20,
        "unpaged": false,
        "paged": true
    },
    "last": true,
    "totalElements": 3,
    "totalPages": 1,
    "size": 20,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 3,
    "empty": false
}
