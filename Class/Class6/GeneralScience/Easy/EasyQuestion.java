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
        panel.setBounds(0, 0, 1300, 700);
        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(450, 1500)); // Height zyada
        frame.add(panel);

        // ================= NOTES FOR QUIZ ================== //
        JLabel label = new JLabel();
        label.setLayout(null);
        label.setText("<html>There are four options.Select the correct one<br>Take your time.Best of Luck.</br></html");
        label.setBounds(450, 40, 550, 60);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(label);

        // ==================QUESTIONS LOGIC ==================;

        JLabel label1= labelCreate("Question 1: What is the basic unit of all living things?",
                                130
                                 );
        panel.add(label1);
        
        JRadioButton[] options = btn(
                        "Option A",
                        "Option B",
                        "Option C",
                        "Option D"
);

    ButtonGroup grp = new ButtonGroup();

for (JRadioButton option : options) {
    panel.add(option);
    grp.add(option);
}
                        
    }

    public JLabel labelCreate(String question , int y)
    {
        JLabel label = new JLabel();
        label.setText(question);
        label.setLayout(null);
        label.setForeground(Color.WHITE);
        label.setBounds(10 , y, 650 , 30);
        label.setFont(new Font("Arial" , Font.BOLD,19));
        return label;
    }

    public JRadioButton[] btn(String optionA,
                          String optionB,
                          String optionC,
                          String optionD
                          ) {

    JRadioButton[] btn = new JRadioButton[4];

    btn[0] = new JRadioButton(optionA);
    btn[1] = new JRadioButton(optionB);
    btn[2] = new JRadioButton(optionC);
    btn[3] = new JRadioButton(optionD);

    for (int i = 0; i < btn.length; i++) {

        btn[i].setBounds(200*i,170 , 150, 30);
        btn[i].setFont(new Font("Arial", Font.BOLD, 13));
    }

    return btn;
}
}
