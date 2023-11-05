import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String [] args){
        Scanner impresion = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        double radio = impresion.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura= impresion.nextDouble();
        double area=2 *3.1416*radio*altura+2*3.1416*radio*radio;
        double volumen=3.1416*radio*radio*altura;

        System.out.println("el area del cilindro es: "+area);
        System.out.println("el area del volumen es: "+volumen);
        }

    }

