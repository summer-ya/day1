package test;

import java.util.*;

public class ifmoon_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
}
//		int input;
//		
//		System.out.print("숫자를 하나 입력하세요 : ");
//		
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		input = Integer.parseInt(tmp);
//		
//		if(input==0) {
//			System.out.println("입력하신 숫자는 0입니다.");
//			
//		}
//		if (input !=0)
//			System.out.println("입력하신 숫자는 0이 아닙니다");
//			System.out.printf("입력하신 숫자는 %d 입니다." ,input);
//	}
//}