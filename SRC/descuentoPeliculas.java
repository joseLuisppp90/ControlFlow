import java.util.Scanner;

public class descuentoPeliculas {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la edad ingresada por el usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Calcular el precio del boleto con el descuento correspondiente
        double precio = calcularPrecioBoleto(edad);

        // Mostrar el precio final del boleto al usuario
        if (precio == -1) {
            System.out.println("Lo siento, no se puede calcular el precio del boleto.");
        } else {
            System.out.println("El precio del boleto es de " + precio + " Euros.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    public static double calcularPrecioBoleto(int edad) {
        double precioNormal = 7.0;

        if (edad < 5) {
            // Descuento del 60% para menores de 5 años
            return precioNormal * 0.4;
        } else if (edad >= 60) {
            // Descuento del 55% para mayores de 60 años
            return precioNormal * 0.45;
        } else {
            // Boleto normal sin descuento
            return precioNormal;
        }
    }
}
