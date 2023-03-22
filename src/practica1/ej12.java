package practica1;

public class ej12 {
    public static int contarPalabras(String frase) {
        int palabras = 0;
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {
                if (frase.charAt(i+1) != ' ') {
                    palabras++;
                }
            }
            return palabras;
        }

    }
}




