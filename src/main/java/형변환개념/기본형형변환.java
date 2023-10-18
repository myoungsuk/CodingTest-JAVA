package 형변환개념;

public class 기본형형변환 {

	public static void main(String[] args) {
		//정수형 1, 2, 4, 8
		//     byte, short, int, long
		byte x = 127; //0110
		int y = x; //00000000000000110
		//형변환(int(큰) <-- byte(작))
		//자동으로 타입이 변경되어 들어감.
		//자동형변환
		byte z = (byte)y; //0110
		//형변환(byte(작) <-- int(큰))
		//강제로 cpu가 가지고 와서 잘라서 램에 집어 넣는다.
		//강제형변환
		//형변환: 원래있던 데이터타입과 다른 데이터타입의 저장공간으로 
		//들어갈때 타입이 변환되어 들어간다.
		int a = 1000;
		byte b = (byte)a; //-128~127
		System.out.println(b);
		//강제형변환을 할 때는 작은 공간에 들어갈 수 있는 값만 가능하다. 
	}

}
