# Resumo do Conteúdo Aprendido – SLA e Disponibilidade na Nuvem

Neste laboratório, exploramos os **Acordos de Nível de Serviço (SLA)** e sua relação com a disponibilidade de sistemas em cloud computing.

## 1. Entendendo o SLA e o Tempo de Inatividade
- O **SLA** define o nível de disponibilidade garantido por um provedor de nuvem.
- **Quanto maior a porcentagem**, menor o tempo de inatividade permitido:
  - `99,9%` → ~8,76h de indisponibilidade/ano.
  - `99,999%` → ~5,26 minutos/ano.
- **Aplicação crítica**: Sistemas bancários, saúde e outros de alta disponibilidade.

## 2. Configuração de Máquinas Virtuais e Disponibilidade
- **Opções de alta disponibilidade**:
  - **Zonas de Disponibilidade (AZs)**: Data centers separados para tolerância a falhas.
  - **Redundância Geográfica**: Replicação em regiões distintas contra desastres locais.
- **Regra geral**: Quanto mais distribuído, menor o risco de falha.

## 3. Documentação e Tomada de Decisão
- **Provedores (AWS, Azure, GCP)** oferecem documentação detalhada sobre SLAs.
- Durante a configuração:
  - Utilize **ícones explicativos** ou o botão *"Saiba mais"*.
  - **Custo vs. Benefício**: Redundância aumenta confiabilidade, mas pode custar mais.

## 4. Redundância e Resiliência
- **Chave para alta disponibilidade**:
  - Exemplo: Falha em uma AZ → tráfego redirecionado automaticamente.
  - Minimiza *downtime*.

## Conclusão
O SLA é **fundamental** para arquiteturas na nuvem, influenciando:
- Escolha de serviços.
- Estratégias de redundância.
- Balanceamento entre **custo**, **performance** e **confiabilidade**.
