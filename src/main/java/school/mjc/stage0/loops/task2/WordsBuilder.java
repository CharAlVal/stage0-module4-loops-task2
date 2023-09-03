package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 0;


        while(count != chars.length) {
            System.out.print(chars[count]);
            ++count;
        }

    }
}
