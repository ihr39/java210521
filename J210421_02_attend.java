package ex01_class;

import java.util.Date;

//학생 클래스
class Attendee{
	//객체가 생성이 될 때 객체소멸시 삭제
	private String code;
	private String name;
	private String subject;
	
	Attendee(String code,String name, String subject){
		this.code=code;
		this.name=name;
		this.subject=subject;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Attendee [code=" + code + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
}

class LectureManager{
	//클래스가 메모리에 로딩이 될 때 클래스필드는 사라지지 않음, 프로그램 종료시 소멸
	static final String college="국제 학원";//수정 불가
	//공용으로 사용을하는데 바꾸면 안되기 때문에 상수 철;
	static int year1=2001;
	//static final은 상수
	static final Date day;
	static {//static 블록을 이용해서 초기화
		Date now=new Date();
		day=now;
	}
	//메소드
	static void in (Attendee a){
		System.out.println(day+a.getSubject()+" 반 "+a.getName()+"님이 입실하셨습니다");
	}
	static void out(Attendee a) {
		System.out.println(day+a.getSubject()+" 반 "+a.getName()+"님이 퇴실하셨습니다");
	}
}

public class J210421_02_attend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LectureManager.college);
		
		Attendee att1=new Attendee("A001","홍길동","자바");
		System.out.println(att1);
		

		LectureManager lm1= new LectureManager();
//		System.out.println(lm1.year);
		System.out.println(LectureManager.college);
		
		lm1.in(att1);
		lm1.out(att1);
	}

}
