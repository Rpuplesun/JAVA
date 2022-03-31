package test4.lcw;

public class Main01 {

	public static void main(String[] args) {
		// 객체생성 및 학생 정보 할당
		Student std = new Student("이찬우", 1, 10, 90, 80, 70);

		//총합, 평균값을 출력하는 메서드 호출
		System.out.println("kor, eng, math 합계 : " + std.getTotal());
		System.out.println("kor, eng, math 평균 : " + std.getAverage());
		
		// 학생 정보 출력하는 메서드 호출
		std.name();
		std.ban();
		std.no();
		std.kor();
		std.eng();
		std.math();
		
		
	}

}
