public class InvertirPalabra3 {
    public static void main(String[] args) {
        String palabra= "codigo bootcamp";
        String palabraInvertida= palabraInvertida(palabra);
        System.out.println("La palabra invertida es:" + palabraInvertida);
    }

    private static String palabraInvertida(String palabra) {
        char[] caracteres = palabra.toCharArray();
        char[] palabraInvertida = new char[palabra.length()];
        int index=0;
        for (int i = palabra.length()-1; i >=0 ; i--) {
            palabraInvertida[index]=caracteres[i];
            index++;
        }
        return new String(palabraInvertida);
    }
}
