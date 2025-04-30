# 🌐 Visão Geral do Portal Azure

## Interface e Personalização
- **Interface do Portal**: 
  - Utiliza uma conta *trial* do Azure, com funcionalidades semelhantes às contas ativas (algumas limitações por restrições de custo/região).
- **Personalização**: 
  - Ajustes de idioma, aparência e configurações para adaptar às preferências do usuário.

---

# 🧱 Componentes Fundamentais da Arquitetura Azure

## Regiões e Zonas de Disponibilidade
- **Regiões**: 
  - Conjuntos de datacenters em áreas geográficas específicas, oferecendo flexibilidade e escalabilidade.
- **Zonas de Disponibilidade (AZs)**: 
  - Datacenters fisicamente separados dentro de uma mesma região, garantindo alta disponibilidade e tolerância a falhas.

## Pares de Regiões
- **Redundância e Recuperação de Desastres**: 
  - Regiões emparelhadas geograficamente.
  - Atualizações aplicadas sequencialmente para minimizar impactos.

## Grupos de Recursos
- **Função**: 
  - Agrupar recursos relacionados (VMs, bancos de dados, redes) para facilitar gerenciamento, políticas e controle de custos.

## Assinaturas e Grupos de Gerenciamento
- **Assinaturas**: 
  - Contêineres lógicos para provisionar recursos, gerenciar custos e acessos.
- **Grupos de Gerenciamento**: 
  - Estruturas hierárquicas para organizar assinaturas e aplicar políticas centralizadas.

---

# 🔐 Segurança e Acesso
- **Azure Bastion**: 
  - Acesso seguro a VMs diretamente pelo portal, sem necessidade de IPs públicos.
- **Firewalls e Políticas**: 
  - Proteção de recursos com conformidade e segurança de dados.

---

# 💾 Armazenamento e Migração de Dados
- **Serviços de Armazenamento**: 
  - Blob Storage, File Storage, etc., com opções de desempenho e redundância.
- **Migração de Dados**: 
  - Ferramentas especializadas para transferência de grandes volumes para a nuvem.

---

# ⚠️ Serviços em Versão Prévia
- **Atenção**: 
  - Serviços em *preview* não possuem SLA completo. Evite uso em produção.

---

# ✅ Conclusão
Este laboratório oferece uma base prática para:
- Projetar soluções na nuvem com **disponibilidade**, **segurança** e **eficiência**.
- Explorar o potencial do Azure para ambientes *cloud-native*.