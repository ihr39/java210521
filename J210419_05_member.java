package ex01_class;

//회원 클래스
class Member {
	//필드 아이디, 비밀번호, 출생연도, 혈액형, 키
	
	private String id;
	private String password;//읽기를 불가
	private int birth;
	private double tall;
	
	//기본 생성자
	//만약에 생성자를 민들면 컴파일러가 기본 생성자를 생성하지 않는다.
	Member(){};//기본 생성자를 이용해서 객체를 생성 
	
	//생성자: 클래스의 이름과 같다
	//반환 형이 없다
	//객체가 생성될 때 실행되는 메소드
	//반드시 객체가 생성 될 떼 생성자가 실행이 되어야한다
	Member(String id, String password, int birth, double tall){
		this.id=id;
		this.password=password;
		this.birth=birth;
		this.tall=tall;
	//생성자의 오버로딩 매개변수의 갯수나 형이 다르면 몇개를 생성해도 상관 없다
	}
	
	//setter 쓰기
	
	void setId(String id) {
		this.id=id;
	}
	
	void setPassword(String password) {
		
		this.password=password;
	}//생성자는 한번입력하면 바꿀 수 없지만 세터는 비밀번호를 바꿀수없다
	
	void setBirth(int birth) {
		this.birth=birth;
	}
	
	void setTall(double tall) {
		this.tall=tall;
	}
	
	//getter 읽기
	
	String getId() {
		return id;
	}
	String getPassword() {//보지를 못하게 하려면 get을 없애면된다
		
		return password.substring(0, 2)+"**";
		
	}
	int getBirth() {
		return birth;
	}
	double getTall() {
		return tall;
	}
}

public class J210419_05_member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member("java","1111",981228,168.8);//객체 생성

		
		System.out.println(m1.getId());
		System.out.println(m1.getPassword());
		System.out.println(m1.getBirth());
		System.out.println(m1.getTall());
		
		
		System.out.println("0123456".substring(0,2));//엔드는 포함하지 않는다
		
	}

}
