package loop;

public class Main06 {

	public static void main(String[] args) {
		// do ~ while문으로 구구단 7단 출력
		int j = 0;
		int i = 1; // 초기식
		
		do {
			j = 7*i; // 반복할 문장
			i++; // 증감식
			System.out.println(j);
		} while (i <= 9) ; // 조건식
	}
}
