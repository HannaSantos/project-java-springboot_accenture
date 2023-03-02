package atividadeJava;

//    ** LocalizaNumero.Java
//     1 Corrigir o bug do programa
//     2 Usar o scanner

import java.util.Scanner;

// Faça um programa para pesquisar o valor 8 no vetor dado:
// inteiro vetor[] = {1, 3, 5, 8, 10}
public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = {1, 3, 5, 8, 10};
        boolean achou = false;
        int posicao = 0;

        System.out.print("Digite o valor que deseja pesquisar: ");
        int valor = scanner.nextInt();

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor){
                achou = true;
                posicao = i;
                break;
            }
        }

        if (achou){
            System.out.printf("Achei! \n");
            System.out.printf("Na Posição %d está localizado do numero %d", posicao, valor);
        }else {
            System.out.printf("Não foi localizado o %d citado :( ", valor);
        }
    }
}
