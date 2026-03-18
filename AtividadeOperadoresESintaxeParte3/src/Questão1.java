public class Questão1 {
    public static void main(String[] args) {
        int x = 80;
        while (x!= 1) {
        int y = (x%2 == 0)? x/2:3*x + 1;
        System.out.println(y);
        x = y;
        }
    }
}
