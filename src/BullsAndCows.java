package src;

import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int codeLength = sc.nextInt();

        if (codeLength > 10) {
            System.out.println("Error: can't generate a secret number with a length of "
                                + codeLength + " because there aren't enough unique digits");
            return;
        }

        StringBuilder code = new StringBuilder();

        do {
            long pseudoRandomNumber = System.nanoTime();
            StringBuilder stringRandomNumber = new StringBuilder();
            stringRandomNumber.append(pseudoRandomNumber);
            stringRandomNumber = stringRandomNumber.reverse();
            int zeroCounter = 0;

            while (zeroCounter < codeLength && stringRandomNumber.charAt(zeroCounter) == '0') {
                zeroCounter++;
            }

            if (zeroCounter > 0) {
                stringRandomNumber.delete(0, zeroCounter);
            }

            for (int i = 0; i < codeLength; i++) {
                if (code.indexOf(String.valueOf(stringRandomNumber.charAt(i))) == -1) {
                    code.append(stringRandomNumber.charAt(i));

                }
            }
        } while (code.length() < codeLength);

//        for (int i = 0; i < codeLength; i++) {
//            if (code.isEmpty() && stringRandomNumber.charAt(i) == '0') {
//                continue;
//            }
//
//            if (code.indexOf(String.valueOf(stringRandomNumber.charAt(i))) == -1) {
//                code.append(stringRandomNumber.charAt(i));
//            }
//        }

        System.out.println(code);
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
