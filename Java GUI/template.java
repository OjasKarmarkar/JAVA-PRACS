import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class template extends JFrame implements ActionListener{
    Container c;
    JButton btn;
    template(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        btn = new JButton("Dummy");
        c.add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn){
            JOptionPane.showMessageDialog(c, "Message");
        }
    }
    public static void main(String []args){
        template frm = new template();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(200, 200, 200 ,200);
        frm.setVisible(true);
    }
}