import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Principal principal = new Principal();

        int opc;

        do {
            opc = mostrarMenu();
            switch (opc) {
                case 1 -> {
                    System.out.println("Temperatura:\n");
                    principal.pruebaTemperatura();
                }
                case 2 -> System.out.println("Hasta Luego");
                default -> System.out.println("Error, valor no deseado");
            }

        } while (opc != 2);
    }


    private static int mostrarMenu() {

        Scanner scan = new Scanner(System.in);

        int opc;

        do {
            System.out.println("1. Probar temperatura\n2. Salir");
            while (!scan.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero:");
                scan.next();
            }

            opc = scan.nextInt();

            return opc;

        } while (opc < 1 || opc > 2);
    }

    private void pruebaTemperatura(){

        // Muestre la configuración actual
        System.out.println(Temperatura.getConfiguracionActual());

        // Lee la temperatura de Lunes, Martes, Miércoles
        Temperatura temperatura = new Temperatura(23, Semana.LUNES);
        Temperatura temperatura1 = new Temperatura(53, Semana.MARTES);
        Temperatura temperatura2 = new Temperatura(12, Semana.MIERCOLES);

        // Cambia a Fahrenheit
        Temperatura.setToFahrenheit();

        // Muestra configuración actual
        System.out.println(Temperatura.getConfiguracionActual());

        // Muestra las temperaturas
        System.out.println(temperatura.toString());
        System.out.println(temperatura1.toString());
        System.out.println(temperatura2.toString());

        // Cambia a Celsius
        Temperatura.setToCelsius();

        // Muestra configuración actual
        System.out.println(Temperatura.getConfiguracionActual());

        // Muestra las temperaturas
        System.out.println(temperatura.toString());
        System.out.println(temperatura1.toString());
        System.out.println(temperatura2.toString());

        // Nos pida una temperatura numérica Celsius y la transforme a Fahrenheit
        Scanner scan = new Scanner(System.in);

        double temperatura01;
        double temperatura02;

        System.out.println("Introduzca una temperatura Celsius: ");
        temperatura01 = scan.nextDouble();
        System.out.println(Temperatura.toFahrenheit(temperatura01) + " ºF");

        System.out.println("Introduzca una temperatura Fahrenheit");
        temperatura02 = scan.nextDouble();
        System.out.println(Temperatura.toCelsius(temperatura02) + " ºC");
    }
}
