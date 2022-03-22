package test;

public class Number4 {

	public static void main(String[] args) {
		int[] num = {94, 85, 95, 88, 90};
		int max = num[0];
		for(int i = 1; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("최댓값 " + max);
	}

}
