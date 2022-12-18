package souzxvini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int casos;
        List<String> array = new ArrayList<>();
        List<String> arrayStringsInvertidas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual será a quantidade de frases? ");
        casos = scanner.nextInt();

        for(int i = 1; i <= casos; i++){
            System.out.println("Digite a " + i + "° frase:");
            String frase = scanner.nextLine();
            boolean hasLowerCase = !frase.equals(frase.toUpperCase());
            if (hasLowerCase){
                System.out.println("A frase não pode conter letra minúscula!");
                i--;
            } else if (frase.length() < 2){
                System.out.println("A frase deve conter ao menos 2 caracteres!");
                i--;
            } else if ( frase.length() > 100){
                System.out.println("A frase deve conter no máximo 100 caracteres!");
                i--;
            } else{
                array.add(frase);
            }
        }

        for ( String frase: array) {
            int tamanhoFrase = frase.length();

            String frase1 = frase.substring(0, tamanhoFrase /2);
            String frase2 = frase.substring( tamanhoFrase /2, tamanhoFrase);

            String frase1Invertida = new StringBuilder(frase1).reverse().toString();
            String frase2Invertida = new StringBuilder(frase2).reverse().toString();

            String fraseCompleta = frase1Invertida + frase2Invertida;
            arrayStringsInvertidas.add(fraseCompleta);
        }

        for (String fraseInvertida:  arrayStringsInvertidas) {
            System.out.println(fraseInvertida);
        }
    }
}
