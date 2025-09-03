package taller7_transportadora;

import java.util.Scanner;

public class Moto extends Transporte implements Vehiculo{
    public Moto (String marca, String modelo, String velocidadMaxima){
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
        System.out.print("¿Encender con botón o pedal?");
        System.out.println(" 1. Bóton / 2. Pedal");
        int encenderMoto = scanner.nextInt();

        if (encenderMoto == 1){
            System.out.println("La moto ha sido encendida con el botón");
        }else{
            System.out.println("La moto ha sido encendida con el pedal");
        }
        scanner.nextLine();
    }

    @Override
    public void detener(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Pisar el freno?");
        System.out.println("1. si / 2. no");
        int frenar = scanner.nextInt();

        if (frenar == 1){
            System.out.println("La moto se ha detenido");
        }else{
            System.out.println("Moto en movimiento");
        }
        scanner.nextLine();
    }
}
