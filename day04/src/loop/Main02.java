package loop;

public class Main02 {

	public static void main(String[] args) {
		
		// 구구단 7단의 결과 값
		
		int j = 0; // 7단의 값을 받을 변수 선언
		
		for(int i = 1; i <= 9; i++) { // 7*1 ~ 7*9 의 반복문 작성
			
			j = 7 * i; // 변수 j에 7*i 값 할당, 반복할 문장
			
			System.out.println("7 x " + i + " = " + j); // 7 x n = n 형식을 반들기 위한 문자열 삽입
			
		}
		
	}

}
