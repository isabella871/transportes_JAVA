import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("-------- Seleccionar vehiculo --------");
            System.out.println("1. Bicicleta");
            System.out.println("2. Moto");
            System.out.println("3. Carro");
            System.out.println("4. Salir del menú");
            System.out.print("Ingrese la opción que desea: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("------ Bicicleta ------");
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Velocidad Máxima: ");
                    String velocidadMaxima = scanner.nextLine();

                    Vehiculo bicicleta = new Vehiculo(marca, modelo, velocidadMaxima);
                    bicicleta.mostrarInformacion();
                    bicicleta.tipoCombustible("No usa ningún tipo de combustible");
                    break;

                case 2:
                    System.out.println("------ Moto ------");
                    System.out.print("Marca: ");
                    String marcaMoto = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modeloMoto = scanner.nextLine();
                    System.out.print("Velocidad Máxima: ");
                    String velocidadMaximaMoto = scanner.nextLine();

                    Moto moto = new Moto(marcaMoto, modeloMoto, velocidadMaximaMoto);
                    moto.mostrarInformacion();
                    moto.tipoCombustible("gasolina"); 
                    break;

                case 3:
                    System.out.println("------ Carro ------");
                    System.out.print("Marca: ");
                    String marcaCarro = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modeloCarro = scanner.nextLine();
                    System.out.print("Velocidad Máxima: ");
                    String velocidadMaximaCarro = scanner.nextLine();

                    Carro carro = new Carro(marcaCarro, modeloCarro, velocidadMaximaCarro);
                    carro.mostrarInformacion();
                    carro.tipoCombustible("Gasolina");
                    break;
            
                default: 
                    System.out.println("... Saliendo del menú ....");
                    break;
            }
        }while (opcion != 4);
        scanner.close();
    }
}

