package src;

import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codeLength = sc.nextInt();

        if (codeLength > 36) {
            System.out.println("Error: can't generate a secret number with a length of "
                                + codeLength + " because there aren't enough unique digits");
            return;
        }

        int possibleSymbols = sc.nextInt();

        StringBuilder code = new StringBuilder();
        code.append(getCode(codeLength));
        System.out.println("Okay, let's start a game!");
        int turns = 1;
        int bulls = 0, cows = 0;

        StringBuilder userGuess = new StringBuilder();

        do {
            System.out.println("Turn " + turns + ":");
            userGuess.append(sc.next());

            for (int i = 0; i < code.length(); i++) {
                if (userGuess.charAt(i) == code.charAt(i)) {
                    bulls++;
                } else if (userGuess.charAt(i) != code.charAt(i)
                        && code.toString().contains(String.valueOf(userGuess.charAt(i)))) {
                    cows++;
                }
            }

            if (bulls != codeLength) {
                System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow");
                bulls = 0;
                cows = 0;
            } else {
                System.out.println("Grade: " + bulls + " bulls");
                System.out.println("Congratulations! You guessed the secret code.");
                return;
            }
            userGuess.delete(0, userGuess.length());
            turns++;
        } while (bulls != codeLength);
    }

    public static long getCode(int codeLength) {
//        StringBuilder code = new StringBuilder();
        String symbols = "1234567890abcdefghijklmnopqrstuvwxyz";

        return (long) (Math.random() * ((Math.pow(10, codeLength) - 1) - (Math.pow(10, codeLength - 1)) + 1)
                                                    + Math.pow(10, codeLength - 1));
//        Generate a 4-digit code
//        final short CODE = (short) (Math.random() * (9999 - 1000 + 1) + 1_000);
//        do {
//            long pseudoRandomNumber = System.nanoTime();
//            StringBuilder stringRandomNumber = new StringBuilder();
//            stringRandomNumber.append(randomNumber).reverse();
//            int zeroCounter = 0;
//
//            while (zeroCounter <= codeLength && stringRandomNumber.charAt(zeroCounter) == '0') {
//                zeroCounter++;
//            }
//
//            if (zeroCounter > 0) {
//                stringRandomNumber.delete(0, zeroCounter);
//            }
//
//            for (int i = 0; i < codeLength; i++) {
//                if (code.indexOf(String.valueOf(stringRandomNumber.charAt(i))) == -1) {
//                    code.append(stringRandomNumber.charAt(i));
//                } else {
//                    break;
//                }
//            }
//
//            if (code.length() < codeLength) {
//                code.delete(0, code.length());
//            }
//        } while (code.length() < codeLength);
    }
}
