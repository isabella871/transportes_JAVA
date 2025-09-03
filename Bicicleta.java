package taller7_transportadora;

import java.util.Scanner;

public class Bicicleta extends Transporte implements Vehiculo{
    public Bicicleta (String marca, String modelo, String velocidadMaxima){
        super (marca, modelo, velocidadMaxima);
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
    }

    @Override
    public String tipoCombustible(String gasolina){
        return gasolina;
    }

    @Override
    public void arrancar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("La bicicleta ha arrancado...");
        scanner.nextLine();
    }

    @Override
    public void detener(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Clavando frenos...");
        System.out.print("...La bicicleta se ha detenido...");
        scanner.nextLine();
    }
}
