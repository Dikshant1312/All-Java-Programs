import javax.swing.*;
class Assign {
    public static void main(String args[]) {
        
     
       
        JFrame frame = new JFrame("Assignment 06");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
 
        
        JRadioButton rb = new JRadioButton("A) All good");
        rb.setBounds(200,290,170,30); 
        JButton b = new JButton("Hello !!!");
        b.setBounds(30,30,100,70);
        JCheckBox c = new JCheckBox("Assignment 6");
        c.setBounds(150,50,190,90);
        JTextArea txa = new JTextArea("Text area !!!");
        txa.setBounds(220,190,200,20);
        JScrollBar sb = new JScrollBar();
        sb.setBounds(350,100,50,70);
        JLabel lb = new JLabel("This is a label!!!");
        lb.setBounds(300,300,120,80);
        
        

        frame.add(b);
        frame.add(c);
        frame.add(txa);
        frame.add(sb);
        frame.add(lb);
        frame.add(rb);
       
        
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
}