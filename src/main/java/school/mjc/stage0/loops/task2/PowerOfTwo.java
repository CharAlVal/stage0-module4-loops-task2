package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        if (power<0){
            System.out.println("too much power");
            ++count;
        }else {
            while (count <= power) {
                System.out.println(1 << count);
                ++count;
            }
        }

    }
}
