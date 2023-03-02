package atividadeLogica;

import java.util.Scanner;

public class VerficacaoDeNumeros {
               public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Lendo as duas sequências de números
                int[] sequenciaUm = new int[5];
                int[] sequenciaDois = new int[5];

                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite o " + (i+1) + "º número da sequência UM: ");
                    sequenciaUm[i] = sc.nextInt();
                }

                for (int i = 0; i < 5; i++) {
                    System.out.print("Digite o " + (i+1) + "º número da sequência DOIS: ");
                    sequenciaDois[i] = sc.nextInt();
                }

                // Verificando quantas vezes um número da sequência UM está presente na sequência DOIS
                int contagem = 0;

                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (sequenciaUm[i] == sequenciaDois[j]) {
                            contagem++;
                        }
                    }
                }

                // Imprimindo o resultado
                System.out.println("O número de vezes que um número da sequência UM está presente na sequência DOIS é: " + contagem);
            }
        }

