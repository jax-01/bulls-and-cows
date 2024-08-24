package src;

public class BullsAndCows {
    public static void main(String[] args) {
        // Generates 4-digit code
        final short CODE = (short) (Math.random() * (9999 - 1000 + 1) + 1_000);
    }
}
