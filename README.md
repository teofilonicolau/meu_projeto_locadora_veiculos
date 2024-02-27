## Locadora de Veículos:
Este é um projeto de uma Locadora de Veículos em Java usando o framework Spring Boot. 

 ## API para Locadora de Veículos com PostgreSQL em Docker
 ## Tecnologias utilizadas:
Java 17
Spring Boot 3
JPA com Hibernate
PostgreSQL em Docker
Thymeleaf
Bootstrap 5
## Estrutura do projeto :
![image](https://github.com/teofilonicolau/meu_projeto_locadora_veiculos/assets/97030160/3a781383-034f-43a6-ac72-deb85f6154d1)

## Banco de dados
O banco de dados PostgreSQL é executado em um container Docker. O arquivo docker-compose.yaml define a configuração do container.

 ## Funcionalidades
A API disponibiliza os seguintes endpoints:

POST /veiculo/criar: Cria um novo veículo.
GET /veiculo/todos: Recupera todos os veículos cadastrados.
GET /veiculo/por-id/{id}: Recupera um veículo por ID.
PUT /veiculo/alterar: Altera um veículo.
GET /veiculo/por-placa/{placa}: Recupera um veículo por placa.
DELETE /veiculo/remover-por-id/{id}: Remove um veículo por ID.



Executando a aplicação
Certifique-se de ter o Java 17, o Maven e o Docker instalados.
Clone o projeto para a sua máquina local.
Abra um terminal no diretório do projeto.
Execute o comando mvn clean install.
Execute o comando docker-compose up -d.
Aguarde alguns segundos para que o container do PostgreSQL seja inicializado.
Execute o comando mvn spring-boot:run.
A API estará rodando na porta 8082.

Ajustes no Frontend
Ainda faltam ajustes no frontend para permitir a criação, listagem, alteração e remoção de veículos através da interface web.

Observações
A imagem postgres utilizada no docker-compose.yaml é a versão oficial do PostgreSQL no Docker Hub.
O volume postgres-data é utilizado para persistir os dados do banco de dados.
A porta 5432 do container é mapeada para a porta 5434 da máquina local.
Links Úteis
