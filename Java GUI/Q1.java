import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Q1 extends JFrame implements ActionListener{
    Container c;
    JButton btn1, btn2, btn3, btn4;
    JLabel label;
    JTextField input;
    Q1(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        label = new JLabel("");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        c.add(label);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btn1){
            label.setText("Button 1 Pressed");
        }else if(ae.getSource() == btn2){
            label.setText("Button 2 Pressed");
        }else if(ae.getSource() == btn2){
            label.setText("Button 3 Pressed");
        }else{
            label.setText("Button 4 Pressed");
        }
    }

    public static void main(String []args){
        Q1 frm = new Q1();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(300, 400, 250, 200);
        frm.setVisible(true);
        frm.setTitle("Q1");
    }
}