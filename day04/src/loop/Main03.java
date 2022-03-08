package loop;

public class Main03 {

	public static void main(String[] args) {
		
		// 1 ~ 10까지의 누적된 합
		
		int sum = 0; // 1 ~ 10까지의 합 값을 받을 변수 선언
		
		int i = 1; // 초기식
		while(i <= 10) { // 조건식
			
			sum += i; // 변수 j에 7*i 값 할당, 반복할 문장
			
			i++; //증감식
		}
		System.out.println(sum);
		
		
		
		
		
	}

}
