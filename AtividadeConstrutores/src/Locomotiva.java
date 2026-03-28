package AtividadeConstrutores.src;

import java.util.Scanner;

public class Locomotiva {
    public String numeroSerie;
    public double capacidadeTracao;
    public double comprimento;

    public Locomotiva(Scanner sc) {

        System.out.print("Número de série da locomotiva: ");
        numeroSerie = sc.nextLine();

        System.out.print("Capacidade de tração: ");
        capacidadeTracao = sc.nextDouble();

        System.out.print("Comprimento: ");
        comprimento = sc.nextDouble();

        sc.nextLine();
    }

    public void mostrarDados() {

        System.out.println("\nLOCOMOTIVA");

        System.out.println(
            "Número série: " + numeroSerie
        );

        System.out.println(
            "Capacidade tração: " +
            capacidadeTracao
        );

        System.out.println(
            "Comprimento: " + comprimento
        );

    }
}
