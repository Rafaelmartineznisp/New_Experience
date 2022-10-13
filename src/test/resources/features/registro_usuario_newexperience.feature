#language:es
#autor: Rafael de jesus Martinez Nisperuza
@Historia
Característica: Validar resgitro new experience
  como usuario quiero resgistarme em la plataforma web new experience

  Antecedentes:
    Dado que el usuario ingresa a la pagina web new experience

  @registroexitoso
  Esquema del escenario: Registro de usuario exitoso
    Cuando  Diligencia correo
      | correo   |
      | <correo> |
    Y diligencia los datos peronales
      | nombre   | apellido   | contrasenna   | dia   | mes   | anno   | direccion   | cuidad   | estado   | codigo_postal   | pais   | telefono   | alias   |
      | <nombre> | <apellido> | <contrasenna> | <dia> | <mes> | <anno> | <direccion> | <cuidad> | <estado> | <codigo_postal> | <pais> | <telefono> | <alias> |
    Entonces verifica que el registro fue satisfactorio
      | mensaje   |
      | <mensaje> |

    Ejemplos:
      | correo          | nombre | apellido | contrasenna  | dia | mes | anno | direccion      | cuidad   | estado | codigo_postal | telefono   | alias           | mensaje                                                                                   |
      | Dania@gmail.com | Raul   | Florez   | C4m3110loko* | 15  | 5   | 2000 | Cll 27  N 4 31 | Colorado | Alaska | 70001         | 3126841141 | Calle principal | Welcome to your account. Here you can manage all of your personal information and orders. |

  @registroexistente
  Esquema del escenario: Registro de usuario existente
    Cuando  Diligencia correo
      | correo   |
      | <correo> |
    Entonces verifica que el registro fue fallido
      | mensaje   |
      | <mensaje> |

    Ejemplos:
      | correo          | mensaje                                                                                                              |
      | Dania@gmail.com | An account using this email address has already been registered. Please enter a valid password or request a new one. |

  @registrofallido
  Esquema del escenario: Registro de usuario fallido
    Cuando  Diligencia correo
      | correo   |
      | <correo> |
    Y diligencia incompletos los datos peronales

    Entonces verifica que el registro no fue permitido
      | mensaje   |
      | <mensaje> |
    Ejemplos:
      | correo             | mensaje |
      | Anasofia@gmail.com | There are 8 errors  |
