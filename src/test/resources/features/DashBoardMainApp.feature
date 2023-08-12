@regresion @mainDashboard
Feature: Main Dashboard App Underc0de
  Background:
    Given El usuario esta en la APP Underc0de

  @botonesMainDashboard
  Scenario: Se valida que los botones del Main Dashboard se visualizan correctamente en Underc0de App
    When El usuario valida botones de Main Dashboard
    And Hace tap en el boton 'BENEFICIOS'
    And Hace tap en el boton 'DUDAS'
    And Hace tap en el boton 'COMUNIDAD'
    And Hace tap en el boton 'CREDENCIAL'
    And Hace tap en el boton 'SALIR'
    Then El usuario valida salida de la app correctamente