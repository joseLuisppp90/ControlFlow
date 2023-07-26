import java.util.Scanner;

public class commisionCalcultor {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la cifra de ventas
        System.out.print("Ingrese la cifra de ventas: ");
        double ventas = scanner.nextDouble();

        // Calcular la comisión según el rango de ventas
        double comision = calcularComision(ventas);

        // Mostrar la comisión calculada al usuario
        if (comision == -1) {
            System.out.println("El rango de ventas no es válido. Comisión no aplicable.");
        } else {
            System.out.println("La comisión es del " + comision + "%.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    public static double calcularComision(double ventas) {
        if (ventas > 10000) {
            return 30.0;
        } else if (ventas >= 5001 && ventas <= 9999) {
            return 20.0;
        } else if (ventas >= 1001 && ventas <= 4999) {
            return 10.0;
        } else {
            return -1; // El rango de ventas no es válido, no hay comisión aplicable.
        }
    }
}
