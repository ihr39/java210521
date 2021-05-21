package ex01_class;

import java.util.Scanner;


public class J210420_01_bankmain {

	public static void main(String[] args) {
//		Bank b1=new Bank("우리","354896578");
//
		//하나의 계좌만 등록가능
//		System.out.println(b1);
//		b1.insert(a)
		Scanner sc=new Scanner(System.in);
		Bank[] barr = new Bank[3];
		
		Bank b1=null;
		while(true) {
			System.out.println("========MENU=========");
			System.out.println("1. 계좌개설");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 잔액 조회");
			System.out.println("9. 종료(9)");
			System.out.println("=====================");
					
			System.out.print("메뉴를 선택하세요.");
			String a=sc.next();

			switch(a) {
			case "1":
				System.out.print("은행명을 입력하세요");
				sc.nextLine();
				String bankname=sc.nextLine();
				System.out.print("계좌번호를 입력하세요");
				String bankno=sc.next();
				b1=new Bank(bankname, bankno);
				break;
			
			case "2":
				if(b1==null) {
					System.out.print("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.print("입금할 금액을 입력하세요");
				int i=sc.nextInt();
				b1.insert(i);
				break;
				
			case "3":
				if(b1==null) {
					System.out.println("계좌를 먼저 계설하세요");
					continue;
				}
				System.out.print("출금할 금액을 입력하세요");
				int d=sc.nextInt();
				b1.del(d);
				break;
			
			case "4":
				if(b1==null) {
					System.out.println("계좌를 먼저 개설하세요");
				}
				System.out.println("현재 잔액은 "+b1.getBalance()+"원");
				break;
				
			case "9":
				System.out.println("프로그램 종료");
				System.exit(0);
				
			default:
				System.out.println("잘 못 된 번호");
			}
		}

		
	}

}
