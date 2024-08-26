package src;

import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int codeLength = sc.nextInt();


//        Generate a 4-digit code
//        final short CODE = (short) (Math.random() * (9999 - 1000 + 1) + 1_000);
//        final String strCode = Short.toString(CODE);
//        String guess = new java.util.Scanner(System.in).nextLine();
//        int bulls = 0, cows = 0;
//
//        for (int i = 0; i < strCode.length(); i++) {
//            if (guess.charAt(i) == strCode.charAt(i)) {
//                bulls++;
//            } else if (guess.charAt(i) != strCode.charAt(i)
//                        && strCode.contains(String.valueOf(guess.charAt(i)))) {
//                cows++;
//            }
//        }
//
//        if (bulls > 0 && cows > 0) {
//            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s). The secret code is " + strCode + ".");
//        } else if (bulls > 0 && cows == 0) {
//            System.out.println("Grade: " + bulls + " bull(s). The secret code is " + strCode + ".");
//        } else if (bulls == 0 && cows > 0) {
//            System.out.println("Grade: " + cows + " cow(s). The secret code is " + strCode + ".");
//        } else {
//            System.out.println("Grade: None. The secret code is " + strCode + ".");
//        }
    }
}
