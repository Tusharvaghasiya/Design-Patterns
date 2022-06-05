package strategy_pattern;

public class FlyWithWing implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("flying...");
	}

}
