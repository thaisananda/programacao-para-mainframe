package lista1.problemac;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] partes = sc.nextLine().split(" ");

            double temperatura = Double.parseDouble(partes[0]);
            double umidade = Double.parseDouble(partes[1]);
            int chuva = Integer.parseInt(partes[2]);

            if (chuva == 1) {
                System.out.println("NAO REGAR");
            } else if (temperatura > 30.0 && umidade < 50.0) {
                System.out.println("REGAR");
            } else {
                System.out.println("NAO REGAR");
            }
        }

        sc.close();
    }
}