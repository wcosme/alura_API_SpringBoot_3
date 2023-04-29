<div>
    <h1 text-align : justify><strong>Alura API SpringBoot 3</strong></h1>
    <p text-align = justify>API de estudo da nova versão do SpringBoot 3 com as tecnologias: Spring Boot 3, Java 17, Lombok, MySQL/ Flyway, JPA/Hibernate, Maven e Insomnia.</p>
    <div style='text-align:center'>
        <h1 text-align : center>
            <a href="https://kafka.apache.org/">🔗 Spring Boot 3</a>
        </h1>
    </div>

<h2 text-align : justify> 
	Running 🚀
</h2>
<p text-align = justify>Envie uma requisição POST para o projeto na seguinte rota: <strong> http://localhost:8080/api/v1/doctors </strong></p>

<p><strong>Formato do JSON</strong></p>

	{
    "content": [
        {
            "id": 1,
            "name": "Viviane Gonçalves",
            "email": "viviane.goncalves@voll.med",
            "crm": "102040",
            "specialty": "GINECOLOGIA"
        },
        {
            "id": 2,
            "name": "Wallace Gonçalves",
            "email": "wallace.goncalves@voll.med",
            "crm": "102050",
            "specialty": "CARDIOLOGIA"
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 0,
        "pageSize": 20,
        "pageNumber": 0,
        "unpaged": false,
        "paged": true
    },
    "last": true,
    "totalPages": 1,
    "totalElements": 2,
    "size": 20,
    "number": 0,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "first": true,
    "numberOfElements": 2,
    "empty": false
}

<p text-align = justify>Payload de response. </p>


<p><strong>Formato do JSON</strong></p>
</div>
