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
//		System.out.print("���ڸ� �ϳ� �Է��ϼ��� : ");
//		
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		input = Integer.parseInt(tmp);
//		
//		if(input==0) {
//			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
//			
//		}
//		if (input !=0)
//			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
//			System.out.printf("�Է��Ͻ� ���ڴ� %d �Դϴ�." ,input);
//	}
//}