package jdbc03_DBCP.예외처리;

public class 예외처리Main {

	public static void main(String[] args) {
		에러발생2 error = new 에러발생2();
		//에러가 발생할 것 코드가 있는 경우 
		//Call()메서드 만든 사람이 예외처리를 결정할 수 있다. 
		error.call();
	}

}
