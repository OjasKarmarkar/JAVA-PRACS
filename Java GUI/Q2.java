import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q2 extends JFrame implements ActionListener {
    Container c;
    JLabel name, password, email;
    JPasswordField passInput;
    JTextField nameInput, emailInput;
    JButton submit;

    Q2(){
        c = getContentPane();
        c.setLayout(new FlowLayout());

        name = new JLabel("Enter Name: ");
        password = new JLabel("Enter Password: ");
        email = new JLabel("Enter Email: ");

        nameInput = new JTextField(10);
        emailInput = new JTextField(10);
        passInput = new JPasswordField(10);
        passInput.setEchoChar('*');

        submit = new JButton("Submit");

        c.add(name);
        c.add(nameInput);
        c.add(email);
        c.add(emailInput);
        c.add(password);
        c.add(passInput);
        c.add(submit);
        submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name, email, strpass;
            name = nameInput.getText();
            email = emailInput.getText();
            strpass = passInput.getPassword().toString();
            JOptionPane.showMessageDialog(c, "Name: "+name+"\nEmail: "+email+"\nEncrypted Password: "+strpass);
        }
    }
    public static void main(String []args){
        Q2 frm = new Q2();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(200, 200 ,250 ,200);
        frm.setVisible(true);
    }
}
