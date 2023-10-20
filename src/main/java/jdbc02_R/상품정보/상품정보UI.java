package jdbc02_R.상품정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 회원정보.MemberDAO;

public class 상품정보UI {

	public static void main(String[] args) {
		// 필요한 부품들을 RAM에 가져다놓아야한다.

		// JFrame
		JFrame f = new JFrame();
		f.setSize(400, 500);
		f.setTitle("나의 상품정보UI");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		// FlowLayout
		FlowLayout flow = new FlowLayout();// 램
		f.setLayout(flow); // 조립
		// Font
		// JLabel 5, JTextField 4, JButton 2
		JLabel l1 = new JLabel("<<<<<< 상품정보 >>>>>>");
		JLabel l0 = new JLabel("상품 번호 : ");
		JLabel l2 = new JLabel("상품 제목 : ");
		JLabel l3 = new JLabel("상품 내용 : ");
		JLabel l4 = new JLabel("상품 가격 : ");
		JLabel l5 = new JLabel("상품 회사 : ");
		JLabel l6 = new JLabel("상품 이미지 : ");

		JTextField t0 = new JTextField(10); 
		JTextField t1 = new JTextField(10); // 10은 글자수
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);

		JButton b1 = new JButton("상품 추가 요청");
		JButton b2 = new JButton("상품 삭제 요청");
		JButton b3 = new JButton("상품 수정 요청");
		JButton b4 = new JButton("상품 검색 요청");
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.BLUE);
		b1.setOpaque(true);
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.BLUE);
		b2.setOpaque(true);
		b3.setBackground(Color.yellow);
		b3.setForeground(Color.BLUE);
		b3.setOpaque(true);
		b4.setBackground(Color.yellow);
		b4.setForeground(Color.BLUE);
		b4.setOpaque(true);

		t0.setBackground(Color.pink);
		t0.setForeground(Color.red);
		t1.setBackground(Color.pink);
		t1.setForeground(Color.red);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.red);
		t3.setBackground(Color.pink);
		t3.setForeground(Color.red);
		t4.setBackground(Color.pink);
		t4.setForeground(Color.red);
		t5.setBackground(Color.pink);
		t5.setForeground(Color.red);

		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 40);

		l1.setFont(font2);
		l0.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);

		t0.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		t5.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		f.add(l1); 
		f.add(l0); 
		f.add(t0);
		f.add(l2); 
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(l6);
		f.add(t5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//입력한 정보 가지고 올 것 
				String id = t0.getText();
				String name = t1.getText();
				String content = t2.getText();
				String price = t3.getText();
				String company = t4.getText();
				String img = t5.getText();
				//ProductDAO를 이용하자.
				ProductDAO dao = new ProductDAO();
				//가방필요--> 데이터를 넣고 --> 가방을 전달 
				ProductVO bag = new ProductVO();
				bag.setId(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(Integer.parseInt(price));
				bag.setCompany(company);
				bag.setImg(img);
				
				//입력한 정보를 주면서 ProductDAO의 insert()요청 
				dao.insert(bag);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//검색할 no입력
				
			}
		});
		
		/////
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true); // 맨끝에!!

	}

}
