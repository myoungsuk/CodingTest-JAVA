package jdbc02_R.회원정보;

import javax.swing.*;

public class 회원정보UI테스트 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		//shop db에 member테이블에 Insert하고 싶음.
		MemberDAO dao = new MemberDAO();
		dao.insert(id, pw, name, tel);
	}

}
