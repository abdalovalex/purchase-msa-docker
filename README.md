### Домашнее задание
Обернуть приложение в docker-образ и запушить его на Dockerhub

**Цель:**
Обернуть приложение в docker-образ и запушить его на Dockerhub

Описание/Пошаговая инструкция выполнения домашнего задания:

**Шаг 1.** Создать минимальный сервис, который отвечает на порту *8000*
имеет http-метод:
```
GET /health/
RESPONSE: {"status": "OK"}
```

**Шаг 2.** Cобрать локально образ приложения в докер контейнер под архитектуру AMD64.  
Запушить образ в dockerhub.  
На выходе необходимо предоставить имя репозитория и тэг на Dockerhub ссылку на github c Dockerfile,  
либо приложить Dockerfile в ДЗ

### Запуск
Сборка
```
docker build . --tag "purchase-msa-docker"
```

Запуск
```
docker run -p 8000:8000 purchase-msa-docker
```
Доступ http://localhost:8000/health