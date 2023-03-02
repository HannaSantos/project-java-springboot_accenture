package atividadeJava;

//  ** Um Estádio Oferece três categoria de assentos:
//          - Classe A = R$ 50
//          - Classe B = R$ 30
//          - Classe C = R$ 20
//
//   ** Escreva um programa que pergunta quantos bilhetes de cada classe
//      foram vendidos, e em seguida, exibe a renda gerada pela venda
//      dos ingresso

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Valor das Classes
        double classeA = 50.0, classeB = 30.0, classeC = 20.0;

        // Quanto incressos foram vendidos
        System.out.println("Quanto incressos foram vendido na Classe A: ");
        int vendidoClasseA = leitor.nextInt();

        System.out.println("Quanto incressos foram vendido na Classe B: ");
        int vendidoClasseB = leitor.nextInt();

        System.out.println("Quanto incressos foram vendido na Classe C: ");
        int vendidoClasseC = leitor.nextInt();

        // Soma das vendas
        double ingressoA = classeA * vendidoClasseA;
        double ingressoB = classeB * vendidoClasseB;
        double ingressoC = classeC * vendidoClasseC;
        double totalTudo = ingressoA + ingressoB + ingressoC;

        // Mostra do Resultados
        System.out.printf(("_").repeat(40) +
                          "\nO Resultado ficou: \n" +
                          "- Classe A total vendido: %.2f \n" +
                          "- Classe B total vendido: %.2f \n" +
                          "- Classe C total vendido: %.2f \n" +
                           ("-").repeat(33) + "\n" +
                          "Soma total de tudo ficou: %.2f \n" +
                          ("_").repeat(40),
                             ingressoA, ingressoB, ingressoC, totalTudo);
    }
}
