package lista2.problemaf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final double PI = 3.14159265358979323846;

        String line;

        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;

            StringTokenizer st = new StringTokenizer(line);

            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double theta = Double.parseDouble(st.nextToken());

            if (a == 0 && b == 0 && theta == 0) {
                break;
            }

            double radians = theta * PI / 180.0;
            double area = (a * b * Math.sin(radians)) / 2.0;

            sb.append(String.format(Locale.US, "%.4f%n", area));
        }

        System.out.print(sb.toString());
    }
}


