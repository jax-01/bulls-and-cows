package src;

public class BullsAndCows {
    public static void main(String[] args) {
        // Generate a 4-digit code
        final short CODE = (short) (Math.random() * (9999 - 1000 + 1) + 1_000);
        final String strCode = Short.toString(CODE);
        String guess = new java.util.Scanner(System.in).nextLine();
        int bulls = 0, cows = 0;

        for (int i = 0; i < strCode.length(); i++) {
            if (guess.charAt(i) == strCode.charAt(i)) {
                bulls++;
            } else if (guess.charAt(i) != strCode.charAt(i)
                        && strCode.contains(String.valueOf(guess.charAt(i)))) {
                cows++;
            }
        }
    }
}
