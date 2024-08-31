package src;

import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the length of the secret code");
        int codeLength = sc.nextInt();

        if (codeLength > 36) {
            System.out.println("Error: can't generate a secret number with a length of "
                                + codeLength + " because there aren't enough unique digits");
            return;
        }

        System.out.println("Input the number of possible symbols in the code:");
        int possibleSymbols = sc.nextInt();

        if (possibleSymbols > 36) {
            System.out.println("Error: " + possibleSymbols + " exceeds the number of possible symbols in the code");
            return;
        }

        if (codeLength > possibleSymbols) {
            System.out.println("Code length shouldn't be greater than number of symbols");
            return;
        }

        StringBuilder code = new StringBuilder();
        code.append(getCode(codeLength, possibleSymbols));
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

    public static StringBuilder getCode(int codeLength, int possibleSymbols) {
        StringBuilder code = new StringBuilder();
        String symbols = "0123456789abcdefghijklmnopqrstuvwxyz";

        do {
            for (int i = 0; i < codeLength; i++) {
                int index = (int) (Math.random() * ((possibleSymbols - 1) + 1));

                if (code.indexOf(String.valueOf(symbols.charAt(index))) == - 1 ) {
                    code.append(symbols.charAt(index));
                } else {
                    break;
                }
            }

            if (code.length() < codeLength) {
                code.delete(0, code.length());
            }
        } while (code.length() < codeLength);

        System.out.print("The secret is prepared: ");
        for (int i = 0; i < codeLength; i++) {
            System.out.print("*");
        }

        System.out.println(possibleSymbols == 10 ? " (0-9)" :
                        possibleSymbols < 10 ? " (0-" + (possibleSymbols - 1) + ")" :
                        possibleSymbols == 11 ? " (0-9, a)" : " (0-9, a-" + symbols.charAt(possibleSymbols - 1) + ")");

        return code;
    }
}
