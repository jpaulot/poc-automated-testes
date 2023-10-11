#language:pt
#encoding:utf-8

@mpsc
Funcionalidade: Efetuar Login
  Como usuário do sistema, pretendo efetuar login tanto com um usuário novo quanto com um já existente.

  Cenario: Efetuar Login com usuário já cadastrado
    Dado que acesso o sistema
    Quando efetuo login com os dados
      | email | tmz.automation@gmail.com |
      | senha | 123456                   |
    Então o sistema deve apresentar a mensagem "Bem vindo, tmz.automation!"


  Cenario: Efetuar Login com novo usuário (Dados aleatórios)
    Dado que acesso o sistema
    E clico em 'Novo Usuario?'
    E informo os dados de usuario
    E clico em 'Cadastrar'
    E efetuo login com os dados registrados
    Então o sistema deve apresentar a mensagem de boas vindas para o usuário cadastrado


  Cenario: Efetuar Login com usuário já cadastrado (Cenário com falha)
    Dado que acesso o sistema
    Quando efetuo login com os dados
      | email | tmz.automation@gmail.com |
      | senha | 123456                   |
    Então o sistema deve apresentar a mensagem "Cenário com falha"


