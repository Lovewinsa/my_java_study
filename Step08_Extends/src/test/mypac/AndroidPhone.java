package test.mypac;

public class AndroidPhone extends HandPhone	{
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출됨");
	}
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	@Override
	public void takePicture() {
		/*
		 * 	자식에서 부모쪽을 가리키는 예약어가 super다.
		 * 	따라서 super.takePicture(); 는 부모객체의 takePicture()를 호출하는 것이다
		 * 	Override한 method에서 부모쪽의 원래 method를 호출할지 말지는 상황에 따라 다르다
		 * 	Override했지만 부모의 method도 호출을 해주어야 method가 정상동작을 하는 경우도 있다
		 * 	이 예제에서는 부모객체의 method를 호출할 필요가 없음
		 */
		// super.takePicture();
		System.out.println("1000만 화소의 사진을 찍어요");
	}
}	
