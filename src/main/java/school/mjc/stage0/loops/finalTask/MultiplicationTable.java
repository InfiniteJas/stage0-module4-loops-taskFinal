package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        if (numberTableToPrint <= 0) {
            return 0;
        }

        for (int i = 1; i <= 10; i++) {
            int result = numberTableToPrint * i;
            System.out.println(i + " x " + numberTableToPrint + " = " + result);
        }
    }
}
