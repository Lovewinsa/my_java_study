package test.main;

import test.mypac.Calc;

public class MainClass05 {

	public static void main(String[] args) {
		// interface가 data type의 역할을 하는 것을 확인
		Calc c1 = null;
		
		// interface type의 참조값 얻어내는 방법
		Calc c2 = new Calc() {
			@Override
			public double execute(double num1, double num2) {
				
				return 0;
			}
		};
		// interface type의 참조값을 함수 모양으로 얻어내기
		// 매개변수의 type은 선언할 필요는 없음, 매개변수의 갯수만 맞으면 됨
		Calc c3 = (a, b) -> {
			return 0;
		};
		
		Calc add = (num1, num2)->{
			return num1+num2;
		};
		
		// 매개변수로 전달한 두 수의 합이 return된다
		double result1 = add.execute(10, 20);
		// 중괄호 안에서 따로 ""실행할 code가 없다면"" 중괄호 생략
		// return 예약어 생략 후 return할 값만 명시하면 된다
		Calc add2 = (num1, num2) -> num1+num2; // 한 줄짜리 함수모양을 '람다식'이라고도 한다
		
		Calc sub = (num1, num2)->num1-num2;
		Calc mul = (num1, num2)->num1*num2;
		Calc div = (num1, num2)->num1/num2;
		
		double result2 = sub.execute(100, 1);
		double result3 = mul.execute(2, 8);
		double result4 = div.execute(10, 2);
		System.out.println("1 : " + result1 + ", 2 : " + result2 + ", 3 : " + result3 + ", 4 : " + result4);
	}

}
