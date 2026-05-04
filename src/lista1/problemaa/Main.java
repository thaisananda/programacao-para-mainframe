package lista1.problemaa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String linha;

        while ((linha = br.readLine()) != null) {
            linha = linha.trim();

            if (linha.isEmpty()) {
                continue;
            }

            String[] simbolos = linha.split("\\s+");

            long resultado = 0;

            for (String s : simbolos) {
                int valor = 0;

                if (s.equals("*")) {
                    valor = 0;
                } else {
                    for (int i = 0; i < s.length(); i++) {
                        char c = s.charAt(i);

                        if (c == '.') {
                            valor += 1;
                        } else if (c == '-') {
                            valor += 5;
                        }
                    }
                }

                resultado = resultado * 20 + valor;
            }

            System.out.println(resultado);

            if (linha.equals("*")) {
                break;
            }
        }
    }
}