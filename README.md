# **Jokenpo**
&gt; Um jogo desenvolvido para se jogar contra o celular que decide a jogada através de números aleatórios.

## Descrição
O **Jokenpo** permite ao usuário jogar pedra, papel ou tesoura contra o celular.

## Funcionalidades
- [x] Contador de Pontos (Derrotas, Vitórias, Empates)
- [x] Interface simples e intuitiva

## Tecnologias Utilizadas
- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ContraintLayout** para interface responsiva
- [x] **TextView** para exibição de dados e **ImageView** para entrada de dados
      
## Como Rodar o Projeto
Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:
```bash
git clone https://github.com/Klaiancdrosa/Jokenpo.git
```
2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.
   
## Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java
| | | | |── br.ulbra.jokenpo
│ │ │ │ | ├── MainActivity.java # Atividade principal que ocorre todo o calculo do bot e contagem das pontuações.
│ │ │ │ | ├── SplashActivityIni.java # Atividade secundária que ocorre a abertura do aplicativo.
│ │ │ ├── res
| | | | ├── drawable # imagens e icones utilizados na tela principal
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ | ├── activity_splash_ini.xml # Layout da tela de abertura do aplicativo.
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```

## Design e Prototipage
A interface do app foi criada usando **ConstraintLayout**;
O design é minimalista e fácil de usar, com foco na simplicidade.

## Telas do Jokenpo
**Tela Principal**
Na tela principal, o usuário poderá iniciar sua jogatina apertando qualquer botão de sua escolha.

![image](https://github.com/user-attachments/assets/e6a6bb0c-cbfc-44e0-b064-0fae45215629)

## Desenvolvedores
**Klaian Conceição da Rosa** - Desenvolvedor - [GitHub](https://github.com/Klaiancdrosa)

## Licenças
Este projeto está licenciado sob os termos da licença MIT. Para mais detalhes, veja o arquivo
[LICENSE](LICENSE).
