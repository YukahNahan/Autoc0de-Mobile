@regresion @mainDashboard
Feature: Main Dashboard App Underc0de
  Background:
    Given El usuario esta en la APP Underc0de

  @botonesMainDashboard
  Scenario: Se valida que los botones del Main Dashboard se visualizan correctamente en Underc0de App
    When El usuario valida botones de Main Dashboard
    And Hace tap en el boton Beneficios
    And Hace tap en el boton Dudas
    And Hace tap en el boton Comunidad
    And Hace tap en el boton Salir
    Then El usuario valida salida de la app correctamente