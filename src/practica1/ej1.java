package practica1;
import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer un número entero (de tipo int)
        System.out.print("Dame un número entero: ");
        int n1 = sc.nextInt();
        int contador = 1;
        int fact = 1;
        while (contador >= n1) {
            fact *= contador;
            contador++;
        }
            System.out.print(n1 + "!: " + fact);


        }
    }
