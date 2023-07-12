Feature: Login Basico


  @regresion @login
  Scenario Outline: El usuario se loguea correctamente en Underc0de App
    Given El usuario está en la pantalla de inicio de sesión de la aplicación Underc0de
    When El usuario ingresa sus credenciales Nombre de Usuario: '<username>' y Password '<password>'
    And El usuario hace tap en el boton Ingresar
    Then El usuario valida la pantalla Bienvenido a Autoc0de
    Examples:
      | username | password  |
      #| Autoc0de | Underc0de  |
      #| Autoc0de | Underc0000 |
      | Autoc0de |           |
      |          | Underc0de |
      #| Autoc0de | Underc0de |
