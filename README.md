# API de Consulta de CEP

Esta API desenvolvida em Java com o framework Spring oferece uma solução eficiente para consulta de CEPs, utilizando a integração com a API ViaCEP para obter informações detalhadas sobre localidades. Além disso, a aplicação armazena os CEPs previamente consultados localmente, eliminando a necessidade de consultas repetitivas.

## Funcionalidades Principais

### Consulta de CEP Via ViaCEP:

- Utiliza a API ViaCEP para obter dados detalhados associados a um CEP específico, como logradouro, bairro, cidade, estado, entre outros.

### Armazenamento Local de Consultas:

- Mantém um registro local dos CEPs consultados, reduzindo o tempo de resposta ao evitar consultas repetitivas à API externa.

## Tecnologias Utilizadas

- Java: Linguagem de programação robusta e orientada a objetos.
- Spring Boot: Framework facilitador para o desenvolvimento de aplicativos Java.
- Spring Data JPA: Facilita a implementação de camadas de persistência em aplicativos com a tecnologia Java.
- Spring Cloud OpenFeign: Simplifica a integração com serviços RESTful, tornando as chamadas a APIs externas mais eficientes.

## Como Utilizar

### Pré-requisitos:

- Certifique-se de ter o Java (versão 17 ou superior) instalado em seu ambiente.
- Clone este repositório.

### Configuração:

- Configure as informações de banco de dados no arquivo `application.properties`.
- Execute a aplicação usando o Maven ou outra ferramenta de sua escolha.

### Uso:

- Acesse os endpoints da API para consultar informações sobre CEPs e aproveite o benefício do armazenamento local para consultas subsequentes.

## Endpoints Principais

### Consulta de CEP:

- `GET /cep/{cep}`: Retorna informações detalhadas sobre o CEP especificado.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorar esta API.
