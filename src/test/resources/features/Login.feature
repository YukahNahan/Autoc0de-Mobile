Feature: Login Basico


  @regresion @login
  Scenario Outline: El usuario se loguea correctamente en Underc0de App
    Given El usuario esta en la pantalla de inicio de sesion de la aplicacion Underc0de
    When El usuario ingresa sus credenciales Nombre de Usuario: '<username>' y Password '<password>'
    And El usuario hace tap en el boton Ingresar
    Then El usuario valida resultado de login en App Underc0de
    Examples:
      | username | password   |
      | Autoc0de | Underc0de  |
      | Autoc0de | Underc0000 |
      | Autocde  |            |
      |          | Underc0de  |
      | Autoc0de |            |
