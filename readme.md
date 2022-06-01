# Prova Sicredi
## Alex Sarubbi Heleno da Silva

Teste realizado para a avaliação de conhecimentos em automação de testes.

Tecnologias/linguagens utilizadas:

- Java
- TestNG
- Maven
- Bibliotecas Selenium

## Testes

- Desafio 1
- Desafio 2

> Foi utilizado o TestNG para a conversão xml das classes
> Assim, é possível visualizar em tempo real e por meio de UI, o teste sendo
> realizado. Basta rodar os arquivos 'desafio1.xml' e 'desafio2.xml' como 'TestNg'.

## Instalação

Requer Maven 3.8 (https://maven.apache.org/download.cgi) e JDK 1.8 (https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html) instalados.

O arquivo `pom.xml` foi previamente configurado com os plugins Maven a serem utilizados.

`!!IMPORTANTE!!: as linhas 24 das classes 'Desafio1' e 'Desafio2' deverão ser ajustadas para indicarem o caminho correto do chromedriver. Devrão também ser descomentadas.`

## Execução dos testes com Maven

Na raíz do projeto, executar:

Para execução do teste 'Desafio1':
```sh
 mvn clean test -DsuiteXMLFile=desafio1.xml
```
Para execução do teste 'Desafio2':
```sh
 mvn clean test -DsuiteXMLFile=desafio2.xml
```

## Dependências

`Maven compiler utilizado: versão 1.7`
Dependências utilizados:

| Dependência | Origem |
| ------ | ------ |
| selenium-java | [https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java] |
| testng | [https://mvnrepository.com/artifact/org.testng/testng] |

## Plugins

Plugins utilizados:

| Plugin | Origem | Versão |
| ------ | ------ | ------ |
| maven-clean-plugin | org.apache.maven.plugins] | 3.2.0 |
| maven-surefire-plugi | [org.apache.maven.plugins] | 3.0.0-M6 |
| maven-compiler-plugin | [org.apache.maven.plugins] | 3.10.1 |
| maven-clean-plugin | [org.apache.maven.plugins] | 3.2.0 |