package fibo;
import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력하는 수 까지의 수열 출력 : ");
		int f = sc.nextInt();

		int num1, num2, sum;
		num1 = 0;
		num2 = 1;
		sum = 1;

		for (int i = 0; i < f; i++) {
			System.out.print(sum + " ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;

			if (sum >= f)
				break;
		}

	}
}
