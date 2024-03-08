import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            int a = sc.nextInt();
            int total = 0;

            for (int k = 0; k < a; k++) {
                total += sc.nextInt();
            }

            System.out.println(total - (a - 1));
        }

        sc.close();
    }
}
