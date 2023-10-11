#language:pt
#encoding:utf-8

@mpsc
Funcionalidade: Validar o registro de Novo Usuário

  Cenario: Registrar novo usuário com sucesso (Dados aleatórios)
    Dado que acesso o sistema
    E clico em 'Novo Usuario?'
    E informo os dados de usuario
    Quando clico em 'Cadastrar'
    Então o sistema deve apresentar a mensagem "Usuário inserido com sucesso"

  Esquema do Cenario: Validar Campos obrigatórios
    Dado que acesso o sistema
    E clico em 'Novo Usuario?'
    E informo os dados de usuario "<nome>""<email>""<senha>"
    Quando clico em 'Cadastrar'
    Então o sistema deve apresentar a mensagem "<mensagem>"
    Exemplos: Nome Obrigatório
      | nome  | email           | senha  | mensagem                     |
      |       | Teste@gmail.com | 123456 | Nome é um campo obrigatório  |
    Exemplos: Email Obrigatório
      | nome  | email           | senha  | mensagem                     |
      | Teste |                 | 123456 | Email é um campo obrigatório |
    Exemplos: Senha Obrigatória
      | nome  | email           | senha  | mensagem                     |
      | Teste | Teste@gmail.com |        | Senha é um campo obrigatório |