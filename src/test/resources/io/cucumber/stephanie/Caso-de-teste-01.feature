# language: pt
@ignore
Funcionalidade: Visualizar itens
  Estamos criando uma rotina de teste para validar a visualização do elemento manifesto

  Cenario: Visualizar o elemento manifesto
    Quando eu acesso o site da gama academy "https://www.gama.academy/"
    E clico para fechar a propaganda
    E clico na opcao "Quem somos"
    Entao devo ver o item "manifesto"  