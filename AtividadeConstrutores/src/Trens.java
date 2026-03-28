package AtividadeConstrutores.src;


import java.util.ArrayList;
import java.util.Scanner;

public class Trens {
    public String prefixo;
    public String dataFormacao;

    public Estacao_Ferroviaria origem;
    public Estacao_Ferroviaria destino;

    public ArrayList<Locomotiva>locomotivas;
    public ArrayList<Vagoes>vagoes;

    public Trens(Estacao_Ferroviaria origem, Estacao_Ferroviaria destino, Scanner sc) {

        this.origem = origem;
        this.destino = destino;

        System.out.print("Prefixo do trem: ");
        prefixo = sc.nextLine();

        System.out.print("Data de formação: ");
        dataFormacao = sc.nextLine();

        locomotivas = new ArrayList<>();
        vagoes = new ArrayList<>();

        System.out.println("quantas locomotivas ?");
        int qtdloc = sc.nextInt();

        sc.nextLine();

        for( int i = 0; i < qtdloc; i++){
            locomotivas.add(new Locomotiva(sc));
        }

        System.out.println("Quantos vagões? ");
        int qtdvag = sc.nextInt();

        sc.nextLine();

        if (qtdloc + qtdvag > 150) {

            throw new IllegalArgumentException("Trem não pode ter mais que 150 recusos");
            
        }

        for (int i = 0; i < qtdvag; i++) {
            vagoes.add(new Vagoes(sc));
        }


    }

    public void mostrarDados() {

        System.out.println("\n*** TREM ***");

        System.out.println("Prefixo: " + prefixo);
        System.out.println("Data: " + dataFormacao);

        System.out.println(
            "Origem: " + origem.sigla
        );

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

        System.out.println("\nLocomotivas:");

        for (Locomotiva l : locomotivas) {

            l.mostrarDados();

        }

        System.out.println("\nVagões:");

        for (Vagoes v : vagoes) {

            v.mostrarDados();

        }

    }
    
}
