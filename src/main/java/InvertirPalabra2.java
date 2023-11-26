import java.util.Scanner;

public class InvertirPalabra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra que desea invertir: ");
        String palabra = sc.next();
        char[] caracteres = palabra.toCharArray();
        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            // Intercambiar caracteres en las posiciones i y j
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }
        String invertida = new String(caracteres);
        System.out.println("La palabra invertida es: " + invertida);

    }
    }

