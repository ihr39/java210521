package ex01_class;

//자동차 클래스
//속성: 이름 컬러 파워(시동여부) 속도 
//기능: 시동이  꺼져있으면 키고 아니면 끄고 실행을 하면 속도를 올리고 다운을 하면 속도를 줄임

class Car{
	//feild
	String name="벤츠";
	String color="black";
	boolean power;//초기화 값이 기본 false이다
	int speed;
	//method
	void powerToggle(){
		power= !power;
		}

	void speedUp() {//100이상이 넘어가면 안된다
		
		if(speed < 100) speed++;
	}
	void speedDown() {//50미만이 될 수 없다
		
		if(speed > 50) speed--;
	}
}

public class J210416_04_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
//		System.out.println("파워 "+c1.power);
//		System.out.println("속도 "+c1.speed);
//		c1.powerToggle();//얘를 실행하면 파워가 바뀐다
//		System.out.println("파워 "+c1.power);
//		c1.powerToggle();
//		System.out.println("파워 "+c1.power);
//		c1.speedUp();
//		System.out.println(c1.speed);
//		c1.speedUp();
//		System.out.println(c1.speed);
		
		for(int i=0;i<200;i++) {
			c1.speedUp();
		}System.out.println(c1.speed);
		
		for(int i=0;i<100;i++) {
			c1.speedDown();
		}System.out.println(c1.speed);

	}

}
