package MPP.lab8;

import java.util.function.Supplier;

public class iii {
    public static void main(String[] args) {
        System.out.println(new iii.supp().get());
    }
    static class supp implements Supplier{

        public Double get() {
            return Math.random();
        }
    }
}
