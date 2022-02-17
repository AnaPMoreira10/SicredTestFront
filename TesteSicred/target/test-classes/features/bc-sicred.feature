#Author: Ana Paula   

Feature: Cadastro de Cliente


  @sicred
  Scenario: Preenchimento de Formulário
    Given que eu acesse o site "https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap"
    And mudo o valor o valor da combo Select version para Bootstrap V Theme
    And ao clicar no botão Add Record
    When preencher os campos do formulário
    Then valido as informações enviadas
    
  