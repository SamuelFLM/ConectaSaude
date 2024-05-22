# Sistema de Agendamento de Consultas Médicas

## Descrição

Este sistema é uma aplicação de agendamento de consultas médicas, projetada para pacientes e médicos. Ele permite que os pacientes agendem consultas com médicos disponíveis, visualizem suas consultas agendadas e realizem edições ou cancelamentos conforme necessário. Os médicos podem visualizar as consultas agendadas com eles.

## Funcionalidades

### Para Pacientes:

1. **Agendamento de Consultas**:

   - Os pacientes podem agendar consultas com médicos disponíveis.
   - Eles fornecem a data e hora desejadas para a consulta.
   - O sistema verifica a disponibilidade do médico e confirma o agendamento.

2. **Visualização de Consultas Agendadas**:

   - Os pacientes podem ver todas as consultas agendadas por eles.
   - As informações exibidas incluem a data, hora, médico e especialidade.

3. **Edição de Consultas**:

   - Os pacientes podem editar a data e hora de uma consulta agendada.
   - O sistema verifica a disponibilidade do médico antes de confirmar a alteração.

4. **Cancelamento de Consultas**:
   - Os pacientes podem cancelar consultas agendadas.
   - O sistema remove a consulta da lista.

### Para Médicos:

1. **Visualização de Consultas Agendadas**:

   - Os médicos podem ver todas as consultas agendadas com eles.
   - As informações exibidas incluem a data, hora, paciente e motivo da consulta.

2. **Atualização de Disponibilidade**:
   - Os médicos podem definir seus horários de disponibilidade.
   - O sistema verifica a disponibilidade ao agendar consultas.

## Tecnologias Utilizadas

- Linguagem de Programação: Java
- Estrutura de Dados: ArrayList para armazenar cadastros e consultas
- Formato de Data e Hora: SimpleDateFormat
- Persistência de Dados: Os dados são mantidos em memória durante a execução do programa (sem persistência em banco de dados)

## Como Executar

1. Compile e execute o programa Java.(JDK v22)
2. Siga as instruções no menu para agendar, visualizar, editar ou cancelar consultas.

## Observações

- Este sistema é uma versão simplificada para fins de demonstração.
- Em um ambiente de produção, seria necessário adicionar autenticação, persistência em banco de dados e outras funcionalidades.

## Testes - Como Rodar.

So clicar na parte de RUN TESTES.

<img src="img\runtests.png">

## Cobertura Total

<img src="img\image.png">
