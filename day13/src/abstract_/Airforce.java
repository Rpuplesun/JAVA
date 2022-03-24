package abstract_;

/*
 * 추상 클래스를 상속받으면 자식은 부모의
 * 모든 추상 메서드를 재정의 해야한다.
 */

public class Airforce extends Unit {

	public Airforce(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
		System.out.println(this.getName() + ">> 공중 공격");
	}
	
	@Override
	public void move() {
		System.out.println(this.getName() + ">> 공중 이동");
	}
	
}
