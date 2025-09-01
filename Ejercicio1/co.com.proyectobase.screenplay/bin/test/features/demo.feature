Feature: Login to viliv page

  @LoginSuccesfull
  Scenario: Login succesfull
    Given the user open application web Viliv
    When enter your credentials
      | email                           | password   |
      | jhordany.mosquera@pragma.com.co | Viliv.2020 |
    Then the user valid your name in home page

  @LoginFailure
  Scenario Outline: Wrong messages in Login
    Given the user open application web Viliv
    When enter your credentials
      | email   | password   |
      | <email> | <password> |
    Then the user observes <message>
    Examples:
      | email                           | password   | message                                                               |
      |                                 |            | * Campo requerido                                                     |
      | prueba@prueba.com               |            | * Campo requerido                                                     |
      |                                 | 123456     | * Campo requerido                                                     |
      | jhordany.mosquera               | 123456     | * Correo inválido                                                     |
      | ´++´{**__-                      | 123456     | * Correo inválido                                                     |
      | jhordany.mosquera@pragma.com.co | 12345      | * Datos incorrectos                                                   |
      | john.taborda@pragma.com.co      | Viliv2020* | * Se encontró inconsistencias en la información del registro de usuario |
      | jhordany.mosquera@pragma.com.co | 123        | * Debe contener mínimo 5 caracteres                                   |
