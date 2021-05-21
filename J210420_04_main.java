package ex01_class;

public class J210420_04_main {

	public static void main(String[] args) {//배열임
		System.out.println(args.length);
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
//		String id=args[0];
//		String pw=args[1];
//		if(id.equals("java") && pw.equals("1111")) {
//			System.out.println("관리자 모드");
//		}else {
//			System.out.println("일반 사용자모드");
//		}
		
		if(args.length>1 && args[0].equals("java") && args[1].equals("1111")) {
			System.out.println("관리자 모드");
		}else {
			System.out.println("일반 사용자 모드");
		}
	}

}
