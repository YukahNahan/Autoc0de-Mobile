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
    Then El usuario hace scroll vertical y valida desplazamiento
    #Then Verifica entradas registradas


  @entradasScroll
  Scenario: Se valida que los botones de las Entradas registradas se visualizan correctamente en el Modulo Dudas al scrollear en Underc0de App
    When El usuario valida botones de Main Dashboard
    And Hace tap en el boton 'DUDAS'
    Then El usuario hace scroll vertical y valida desplazamiento

  @entradasScroll @publicar
  Scenario: Se valida agregar consulta en el Modulo Dudas en Underc0de App
    When El usuario valida botones de Main Dashboard
    And Hace tap en el boton 'DUDAS'
    And Hace tap en el boton 'AGREGAR_POST'
    And Verifica formulario publicar posteo
    When Publica nueva consulta
    And El usuario valida botones de Main Dashboard
    And Hace tap en el boton 'DUDAS'
    And El usuario hace scroll horizontal y valida desplazamiento
    And Hace tap en el boton 'CONSULTA'
    When Comenta en la consulta realizada de forma correcta
    And Hace tap en el boton 'VOLVER'
    And Hace tap en el boton 'DUDAS'
    Then El usuario hace scroll vertical y valida desplazamiento
