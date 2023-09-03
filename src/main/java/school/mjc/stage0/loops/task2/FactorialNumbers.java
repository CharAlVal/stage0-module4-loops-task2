package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        int factorial = 1;
        while(count <= printToInclusive) {
            System.out.println(factorial);
            ++count;
            factorial *= count;
        }

    }
}
