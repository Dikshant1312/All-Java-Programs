import java.awt.*;  
  
  
public class App {  

public App() 
    {  
Frame f=new Frame();
 
        Button btn=new Button("Hello World");  
        Label Nm = new Label("First name:");
        TextField tf = new TextField();
        Checkbox cb = new Checkbox("Assigment 6 ");
        cb.setBounds(100, 100,150,30);
        tf.setBounds(120, 50, 100, 20);
        Nm.setBounds(20,50,70,20);
        btn.setBounds(150, 150,100, 40);  
        Scrollbar s = new Scrollbar();
        s.setBounds(200,200,30,90);
        f.add(btn);   
        f.add(Nm);
        f.add(tf);
        f.add(cb); 
        f.add(s);      
        f.setSize(500, 400);          
        f.setTitle("!!!");    
        f.setLayout(null);     
        f.setVisible(true);   
}
public static void main(String[] args) {  
        App a = new App();    
    
}
}