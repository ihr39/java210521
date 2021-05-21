package ex01_class;
//객체를 만들기 위한 틀
//클래스
class Dog{//public 클래스의 이름과 파일의 이름은 같아야한다
	//다른  class는 만들어도되는데 퍼블릭 클래스는 하나여야 한다
	//속성 표현
	//자동 초기화가 일어난다
	String type="강아지";
	String name="멍멍이";
	int legs=4;
	int cnt;//걸음수 저장 초기화 엑스
	
	//기능 표현
	void walking() {
		//메소드 안에 만들면 변수 밖에 만들면 필드
		cnt++;
		System.out.println(name+ " 걷는다");
	}//클래스는 파일당 하나인게 좋다 그냥 관리를 위해서
	void eat() {
		String food="사료";//메소드 안에 있으면 변수
		//지역변수 클레스 안에 있음
		System.out.println(food + " 먹는다");
	}
}
public class J210416_03_class {
	public static void main(String[] args) {
		//클래스
		Dog d1 = new Dog();
		System.out.println(d1.legs);
		System.out.println(d1.type);
		d1.walking();
		System.out.println(d1.cnt);
		d1.eat();
	}
}
