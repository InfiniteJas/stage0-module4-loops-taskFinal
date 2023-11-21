package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        if (power < 0) {
            System.out.println("Power should be a non-negative integer.");
            return;
        }

        int result = 1;

        // Calculate power using a for loop
        for (int i = 1; i <= power; i++) {
            result *= numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
