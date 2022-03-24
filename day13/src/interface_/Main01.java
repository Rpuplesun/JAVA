package interface_;

public class Main01 {

	public static void main(String[] args) {
		Character ch = new Character("캐릭터");
		ch.walk();
		ch.run();
		ch.jump();
		ch.attack();
		ch.shield();
		ch.pickup();
		
		System.out.println("-------------------------------");
		
		Monster mo = new Monster("몬스터");
		mo.walk();
		mo.run();
		mo.jump();
		mo.attack();
		mo.shield();
	}

}
