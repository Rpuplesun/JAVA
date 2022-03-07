package condition;

public class Main04 {

	public static void main(String[] args) {
		int point = 87;
		
		if(point > 90 && point <= 100) {
			System.out.println("A");
		}else if(point > 80 && point <= 90) {
			System.out.println("B");
		}else if(point > 70 && point <=80) {
			System.out.println("C");
		}else{
			System.out.println("F");
		}
		
		
		
	}

}
