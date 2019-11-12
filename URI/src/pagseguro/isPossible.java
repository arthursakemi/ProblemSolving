/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagseguro;

/**
 *
 * @author Sakemi
 */
public class isPossible {

    public static String isPossible(int a, int b, int c, int d) {
        if (a == c && b == d) {
            return "Yes";
        } else if (a > c || b > d) {
            return "No";
        }

        if (isPossible(a + b, b, c, d).equals("Yes")) {
            return "Yes";
        } else if (isPossible(a, a + b, c, d).equals("Yes")) {
            return "Yes";
        }

        return "No";
    }

    public static void main(String[] args) {

    }

}
