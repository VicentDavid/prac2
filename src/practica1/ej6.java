package practica1;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int n1 = sc.nextInt();
        int primo = 2;
        int contador;
        int max = 0;
        int div;
        int divmax = 0;
        while (primo < n1) {
            contador = 2;
            div = 2;
            while (contador <= primo / 2) {
                if (primo % contador == 0) {
                    div += 1;
                }
                contador++;
            }
            if (div >= divmax) {
                divmax = div;
                max = primo;
            }
            primo++;
        }
        System.out.print("El numero con mas divisores es " + max + " (" + divmax + " divisores)");


    }
}

