package practica1;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int n1 = sc.nextInt();
        int primo = 2;
        int contador;
        int primordial = 1;
        boolean esPrimo;
        while (primo < n1) {
            contador = 2;
            esPrimo = true;
            while (contador <= primo/2) {
                if (primo % contador == 0) {
                    esPrimo = false;
                    break;
                }
                contador++;
            }
            if (esPrimo)
                primordial *= primo;
            primo++;
        }
        System.out.print(n1 + "#: "+ primordial);



    }
}

