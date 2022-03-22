package test;

public class Number5 {

	public static void main(String[] args) {
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum1 = 0;					
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
			sum1 += num[i];
			}
		}
		System.out.println("짝수의 합 : " + sum1);
		
		int sum2 = 0;					
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 1) {
				sum2 += num[i];
			}
		}
		System.out.println("홀수의 합 : " + sum2);
	}

}
