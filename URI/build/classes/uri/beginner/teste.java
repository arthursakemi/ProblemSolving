/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri.beginner;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Sakemi
 */
public class teste {

    public static int[] leituramatriz() throws Exception {

        FileReader arquivo = new FileReader("vetor.txt");
        BufferedReader leBufferizado = new BufferedReader(arquivo);
        String linha = leBufferizado.readLine();
        String dados[] = linha.split(" ");

        int[] vetor = new int[dados.length];
        for (int i = 0; i < dados.length; i++) {
            vetor[i] = Integer.parseInt(dados[i]);
        }

        int linhas = vetor[0];
        int colunas = vetor[1];

        double[][] matriz = new double[linhas][colunas];

        int d = 0;

        while ((linha = leBufferizado.readLine()) != null) {
            System.out.println(linha);
            String dadoss[] = linha.split(" ");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = Double.parseDouble(dadoss[d]);
                }
            }

            d++;

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("");

        return vetor;

    }

}
