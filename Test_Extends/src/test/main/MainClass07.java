package test.main;

import java.util.Scanner;

import test.mypac.Phone;

public class MainClass07 {
	public static void main(String[] args) {
		Object a=10;
		Object b=true;
		Object c='a';
		Object d="abcd";
		Object e=new Phone();
		Object f=new Scanner(System.in);
		
		Object[] ob = new Object[5];
		ob[0]=10;
		ob[1]=true;
		ob[2]="kim";
		ob[3]=new Phone();
		ob[4]=new Scanner(System.in);
		
		
		Phone p1 = (Phone)e;
		p1.call();
		Phone p2 = (Phone)ob[3];
		p2.call();
	}
}
