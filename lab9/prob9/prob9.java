package MPP.lab9.prob9;

import java.util.stream.IntStream;

public class prob9 {
    static int count = 1;

    public static void main(String[] args) {
        print(4);
    }

    public static void print(int num) {
        IntStream intStream = IntStream.iterate(1, n-> square(++count)).limit(num);
        intStream.forEach(i -> System.out.print(i+" "));
    }

    public static int square(int num) {
        return (int)Math.pow(num, 2);
    }
}
