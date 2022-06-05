package strategy_pattern;

public class DuckSim {

	public static void main(String[] args) {
		Duck mountainDuck = new MountainDuck();
		mountainDuck.setFlyBehaviour(new FlyWithWing());
		mountainDuck.setQuackBehaviour(new QuackAsQuack());
		mountainDuck.display();
		mountainDuck.performQuack();
		mountainDuck.performFly();
	}

}
