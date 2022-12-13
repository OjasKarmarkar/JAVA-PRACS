import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q5 extends JFrame implements ActionListener{
    Container c;
    JButton inc, dnc, reset;
    JLabel count, val, padding;
    Q5(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        count = new JLabel("Counter: ");
        val = new JLabel("0");
        padding = new JLabel("   ");
        inc = new JButton("Count Up");
        dnc = new JButton("Count Down");
        reset = new JButton("Reset");
        c.add(count);
        c.add(val);
        c.add(padding);
        c.add(inc);
        c.add(dnc);
        c.add(reset);
        inc.addActionListener(this);
        dnc.addActionListener(this);
        reset.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==inc){
            int num = Integer.parseInt(val.getText());
            num = num+1;
            val.setText(Integer.toString(num));
        }else if(ae.getSource()==dnc){
            int num = Integer.parseInt(val.getText());
            num = num-1;
            val.setText(Integer.toString(num));
        }else{
            val.setText("0");
        }
    }
    public static void main(String []args){
        Q5 frm = new Q5();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(200, 200, 400 ,200);
        frm.setVisible(true);
    }
}