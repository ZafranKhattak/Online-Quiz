package Class.Class6.GeneralScience.Easy;

import javax.swing.*;
import java.awt.*;

public class EasyQuestion {

    public EasyQuestion() {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         // ================= JPANEL ======================//
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1300, 700);
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(450, 1500)); // Height zyada
        frame.add(panel);

        // ================= NOTES FOR QUIZ ================== //
        JLabel label = new JLabel();
        label.setLayout(null);
        label.setText("<html>There are four options.Select the correct one<br>Take your time.Best of Luck</br></html");     
        label.setBounds(450 , 40 , 550 , 60);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial" , Font.ITALIC, 18));
        panel.add(label);

        // ======================== JScrollPane ===================//
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setBounds(0,0, 1300,400);
         scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        scroll.getVerticalScrollBar().setUnitIncrement(20);
         frame.add(scroll);
        
    }

}

