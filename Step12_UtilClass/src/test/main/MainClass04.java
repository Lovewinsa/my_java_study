package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type을 저장할 수 있는 ArrayList 객체를 생성해서
		//		참조값을 List 인터페이스 type 지역변수 cars에 담아보기
		List<Car> cars = new ArrayList<Car>();
		// 2. Car 객체 3개를 생성해서 List 객체에 저장해 보세요.
		cars.add(new Car("현대"));
		cars.add(new Car("기아"));
		cars.add(new Car("쉐보레"));
		// 3. 일반 for문을 이용해서 List객체에 저장된 모든 Car객체의 drive() method를
		//		순서대로 호출해 보세요
		for(int i=0; i<cars.size(); i++) {
			Car tmp = cars.get(i);
			tmp.drive();
		}
		// 4. 확장 for문을 이용해서 List객체에 저장된 모든 Car객체의 drive() method를
		//		순서대로 호출해 보세요
		for(Car tmp:cars) {
			tmp.drive();
		}
		// 5. Consumer 인터페이스를 활용해서 List객체에 저장된 모든 Car객체의 drive() method를
		//		순서대로 호출해 보세요
		Consumer<Car> con = new Consumer<Car>() {
			@Override
			public void accept(Car t) {
				t.drive();
			}
		};
		cars.forEach(con);
		
		System.out.println("------------");
		
		Consumer<Car> con2 = (tmp)->{
			tmp.drive();
		};
		cars.forEach(con2);
		System.out.println("------------");
		
		cars.forEach((tmp)->{
			tmp.drive();
		});
	}
}
