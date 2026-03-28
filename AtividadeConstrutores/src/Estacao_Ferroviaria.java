package AtividadeConstrutores.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacao_Ferroviaria {
    public String sigla;
    public String descricao;

    public ArrayList<Linha_Ferroviarias> linhas;

    

    public Estacao_Ferroviaria( ArrayList<Estacao_Ferroviaria> estacoes, Scanner sc){
  
        System.out.println("sigla: ");
        sigla = sc.nextLine();

        System.out.println("Descrição: ");
        descricao = sc.nextLine();

        linhas = new ArrayList<>();

        estacoes.add(this);
        
        System.out.println("Quantas linhas: ");
        int qtqlinhas = sc.nextInt();
        
        sc.nextLine();

        for (int i = 0; i < qtqlinhas; i++){
            System.out.println("criando linhas" + (i+1));
            linhas.add(new Linha_Ferroviarias(this,estacoes,sc));
        }

    }

    public void mostrarDados() {

        System.out.println("\n===== ESTAÇÃO =====");

        System.out.println("Sigla: " + sigla);
        System.out.println("descricao: " + descricao);

        System.out.println("\nLinhas da estação:");

        for (Linha_Ferroviarias l : linhas) {

            l.mostrarDados();

        }

    }

}


