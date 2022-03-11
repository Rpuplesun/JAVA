package array;

public class Main02 {

	public static void main(String[] args) {
		// 문제 1. num 배열에 저장된 요소의 합을 구하시오
		
		int[] num = new int[] {22, 3, 8, 12};
		int sum1 = 0;
		for(int i = 0; i <num.length; i++ ) {
			sum1 += num[i];
		}
		System.out.println("합계 " + sum1);
		System.out.println("---------------------------");
		// 문제 2. num2 배열의 저장된 요소의 합과 평균을 구하시오
		
		int[] num2 = new int[] {60, 95, 88};
		int sum2 = 0;
		int avg = 0;
		for(int i = 0; i < num2.length; i++) {
			sum2 += num2[i];
			avg = sum2 / num2.length;
		}
		System.out.println("합계 : " + sum2 + " 평균 : " + avg);
		System.out.println("---------------------------");
		
		// 문제 3. num3 배열에 저장된 요소의 최대값을 출력하시오.
		
		int[] num3 = {94, 85, 95, 88, 90};
		int max = num3[0];
		for(int i = 1; i < num3.length; i++) {
			if(num3[i] > max) {
				max = num3[i];
			}
		}
		System.out.println("최댓값 " + max);
		System.out.println("---------------------------");
		
		// 문제 4. num4 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		
		int[] num4 = new int[] {22, 3, 8, 12};
		int result1 = 0;					
		for (int i = 0; i < num4.length; i++) {
			if(num4[i] % 2 == 1) {
			result1 += num4[i];
			}
		}
		System.out.println("홀수의 합 : " + result1);
		
		int result2 = 0;					
		for (int i = 0; i < num4.length; i++) {
			if(num4[i] % 2 == 0) {
			result2 += num4[i];
			}
		}
		System.out.println("짝수의 합 : " + result2);
		
		/* 다른 방법
		int[] num4 = new int[] {22, 3, 8, 12};
		int result1 = 0;
		int result2 = 0;
							
		for (int i = 0; i < num4.length; i++) {
			if(num4[i] % 2 == 1) {  // 홀수
			result1 += num4[i];
			} else {				// 짝수
				result2 += num4[i]
				}
				System.out.println("홀수의 합 : " + result1 + "짝수의 합 : " + result2);
			*/
		}
	}


