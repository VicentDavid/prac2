
package practica1;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int n1 = sc.nextInt();
        int primo = 2;
        int contador;
        boolean esPrimo;
        System.out.println("Los números primos menores que " + n1 + " son: ");
        while (primo < n1) {
            contador = 2;
            esPrimo = true;
            while (contador < primo/2) {
                if (primo % contador == 0) {
                    esPrimo = false;
                    break;
                }
                contador++;
            }
            if (esPrimo)
                System.out.println(primo);
            primo++;
        }


    }
}

