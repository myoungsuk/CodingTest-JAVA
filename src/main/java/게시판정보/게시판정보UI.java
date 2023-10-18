package 게시판정보;

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

public class 게시판정보UI {

    public static void main(String[] args) {
        // 필요한 부품들을 RAM에 가져다놓아야한다.

        // JFrame
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.setTitle("나의 게시판정보UI");
        f.getContentPane().setBackground(Color.GRAY);

        // FlowLayout
        FlowLayout flow = new FlowLayout();// 램
        f.setLayout(flow); // 조립
        // Font
        // JLabel 5, JTextField 4, JButton 2
        JLabel l1 = new JLabel("<<<<<< 게시판 >>>>>>");
        JLabel l2 = new JLabel("게시판 제목 : ");
        JLabel l3 = new JLabel("게시판 내용 : ");
        JLabel l4 = new JLabel("게시판 작성자: ");

        JTextField t1 = new JTextField(10); // 10은 글자수
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);

        JButton b1 = new JButton("게시판 글쓰기 요청");
        JButton b2 = new JButton("게시판 글삭제 요청");
        JButton b3 = new JButton("게시판 글수정 요청");
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.BLUE);
        b1.setOpaque(true);
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.BLUE);
        b2.setOpaque(true);
        b3.setBackground(Color.yellow);
        b3.setForeground(Color.BLUE);
        b3.setOpaque(true);

        t1.setBackground(Color.pink);
        t1.setForeground(Color.red);
        t2.setBackground(Color.pink);
        t2.setForeground(Color.red);
        t3.setBackground(Color.pink);
        t3.setForeground(Color.red);

        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        Font font2 = new Font("맑은 고딕", Font.BOLD, 50);

        l1.setFont(font2);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);

        t1.setFont(font);
        t2.setFont(font);
        t3.setFont(font);

        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(l4);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //입력한 정보 가지고 올 것
                //bbsDAO를 이용하자.
                //입력한 정보를 주면서 bbsDAO의 insert()요청
                String title = t1.getText();
                String content = t2.getText();
                String writer = t3.getText();

                BbsDAO dao = new BbsDAO();
                dao.insert(title, content, writer);
            }
        });

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String no = JOptionPane.showInputDialog("삭제할 게시판 No입력");
                BbsDAO dao = new BbsDAO();
                dao.delete(Integer.parseInt(no));

            }
        });

        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); // 맨끝에!!

    }

}