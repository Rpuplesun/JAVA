package calculator;
import java.util.Scanner; //입력처리하는 클래스


public class Mycalculator {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in); //sc라는 객체(인스턴스 변수) 생성 = sc가 Scanner를 사용할 수 있게 된다.
	        
	        while (true) { // 조건식이 참인 동안 무한 반복
	            showMenu(); // showmenu 호출

	            char myChar = sc.next().charAt(0); 
	            
	            // 사용자가 선택한 숫자 검색 및 유효성 검사, String 타입의 문자열에서 index 위치에 있는 문자값 반환
	            if ( !checkNum(myChar) ) { //!는 not
	                System.out.println("메뉴를 잘못 선택했습니다.1");
	                continue; // 다시 실행해라(showMenu() 호출)
	            }
	           
	            int num = myChar - '0';
	            System.out.println(num);
	            if (num == 0) // 반복문 종료
	            {
	                break;
	            }
	            else
	            {
	                if (num > 4)
	                {
	                    System.out.println("메뉴를 잘못 선택했습니다.2");
	                    continue;
	                }
	                
	   
	                System.out.print("첫 번째 숫자:");
	                int num1 = sc.nextInt();
	                
	                System.out.print("두 번째 숫자:");
	                int num2 = sc.nextInt();

	                // 해당하는 함수 호출
	                if (num == 1)
	                    addNum(num1, num2);
	                else if (num == 2)
	                    minusNum(num1, num2);
	                else if (num == 3)
	                    multiplyNum(num1, num2);
	                else if (num == 4)
	                    divideNum(num1, num2);
	                
	            }
	        }
	        System.out.println("계산기를 종료합니다.");
	    }
	    
	    public static void showMenu()
	    {
	        System.out.println("메뉴를 선택하세요.");
	        System.out.println("1.더하기");
	        System.out.println("2.빼기");
	        System.out.println("3.곱하기");
	        System.out.println("4.나누기");
	        System.out.println("0.끝내기");        
	    }
	    
	    public static void addNum(int num1, int num2)
	    {
	        int result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	    }
	    
	    public static void minusNum(int num1, int num2)
	    {
	        int result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	    }

	    public static void multiplyNum(int num1, int num2)
	    {
	        int result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	    }
	    
	    public static void divideNum(int num1, int num2)
	    {
	        int result1 = num1 / num2; // 몫을 나타냄 5/2 = 2(몫) 
	        System.out.println(num1 + " / " + num2 + " = " + result1);

	        int result2 = num1 % num2; // 나눈 후 나머지를 나타냄.
	        System.out.println(num1 + " % " + num2 + " = " + result2);
	    }
	    
	    //아스키코드 값 9 = 57
	    public static boolean checkNum(char ch)
	    {
	        if (ch >= '0' && ch <= '9')
	        {
	            return true;
	        }
	        else 
	        {
	            return false;
	        }
	    }
	}
