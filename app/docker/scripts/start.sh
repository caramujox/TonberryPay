#!/bin/sh
echo "Running custom script..."
# Adicione os comandos que você deseja executar aqui
aws sqs create-queue --queue-name filateste --endpoint-url http://localhost:4566