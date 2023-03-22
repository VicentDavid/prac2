package practica1;
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer un número entero (de tipo int)
        System.out.print("Dame un número entero: ");
        int n1 = sc.nextInt();
        int contador = 1;
        int fact = 1;
        if (n1 != 0 && n1 != 1) {
            while (contador >= n1) {
                if (n1 % 2 == 0) {
                    fact *= contador + 1;
                    contador += 2;

                } else {
                    fact *= contador;
                    contador += 2;
                }
            }
        }
        System.out.print(n1 + "!!: " + fact);
    }
}
