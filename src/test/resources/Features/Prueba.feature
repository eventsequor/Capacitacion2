Feature: Title of your feature
  I want to use this template for my feature file

  @fabrica1
  Scenario Outline: Title of your scenario
    And El usuario envia la palabra "<Oracion>"
    Given Dada una lista de números
    Given El usuario ingresa el número <numeroA>
    Given El usuario ingresa el número <numeroB>
    Given El usuario ingresa el número <numeroC>
    When El usuario suma los números ingresados
    Then El usuario valida que la sumatoria sea igual a <resultado>

    Examples: 
      | Oracion             | numeroA | numeroB | numeroC | resultado |
      | esta es una oracion |       3 |       2 |       4 |         9 |
      | esta es una oracion |       5 |       7 |       8 |        20 |
      | esta es una oracion |       5 |       2 |      45 |         9 |
      | esta es una oracion |       7 |       3 |       9 |        19 |
