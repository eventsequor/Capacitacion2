#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Busqueda de empleo
  I want to use this template for my feature file

  Background: 
    Given El elige el navegador "google"
    Given La urlDelNavegador "https://www.elempleo.com/"
    Then El usuario lanza el navegador con la pagina

  @BusquedaEmpleos
  Scenario Outline: Escenario busqueda
    Then el usuario hace clic en buscar empleo
    Then el usuario busca "<OpcionBusqueda>"
    Then el usuario solicita a la pagina que busque empleos relacionados
    And el usuario espera <tiempoA> segundos
    Then el usuario imprime las opciones de busqueda
    And el usuario espera <tiempoB> segundos
    Then el usuario cierra el navegador
    Examples:
      | OpcionBusqueda | tiempoA | tiempoB |
      | Automatizador  |       9 |       3 |
      | Desarrollador  |       9 |       3 |
