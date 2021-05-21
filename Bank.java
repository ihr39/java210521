package ex01_class;


public class Bank{
	//필드 은행명, 계좌번호,계좌 잔액
	private String bankname;
	private String bankno;
	private int balance;
	
	 public Bank(String bankname, String bankno) {
		this.bankname = bankname;
		this.bankno = bankno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	void setBalance(int balance) {
		this.balance=balance;
	}
	public String getBankno() {
		return bankno;
	}
	public int getBalance() {
		return balance;
	}
	//오버라이딩 부모클래스(클래스는 오브젝트를 상속받게 되어있음)의 메소드를 재정의
	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
	}
	
	//입금 출금 메소드
	
	int insert(int a) {
		return balance+=a;
	}
	
	void del (int a) {
		if(balance-a<0) {
			System.out.println("잔액 부족 출금 가능액은 "+balance+"원 입니다.");
		}else {
		balance-=a;
		System.out.println("출금 완료 현재 잔액은 "+balance+"원");}
	}
}

