package MPP.lab7.prob4;

public abstract interface FlyBehavior {
	
	default void fly() {
		System.out.println("flying");
	};
}
