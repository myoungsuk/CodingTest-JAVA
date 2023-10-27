package jdbc03_DBCP.문제풀이;

public class ErrorMain2 {
	public static void main(String[] s) {
		Error2 e = new Error2();
		try {
			e.arr2();
		} catch (Exception e1) {
			System.out.println("main()에서 배열 인덱스 에러를 예외처리함");
		} // 실행에러
		System.out.println("여기는 실행되어야만 해");
	}
}