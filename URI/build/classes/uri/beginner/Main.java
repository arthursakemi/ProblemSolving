package uri.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        while (n != 0) {
            print(matriz(n));
            n = Integer.parseInt(br.readLine());
            System.out.println("");
        }
    }

    static int[][] matriz(int n) {
        int[][] matriz = new int[n][n];
        int end = n % 2 == 0 ? n / 2 : n / 2 + 1;

        for (int i = 0; i < end; i++) {
            for (int j = i; j < n - i; j++) {
                matriz[i][j] = i + 1;
                matriz[n - 1 - i][j] = i + 1;
                matriz[j][i] = i + 1;
                matriz[j][n - 1 - i] = i + 1;
            }
        }

        return matriz;
    }

    static void print(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int j = 0; j < linha.length; j++) {
                System.out.printf("%3d", linha[j]);
                if (j < linha.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
