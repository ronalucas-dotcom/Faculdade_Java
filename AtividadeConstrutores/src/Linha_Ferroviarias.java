package AtividadeConstrutores.src;

import java.util.ArrayList;
import java.util.Scanner;



public class Linha_Ferroviarias {
    public int numero;
    public double extensao;
    public String descricao;

    public Estacao_Ferroviaria origem;
    public Estacao_Ferroviaria destino;

    public  ArrayList<Trens> trens;


    public Linha_Ferroviarias(Estacao_Ferroviaria origem, ArrayList<Estacao_Ferroviaria> estacoes, Scanner sc) {

        this.origem = origem;

        System.out.println("Número da linha: ");
        numero = sc.nextInt();

        System.out.println("Extenção: ");
        extensao = sc.nextDouble();

        sc.nextLine();

        System.out.println("Descrição: ");
        descricao = sc.nextLine();
        

        if (estacoes.size() > 1) {

        System.out.println("\nEscolha estação destino:");

        for (int i = 0; i < estacoes.size(); i++) {

            if (estacoes.get(i) != origem) {

                System.out.println(
                    i + " - " +
                    estacoes.get(i).sigla
                );

            }

        }

        int escolha = sc.nextInt();

        destino = estacoes.get(escolha);

        }
        else {

            System.out.println(
                "Ainda não há outra estação para conectar."
            );

            destino = null; // temporário

        }

        
        trens = new ArrayList<>();

        System.out.println("Quantos trens? :");
        int qtqtrens = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i< qtqtrens;i++){
            trens.add(new Trens(origem,destino,sc));
        }

    }

    public void definirDestino(ArrayList<Estacao_Ferroviaria> estacoes, Scanner sc) {

        if (destino != null) return;

        System.out.println(
            "\nDefinir destino da linha "
            + numero
        );

        for (int i = 0; i < estacoes.size(); i++) {

            if (estacoes.get(i) != origem) {

                System.out.println(
                    i + " - " +
                    estacoes.get(i).sigla
                );

            }

        }

        int escolha = sc.nextInt();

        destino = estacoes.get(escolha);

    }

    public void mostrarDados() {

        System.out.println("\n--- LINHA ---");

        System.out.println("Numero: " + numero + " extensão: " + extensao);

        if (destino != null) {

            System.out.println(
                "Destino: " + destino.sigla
            );

        }
        else {

            System.out.println(
                "Destino ainda não definido"
            );

        }

        System.out.println("\nTrens da linha:");

        for (Trens t : trens) {

            t.mostrarDados();

        }

    }
    
}