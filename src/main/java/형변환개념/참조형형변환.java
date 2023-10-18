package 형변환개념;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {
	public static void main(String[] args) {
		//참조형 형변환은 상속관계에서만 가능하다.
		//가변길이, 타입 여러개일 때 사용
		//list = {a, b,c};
		//list = {b, c}; //데이터변경이 있을 때 자리를 옮긴다.
		//list = {b, d, c};; //자리를 옮긴다.
		//데이터 변경이 너무 많을 때 사용 불편.
		//==> LinkedList를 권장 
		ArrayList list = new ArrayList();
		list.add("나는 스트링"); //Object(큰) <-- String(작)
		//자동으로 Object타입으로 변환되어 들어감. 자동형변환 
		list.add(100); //Object(큰) <-- Integer(작)
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값>> " + list.get(i));
		}
		//list에 있는 각각 꺼내서 변수에 넣어봅시다.
		String s = (String)list.get(0);//Object
		//cpu가 강제로 String타입으로 변환해서 변수에 넣어줌.
		//강제형변환
		//Casting(캐스팅)
		
		list.add(new JButton("나는 버튼"));
		
		JButton b1 = (JButton)list.get(2);
	}
}
