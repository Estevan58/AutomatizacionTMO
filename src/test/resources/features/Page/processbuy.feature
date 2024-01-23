Feature: Funcionalidades de la página TMO

  Background:
    Given El usuario abre la página TMO

  @login
  Scenario: Registrarse en la página TMO

    When El usuario hace clic en el enlace de registro
    And Completa el formulario de registro con información válida
    And Hace clic en el botón de registro
    Then El usuario debería ser redirigido a la página de inicio de sesión

@Acceder
  Scenario: Acceder a la página TMO
    When El usuario hace clic en el boton para iniciar sesion
    And Ingresa las credenciales de usuario
    And Hace clic en el boton para acceder
    Then El usuario debería ser redirigido a la pagina principal

    @buscar
  Scenario: Buscar una manga en la barra de búsqueda

    And Inicia sesión con credenciales válidas
    When El usuario busca un anime específico en la barra de búsqueda
    And Presiona Enter o hace clic en el botón de búsqueda
    Then Deberían mostrar los resultados relacionados con el manga buscado

