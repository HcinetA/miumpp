package MPP.lab7.prob4;

public abstract interface MuteQuack extends QuackBehavior {

	@Override
	public default void quack() {
		System.out.println("can't quack");
	}

}
