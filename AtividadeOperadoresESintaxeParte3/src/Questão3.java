public class Questão3 {
    public static void main(String[] args) {
        int fat = 1;
        for (int i = 1; i < 10 ; i++) {
            System.out.println(fat*i + " ");
            fat *= i;
        }
    }   
}
