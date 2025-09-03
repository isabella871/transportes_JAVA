package taller7_transportadora;

public abstract class Transporte{ // usar setter y getters para acceder a los atributos
    private String marca;
    private String modelo;
    private String velocidadMaxima;

    public Transporte(String marca, String modelo, String velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract String tipoCombustible(String gasolina); // Método Abstracto

    public void mostrarInformacion(){
        System.out.println("------------- Información del Vehículo --------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
        System.out.println("----------------------------------------------------");
        System.out.println();
    }
}
