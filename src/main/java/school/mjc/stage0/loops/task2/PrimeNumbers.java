package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 2;
        boolean dividend2;
        boolean dividend3;
        boolean dividend5;


        while (count <= printToInclusive) {
            dividend2 = count % 2 != 0;
            dividend3 = count % 3 != 0;
            dividend5 = count % 5 != 0;

            if (count > 5 && dividend2 && dividend3 && dividend5) {
                System.out.println(count);
                ++count;
            } else if (count == 2 || count == 3 || count == 5) {
                System.out.println(count);
                ++count;
            } else {
                ++count;
            }
        }
    }
}
