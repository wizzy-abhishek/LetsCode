import java.awt.*;

import javax.swing.JFrame;

public class MyFrame {
    @SuppressWarnings("deprecation")
    
    public static void main(String[] args) {
        Frame frame = new Frame("First Frame");
        Panel panel= new Panel();
        Button b = new Button();
        Checkbox c = new Checkbox("JAVA");
        List L = new List(5);
        Choice Co = new Choice();
        Scrollbar S = new Scrollbar(0);
        TextField T1;   
        TextArea T2;     
        //((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.resize(800, 600);
        frame.setBackground(Color.pink);
        frame.setLayout(null);
        panel.resize(600,50);
        panel.setBackground(Color.CYAN);
        b.setLabel("Menu");
        b.setBounds(00,50,50,25);
        b.setSize(75,25);
        frame.add(b);
        b.setLabel(null);
        b.setVisible(true);
        //b.setBackground();
        c.setBounds(50,100,50,50);
        T1 = new TextField("Enter About yourself in single line ", 1 );
        T1.setBounds(100,100,120,150);
        T2 = new TextArea("Enter about yourself multiple line" , 25 , 25);
        T2.setBounds(180,200,200,180);
        L.setBounds(500,210,75,75);
        L.add("JAVA");
        L.add("C++");
        L.add("LIST");
        Co.add("JAVA");
        Co.add("C++");
        Co.add("HTML");
        Co.add("JavaScript");
        Co.setBounds(550,290,75,75);
        S.setBounds(750,550,50,50);
        frame.add(S);
        frame.add(Co);
        frame.add(L);
        frame.add(T2);
        frame.add(T1);
        frame.add(c);
        frame.add(panel);
        frame.show();
    }

}