package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 0;
        boolean dividend2;
        boolean dividend3;


        while (count <= printToInclusive) {
            dividend2 = count % 2 != 0;
            dividend3 = count % 3 != 0;

            if (count > 3 && dividend2 && dividend3) {
                System.out.println(count);
                ++count;
            } else if (count == 2 || count == 3) {
                System.out.println(count);
                ++count;
            } else {
                ++count;
            }
        }
    }
}
