import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String [] args){
        Scanner imprimir = new Scanner(System.in);


        System.out.print("Ingrese el numero: ");
        double numero = imprimir.nextDouble();
        double elevadoalcuadrado = numero*numero;

        System.out.print("El resultado del "+numero+" "+"es: "+elevadoalcuadrado);
    }
}
