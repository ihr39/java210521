package ex01_class;

class Circle{
	//필드
	private double r;
	private double r2;
	
	//생성자
//	Circle(){};
	Circle(double r){
		this.r=r;
		c(r);//생성자에서 메소드 실행
	}
	Circle (double r, double a){
		this.r=r;
		c(r,a);
	}
	
	//세터 게터
	
	void setR(double r) {
		this.r=r;
	}
	
	double getR() {
		return r2;
	}
	
	//메소드
	double c(double r){
		r2= (double)Math.round((r*r*Math.PI)*100)/100;
		return r2;
	}
	double c(double r,double a) {
		r2=r*r*a;
		return r2;
	}
	
	double c(int r, double pi) {
		return r*r*pi;
	}
	int c(int r) {
		r2=r*r*Math.PI;
		return 2;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", r2=" + r2 + "]";
	}

	
}


public class J210420_05_practice {

	public static void main(String[] args) {
		Circle c1=new Circle(4.1);
		System.out.println(c1);
//		System.out.println(c1.c(4));
//		System.out.println(c1.c(7));
//		System.out.println((double)Math.round(c1.c(7.2)*100)/100);
//		
	}

}
