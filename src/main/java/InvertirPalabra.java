public class InvertirPalabra {
    //invertir el orden de la palabra codigo

    public static void main(String[] args) {
         String palabra = "codigo de tecsup";
         char[] caracteres = palabra.toCharArray();
        char [] palabraInvertida = new char[palabra.length()];
        int index =0;
        for (int i = palabra.length()-1; i >=0 ; i--) {
            palabraInvertida[index] = caracteres[i] ;
            index++;

        }
        String invertida = new String(palabraInvertida);
         System.out.println("La palabra invertida es: " + invertida);



    }



}
