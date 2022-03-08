package loop;

public class Main07 {

	public static void main(String[] args) {
		// while문과 do~while문의 차이점
		
		int max = 100;
		
		while(max > 100) {
			System.out.println("while문"); // 조건식이 false 이므로 실행되지 않는다.
		}
		
		do {
			System.out.println("do~while문"); // while 안에 조건식이 true이든 false이든 do 안에 문법은 무조건 한 번은 실행된다.
		} while(max > 100);
		
	}

}
