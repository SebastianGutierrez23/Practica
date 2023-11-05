import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros: ");
        double Euros = scanner.nextDouble();

        double Tasadecambio = Euros*1.06;

        System.out.print("La cantidad de dolares es: "+Tasadecambio);

    }
}
