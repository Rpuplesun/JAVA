package loop;

public class Main05 {

	public static void main(String[] args) {
		// do ~ while문, 1 ~ 100 누적된 합
		int sum = 0;
		int i = 1; // 초기식
		
		do {
			sum += i; // 반복할 문장
			i++; // 증감식
		} while (i <= 100); // 조건식
		
		System.out.println(sum);
	}
}
