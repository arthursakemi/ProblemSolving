package Contest;


import java.util.Scanner;

public class Parentesis {

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int n = in1.nextInt();

        String[] input = new String[n];

        for (int i = 0; i < input.length; i++) {
            input[i] = in.nextLine();
        }

        String concat = "";

        for (String input1 : input) {
            concat = concat + input1;
        }

        boolean check;

        int count = 0;

        for (int i = 0; i < concat.length(); i++) {
            if (concat.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                check = false;
            }

        }
        check = count == 0;

        if (check) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
