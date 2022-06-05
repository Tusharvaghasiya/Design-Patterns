package strategy_pattern;

public class QuackAsMute implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<<Silent>>");
	}

}
