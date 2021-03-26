# language: pt
# @ignore
Funcionalidade: Visualizar itens de cursos
  Estamos criando uma rotina de teste para validar a visualização de elementos relacionados a cursos

  #Cenario: Visualizar os itens para comprar um curso
  #  Quando eu acesso o site da gama academy "https://pages.gama.academy/curso-de-product-management/"
  #  E clico na opcao "QUERO IR PARA O PRÓXIMO NÍVEL"
  #  Entao devo ver o valor e o botao de comprar agora

  Cenario: Visualizar as opcoes de dev fullstack
    Quando eu acesso o site da gama academy "https://www.gama.academy/"
    E clico para fechar a propaganda
    E clico na opcao "Dev fullstack"
    Entao devo ver as opcoes
    |Crie seu portfólio!| 
    |Acompanhamento de Carreira|
    |Professores de surf que sabem surfar!|
    |Estude na Melhor Startup de Educação|
