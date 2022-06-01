# Prova Sicredi
## Alex Sarubbi Heleno da Silva

Teste realizado para a avalia��o de conhecimentos em automa��o de testes.

Tecnologias/linguagens utilizadas:

- Java
- TestNG
- Maven
- Bibliotecas Selenium

## Testes

- Desafio 1
- Desafio 2

> Foi utilizado o TestNG para a convers�o xml das classes
> Assim, � poss�vel visualizar em tempo real e por meio de UI, o teste sendo
> realizado. Basta rodar os arquivos 'desafio1.xml' e 'desafio2.xml' como 'TestNg'.

## Instala��o

Requer Maven 3.8 (https://maven.apache.org/download.cgi) e JDK 1.8 (https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html) instalados.

O arquivo `pom.xml` foi previamente configurado com os plugins Maven a serem utilizados.

`!!IMPORTANTE!!: as linhas 24 das classes 'Desafio1' e 'Desafio2' dever�o ser ajustadas para indicarem o caminho correto do chromedriver. Devr�o tamb�m ser descomentadas.`

## Execu��o dos testes com Maven

Na ra�z do projeto, executar:

Para execu��o do teste 'Desafio1':
```sh
 mvn clean test -DsuiteXMLFile=desafio1.xml
```
Para execu��o do teste 'Desafio2':
```sh
 mvn clean test -DsuiteXMLFile=desafio2.xml
```

## Depend�ncias

`Maven compiler utilizado: vers�o 1.7`
Depend�ncias utilizados:

| Depend�ncia | Origem |
| ------ | ------ |
| selenium-java | [https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java] |
| testng | [https://mvnrepository.com/artifact/org.testng/testng] |

## Plugins

Plugins utilizados:

| Plugin | Origem | Vers�o |
| ------ | ------ | ------ |
| maven-clean-plugin | org.apache.maven.plugins] | 3.2.0 |
| maven-surefire-plugi | [org.apache.maven.plugins] | 3.0.0-M6 |
| maven-compiler-plugin | [org.apache.maven.plugins] | 3.10.1 |
| maven-clean-plugin | [org.apache.maven.plugins] | 3.2.0 |