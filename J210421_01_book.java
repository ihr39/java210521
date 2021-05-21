package ex01_class;

import java.util.Arrays;

//책클래스

class Book{
	///필드 책코드 책명 단가 할인율
	private String code;
	private String name;
	private int price;
	private double sale;
	
	//생성자 
	Book(){};
	Book(String code, String name,int price, double sale){
		this.code=code;
		this.name=name;
		this.price=price;
		this.sale=sale;
	}
	//세터
	void setCode(String code) {
		this.code=code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	
	//게터
	String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public double getSale() {
		return sale;
	}
	//to string
	@Override
	public String toString() {
		return "Book [code=" + code + ", name=" + name + ", price=" + price + ", sale=" + sale + "]";
	}
	
	//메소드
}

//다른 클래스를 만드려면 클래스 다 끝난 밖에 만들어야한다.
class Manager{//처리하는것만 따로 만들기
	//메소드
	private int [] sum=new int[10];
	int[] getSum() {
		return sum;
	}
	//판매금액 계산
//		System.out.println(book);
//		System.out.println(amount);
	int total(Book book, int amount, int index) {
			int bookprice=book.getPrice();
			double booksale=book.getSale();
			int total=0;
			if(booksale>1|| booksale<0) {
				System.out.println("잘못된 할인율");
			}else {
				total=(int)(amount*(bookprice-(bookprice*booksale)));
			}
		String bookcode=book.getCode();
		sum[index]+=total;//합계 저장 인덱스
		return total;
	}

		//판매금액 합계 저장
		//책별로의 가격의 총합 여러권이므로 배열을 사용
}

public class J210421_01_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] barr=new Book[10];//Book클래스의 배열
		barr[0]=new Book();
		
		barr[0].setCode("b001");
		barr[0].setName("자바 프로그래밍");
		barr[0].setPrice(30000);
		barr[0].setSale(0.2);
//		System.out.println(b1);
//		System.out.println("판매 금액: "+b1.c(3));
//		System.out.println("판매 금액: "+b1.c(5));
		barr[1]=new Book("b002","파이썬",18000,0.15);
		
		Manager mg=new Manager();
//		System.out.printf(%-10s 왼쪽 정렬 %10s오른쪽으로 10칸 띄기);
		System.out.println(barr[0].getName()+" 판매 금액: "+mg.total(barr[0], 3,0));
		System.out.println(barr[0].getName()+" 판매 금액: "+mg.total(barr[0], 5,0));
		System.out.println(barr[1].getName()+" 판매 금액: "+mg.total(barr[1], 3,1));
		System.out.println(barr[1].getName()+" 판매 금액: "+mg.total(barr[1], 5,1));
		
		System.out.println(Arrays.toString(mg.getSum()));
		
	}

}
