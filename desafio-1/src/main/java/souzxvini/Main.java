package souzxvini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidadeDeNumeros;
        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> listaNumerosPares = new ArrayList<>();
        List<Integer> listaNumerosImpares = new ArrayList<>();

        System.out.println("Digite a quantidade de números a serem digitados:");
        Scanner scanner = new Scanner(System.in);

        quantidadeDeNumeros = scanner.nextInt();
        while(quantidadeDeNumeros < 0){
            System.out.println("Desculpe, você não pode colocar um número negativo!");
            System.out.println("Digite a quantidade de números a serem digitados:");
            Scanner entrada = new Scanner(System.in);
            quantidadeDeNumeros = entrada.nextInt();
        }

        for(int i = 1; i < quantidadeDeNumeros + 1; i++){
            System.out.println("digite o : " + (i) + "° número:");
            int numero = scanner.nextInt();
            if(numero < 0){
                System.out.println("Não pode colocar número negativo!");
                i--;
            } else{
                listaNumeros.add(numero);
            }
        }

        for (int numero: listaNumeros) {
            if(numero % 2 == 0){
                listaNumerosPares.add(numero);
            } else{
                listaNumerosImpares.add(numero);
            }
        }
        System.out.println("Resultado: ");
        ordenarParesOrdemCrescente(listaNumerosPares);
        ordenarImparesOrdemDecrescente(listaNumerosImpares);

    }
    public static void separarPorParOuImpar(){

    }
    public static void ordenarParesOrdemCrescente(List<Integer> listaNumerosPares) {
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < listaNumerosPares.size() - 1; i++) {
                if (listaNumerosPares.get(i) > listaNumerosPares.get(i + 1)) {
                    aux = listaNumerosPares.get(i);
                    listaNumerosPares.set(i, listaNumerosPares.get(i + 1));
                    listaNumerosPares.set(i + 1, aux);
                    troca = true;
                }
            }
        }
        for (int numero: listaNumerosPares) {
            System.out.println(numero);
        }
    }
    public static void ordenarImparesOrdemDecrescente(List<Integer> listaNumerosImpares){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < listaNumerosImpares.size() - 1; i++) {
                if (listaNumerosImpares.get(i) < listaNumerosImpares.get(i + 1)) {
                    aux = listaNumerosImpares.get(i);
                    listaNumerosImpares.set(i, listaNumerosImpares.get(i + 1));
                    listaNumerosImpares.set(i + 1, aux);
                    troca = true;
                }
            }
        }
        for (int numero: listaNumerosImpares) {
            System.out.println(numero);
        }

    }

}
