import java.awt.*;
class AWTexample2{
AWTexample2(){
Frame f=new Frame();
Label l=new Label("Employee id");
Button b=new Button("Submit");
TextField t=new TextField();
l.setBounds(20,80,80,30);
t.setBounds(20,100,80,30);
b.setBounds(100,100,80,30);
f.add(b);
f.add(l);
f.add(t);
f.setSize(400,300);
f.setTitle("Employee Info");
f.setLayout(null);
f.setVisible(true);
}

public static void main(String args[])
{
AWTexample2 awt_obj=new AWTexample2();
}
}