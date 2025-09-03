package taller7_transportadora;

import java.util.Scanner;

public class Carro extends Transporte implements Vehiculo {
    public Carro (String marca, String modelo, String velocidadMaxima){
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
        System.out.print("Arrancar el vehiculo...");
        System.out.println("Elejir método de arranque...");
        System.out.println("1. Ingresar llave / 2.Presione botón de arranque");
        int arrancarCarro = scanner.nextInt();

        if (arrancarCarro == 1) {
            System.out.println("... Llave Ingresada ...");
            System.out.println(" 1. Girar llave / 2. No girar");
            int girar = scanner.nextInt();

            if (girar == 1){
                System.out.println("El carro ha arrancado");
            }else{
                System.out.println("El carro se encuentra estático");
            }
        }
        scanner.nextLine();
    }

    @Override
    public void detener(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("El carro se ha detenido...");
        scanner.nextLine();
    }
}
