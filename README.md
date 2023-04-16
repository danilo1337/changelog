# changelog


# Docker
Repositório [Docker hub](https://hub.docker.com/repository/docker/danilo1337/changelog/general)


* crie um arquivo docker-compose.yaml

```yaml
version: "3.7"
services:
    springboot:
      image: danilo1337/changelog:latest 
      ports:
        - '8080:8080'
```

* Execute os comandos
``` shell
$ docker-compose pull
$ docker-compose up -d
```


* Acesse a página do projeto

#### http://localhost:8080/static/index.html


![Pagnia Web](./src/main/resources/static/changelog.png)

______________________________

## Scripts para carga inicial
### Windows
```bat
@echo off

PowerShell -Command "Invoke-RestMethod -Uri 'http://localhost:8080/projects' -Method POST -ContentType 'application/json' -Body '{\"name\": \"Projeto A\",\"lastUpdated\": \"2023-04-13\",\"infoLink\": \"https://dominio.com.br/projeto-a\",\"description\": \"Corrigido bug do LOG4j\",\"color\": \"blue\"}'"


PowerShell -Command "Invoke-RestMethod -Uri 'http://localhost:8080/projects' -Method POST -ContentType 'application/json' -Body '{\"name\": \"Projeto B\",\"lastUpdated\": \"2023-04-13\",\"infoLink\": \"https://dominio.com.br/projeto-b\",\"description\": \"Corrigido bug do LOG4j\",\"color\": \"blue\"}'"


PowerShell -Command "Invoke-RestMethod -Uri 'http://localhost:8080/projects' -Method POST -ContentType 'application/json' -Body '{\"name\": \"Projeto C\",\"lastUpdated\": \"2023-04-13\",\"infoLink\": \"https://dominio.com.br/projeto-c\",\"description\": \"Corrigido bug do LOG4j\",\"color\": \"blue\"}'"

pause
```

### Linux
```shell
#!/bin/bash

curl --location 'localhost:8080/projects' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Projeto A",
    "lastUpdated": "2023-04-13",
    "infoLink": "https://dominio.com.br/projeto-a",
    "description": "Corrigido bug do LOG4j",
    "color": "blue"
}'


curl --location 'localhost:8080/projects' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Projeto B",
    "lastUpdated": "2023-04-13",
    "infoLink": "https://dominio.com.br/projeto-b",
    "description": "Corrigido bug do LOG4j",
    "color": "blue"
}'
```


