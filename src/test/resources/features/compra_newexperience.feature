#language:es
#autor: Rafael Martinez N
@Historia2
Característica: como usuario quiero comprar articulos  en la plataforma web new experience

  @Login
  Esquema del escenario: Escenario de compra Exitoso
    Dado que el usuario ingresa a la pagina web new experience
    Cuando digita las credenciales de acceso
      | correo   |contrasenna   |
      | <correo> |<contrasenna>  |
    Y selecciona los productos a adquirir

    Entonces verifica la comprar realizada
      | verificarcompra  |
      | <verificarcompra> |
    Y cerrar sesion
    Ejemplos:
      | correo       | contrasenna  |       verificarcompra  |
      | rj_2012@hotmail.com | R@fael1991 |  Your order on My Store is complete. |