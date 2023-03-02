package atividadeLogica;

import java.util.Scanner;

public class Votos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int voto, votosA = 0, votosB = 0, votosNulos = 0, votosBrancos = 0;

        // Lendo os votos
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite o voto " + i + ": ");
            voto = entrada.nextInt();

            // Verificando se o voto é válido ou não
            if (voto == 1) {
                votosA++;
            } else if (voto == 2) {
                votosB++;
                if (votosB % 3 == 0) {
                    votosNulos++;
                }
            } else if (voto == 3) {
                votosNulos++;
            } else {
                votosBrancos++;
            }
        }

        // Calculando os percentuais
        double percA = (votosA / 7.0) * 100;
        double percB = (votosB / 7.0) * 100;
        double percNulos = (votosNulos / 7.0) * 100;
        double percBrancos = (votosBrancos / 7.0) * 100;

        // Exibindo os resultados
        System.out.println("Percentual de votos para o candidato A: " + percA + "%");
        System.out.println("Percentual de votos para o candidato B: " + percB + "%");
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos em branco: " + percBrancos + "%");

        entrada.close();
    }
}