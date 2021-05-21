package ex01_class;
//핸드폰 클래스

//필드 이름 용량 화소
//생성자
//게터 세터  tostring

class Phone{
	//필드
	
	private String name;
	private String size;
	private String pixel;
	
	//생성자
	
	Phone(String name, String size, String pixel){
		this(name, size);//나 자신의 생성자 호출, 반드시 첫줄에 실행
		this.pixel=pixel;
		System.out.println(this);
	}
	
	public Phone() {
		super();
	}

	public Phone(String name, String size) {
		super();
		this.name = name;
		this.size = size;
	}

	//세터
	void setName(String name) {
		this.name=name;
	}
	void setPixel(String pixel) {
		this.pixel=pixel;
	}
	void setSize(String size) {
		this.size=size;
	}
	//게터
	
	String getName() {
		return name;
	}
	String getPixel() {
		return pixel;
	}
	String getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", size=" + size + ", pixel=" + pixel + "]";
	}
	
}

public class J210420_02_Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1=new Phone("갤럭시","512","1200");
		System.out.println(p1);
		p1.setSize("256");

	}

}
