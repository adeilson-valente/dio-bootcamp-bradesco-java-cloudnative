# API Gerenciamento de Estoque

```mermaid
classDiagram
    direction TB

    class Produto {
        +Long id
        +String nome
        +String descricao
        +Double preco
        +Integer quantidadeEmEstoque
        +String categoria
    }

    class MovimentacaoEstoque {
        +Long id
        +Integer quantidade
        +String tipo  # Alterado para String (sem enum)
        +LocalDateTime data
    }

    class Categoria {
        +Long id
        +String nome
    }


    Produto "1" -- "*" MovimentacaoEstoque : "contém"
    Produto "1" -- "1" Categoria : "categoria"
    ```