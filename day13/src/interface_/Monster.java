package interface_;

public class Monster implements Fight, Move {

	private String name;
	
	public Monster(String name) {
		super();
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println(this.name + " >>> 걷다");
	}

	@Override
	public void run() {
		System.out.println(this.name + " >>> 뛰다");
	}

	@Override
	public void jump() {
		System.out.println(this.name + " >>> 점프");
	}

	@Override
	public void attack() {
		System.out.println(this.name + " >>> 공격");
	}

	@Override
	public void shield() {
		System.out.println(this.name + " >>> 방어");
	}

}
