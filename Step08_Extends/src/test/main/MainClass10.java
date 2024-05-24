package test.main;

import test.util.MyUtil;

public class MainClass10 {
	public static void main(String[] args) {
		MyUtil.clear();
		MyUtil.send();
		MyUtil.light();
		// 상속받은 BaseUtil class에 정의된 static method도 모두 사용 가능
	}
}
