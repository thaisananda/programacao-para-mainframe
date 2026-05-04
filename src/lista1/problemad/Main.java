package lista1.problemad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        long melhor = Long.MIN_VALUE;

        for (int k = 1; k <= n / 2; k++) {
            for (int inicio = 0; inicio < k; inicio++) {

                long atual = 0;

                for (int i = inicio; i < n; i += k) {
                    atual += v[i];

                    if (atual > melhor) {
                        melhor = atual;
                    }

                    if (atual < 0) {
                        atual = 0;
                    }
                }
            }
        }

        System.out.println(melhor);

        sc.close();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 17cebc6f7348b8e9d9ae85d15ee9e1a44eb59908
