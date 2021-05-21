package ex01_class;

import java.util.Arrays;

class Sum{
	//두수를 매개변수로 받아서 합을 리턴하는 메소드
	
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	int add(int[]a) {
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			sum+=a[i];
		}
		a[a.length-1]=sum;//마지막 인덱스에 합 넣기
		return sum;
	}
	
	int add1(int...num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}
	
	void arr(String...a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(String b:a) {
			System.out.println(b);
		}
	}
}

public class J210420_03_overloding {

	public static void main(String[] args) {
		// 오버로딩
//		Sum s1=new Sum();
//		int a=10, b=5, c=20;//참조 변수 = 인스턴스 변수
//		System.out.println(s1.add(a, b));
//		System.out.println(s1.add(a, b, c));
		
		int arr[]= {10,20,30,40,0};
		Sum s2=new Sum();
		System.out.println(s2.add(arr));
//		System.out.println(s2.add1(10,20));
		System.out.println(Arrays.toString(arr));
		
//		s2.arr("하늘","꽃","바다");
		
//		int sum=0;
////		for(int i=1;i<101;i=i+2) {
////			sum=sum+i;
////			System.out.println(sum);
////		}
//		for(int i=0;i<101;i=i+2) {
//			sum=sum+i;
//			System.out.println(sum);
//		}
		
			
	}

}
