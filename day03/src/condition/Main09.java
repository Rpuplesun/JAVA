package condition;

public class Main09 {

	public static void main(String[] args) {
		//////////////////////////////////////////////////////////////////////// if문
		
		//문제1. 만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라
		
		// 문제2. 만약 3000원 이상 있거나, 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라
		
		// 문제3. 어떤 특정 정수값 a가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하라.
		
		// 문제4. 특정 정수값 a2, b2, c2의 최대값을 구하여라
		
		/*
		 * 문제5-1. 국어, 영어, 수학 점수의 평균이 95점 이상이면 "장학생"을 출력하여라.
		 * 문제5-2. 국어점수가 70점 이상이면 "국어 합격" 그렇지 않으면 "국어 불합격"을 출력하여라.
		 * 문제5-3. 수학점수가 90점 이상이면 "A학점", 80점 이상이면 "B학점", 70점 이상이면 "C학점", 60점 이상이면 "D학점", 나머지 "F학점"을 출력 
		*/
		
		////////////////////////////////////////////////////////////////////////// switch-case
		// 문제1. 1은 "축구", 2는 "농구", 3은 "야구", 4는 "배구", 그 외는 "배드민턴"을 출력
		
		// 문제2. 숫자가 3이면 "안녕"이 세줄, 숫자가 2이면 "안녕"이 두줄, 숫자가 1이면 "안녕"이 한줄, 그 외는 "잘가"를 출력
		
		
		
		//변수선언
		int money = 3000; // 문제1, 2번 변수
		boolean card = true; // 문제2번 변수
		int a = 8; // 문제3번 변수
		int a2 = 10, b2 = 20, c2 = 90; // 문제4번 변수
		int max = 0; // 문제4번 변수
		int kor = 100, math = 100, eng = 100; // 문제5번 변수
		char exercise = '3'; // 문제6번 변수
		int hi = 1; // 문제7번 변수
		
		//1번문제
		System.out.println("---------1번 문제---------");
		if( money >= 3000) {
			System.out.println("택시를 타세요.");
		} else {
			System.out.println("걸어가세요.");
		}
		System.out.println();
		
		//2번문제	
		System.out.println("--------2번 문제--------");
		
		if(money >= 3000 || card) {
			System.out.println("택시를 타세요.");
		} else {
			System.out.println("걸어가세요.");
		}
		System.out.println();
		
		//3번문제	
		System.out.println("--------3번 문제--------");
		
		if(a % 2 == 1) {
			System.out.println("a는 홀수입니다.");
		} else {
			System.out.println("a는 짝수입니다.");
		}
		
		//4번문제	
		System.out.println("--------4번 문제--------");
		
		if(a2 > b2 && a2 > c2) {
			max = a2;
		} else  {
			if(b2 > c2) {
			max = b2;
			} else {
				max = c2;
			}
		} System.out.println("최댓값은 : " + max);
	
	
	
		//5번문제	
		System.out.println("--------5번 문제--------");
		
		if((kor+math+eng) / 3 >= 95) System.out.println("장학생");

		if(kor >= 70) {
			System.out.println("국어 합격");
		} else System.out.println("국어 불합격"); 
		
		if(math >= 90) {
			System.out.println("A학점");
		} else if(math >= 80 && math < 90) {
			System.out.println("B학점");
		} else if(math >= 70 && math < 80) {
			System.out.println("C학점");
		} else if(math >= 60 && math < 70) {
			System.out.println("D학점");
		} else System.out.println("F학점");

		
		//6번문제	
		System.out.println("--------6번 문제--------");
		
		switch(exercise) {
		case '1' : System.out.println("축구"); break;
		case '2' : System.out.println("농구"); break;
		case '3' : System.out.println("야구"); break;
		case '4' : System.out.println("배구"); break;
		default : System.out.println("배드민턴"); break;
		}
		
		//7번문제	
		System.out.println("--------7번 문제--------");
		
		switch(hi) {
		case 3 : System.out.println("안녕");
		case 2: System.out.println("안녕");
		case 1: System.out.println("안녕"); break;
		default :
			System.out.println("잘가");
		}
		
		
	}
}
