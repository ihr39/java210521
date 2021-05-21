package ex01_class;

import java.util.Scanner;


public class J210420_01_bankMultiMain {

	public static void main(String[] args) {
//		Bank b1=new Bank("우리","354896578");
//
		//여러개의 계좌 등록가능
//		System.out.println(b1);
//		b1.insert(a)
		Scanner sc=new Scanner(System.in);
		Bank[] barr = new Bank[3];//주소를 저장
		int no=0;

		while(true) {
			System.out.println("=====================");
			System.out.println("=====고객번호: "+no+"=====");
			System.out.println("========MENU=========");
			System.out.println("0. 고객번호 등록");
			System.out.println("1. 계좌개설");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 잔액 조회");
			System.out.println("9. 종료(9)");
			System.out.println("=====================");
					
			System.out.print("메뉴를 선택하세요.");
			String a=sc.next();

			switch(a) {
			case "0":
				System.out.print("고객번호를 입력하세요");
				no=sc.nextInt();
				break;
			case "1":
				System.out.print("은행명을 입력하세요");
				sc.nextLine();
				String bankname=sc.nextLine();
				System.out.print("계좌번호를 입력하세요");
				String bankno=sc.next();
				barr[no-1]=new Bank(bankname, bankno);
				break;
			
			case "2":
				if(barr[no-1]==null) {
					System.out.print("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.print("입금할 금액을 입력하세요");
				int i=sc.nextInt();
				barr[no-1].insert(i);
				break;
				
			case "3":
				if(barr[no-1]==null) {
					System.out.println("계좌를 먼저 계설하세요");
					continue;
				}
				System.out.print("출금할 금액을 입력하세요");
				int d=sc.nextInt();
				barr[no-1].del(d);
				break;
			
			case "4":
				if(barr[no-1]==null) {
					System.out.println("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.println("현재 잔액은 "+barr[no-1].getBalance()+"원");
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
