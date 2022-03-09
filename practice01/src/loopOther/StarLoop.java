package loopOther;

public class StarLoop {

	public static void main(String[] args) {

		int s = 0; // 라인 수에 대한 변수 선언
		for(int i = 1; i < 8; i++) {
			for(int j = 0; j <= s; j++ ) { // j가 s를 이용해 별의 개수를 조정한다.
				System.out.print("★");
			}
			
			System.out.println(); 
			
		if(i < 4) { s++; } // 4번째 줄까지 증가
		else { s--; } // 4번째 줄 이후부터 감소
		
		
		}	
		
	}

}
