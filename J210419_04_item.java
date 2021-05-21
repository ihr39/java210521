package ex01_class;

import java.util.Scanner;

//상품 클래스

class Item{
	
	//필드 아이템 코드 아이템 네임 상품의 가격
	//클래스 내부에서만 접근이 가능한 private
	private String code;//접근 제한자 
	private String name;
	private int price;
	
	//기능 판매금액을 계산: 매개변수가 판매 수량, 리턴값이 판매 금액
	int money(int a) {
		return price*a;
	}
	//메소드를 이용해서 접근을 한다
	//디스는 객체 자신
	//세터
	void setCode(String code) {
		this.code = code;
	}
	void setName(String name) {
		this.name=name;
	}
	void setPrice(int price) {
		this.price=price;
	}
	
	//getter 읽기 전용 함수
	String getCode() {
		return code;
	}
	String getName() {
		return name;
	}
	int getPricce() {
		return price;
	}
}

public class J210419_04_item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1=new Item();
		Scanner sc=new Scanner(System.in);
//		System.out.print("코드는?");
//		i1.code=sc.next();
//		System.out.print("물품 이름은?");
//		i1.name=sc.next();
//		System.out.println("코드: "+i1.code);
//		System.out.println("이름: "+i1.name);
		i1.setCode("8802");//세터
		i1.setName("사이다");
		i1.setPrice(1000);
		System.out.println(i1.getCode()+"판매 금액: "+i1.money(45));
		System.out.println(i1.getName());
		System.out.println(i1.getPricce());
		
		//아이템이라는 클레스는 같지만 객체 이름이 다름
		Item i2=new Item();
		i2.setCode("8801");
		i2.setName("콜라");
		i2.setPrice(1500);
		System.out.println(i2.getCode()+"판매 금액: "+i1.money(10));
	}

}
