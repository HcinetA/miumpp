package MPP.lab7.prob4;

public class DecoyDuck extends Duck implements CannotFly, MuteQuack {
	
	public DecoyDuck() {}

	@Override
	public void display() {
		System.out.println("this is a DecoyDuck");
	}
	
}