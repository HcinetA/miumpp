package MPP.lab8;

import java.util.function.Supplier;

public class ii {
    public static void main(String[] args) {
        Supplier<Double> v = () -> Math.random();
        System.out.println(v.get());
    }
}
