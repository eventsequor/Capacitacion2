Feature: Clase número 10
  I want to use this template for my feature file

  Background: Nombre de la precondición
    Given El usuario envia la oracion "Buen día"

  Scenario: Primer escenario
    Then La longitud de la oración debe ser de 8

  @Clase10
  Scenario: Segundo escenario
    When El usuario concatena la oración " compañeros"
    Then El usuario valida, la oración esperada es "Buen día compañeros"
