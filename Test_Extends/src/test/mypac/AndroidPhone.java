package test.mypac;

public class AndroidPhone extends HandPhone{
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출됨");
	}
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		super.takePicture();
		System.out.println("1000만 화소의 사진을 찍어요");
	}
}
