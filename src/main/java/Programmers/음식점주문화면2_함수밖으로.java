//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Programmers;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식점주문화면2_함수밖으로 {
    static int total = 0;
    static JLabel l1;
    static JLabel l2;
    static JLabel l3;

    public 음식점주문화면2_함수밖으로() {
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(700, 600);
        FlowLayout flow = new FlowLayout();
        f.setLayout(flow);
        JButton b1 = new JButton();
        b1.setText("짬뽕");
        JButton b2 = new JButton();
        b2.setText("우동");
        JButton b3 = new JButton();
        b3.setText("짜장");
        l1 = new JLabel();
        l1.setText("개수 : 0개");
        l2 = new JLabel();
        ImageIcon icon = new ImageIcon("main.png");
        l2.setIcon(icon);
        l3 = new JLabel();
        l3.setText("결제금액");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        Font font = new Font("맑은 굴림", 1, 50);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        b1.setBackground(Color.yellow);
        b2.setBackground(Color.yellow);
        b3.setBackground(Color.yellow);
        l1.setForeground(Color.blue);
        l2.setForeground(Color.blue);
        l3.setForeground(Color.blue);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("짬뽕선택함.");
                음식점주문화면2_함수밖으로.show();
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("우동선택함.");
                음식점주문화면2_함수밖으로.show();
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("짜장선택함.");
                음식점주문화면2_함수밖으로.show();
            }
        });
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }

    public static void show() {
        ++total;
        l1.setText("개수 : " + total + "개");
        l3.setText("결제금액 : " + total * 5000 + "원");
    }
}
