package lista2.problemae;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	 public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(br.readLine());

	        long saldo = 0;
	        long menorSaldo = 0;

	        for (int i = 0; i < n; i++) {
	            long t = Long.parseLong(br.readLine());

	            saldo += t;

	            if (saldo < menorSaldo) {
	                menorSaldo = saldo;
	            }
	        }

	        long resposta = -menorSaldo;

	        System.out.println(resposta);
	    }
}
