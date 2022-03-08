package loop;

public class Main10 {

	public static void main(String[] args) {
		// for문
		// 문제1 1~50 까지 숫자의 합
		int sum = 0;
		for(int i = 1; i <= 50; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("---------------------");
		
		// 문제2. 구구단 2단, 2 * 1 = 2 형식
		int two = 0;
		for(int i = 1; i <= 9; i++) {
			two = 2*i;
			System.out.println("2 x " + i + " = " + two);
		}
		System.out.println("---------------------");
		
		// while문
		// 문제1. 10번찍어 안 넘어 가는 나무 없다.
		// 나무를 1번 찍었습니다.
		// 나무를 2번 찍었습니다.
		// ...
		// 나무를 10번 찍었습니다.
		// 나무가 넘어갑니다.
		int treehit = 0;
		while(treehit < 10) {
			treehit++;
			System.out.println("나무를 " + treehit + "번 찍었습니다.");
			if(treehit == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
			
		}

	}

}
