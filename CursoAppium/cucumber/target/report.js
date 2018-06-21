$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/br/com/appium/cucumber/mobile/homebanking/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login segundo acesso",
  "description": "",
  "id": "login-segundo-acesso",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Acessar o aplicativo Cetelem",
  "description": "",
  "id": "login-segundo-acesso;acessar-o-aplicativo-cetelem",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@CucumberRunner"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "estou logada na VPN Banco Cetelem e no aplicativo HomeBanking informo o numero de CPF \"24258594385\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "clico no botao Acessar",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "informo a senha de acesso cadastrada",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "clico no botao Confirmar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "o usuario se loga no aplicativo cetelem",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "24258594385",
      "offset": 87
    }
  ],
  "location": "StepDefinitions.openAPK(String)"
});
formatter.result({
  "duration": 49554518483,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicaBotaoAcessar()"
});
formatter.result({
  "duration": 4170490655,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.preencheSenha()"
});
formatter.result({
  "duration": 4496208512,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicaBotaoConfirmar()"
});
formatter.result({
  "duration": 6724121366,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verificaSeUsuarioLogadoComSucesso()"
});
formatter.result({
  "duration": 140977837,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": ": Acessar a opcao Meu Cartao",
  "description": "",
  "id": "login-segundo-acesso;:-acessar-a-opcao-meu-cartao",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "que estou logada no aplicativo Cetelem menu cartoes",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "clico na opcao Meu cartao",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "o aplicativo carrega a pagina Meu cartao",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.verificaSeMenuCartoes()"
});
formatter.result({
  "duration": 124769373,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicaMeuCartao()"
});
formatter.result({
  "duration": 203777593,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verificaSeTelaMeuCartao()"
});
formatter.result({
  "duration": 2165964948,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": ": Acessar o botao Ver Fatura",
  "description": "",
  "id": "login-segundo-acesso;:-acessar-o-botao-ver-fatura",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "que estou na tela Meu Cartao",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "clico no botao \u003cVer Fatura\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "o aplicativo carrega a tela Faturas",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.que_estou_na_tela_Meu_Cartao()"
});
formatter.result({
  "duration": 176180058,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicarVerFatura()"
});
formatter.result({
  "duration": 206141698,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verificaSeTelaFaturas()"
});
formatter.result({
  "duration": 209260153,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": ": Sair do aplicativo HomeBanking",
  "description": "",
  "id": "login-segundo-acesso;:-sair-do-aplicativo-homebanking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "estou logada no aplicativo cetelem",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "clico no menu Servicos",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "clico no botao \u003cSAIR\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "o usuario sera direcionado para tela de login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.estou_logada_no_aplicativo_cetelem()"
});
formatter.result({
  "duration": 1580799556,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.acessaServicos()"
});
formatter.result({
  "duration": 575316997,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicaBotaoSair()"
});
formatter.result({
  "duration": 4574758044,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verificaSeTelaLogin()"
});
formatter.result({
  "duration": 243595918,
  "status": "passed"
});
});