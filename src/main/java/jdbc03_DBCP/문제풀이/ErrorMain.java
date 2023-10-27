package jdbc03_DBCP.문제풀이;

public class ErrorMain {
	public static void main(String[] s) {
		java.lang.Error e = new java.lang.Error();
//		e.wait(); //실행에러
		System.out.println("여기는 실행되어야만 해");
	}
}