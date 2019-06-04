#language: pt
Funcionalidade: Cadastro de contas
  
  Como um usuário 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  @teste
  Esquema do Cenario: Vaidar as regras de contas
    Dado que acesso o sistema e realizo login
    Quando seleciono a opcao "Adicionar" no menu "Contas"
    E informo a conta "<Conta>"
    E seleciono "Salvar"
    Então verifico que a mensagem <Mensagem> foi mostrada na tela

    Exemplos: 
      | Conta          | Mensagem                             |
      | Conta de Teste | "Conta adicionada com sucesso!"      |
      | Conta de Teste | "Já existe uma conta com esse nome!" |
      |                | "Informe o nome da conta"            |
