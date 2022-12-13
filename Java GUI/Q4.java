import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q4 extends JFrame implements ActionListener{
    Container c;
    JLabel list;
    JTextField listInput;
    JButton btn;
    Q4(){
        c = getContentPane();
        c.setLayout(new FlowLayout());
        list = new JLabel("Enter List of Numbers:  ");
        listInput = new JTextField(20);

        btn = new JButton("Find Nums");

        c.add(list);
        c.add(listInput);
        c.add(btn);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn){
            String strArr[] = listInput.getText().split(" ");
            String evenArr="", oddArr="";
            for(String a:strArr){
                if(Integer.parseInt(a)%2==0){
                    evenArr = evenArr + " "+a;
                }else{
                    oddArr = oddArr + " " + a;
                }
            }
            JOptionPane.showMessageDialog(c, "Even Numbers from List: "+evenArr+"\nOdd Numbers from List: "+oddArr);
        }
    }
    public static void main(String []args){
        Q4 frm = new Q4();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(200, 200, 300 ,200);
        frm.setVisible(true);
        frm.setTitle("Even Odd from List");
    }
}