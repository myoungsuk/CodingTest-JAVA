package jdbc03_DBCP.메서드연습;

public class 나가게 {

	public static void main(String[] args) {
		int coffeePrice = 5000;
		int coffeeCount = 15;
		
		//커피계산가격이 5만원이상이면 
		//5000원을 할인해주려고 한다.
		
		계산기 cal = new 계산기();
		int result = cal.mul(coffeePrice, coffeeCount);
		if (result >= 50000) {
			System.out.println("최종 계산금액은 " + (result - 5000));
		} else {
			System.out.println("최종 계산금액은 " + result);
		}
		
		int[] result2 = cal.array(); //int[]
		System.out.println(result2[0] + 100);
		
		MemberVO result3 = cal.get2("win2", "1234", "win2", "010");
		result3.setPw("1111");
		System.out.println(result3);
		
		String result4 = cal.get4("홍길동", 100);
		System.out.println(result4 + "입니다. 환영해주세요.");
	}

}
