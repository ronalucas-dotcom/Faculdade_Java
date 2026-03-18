import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = sc.nextInt();
        int primeiro = 0;
        int segundo = 1;
        int prox;
        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");
        for (int i = 3; i <= num; i++) {
            prox = primeiro + segundo;
            System.out.print(prox + " ");
            primeiro = segundo;
            segundo = prox;
        }
        sc.close();
    }
}
