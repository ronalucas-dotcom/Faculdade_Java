package AtividadeConstrutores.src;

import java.util.Scanner;

public class Vagoes {
    public String numeroSerie;
    public String tipo;
    public double capacidadeCarga;

    public double compTesteiras;
    public double compEngates;

    public Vagoes(Scanner sc){

        System.out.print("Número de série do vagão: ");
        numeroSerie = sc.nextLine();

        System.out.print("Tipo: ");
        tipo = sc.nextLine();

        System.out.print("Capacidade de carga: ");
        capacidadeCarga = sc.nextDouble();

        System.out.print("Comprimento entre testeiras: ");
        compTesteiras = sc.nextDouble();

        System.out.print("Comprimento dos engates: ");
        compEngates = sc.nextDouble();

        sc.nextLine();

        
    }

    public void mostrarDados() {

        System.out.println("\nVAGÃO");

        System.out.println(
            "Número série: " + numeroSerie
        );

        System.out.println("Tipo: " + tipo);

        System.out.println(
            "Capacidade: " + capacidadeCarga
        );

        System.out.println(
            "Comp. testeiras: " +
            compTesteiras
        );

        System.out.println(
            "Comp. engates: " +
            compEngates
        );

    }

    
}
