package loop;

public class Main04 {

	public static void main(String[] args) {
		
		// while문으로 구구단 7단 출력
		
		int j = 0; // 7단의 값을 받을 변수 선언
		
		int i = 1; // 초기식
		while(i <= 9) { // 조건식
			
			j = 7 * i; // 변수 j에 7*i 값 할당, 반복할 문장
			
			i++; //증감식
			
		System.out.println(j);
		}
	}
}
