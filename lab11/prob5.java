package MPP.lab11;

import java.util.List;

public class prob5 {
    public static Object secondSmallest(List<?> lists) {
        return helperSmallest(lists);
    }

    private static <T> T helperSmallest(List<T> list) {
        return list.stream().sorted().skip(1).findFirst().get();
    }

    public static void main(String[] args) {
        List<Integer> lst1 = List.of(0, 10, 23, 345, 5646453, 34, 234);
        List<String> str = List.of("a", "t", "x", "w", "d");

        System.out.println(secondSmallest(lst1));
        System.out.println(secondSmallest(str));
    }
}
