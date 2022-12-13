import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Q3 extends JFrame implements ActionListener {
    Container c;
    JLabel input, search, occur, replace, newInput, Occur, NewInput;
    JTextField Input, Search,  Replace;
    JButton btn1, btn2;

    Q3(){
        c = getContentPane();
        c.setLayout(new FlowLayout());

        input = new JLabel("Input String: ");
        Input = new JTextField(20);

        search = new JLabel("Enter String: ");
        Search = new JTextField(20);

        occur = new JLabel("No of occurences:      ");
        Occur = new JLabel("Press Search Button");

        replace = new JLabel("Replace String with: ");
        Replace = new JTextField(20);

        newInput = new JLabel("New String:    ");
        NewInput = new JLabel("Press Replace Button to Get        ");

        btn1 = new JButton("Search");
        btn2 = new JButton("Replace");

        c.add(input);
        c.add(Input);
        c.add(search);
        c.add(Search);
        c.add(occur);
        c.add(Occur);
        c.add(replace);
        c.add(Replace);
        c.add(newInput);
        c.add(NewInput);
        c.add(btn1);
        c.add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String str, word, change, output="";
        int count=0;
        str = Input.getText();
        String strArr[] = str.split(" ");
        
        word = Search.getText();

        change = Replace.getText();
        
        // For Search Button
        if(ae.getSource() == btn1){
            for(String a: strArr){
                if(a.equals(word)){
                    count = count + 1;
                }
            }
            Occur.setText("Num of occurences: "+count);
            JOptionPane.showMessageDialog(c, "Num of Occurences: "+count);
        }else{
            for(String a:strArr){
                if(a.equals(word)){
                    output = output +" "+change;
                }else{
                    output = output + " "+a;
                }
            }
            NewInput.setText(output);
            JOptionPane.showMessageDialog(c, "New String: "+output);
        }
    }

    public static void main(String []args){
        Q3 frm = new Q3();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(200, 200, 350, 300);
        frm.setVisible(true);
    }
}
