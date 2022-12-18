package souzxvini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int notasDe100 = 0;
        int notasDe50 = 0;
        int notasDe20 = 0;
        int notasDe10 = 0;
        int notasDe5 = 0;
        int notasDe2 = 0;
        int moedasDe1 = 0;
        int moedasDe50 = 0;
        int moedasDe25 = 0;
        int moedasDe10 = 0;
        int moedasDe5 = 0;
        int moedasDe01 = 0;
        double valor;
        double valorFormatado;
        List<Double> sequenciaDeNotas = new ArrayList<>();
        sequenciaDeNotas.add(100.00);
        sequenciaDeNotas.add(50.00);
        sequenciaDeNotas.add(20.00);
        sequenciaDeNotas.add(10.00);
        sequenciaDeNotas.add(5.00);
        sequenciaDeNotas.add(2.00);
        sequenciaDeNotas.add(1.00);
        sequenciaDeNotas.add(0.50);
        sequenciaDeNotas.add(0.25);
        sequenciaDeNotas.add(0.10);
        sequenciaDeNotas.add(0.05);
        sequenciaDeNotas.add(0.01);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor:");
        valor = scanner.nextFloat();
        valorFormatado = Math.round(valor * 100.0) / 100.0;

        for (Double nota: sequenciaDeNotas) {
            if(valorFormatado / nota >= 1){
                Double resultado = valorFormatado/nota;
                int quantidade = resultado.intValue();
                valorFormatado = valorFormatado - quantidade * nota;
                if (nota == 100.00) {
                    notasDe100 = quantidade;
                }
                if(nota == 50.00){
                    notasDe50 = quantidade;
                }
                if(nota == 20.00){
                    notasDe20 = quantidade;
                }
                if(nota == 10.00){
                    notasDe10 = quantidade;
                }
                if(nota == 5.00){
                    notasDe5 = quantidade;
                }
                if(nota == 2.00){
                    notasDe2 = quantidade;
                }
                if(nota == 1.00){
                    moedasDe1 = quantidade;
                }
                if(nota == 0.50){
                    moedasDe50 = quantidade;
                }
                if(nota == 0.25){
                    moedasDe25 = quantidade;
                }
                if(nota == 0.10){
                    moedasDe10 = quantidade;
                }
                if(nota == 0.05){
                    moedasDe5 = quantidade;
                }
                if(nota == 0.01){
                    moedasDe01 = quantidade;
                }
            }
        }
        System.out.println("NOTAS:");
        System.out.println( notasDe100 + " nota(s) de R$ 100.00");
        System.out.println( notasDe50 + " nota(s) de R$ 50.00");
        System.out.println( notasDe20 + " nota(s) de R$ 20.00");
        System.out.println( notasDe10 + " nota(s) de R$ 10.00");
        System.out.println( notasDe5 + " nota(s) de R$ 5.00");
        System.out.println( notasDe2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println( moedasDe1 + " moeda(s) de R$ 1.00");
        System.out.println( moedasDe50 + " moeda(s) de R$ 0.50");
        System.out.println( moedasDe25 + " moeda(s) de R$ 0.25");
        System.out.println( moedasDe10 + " moeda(s) de R$ 0.10");
        System.out.println( moedasDe5 + " moeda(s) de R$ 0.05");
        System.out.println( moedasDe01 + " moeda(s) de R$ 0.01");
    }
}
