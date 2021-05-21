package ex01_class;

public class J210421_03_Calculator {//클래스 이름
	//속성
	private static final String maker="국제 계산기";
	static int result;
	private boolean light;
	private String color;//객체 안에 존재 즉 주소가 있다 this가 그 주소를 받음
	
	J210421_03_Calculator(){}
	J210421_03_Calculator(String color){
		this.color=color;
	}
	//static메소드 안에서는 static필드만 사용가능
	//두 수를 매개변수로 받아서 합을 리턴하는 메소드
	static String getMaker() {
		return "[" + maker + "]";
	}
	
	static int add(int a, int b) {
		result+=a+b;
		return result;
	}
	int del(int a,int b) {
		return a-b;
	}
	void siw() {
		light=!light;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J210421_03_Calculator c=new J210421_03_Calculator();
//		int a=10,b=3;
		System.out.println(c.getMaker());
//		System.out.println(c.add(a,b));
//		System.out.println(J210421_03_Calculator.add(10, 7));
		System.out.println(J210421_03_Calculator.add(4, 8));
		System.out.println(J210421_03_Calculator.add(5, 5));
		
		System.out.println(c.light);
		c.siw();
		System.out.println(c.light);
		
		J210421_03_Calculator c1=new J210421_03_Calculator("블랙");
		System.out.println(c1.color);
		
	}

}
