package test;

public class Number2 {

	public static void main(String[] args) {
		int average = 0;
		int total = 0;
		int sum = 0;
		int[][] arr = {

				{ 5, 5, 5, 5, 5 },

				{ 10, 10, 10, 10, 10 },

				{ 20, 20, 20, 20, 20 },

				{ 30, 30, 30, 30, 30 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				sum++;
			}
		}
		average = total / sum;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
}
