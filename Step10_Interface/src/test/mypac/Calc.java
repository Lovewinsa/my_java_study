package test.mypac;

@FunctionalInterface //  >>>  추상method를 1개만 만들도록 강제하는 역할
public interface Calc {
	// method로 두 개의 실수를 전달받아서 어떤 연산을 하고 결과값을 return해주는 method
	// 어떤 연산을 할지는 개발자가 알아서 정하기
	public double execute(double num1, double num2);
}
