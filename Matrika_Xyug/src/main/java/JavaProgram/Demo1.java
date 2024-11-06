package JavaProgram;

import java.util.Scanner;

public class Demo1 {

	public static int PrintMyname(String name) {

		System.out.println("Your name is:" + name);

		return 1;

	}

	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int button=sc.nextInt();
//	if(button==1) {
//		System.out.println("hello");
//	}else if(button==2) {
//		System.out.println("Namaste");
//	}else if(button ==3) {
//		System.out.println("Bonjour");
//	}else {
//		System.out.println("Invalid button");
//	}

		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();

		PrintMyname(name);

		// PrintMyname("Shiv");

	}
}
