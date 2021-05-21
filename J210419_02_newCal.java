package ex01_class;

//결과값이 저장되는 계산기
class NewCal{//같은 패키지에는 똑같은 클래스의 이름을 선언 못 함
	//필드 
	String maker="새로운 계산기";
	double result;//결과값을 저장할 필드
	
	//메소드 결과값에 더하는 기능
	void add(double a) {
		result+=a;
	}
	
	double add(double a, double b) {//매개변수의 개수가 다르다면 중복을 선언해도 된다; 오버로딩
		return a+b;
	}
	
	void add(int a) {
		result+=a;
	}
	//오버로딩; 매개변수의 갯순 형이 다른 경우 메소드의 이름은 중복선언 가능 
	void sub(double a) {
		result-=a;
	}
	void mul(double a) {
		result*=a;
	}
	void qes(double a) {
		result=result/a;
	}
	
}

public class J210419_02_newCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCal nc1=new NewCal();
//		System.out.println(nc1.result);
//		nc1.add(10);
//		System.out.println(nc1.result);
//		nc1.sub(2);
//		System.out.println(nc1.result);
//		nc1.mul(10);
//		System.out.println(nc1.result);
//		nc1.qes(7);
//		System.out.println(nc1.result);
		System.out.println(nc1.add(20,10));
		nc1.add(100);
		System.out.println(nc1.result);
		
		
	}

}
