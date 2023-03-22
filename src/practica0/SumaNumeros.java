package practica0;


import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¾Límite? ");
        int límite = entrada.nextInt();
        int suma = sumarHasta(límite);
        System.out.println("Suma: " + suma);
        entrada.close();
    }

    private static int sumarHasta(int límite) {
        int suma = 0;
        int número = 1;
        while (número <= límite) {
            suma += número;
            número++;
        }
        return suma;
    }
}