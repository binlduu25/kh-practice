package edu.kh.operator.ex;
//예제 코드 작성용 클래스 (기능용/메서드용)
public class OpExample {
	
	// 기능들만 .. == 메서드
	// 연습용 기계 또는 설계도를 만들 것
	// 따라서 이 클래스에는 main 메서드가 없다.
	// 이 클래스에서 기능을 만들고 다른 클래스에서 불러올 것
	 // Scanner 기능을 불러오는 것처럼
	
	public void havingMeal() { // 이곳에는 havingMeal이라는 기능이 있다는 뜻
	 // 이 부분에 havingMeal에 대한 정의가 들어간다.
	}
		
	public void hi() { // 이곳에는 'hi'이라는 기능이 있다는 뜻, 즉 설계도가 있다.
		System.out.println("안녕!");
	}	
		
	public void hungry() { // 이곳에는 'hungry'이라는 기능이 있다는 뜻, 즉 설계도가 있다.
		System.out.println("배고프다");
	}
	
	public void testEx1() { // 증감 연산자에 대한 메서드 만들기
		
		// 증감 연산자 : "++"(1 증가), "--"(1 감소)
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1의 값: "+iNum1);
		System.out.println("iNum2의 값: "+iNum2);
		
	}
	
	public void testEx2() { // 비교 연산자에 대한 메서드 만들기
		
		// 비교 연산자 : > < >= <= == !=
		// 비교 연산자의 결과는 항상 논리값(t/f)
		
			// 비교 연산자 테스트 1
		
			int a = 10;
			int b = 20;
		
			System.out.println("비교 연산자 테스트1 : "+( (a==b) == false) );
													// false
														// false
			
			// 비교 연산자 테스트 2
			
			int c = 4;
			int d = 5;
			
			System.out.println("비교 연산자 테스트2 : "+ ( (++c != d) == (--c != d) ) );
													  // false		   // true
														    	// false
	}
	
	public void testEx3() { // 논리 연산자에 대한 메서드 만들기
		
		// 논리 연산자 :  논리 값 2개를 비교하는 연산자
		
		// 1.&& 
		// && : 두 피연산자가 모두 true일 때 true 반환(AND)
		// "와, 그리고, ~면서, ~부터 ~까지, ~사이 등등"		
			
			int ab = 101;
			// ab는 100이상"이면서" 짝수인가?
			System.out.println("논리 연산자 테스트1 : " + ( (ab>=100) && (ab%2==0) ) ); // 결과는 false
	
			int ac = 5;
			// ac는 1부터 10까지의 숫자 범위에 포함되어 있는가?
			System.out.println("논리 연산자 테스트2 : " + ( (ac>=1) && (ac<=10) ) ); // 결과는 true
	
					
		// 2. ||
		// || : 두 피연산자 중 하나만 true여도 true 반환(OR)
		// "또는, 혹은, ~거나 등등"
			
			int ad = 10;
			// ad는 10을 초과하거나 짝수인가?
			System.out.println("논리 연산자 테스트3 : " + ( (ad>10) || (ad%2==0) ) ); // 결과는 true
 	}
		
	public void testEx4() { // 삼항 연산자에 대한 메서드 만들기
		
		// 삼항 연산자란?
		 // 형식
		  // '조건식' '?' 'true일 때 수행값' ':' 'false일 때 수행값'
		  //     1	   2          3           4		     5
			
			
	}
}
	

