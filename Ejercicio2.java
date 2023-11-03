import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner impresion = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1 = impresion.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = impresion.nextDouble();
        double resultado = numero1+numero2;

        System.out.print("El resultado de la suma es: "+resultado);
    }

}
