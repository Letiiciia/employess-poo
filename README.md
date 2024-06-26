<h1 align="center">🚀 Employees 🚀</h1>
<p align="center">Projeto de cadastro de informações pessoais de funcionários</p>

## Implementações
- [x] Criar um registro de funcionário
- [x] Listar todos os registros

### 🛠 Tecnologias e Dependências
* [Git](#Git)
* [Java](#Java)
* [Maven](#Maven)
* [Springboot](#Springboot)
* [JPA](#JPA)
* [Lombok](#Lombok)
* [BancoH2](#BancoH2)


### Como Utilizar?
- Build e Rode o projeto localmente
- Para criar um registro 
$ Accesse http://localhost:8080/information-create
 - Este é o payload para enviar na requisição
{
  "name": "Letícia Lima",
  "healthProblems": "headache",
  "allergies": "itch",
  "email": "leticialimaferreira2@gmail.com",
  "cellPhone": "6199613-2589"
}

- Para listar os registro 
$ Accesse http://localhost:8080/information
- Este é o objeto criado no banco
{
  "id": 1,
  "name": "Letícia Lima",
  "healthProblems": "headache",
  "allergies": "itch",
  "email": "leticialimaferreira2@gmail.com",
  "cellPhone": "6199613-2589"
}


