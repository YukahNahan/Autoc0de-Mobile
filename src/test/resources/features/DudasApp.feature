@regresion @dudasPost
Feature: Modulo Dudas App Underc0de
  Background:
    Given El usuario esta en la APP Underc0de

  @botonesEntradas
  Scenario: Se valida que los botones de las Entradas registradas en el Modulo Dudas se visualizan correctamente en Underc0de App
    When El usuario valida botones de Main Dashboard
    And Hace tap en el boton 'DUDAS'
    And Hace tap en el boton 'AGREGAR_POST'
    #And El usuario hace tap en el boton Agregar Duda
    And Verifica formulario publicar posteo
    And Hace tap en el boton 'VOLVER'
    Then El usuario hace scroll y valida desplazamiento
    #Then Verifica entradas registradas


  @entradasScroll
  Scenario: Se valida que los botones de las Entradas registradas se visualizan correctamente en el Modulo Dudas al scrollear en Underc0de App
    When El usuario valida botones de Main Dashboard
    And Hace tap en el boton 'DUDAS'
    Then El usuario hace scroll y valida desplazamiento
