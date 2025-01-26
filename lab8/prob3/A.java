package MPP.lab8.prob3;

import java.util.List;
import java.util.ArrayList;
import java.util.function.BiFunction;

public class A {
    public static void main(String[] args) {
        //yes it can be typed correctly as a Bifunction

        BiFunction<Double, Double , List<Double>> mylistfunc =  (x,y)->{
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x*y);
            return list;
        };
        System.out.println(mylistfunc.apply(2.0,3.0));
    }
}
