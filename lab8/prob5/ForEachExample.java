package MPP.lab8.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");


        //a
        list.forEach(word ->{
            System.out.println(word.toUpperCase());
        });

    //b
        System.out.println("------------------");
        Mycon c = new Mycon();
        list.forEach(c::accept);

    }

    //implement a Consumer
    static class Mycon implements Consumer<String>{
        public void accept(String s) {
            System.out.println(s.toUpperCase());
        }
    }

}