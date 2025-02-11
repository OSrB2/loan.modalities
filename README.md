# Empréstimos
Este projeto é um serviço que determina quais modalidades de empréstimo uma pessoa pode acessar com base em sua idade, salário e localização.

## Modalidades de Empréstimo
- **Empréstimo pessoal**: Taxa de juros de 4%.
- **Empréstimo consignado**: Taxa de juros de 2%.
- **Empréstimo com garantia**: Taxa de juros de 3%.

## Regras de Concessão
### Empréstimo pessoal:
- Concedido se o salário for igual ou inferior a R$ 3000.
- Concedido se o salário estiver entre R$ 3000 e R$ 5000, desde que o cliente tenha menos de 30 anos e resida em São Paulo (SP).

### Empréstimo consignado:
- Concedido se o salário for igual ou superior a R$ 5000.

### Empréstimo com garantia:
- Concedido se o salário for igual ou inferior a R$ 3000.
- Concedido se o salário estiver entre R$ 3000 e R$ 5000, desde que o cliente tenha menos de 30 anos e resida em São Paulo (SP).

## Exemplo de Requisição
[POST] `{{host}}/api/customer-loans`
```json
{
    "age": 26,
    "cpf": "275.484.389-23",
    "name": "Vuxaywua Zukiagou",
    "income": 7000.00,
    "location": "SP"
}
```


### Resposta Esperada
**HTTP/1.1 200 Ok**
```json
{
  "customer": "Vuxaywua Zukiagou",
  "loans": [
    {
      "type": "PERSONAL",
      "interest_rate": 4
    },
    {
      "type": "GUARANTEED",
      "interest_rate": 3
    },
    {
      "type": "CONSIGNMENT",
      "interest_rate": 2
    }
  ]
}
```


## Como Rodar a Aplicação

### Pré-requisitos
- Java 17+
- Maven

### Passos para Executar
1. Clone o repositório:
```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
```
2. Compile e execute a aplicação:
```bash
   mvn clean install
   mvn spring-boot:run
```

A aplicação estará rodando em: [http://localhost:8080/api/customer-loans](http://localhost:8080/api/customer-loans)