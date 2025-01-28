package MPP.lab11;

import java.util.Collection;

public class prob4 {

    // given example from lecture
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums)
            s += num.doubleValue();
        return s;
    }

	/*
		// part a

		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		double dbl = sum(nums);
		nums.add(3.14); // compile time error


		// part b

		List<Object> objs = new ArrayList<>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> ints = objs;
		ints.add(3);
		double dbl = sum(ints); // compile time error

	*/
}
