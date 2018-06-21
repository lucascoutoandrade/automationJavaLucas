$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/br/com/appium/cucumber/mobile/homebanking/feature/Login.feature");
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
  "duration": 41361396925,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicaBotaoAcessar()"
});
formatter.result({
  "duration": 2477815945,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.preencheSenha()"
});
formatter.result({
  "duration": 4807324895,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicaBotaoConfirmar()"
});
formatter.result({
  "duration": 6746641345,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verificaSeUsuarioLogadoComSucesso()"
});
formatter.result({
  "duration": 116372045,
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
  "duration": 115382824,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicaMeuCartao()"
});
formatter.result({
  "duration": 153244416,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verificaSeTelaMeuCartao()"
});
formatter.result({
  "duration": 298689143,
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
  "duration": 1767231436,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicarVerFatura()"
});
formatter.result({
  "duration": 183780404,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verificaSeTelaFaturas()"
});
formatter.result({
  "duration": 181746303,
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
  "duration": 581921015,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.acessaServicos()"
});
formatter.result({
  "duration": 516284255,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicaBotaoSair()"
});
formatter.result({
  "duration": 7952080404,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.verificaSeTelaLogin()"
});
formatter.result({
  "duration": 1308477934,
  "status": "passed"
});
});