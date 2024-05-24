package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 	MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담아보세요.
		 * 
		 * 	주의!!
		 * 	- MacBook class를 절대 수정하지 마세요
		 * 	- MainClass03은 test.main package에 있고
		 * 	  Cpu, Memory, HardDisk, MacBook class는 test.mypac package에 있기 때문에
		 * 	  4개의 class 모두 import되어야 한다.
		 * 	- 매개변수에 null전달 금지
		 */
		MacBook mac1 = new MacBook(new Cpu(), new Memory(), new HardDisk());
		
		Cpu cp1 = new Cpu();
		Memory Mm1 = new Memory();
		HardDisk Hd1 = new HardDisk();
		
		MacBook mac2 = new MacBook(cp1, Mm1, Hd1);
	}
}
