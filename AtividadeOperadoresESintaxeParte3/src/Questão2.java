public class Questão2 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= i; j++) {
                if (i == j *i) {
                    continue;
            
                }
                else{
                    System.out.print(j*i + " ");

                }
            }
            System.out.println(" ");
        }
    }
}
