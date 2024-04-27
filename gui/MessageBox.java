import javax.swing.Jframe;

import java.awt.Color;

import javax.swing.*;
import javax.swing.JMessageBox;

class MessageBox extends JFrame {
    public static void messagebox1() {
        JFrame mess = new JFrame("Message");
        JButton button = new JButton("YES");
        JMessageBox message = new JMessageBox("Message");
        mess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mess.resize(500, 500);
        mess.setBackground(Color.WHITE);
        mess.setVisible(true);
        button.resize(75, 50);
        button.setLayout(getLayout());
        mess.add(button);
    }
    public static void main(String[] args) {
        MessageBox.messagebox1();
    }
}