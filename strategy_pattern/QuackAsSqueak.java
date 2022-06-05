package strategy_pattern;

public class QuackAsSqueak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<<Squeak>>");
	}

}
