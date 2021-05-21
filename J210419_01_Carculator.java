package ex01_class;

//계산기 클레스
class Cal{
	//속성; 필드
	String maker="국제계산기";
	
	//기능
	int a(int a,int b) {//더하기기능
		int r=a+b;
		return r;
	}
	int b(int a,int b) {
		return a-b;
	}
	int c(int a,int b) {
		return a*b;
	}
	double d(int a,int b) {
		return (double)a/b;
	}
}

public class J210419_01_Carculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal cl=new Cal();
		int a=20, b=3;
		int r=cl.a(a, b);
		System.out.println("합계: "+r);
		int d=cl.b(a, b);
		System.out.println(d);
		System.out.println(cl.d(a,b));
		
	}

}
