Feature: Login segundo acesso 
@CucumberRunner
Scenario Outline: Acessar o aplicativo Cetelem 

	Given estou logada na VPN Banco Cetelem e no aplicativo HomeBanking informo o numero de CPF "<CPF>"
	When  clico no botao Acessar 
	And   informo a senha de acesso cadastrada 
	And   clico no botao Confirmar 
	Then  o usuario se loga no aplicativo cetelem 
		
	
Examples:
|CPF           |
|24258594385   |
|              |
|              |
|              |
|              |
|              |	
	
	
	
	
	
	
	
	
