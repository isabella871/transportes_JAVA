Una empresa de transporte necesita un sistema para registrar distintos tipos de vehículos (carro, moto, bicicleta).

Crea una interfaz llamada Vehiculo con los métodos:

arrancar()

detener()

Crea una clase abstracta llamada Transporte que implemente Vehiculo y tenga:

Atributos: marca, modelo y velocidadMaxima.

Un método abstracto llamado tipoCombustible().

Un método común mostrarInformacion() que imprima los atributos.


Crea clases concretas (Carro, Moto, Bicicleta) que hereden de Transporte e implementen el método tipoCombustible().

El carro usa gasolina.

La moto usa gasolina.

La bicicleta no usa combustible.


En el main, utiliza Scanner para:

Pedir al usuario el tipo de vehículo que quiere registrar.

Solicitar marca, modelo y velocidad máxima.

Crear el objeto correspondiente y llamar a los métodos arrancar(), detener(), tipoCombustible() y 
mostrarInformacion().