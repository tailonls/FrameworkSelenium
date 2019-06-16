#language: pt
Funcionalidade: Pesquisa no google
  
  Como um usuario da internet
  Gostaria de acessar o Google
  Para realizar pesquisas

  @teste
  Cenario: Realizar um pesquisa
    Dado que acesso o site do google
    E informo o termo "teste" no campo de pesquisa
    Quando clico no botao "Pesquisa Google"
    Entao deve carregar a pagina de pesquisa por "Todas"

  @test
  Cenario: Realizar pesquisa de imagens
    Dado que acesso o site do google
    E informo o termo "teste" no campo de pesquisa
    E clico no botao "Pesquisa Google"
    Entao deve carregar a pagina de pesquisa por "Todas"
    Quando clico na aba "Imagens"
    Entao deve carregar a pagina de pesquisa por "Imagens"
