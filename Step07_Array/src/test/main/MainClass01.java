package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		// double type 5개를 저장하고 있는 배열 객체를 생성해서 참조값을 nums2라는 지역변수에 담기
		double[] nums2 = {10.1, 20.2, 30.3, 40.4, 50.5};
		// boolean type 5개를 저장하고 있는 배열
		boolean[] truth = {true, true, false, true, false};
		// String type (참조데이터 type) 5개를 저장하고 있는 배열
		String a = "김구라";
		String b = "아무개";
		String[] names = {a, "원숭이", "다리미", b, "까막이"};
		
		// 배열 객체의 복제본 얻어내기
		int[] result = nums.clone();
		int[] result2 = nums; // 참조값 복사
		
		//배열의 크기 얻어내기
		int size = nums.length;
		// 배열은 순서가 있는 data다. 특정 index의 item참조하는 방법
		int first = nums[0];
		int second = nums[1];
		int third = nums[2];
	}
}
