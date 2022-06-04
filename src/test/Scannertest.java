package test;

import java.util.Scanner;

public class Scannertest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 : ");
//		
//		int num = sc.nextInt();
//		
//		System.out.println("입력받은 숫자 : " + num);
//		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("문자를 입력하세요 : ");
//		
//		String str = in.nextLine();
//		
//		System.out.println("입력받은 문자 : " + str);
		
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		
		System.out.println("문자를 입력하세요 : ");
		
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		
		System.out.println("----출력----");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
				
	}

}
