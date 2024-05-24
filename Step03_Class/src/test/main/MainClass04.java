package test.main;

import test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[] args) {
		// MyUtil class의 static method 호출
		MyUtil.send();
		// MyUtil class의 static field 참조
		String a = MyUtil.version;
	}
}
