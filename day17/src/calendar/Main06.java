package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Main06 { // Scanner 사용한 달력출력

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("연도를 입력하세요.");
		int year = sc.nextInt();

		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();

		System.out.println(year + "년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		cal.set(year, month - 1, 1);

		cal.set(Calendar.DAY_OF_MONTH, 1);

		int week = cal.get(Calendar.DAY_OF_WEEK);

		int lastWeek = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		for (int j = 1; j <= lastWeek; j++) {
			System.out.print(j + "\t");
			if (week % 7 == 0)
				System.out.println();
			week++;
		}
		sc.close();
	}

}
