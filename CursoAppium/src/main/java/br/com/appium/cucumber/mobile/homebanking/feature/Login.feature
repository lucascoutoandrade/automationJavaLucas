Feature: Login segundo acesso 
@CucumberRunner
Scenario: Acessar o aplicativo Cetelem 

	Given estou logada na VPN Banco Cetelem e no aplicativo HomeBanking informo o numero de CPF "24258594385"
	When  clico no botao Acessar 
	And   informo a senha de acesso cadastrada 
	And   clico no botao Confirmar 
	Then  o usuario se loga no aplicativo cetelem 
		
Scenario: :  Acessar a opcao Meu Cartao 

	Given que estou logada no aplicativo Cetelem menu cartoes 
	When  clico na opcao Meu cartao 
	Then  o aplicativo carrega a pagina Meu cartao 
	
	
Scenario: : Acessar o botao Ver Fatura 

	Given que estou na tela Meu Cartao 
	When  clico no botao <Ver Fatura> 
	Then  o aplicativo carrega a tela Faturas 
	
	
Scenario: : Sair do aplicativo HomeBanking 

	Given estou logada no aplicativo cetelem 
	And   clico no menu Servicos 
	When  clico no botao <SAIR> 
	Then  o usuario sera direcionado para tela de login 
	

	
	
	
	
	
	
	
	
	
