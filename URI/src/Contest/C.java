/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int F = Integer.parseInt(br.readLine());

        for (int i = 0; i < F; i++) {
            int[] CT = input();
            int[][] cenarios = cenarios(CT[1]);

        }

    }

    static int run(int fim, int entrada, int saida, int[][] fases) {
        int tempo = 0;
        int menor = 0;

        return menor;
    }

    static int[][] cenarios(int transicoes) throws IOException {
        int[][] cenarios = new int[transicoes][];

        for (int i = 0; i < cenarios.length; i++) {
            cenarios[i] = input();
        }

        return cenarios;
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
