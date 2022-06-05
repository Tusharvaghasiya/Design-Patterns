package strategy_pattern;

public class QuackAsQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<<Quacking>>");
	}

}
