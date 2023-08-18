Feature: Slides Bienvenida App Underc0de


  @regresion @slides @ayuda
  Scenario: El usuario valida visualizacion correcta de Slides en Underc0de App
    Given El usuario esta en la pantalla de Bienvenida de la aplicacion Underc0de
    When El usuario hace scroll horizontal y valida desplazamiento de Slides
    And El usuario esta en la pantalla de inicio de sesion de la aplicacion Underc0de
    When El usuario hace tap en el boton Necesitas Ayuda?
    And El usuario hace scroll horizontal y valida desplazamiento
    And El usuario hace scroll horizontal y valida desplazamiento
    And El usuario hace scroll horizontal y valida desplazamiento
    Then El usuario esta en la pantalla de inicio de sesion de la aplicacion Underc0de