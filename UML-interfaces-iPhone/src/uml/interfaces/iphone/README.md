```mermaid
classDiagram
    class IPhone {
        +ligar()
        +desligar()
    }
    
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }
    
    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }
    
    class NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    IPhone --|> ReprodutorMusical
    IPhone --|> AparelhoTelefonico 
    IPhone --|> NavegadorInternet 
    ```