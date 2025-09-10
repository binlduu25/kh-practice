package edu.kh.variablePractice;

public class PracticeVariable {
	public static void main(String[] args) {
	
		//1.boolean : true와 false 판단 위한 변수
		
		// 예시1
		boolean rain = true;
		boolean noRain = false;

		System.out.println(rain);
		System.out.println(noRain);

		//예시2
		int a = 35;
		int b = 30;
		
		boolean aBetweenBCompare1 = (a>b);
		System.out.println(aBetweenBCompare1);
		
		boolean aBetweenBCompare2 = (a<b);
		System.out.println(aBetweenBCompare2);
		
		//2.string
		String iphone = "아이폰17";
		String megaCoffee = "메가커피";
		
		System.out.println(iphone);
		System.out.println(iphone + " & " +megaCoffee);
	}
}
