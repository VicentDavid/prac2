package practica1;
import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer un número entero (de tipo int)
        System.out.println("Dame un número entero: ");
        int n1 = sc.nextInt();
        int contador = 2;
        boolean esPrimo = true;
        while (contador >= n1 / 2) {
            if (n1 % contador == 0) {
                System.out.print("No es primo");
                esPrimo = false;
                break;
            }

            contador++;
        }
        if (esPrimo)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");

        }
    }

