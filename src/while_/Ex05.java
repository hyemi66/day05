package while_;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3조 문제01
//		int a,b;
//		boolean bool = true;
//		while (bool) {
//			System.out.print("행 입력(1~10) : ");
//			a = sc.nextInt();
//			System.out.print("열 입력(1~50) : ");
//			b = sc.nextInt();
//			if (a == 0 || b == 0) {
//				System.out.println("잘못된 입력입니다.");
//				continue;
//			}
//			for (int i=1; i<=a; i++) {
//				System.out.println();
//				for (int j=1; j<=b; j++) {
//					System.out.print(i*j + " ");
//				}
//			}
//			System.out.println();
//			bool = false;
//		}
		
		// 3조 문제02
//		int money;
//		int a;
//		while (true) {
//			System.out.println("---MENU---");
//			System.out.println("1. 아메리카노");
//			System.out.println("2. 라떼");
//			System.out.println("----------");
//			System.out.print("메뉴선택 >> ");
//			a = sc.nextInt();
//			if (a == 1) {
//				System.out.println("아메리카노(1000원)를 선택하셨습니다");
//				System.out.println("얼마 지불하실건가요? ");
//				System.out.print(">>> ");
//				money = sc.nextInt();
//				if (money < 1000) {
//					System.out.println("금액이 낮습니다 다시 지불해주세요");
//					continue;
//				} else {
//					System.out.println(money+"원 받았습니다.");
//					System.out.println("거스름돈 : "+(money-1000));
//				} break;
//			} else if (a == 2) {
//				System.out.println("라떼(1500원)를 선택하셨습니다");
//				System.out.println("얼마 지불하실건가요? ");
//				System.out.print(">>> ");
//				money = sc.nextInt();
//				if (money < 1500) {
//					System.out.println("금액이 낮습니다 다시 지불해주세요");
//					continue;
//				} else {
//					System.out.println(money+"원 받았습니다.");
//					System.out.println("거스름돈 : "+(money-1500));
//				} break;
//			} 
//		}
		
		// 3조 문제03
		int num;
		int a,b,sum=0;
		
		while (true) {
			System.out.println("----------");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.println("----------");
			System.out.print(">>> ");
			num = sc.nextInt();
			if (num==1) {
				System.out.println("---입금---");
				System.out.print(">>> ");
				a = sc.nextInt();
				sum += a;
			} else if (num == 2) {
				System.out.println("---출금---");
				System.out.print(">>> ");
				b = sc.nextInt();
				
			}
		}
	}
}
