import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner impresion = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1 = impresion.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = impresion.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = impresion.nextDouble();

        double promedio = (numero1 + numero2 + numero3) / 3;

        System.out.print("El promedio es: " + promedio);

    }
}