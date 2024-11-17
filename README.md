# TonberryPay

_Pay me or i'll stab you_

![tonberrypay](./doc/tonberry.jpg)

Repo pra treinar com esse desafio aqui: https://github.com/PicPay/picpay-desafio-backend?tab=readme-ov-file

## Definições Técnicas 💻🏢👥

### Tecnologias 💻

![Kotlin](https://img.shields.io/badge/Kotlin-B125EA?style=for-the-badge&logo=kotlin&logoColor=white)
![Springboot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![AWS](https://img.shields.io/badge/Amazon_AWS-FF9900?style=for-the-badge&logo=amazonaws&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white)

### Desenho de Solução 🏢

Desconsiderando o sistema de cadastro de Usuários, a solução do TonberryPay será feita em microsserviços baseados em uma arquitetura orientada a Eventos (EDA).

Serão dois microsserviços principais, um responsável por gerenciar todas as etapas e validações de domínio de transferência, outro responsável pelo domínio de comunicações.

![TonberryPay - Desenho de Solução](./doc/TonberryPay-Desenho%20de%20solucao.png)

A ideia principal desta abordagem é separar os serviços por contexto e caso de uso, permitindo que outros serviços possam usufruir dos mesmos eventos e desempenhar seus papéis com base na mensagem consumida.

Por exemplo: Após a transferência, o usuário pode precisar que um comprovante (ou nota fiscal) seja gerado e enviado por e-mail. Com base no evento de sucesso gerado pelo serviço de transferência, o terceiro serviço de geração de comprovantes pode coletar as informações na mensagem e enriquecer o arquivo que será disponibilizado as partes da transferência.

### UML 👥

![TonberryPay-UML](./doc/TonberryPay-UML.png)

## Rodando o projeto Localmente
