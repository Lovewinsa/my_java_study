package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {

	public static void main(String[] args) {
		// generic class를 Apple로 지정해서 객체 사용하기
		FruitBox<Apple> box = new FruitBox<Apple>();
		box.pack(new Apple());
		Apple a1 = box.unPack();
		
		// generic class를 Melon으로 지정해서 객체 사용하기
		FruitBox<Melon> box2 = new FruitBox<>();
		box2.pack(new Melon());
		Melon m1 = box2.unPack();
		
		// generic class를 Orange로 지정해서 객체 사용하기
		FruitBox<Orange> box3 = new FruitBox<>();
		box3.pack(new Orange());
		Orange o1 = box3.unPack();
	}

}
