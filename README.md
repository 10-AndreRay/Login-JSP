## Login Page With JavaEE (Servlet + JSP)

<p>
  <img src="https://img.shields.io/static/v1?label=Java&message=Language&color=blue&style=for-the-badge&logo=SPRING%22"/>
  <img src="http://img.shields.io/static/v1?label=License&message=MIT&color=red&style=for-the-badge"/>
  <img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>
<p>
  
## Descrição do projeto 

<p align="justify">
  Sistema de login com autenticação usando banco de dados MySQL e uso de sessão com autenticação do usuário
  <br>
</p>

## Linguagens, dependencias e libs utilizadas :books:

- [Java](https://java.com/)
- [Eclipse](https://www.eclipse.org/)
- [Tomcat 9](https://tomcat.apache.org/)
- [MySQL Connector](https://downloads.mysql.com/archives/c-j/)

## Requisitos para rodar o projeto:
- JDK 11+ instalado na sua máquina
- Servidor Tomcat
- MySQL
- MySQL Driver

## Rotas:
### Login Controller:
HTTP  | Rotas |  Resultado
--------- | ------ | ------
POST | localhost:8080/Login/ | Retorna o formulário de login se não existir usuário logado.

### Log Off Controller:
HTTP  | Rotas | Resultado
--------- | ------ | ------
GET | localhost:8000/Login/logoff | Retorna a form-login.jsp e invalida a sessão.
