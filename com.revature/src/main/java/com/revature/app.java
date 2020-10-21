package com.revature; 
import ask.*;
import java.util.Scanner;
public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What should be his/her name?");
		String name = scan.nextLine();
		System.out.println("What should be his/her age?");
		int age = scan.nextInt();
		//System.out.println("Do you want to know about?");
		//String an = scan.nextLine();
		
		
		
		
		Human h = new Human();
		h.setName(name);
		h.setAge(age);
		System.out.println("Do you want to know about "+h.getName()+"? If yes type yes all lowercase");
		String answer = scan.next();
		if(answer.equals("yes")) {
			System.out.println("His/her name is " + h.getName() + " and he/she is "+ h.getAge() + " years old.");
		}
		else {
			System.out.println("Okay");
		}
		
	}

}
