package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 * 	[ 추상클래스 (Abstract Class) ]
 * 
 * 	- class 예약어 앞에 abstract를 명시해서 class를 정의한다
 * 	- 형태만 정의되고 실제 구현은 되지 않은 method가 존재할 수 있다
 * 	- 형태만 정의된 method를 만들 때는 abstract 예약어를 붙여서 method를 만든다
 *  - 생성자는 존재하지만 단독으로 객체 생성은 불가하다
 *  - Abstract class type의 참조값이 필요하다면
 *    Abstract class를 상속받은 자식class를 정의해서 객체를 생성한다.
 *  - Abstract class를 상속받은 자식class는
 *    부모의 Abstract method를 모두 Override(재정의) 해야한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 추상(abstract) class로 객체를 생성할 수 있을까?
		//	Weapon w1 = new Weapon();	>>>	추상class 단독으로 객체 생성 불가능, 미완성이기 때문에
		
		Weapon w1 = null;	//data type의 역할은 한다
		//	w1.prepare();	// comfile시에는 에러나지 않지만, 실행시 발생하는 에러 runtime error
		
		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
