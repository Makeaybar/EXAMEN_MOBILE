@login
Feature: Login Sauce Demo

  @login_success
  Scenario: Login con credenciales válidas

    Given que estoy en la aplicación de Swag Labs
    When ingreso mis credenciales username "standard_user" y password "secret_sauce"
    Then el inicio de sesión es exitoso

  @login_user_locked
  Scenario: Login con usuario bloqueado

    Given que estoy en la aplicación de Swag Labs
    When ingreso mis credenciales username "locked_out_user" y password "secret_sauce"
    Then se muestra el mensaje de error "Sorry, this user has been locked out."