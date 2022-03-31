package test3.lcw1;

public class Main01 {

	public static void main(String[] args) {
		// 2개의 정수값을 받는 변수 선언 및 할당
		int a = 12;
		int b = 13;
		// 변수 출력
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// 이름을 매개변수 값으로 넘기는 객체 생성
		Calc cal = new Calc("이찬우");
		// name() 메서드 호출
		cal.name();
		
		// 사칙연산 메서드 호출
		cal.plus(a, b);
		cal.minus(a, b);
		cal.multiply(a, b);
		cal.divide(a, b);
	
	}

}
