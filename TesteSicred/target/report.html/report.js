$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bc-sicred.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Ana Paula"
    }
  ],
  "line": 3,
  "name": "Cadastro de Cliente",
  "description": "",
  "id": "cadastro-de-cliente",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Preenchimento de Formulário",
  "description": "",
  "id": "cadastro-de-cliente;preenchimento-de-formulário",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@sicred"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que eu acesse o site \"https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "mudo o valor o valor da combo Select version para Bootstrap V Theme",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "ao clicar no botão Add Record",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "preencher os campos do formulário",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "valido as informações enviadas",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap",
      "offset": 22
    }
  ],
  "location": "Steps.que_eu_acesse_o_site(String)"
});
formatter.result({
  "duration": 4860688000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.mudo_o_valor_o_valor_da_combo_Select_version_para_Bootstrap_V_Theme()"
});
formatter.result({
  "duration": 2437200600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.ao_clicar_no_botão_Add_Record()"
});
formatter.result({
  "duration": 1457345400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.preencher_os_campos_do_formulário()"
});
formatter.result({
  "duration": 842469900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.valido_as_informações_enviadas()"
});
formatter.result({
  "duration": 2904434400,
  "status": "passed"
});
});