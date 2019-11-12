package uri.beginner;

import java.util.Scanner;

public class Beginner1061 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String[] input = input();
        String[][] tempoStr = split(input);
        int[][] tempoInt = convert(tempoStr);
        int[] duracao = duracao(tempoInt);

        output(duracao);

    }

    static String[] input() {
        String[] tempoStr = new String[4];

        for (int i = 0; i < tempoStr.length; i++) {
            tempoStr[i] = in.nextLine();
        }

        return tempoStr;
    }

    static String[][] split(String[] input) {

        String[][] tempoStr = new String[2][4];

        tempoStr[0][0] = input[0].substring(4);
        tempoStr[0][1] = input[1].substring(0, 2);
        tempoStr[0][2] = input[1].substring(5, 7);
        tempoStr[0][3] = input[1].substring(10, 12);

        tempoStr[1][0] = input[2].substring(4);
        tempoStr[1][1] = input[3].substring(0, 2);
        tempoStr[1][2] = input[3].substring(5, 7);
        tempoStr[1][3] = input[3].substring(10, 12);

        return tempoStr;
    }

    static int[][] convert(String[][] tempoStr) {
        int[][] tempoInt = new int[2][4];

        for (int i = 0; i < tempoStr.length; i++) {
            for (int j = 0; j < tempoStr[i].length; j++) {
                tempoInt[i][j] = Integer.parseInt(tempoStr[i][j]);
            }

        }

        return tempoInt;
    }

    static int[] duracao(int[][] tempoInt) {
        int[] duracao = new int[4];

        for (int i = 0; i < duracao.length; i++) {
            duracao[i] = tempoInt[1][i] - tempoInt[0][i];
        }

        if (duracao[3] < 0) {
            duracao[3] += 60;
            duracao[2]--;
        }

        if (duracao[2] < 0) {
            duracao[2] += 60;
            duracao[1]--;
        }

        if (duracao[1] < 0) {
            duracao[1] += 24;
            duracao[0]--;
        }

        return duracao;
    }

    static void output(int[] duracao) {
        System.out.printf("%d dia(s)\n", duracao[0]);
        System.out.printf("%d hora(s)\n", duracao[1]);
        System.out.printf("%d minuto(s)\n", duracao[2]);
        System.out.printf("%d segundo(s)\n", duracao[3]);
    }

}
