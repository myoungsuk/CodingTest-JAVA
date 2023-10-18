package 형변환개념;

import java.util.ArrayList;

import javax.swing.JFrame;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		
		me.add(1000); //Object <-업캐스팅(자동형변환)- Integer <-오토박싱- int
		me.add(189.1);
		me.add(false);
		me.add('남');

		System.out.println(me);
		
		int money = (Integer)me.get(0);
		//int <-- Integer <-- Object
		System.out.println(money + 2000);
		
		double h = (Double)me.get(1);
		//double <-- Double <-- Object 
		System.out.println(h+ 10);
		
		boolean m = (Boolean)me.get(2);
		//boolean <-- Boolean <-- Object
		if (m) { //true
			System.out.println("배불러요.");
		}else {
			System.out.println("배고파요.");
		}
		
		char gender = (Character)me.get(3);
		//char <-오토언박- Character <-다운캐스팅(강제형변환)- Object
		if (gender == '남') {
			System.out.println("1, 3");
		} else {
			System.out.println("2, 4");

		}
	//ArrayList에는 다양한 타입을 넣을 수 있기는 하다.
		//실제로 코드할 때 다양한 타입을 넣는 경우가 정말 흔치 않다.  
		//매번 넣을 때마다 형변환을 해야할까???
		ArrayList<String> list = new ArrayList<>();
		//ArrayList<Integer> list 
		//<클래스>만 쓸 수 있음. <기본형>사용 불가.
		//<>를 쓰면 객체를 생성할 때 타입을 결정할 수 있음.
		//형변환을 할 필요가 없음. 
		//제너릭(제너럴, 일반적인) 프로그래밍 
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		String s = list.get(0);
		
		JFrame f = new JFrame();
		//f.add(f)
		
	}

}
