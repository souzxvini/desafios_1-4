package souzxvini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int alvo;
        int tamanhoArray;
        List<Integer> array = new ArrayList<>();
        int resultado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        tamanhoArray = scanner.nextInt();

        System.out.println("Digite o valor alvo:");
        alvo = scanner.nextInt();

        for(int i = 1; i <= tamanhoArray; i++){
            System.out.println("Digite os valores do array:");
            array.add(scanner.nextInt());
        }

        for (int posicao : array) {
            for (int index: array) {
                if(index != posicao){
                    if(index - posicao == alvo || posicao - index == alvo){
                        resultado++;
                    }
                }
            }
        }

        resultado /= 2;
        System.out.println("Array: " + array);
        System.out.println("Resultado = " + resultado);

    }
}
