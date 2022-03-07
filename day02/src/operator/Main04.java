package operator;

public class Main04 {

	public static void main(String[] args) {
		int plus_num = 1;
		plus_num = plus_num + 1;
		plus_num += 1;
		plus_num++;
		++plus_num;
		
		System.out.println("plus_num : " + plus_num);
		System.out.println("-------------------------");
		
		int minus_num = 5;
		minus_num = minus_num - 1;
		minus_num -= 1;
		minus_num--;
		--minus_num;
		
		System.out.println("minus_num : " + minus_num);
		
		int a = 100;
		int x = 1;
		int y = a + ++x;
		
		System.out.println(y);
		System.out.println(x);
	}

}
