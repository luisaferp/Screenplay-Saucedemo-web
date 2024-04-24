#language: en
@Regresion
Feature: automatizar el login para  y carrito de compra de saucedemo
  como un usuario quiero ingresar a saucedemo para comprar productos en la tienda

  @caso1
  Scenario: ingreso exitoso
    Given que luisa ingresa a saucedemo
    When inicia sesion
    Then Verifico que inicio correctamente

  @caso2
  Scenario: ingreso exitoso
    Given que luisa ingresa a saucedemo
    When inicia sesion
    And selecciono el producto para luego ir al carrito
    And diligencio el formulario de compra
    Then Verifico la compra
