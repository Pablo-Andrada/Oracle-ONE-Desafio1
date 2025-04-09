import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "corriente";
        double saldo = 5000000;
        int opcion = 0;

        System.out.println("********************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta " + tipoDeCuenta);
        System.out.println("Su saldo es: " + saldo);
        System.out.println("\n********************************************");

        String menu = """
                ***Escriba el número de la operación deseada:***
                1 - Consultar saldo
                2 - Retirar dinero
                3 - Depositar dinero
                9 - Salir del menú
                """;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            System.out.printf(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case  1:
                    System.out.println("El saldo actualizado es: " + saldo + " $");
                    break;
                case  2:
                    System.out.println("Ingrese el monto que desea retirar: ");
                    double montoARetirar = teclado.nextDouble();

                    if(montoARetirar > saldo){
                        System.out.println("Su saldo es insuficiente para esta operacion");
                    }else {
                        saldo = saldo - montoARetirar;
                        System.out.println("Su saldo actualizado es: " + saldo);
                    }
                    break;
                case  3:
                    System.out.println("Ingrese el monto que desea depositar");
                    double montoADepositar = teclado.nextDouble();

                    saldo = saldo + montoADepositar;
                    System.out.println("Su saldo actualizado es: " + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opcion ingresada invalida, intente nuevamente.");
            }
        }
    }
}