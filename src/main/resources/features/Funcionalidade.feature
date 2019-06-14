#language: pt
Funcionalidade: Pesquisa no google
  
  Como um usuario da internet
  Gostaria de acessar o Google.com
  Para realizar uma pesquisa qualquer

  @teste
  Cenario: Realizar pesquisa no site
    Dado que acesso o site do google
    E informo o termo "teste" no campo de pesquisa
    Quando clico no botao "Pesquisa Google"
    Entao deve carregar a pagina com resultados da pesquisa

  @test
  Cenario: Validar resultados aproximados em uma pesquisa
    Dado que acesso o site do google
    E informo o termo "teste" no campo de pesquisa
    Quando clico no botao "Pesquisa Google"
    Entao deve carregar a pagina com resultados da pesquisa
