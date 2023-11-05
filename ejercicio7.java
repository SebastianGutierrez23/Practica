import java.util.Scanner;

public class ejercicio7 {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el radio: ");
    double radio = scanner.nextDouble();
    double longitud =2 *3.1416*radio;
    double area =3.1416*radio*radio;

    System.out.println("la longitud del circulo es: "+longitud);
    System.out.println("el area del circulo es: "+area);




}
}
