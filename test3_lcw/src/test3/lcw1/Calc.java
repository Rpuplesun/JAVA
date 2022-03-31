package test3.lcw1;

// Calc 클래스 생성
public class Calc {
	// String 타입의 전역변수 생성
	private String name;
	
	// 생성자 정의
	public Calc(String name) {
		super();
		this.name = name;
	}
	
	// 이름 출력 메소드
	public void name() {
		System.out.println("이름 : " + this.name);
	}
	
	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// 덧셈 메서드
	public int plus(int x, int y) {
		int result1 = x + y;
		System.out.println(x + " + " + y + " = " + result1);
		return result1;
	}
	
	// 뺄셈 메서드
	public int minus(int x, int y) {
		int result2  = x - y;
		System.out.println(x + " - " + y + " = " + result2);
		return result2;
	}
	
	// 곱셈 메서드
	public int multiply(int x, int y) {
		int result3  = x * y;
		System.out.println(x + " * " + y + " = " + result3);
		return result3;
	}
	
	// 나눗셈 몫 메서드
	public int divide(int x, int y) {
		int result4  = x / y;
		System.out.println(x + " / " + y + " = " + result4);
		return result4;
	}

}
