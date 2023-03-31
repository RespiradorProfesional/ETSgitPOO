EJERCICIO INTEGRADOR POO
@Autor 1dam

Este mini-programa es solo un testeo de funcionalidades informaticas, solo ejecutable o accesible a traves del main accediendo a este a traves de un IDE.
Lo primero que deberas hacer es crear el posnet, para poder hacer las siguientes transacciones sobre el programa llamando a la clase Posnet,
lo siguiente sera crear una persona a traves de la clase Persona, donde pedira los siguientes parametros (DNI, nombre, apellidos, telefono, email).

Con la persona ya creada lo que queda es realizar la tarjeta llamando a la clase TarjetaDeCredito donde pide la : entidadBancaria, nroTarjeta, saldo, entidadFinanciera(deberas escoger
en especifico una de las existentes en la clase EntidadFinanciera), titular.

Podras ver los datos de cada tarjeta a traves de un System.out.println(NombreDeTarjeta),

Podras realizar las siguientes funciones con las siguientes clases :

-EntidadFinanciera:
simplemente sirve para crear un enum con las entidades financieras existentes
-Persona:
crear la persona con sus datos y el metodo:
---nombreCompleto(): Metodo para generar cadena con Nombre+Apellido

-Posnet:
su unica funcion es efectuar los pagos requeridos y restar a la tarjeta que realizo dico pago generando un ticket con el metodo:
---efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas): Es un creador de ticket donde comprueba que todos los parametros sean correctos y finalmente poder crear el ticket

-TarjetaDeCredito:
su funcion es crear una tarjeta de credito relacionandose con una persona ya existente previamente, posee los siguientes metodos:
---tieneSaldoDisponible(double monto): Simplemente compara el parametro dado con el sado actual del usuario
---descontar(double monto): Resta el saldo del usuario por el parametro dado
---nombreCompletoDeTitular(): Metodo usado para comprobar quien es el titular de la tarjeta
---toString(): Metodo para generar una cadena de frases donde muestra los datos de la tarjeta
-Ticket:
su unica funcion es crear un ticket a traves de los datos obtenidos por posnet
---toString(): Metodo para generar cadena con Nombre y Apellido, el monto total y el monto por cuota

La url de la version de mi proyecto esta en github: https://github.com/RespiradorProfesional/ETSgitPOO

La version base de este proyecto es de: https://github.com/CharlyCimino/ejercicio-integrador-POO-I
