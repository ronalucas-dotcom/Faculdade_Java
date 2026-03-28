package AtividadeConstrutores.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Estacao_Ferroviaria> estacoes = new ArrayList<>();

        System.out.println("Quantas estações? :");
        int qtdest = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < qtdest; i++) {
            System.out.println("criando estações");
           new Estacao_Ferroviaria(estacoes, sc);
        }

        for (Estacao_Ferroviaria e : estacoes) {

            for (Linha_Ferroviarias l : e.linhas) {

                if (l.destino == null) {

                    l.definirDestino(estacoes,sc);

                }

            }

        }

        for (Estacao_Ferroviaria e : estacoes) {
            e.mostrarDados();
        }

        System.out.println("Sistema criado com sucesso!");

    }
}
