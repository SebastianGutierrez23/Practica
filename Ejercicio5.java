import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double perimetro = lado*4;
        double area = lado*lado;
        System.out.println("El perimetro del cuadrado es:"+perimetro);
        System.out.print("El area del cuadrado es:"+area);
    }
}
