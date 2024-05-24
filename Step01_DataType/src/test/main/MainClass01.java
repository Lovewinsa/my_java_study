package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */

// class의 이름이 MainClass01 (파일명과 동일하게 만들어진다.)
public class MainClass01 { // 클래스의 범위를 나타내는 괄호(시작)

	// app을 실행할 때(run버튼을 눌렀을 때) 시작되는 main메소드
	// javascript에서 function main(args){} 같은 모양
	public static void main(String[] args) { // 메소드의 범위를 나타내는 괄호(시작)
		// 정수형 변수 선언하고 값 대입하기
		byte iByte=10;
		short iShort=500;
		int iInt=1000;
		long iLong=10000;
		/*
		 int type변수에 short type변수에 담긴 내용을 대입한다면?
		 - 표현 가능한 범위가 좁은 변수에 담긴 값을
		   표현 가능한 범위가 더 넓은 변수에 대입하는것은 문제가 없다.
		 - 따라서 에러를 발생시키지 않는다.
		 */
		int iInt2=iShort;
		/*
		 표현 가능한 범위가 더 넓은 변수에 담긴 내용을 대입 하려면
		 명시적으로 casting을 해야한다.
		 */
		byte tmp = (byte)iShort;
		
		//실수형 변수 선언하고 값 대입하기
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3; // d, f를 붙이지 않으면 double type으로 간주된다.
		
		// float type에 있는 값을 double type에 담기
		double tmp2=num1;
		
		// casting연산자가 필요하다.
		float tmp3=(float)num2;
		System.out.println(tmp);
		
	} // main메소드의 끝


}//MainClass01클래스의 끝
