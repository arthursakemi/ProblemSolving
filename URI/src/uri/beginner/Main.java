package uri.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int P = Integer.parseInt(br.readLine());
        int[][] pontos = pontos(P);
        boolean[] usado = new boolean[P];

        double fio = 0;
        double menori = D(pontos[0], pontos[1]);
        double menorf = D(pontos[0], pontos[1]);
        double di = D(pontos[0], pontos[1]);
        double df = D(pontos[0], pontos[1]);
        int i = 0, f = 0;
        int xi = 1, xf = 1;

        while (!concluido(usado)) {
            usado[i] = true;
            boolean primeiro = true;

            for (int k = 0; k < usado.length; k++) {
                if (!usado[k]) {
                    if (primeiro) {
                        menori = D(pontos[i], pontos[k]);
                        xi = k;
                        menorf = D(pontos[f], pontos[k]);
                        xf = k;
                        primeiro = false;

                    }
                    di = D(pontos[i], pontos[k]);
                    if (di < menori) {
                        menori = di;
                        xi = k;
                    }
                    df = D(pontos[f], pontos[k]);
                    if (df < menorf) {
                        menorf = df;
                        xf = k;
                    }
                }
            }

            if (menori <= menorf) {
                usado[xi] = true;
                i = xi;
                fio += menori;
            } else {
                usado[xf] = true;
                f = xf;
                fio += menorf;
            }

        }

        System.out.printf("%.6f\n", fio);

    }

    static boolean concluido(boolean[] usado) {
        for (int i = 0; i < usado.length; i++) {
            if (!usado[i]) {
                return false;
            }
        }
        return true;
    }

    static double D(int[] A, int[] B) {
        int a = Math.abs(A[0] - B[0]);
        int b = Math.abs(A[1] - B[1]);

        double d = Math.sqrt(a * a + b * b);

        return d;
    }

    static int[][] pontos(int P) throws IOException {
        int[][] pontos = new int[P][];

        for (int i = 0; i < pontos.length; i++) {
            pontos[i] = input();
        }

        return pontos;
    }

    static int[] input() throws IOException {
        String[] input = br.readLine().split(" ");
        int[] x = new int[input.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(input[i]);
        }
        return x;
    }

}
