package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

import java.awt.*;

public class NetBFrame extends JFrame {

    @SuppressWarnings("deprecation")
    public void screen() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame body = new JFrame("Net Banking");
                JMenuBar menubar = new JMenuBar();
                JMenu menu = new JMenu("Options ");
                JMenuItem menuItem = new JMenuItem("Open");
                JPasswordField password = new JPasswordField("Enter your password");
                body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                body.resize(800, 825);
                body.setBackground(Color.CYAN);
                body.setVisible(true);
                body.add(password);
                body.add(menubar);
                password.setVisible(true);
                menubar.add(menu);
                menu.add(menuItem);
            }
        });

    }

    public static void main(String[] args) {
        NetBFrame obj = new NetBFrame();
        obj.screen();
    }

}
