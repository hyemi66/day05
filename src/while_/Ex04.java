package while_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String str = null;
		String menu ="";
		while (true) {
			System.out.println("----------");
			System.out.println("카페 메뉴");
			System.out.println("1. 메뉴 추가");
			System.out.println("2. 메뉴판 보기");
			System.out.println("3. 종료");
			System.out.println("----------");
			System.out.print(">>> ");
			a = sc.nextInt();
			if (a == 1) {
				if (menu != "") { menu += "\n"; }
				System.out.println("어떤 메뉴를 추가 하시겠습니까?");
				System.out.print(">>> ");
				str = sc.next();
				menu += str;
				System.out.println("추가되셨습니다");
			} else if (a == 2) {
				if (str == null) {
					System.out.println("메뉴부터 추가해주세요.");
					continue;
				}
				System.out.println(menu);
			} else if (a == 3) {
				System.out.println("사용해 주셔서 감사합니다");
				break;
			} else { System.out.println("다시 입력해주세요"); }
		}
	}
}
