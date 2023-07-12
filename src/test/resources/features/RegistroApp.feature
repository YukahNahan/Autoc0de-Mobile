Feature: Registro App Underc0de


  @regresion @registroApp
  Scenario Outline: El usuario se registra correctamente en Underc0de App
    Given El usuario está en la pantalla de inicio de sesión de la aplicación Underc0de
    When El usuario ingresa sus credenciales Nombre de Usuario: '<username>' y Password '<password>'
    And El usuario hace tap en el boton Ingresar
    And Ingresa datos personales de Usuario: '<nombre>' y Apellido '<apellido>' y Telefono '<telefono>' y Email '<email>' y Fecha de Nacimiento '<fechaNacimiento>'
    And El usuario hace tap en el boton Guardar
    Then El usuario valida la pantalla de registracion en Autoc0de App
    Examples:
      | username | password | nombre | apellido | telefono | email | fechaNacimiento |
      |          |          |        |          |          |       |                 |
