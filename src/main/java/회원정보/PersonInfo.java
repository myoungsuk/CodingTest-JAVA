package 회원정보;

import javax.swing.*;
import java.awt.*;

public class PersonInfo {
    public static void main(String[] args) {
        //필요한 부품들을 RAM에 가져다놓아야한다.

        //JFrame
        JFrame f = new JFrame();
        f.setSize(400, 600);
        f.setTitle("나의 회원정보UI");
        f.getContentPane().setBackground(Color.GREEN);

        //FlowLayout
        FlowLayout flow = new FlowLayout();//램
        f.setLayout(flow); //조립
        //Font
        //JLabel 5, JTextField 4, JButton 2
        JLabel l1 = new JLabel("이미지 들어갈 곳");
        JLabel l2 = new JLabel("회원ID : ");
        JLabel l3 = new JLabel("회원PW : ");
        JLabel l4 = new JLabel("회원이름: ");
        JLabel l5 = new JLabel("회원TEL: ");

        JTextField t1 = new JTextField(10); //10은 글자수
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);
        JTextField t4 = new JTextField(10);

        JButton b1 = new JButton("회원가입 요청");
        JButton b2 = new JButton("회원탈퇴 요청");
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.BLUE);
        b1.setOpaque(true);
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.BLUE);
        b2.setOpaque(true);

        t1.setBackground(Color.pink);
        t1.setForeground(Color.red);
        t2.setBackground(Color.pink);
        t2.setForeground(Color.red);
        t3.setBackground(Color.pink);
        t3.setForeground(Color.red);
        t4.setBackground(Color.pink);
        t4.setForeground(Color.red);

        Font font = new Font("맑은 고딕", Font.BOLD, 30);

        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        l5.setFont(font);

        t1.setFont(font);
        t2.setFont(font);
        t3.setFont(font);
        t4.setFont(font);

        b1.setFont(font);
        b2.setFont(font);

        f.add(l1); //이미지
        f.add(l2); //회원ID :
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(l4);
        f.add(t3);
        f.add(l5);
        f.add(t4);
        f.add(b1);
        f.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); //맨끝에!!

    }
}
