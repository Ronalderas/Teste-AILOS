#Autor: Ronalderas

Feature: Navegar e realizar compras no site
  Eu como usuario quero fazer login no site navegar e realizar compras

	
  Scenario: Login com usuario bloqueado
    Given que eu esteja no site "https://www.saucedemo.com"
    When informar um usuario bloqueado 
    Then valido que o usuario esta bloqueado e não pode efetuar o login
   
   
    Scenario: Realizar uma compra com mais de um produto no carrinho
    Given que eu esteja no site "https://www.saucedemo.com"
    When informar um usuario valido
    And selecionar mais de um produto e clicar em <add to cart>
    And clicar em <checkout>
    And informar os dados pessoais validos
    And clicar em <continue>
    And clicar em <finish>
    Then valido que a compra foi efetuada com sucesso
    
    Scenario: Adicionar todos os produtos ao carrinho e validar o valor total
    Given que eu esteja no site "https://www.saucedemo.com"
    When informar um usuario valido
    And selecionar todos os produtos e clicar em <add to cart>
    Then valido que a compra foi efetuada com sucesso
 