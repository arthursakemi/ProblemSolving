/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri.beginner;

/**
 *
 * @author Sakemi
 */
public class codeSignal {

    public static void main(String[] args) {

        System.out.println(candles(5, 2));
    }

    static int candles(int whole, int makeNew) {
        int lo = 0, burnt = 0;

        while (whole > 0 || lo >= makeNew) {
            burnt += whole;
            lo += whole;
            whole = lo / makeNew;
            lo = lo % makeNew;
        }

        return burnt;
    }

}
