package ex01_class;

import java.util.Arrays;

//학생
class Student{
	//필드 반, 이름, 점수 자바 c 파이썬 
	
	int []score=new int[3];
	String group;
	String name;
	int sum;
	
	//메소드
	//점수의 합계를 계산 메소드 평균을 계산해서 반환

	//call by reference
	void add(int[] score) {//얕은 카피
		//필드랑 지역변수의 이름이 같으면 지역변수가 우선이다
		//this.score=score;//필드의 score가 필드의 것을 가리키는게 아니라 지역변수를 가리킨다.
		for(int i=0;i<score.length;i++) {
			sum=0;//점수가 바뀔 때 마다 초기화가 된다
			sum=sum+score[i];//필드의  sum에 저장을 한
		}
	}
	
	//메소드의 오버로딩
	//call by value
	void add(int a, int b, int c) {
		sum=0;
		score[0]=a;score[1]=b;score[2]=c;
		sum=a+b+c;
	}
	
	//평균 구하기
	double avg(int sum) {
		double avg=(double)sum/score.length;
		return (double) Math.round(avg*100)/100;
		//92.66~~이 9266이되고 9267이 되고 100으로 나눠줘주고 실수를 만들기 위해 더블형으로 처리
	}
}

public class J210419_03_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.add(79,88,89);//배열을 입력 받을 때는 이렇게 입력한다
		System.out.println(Arrays.toString(s1.score));
		System.out.println(s1.sum);
		System.out.println(s1.avg(s1.sum));
		
		
		
		
	}

}
