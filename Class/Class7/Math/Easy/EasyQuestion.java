package Class.Class7.Math.Easy;

import javax.swing.*;
import Class.Class7.Math.MathsDashboard.MathsDashboard;
import java.awt.*;

public class EasyQuestion {

    public EasyQuestion() {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1300, 700);
        panel.setPreferredSize(new Dimension(1750, 1500));
        panel.setBackground(Color.BLACK);

        JLabel label = new JLabel();
        label.setLayout(null);
        label.setText("<html>There are four options.Select the correct one<br>Take your time.Best of Luck.</br></html");
        label.setBounds(450, 40, 550, 60);
        label.setForeground(Color.RED);
        label.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(label);

        JScrollPane scroll = new JScrollPane(panel);
        scroll.setBounds(0, 0, 1300, 700);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        frame.add(scroll);

        String questions[] = {
                "Question 1: The sum of two negative integers is always:",
                "Question 2: What is the reciprocal of 2/3?",
                "Question 3: A triangle with all sides equal is called:",
                "Question 4: The perimeter of a square with side 5 cm is:",
                "Question 5: 5% of 200 is:",
                "Question 6: The sum of two complementary angles is:",
                "Question 7: The absolute value of -7 is:",
                "Question 8: A rational number is any number that can be written as:",
                "Question 9: The product of 3 and -4 is:",
                "Question 10: The mean of 2, 4, 6, 8, 10 is:",
                "Question 11: The area of a rectangle with length 6 cm and breadth 4 cm is:",
                "Question 12: Which of the following is a rational number?",
                "Question 13: The opposite of -12 is:",
                "Question 14: The sum of all angles in a triangle is:",
                "Question 15: The circumference of a circle with radius 7 cm is:",
                "Question 16: The product of two negative integers is:",
                "Question 17: A triangle with two equal sides is called:",
                "Question 18: The place value of 5 in 456 is:",
                "Question 19: The decimal form of 3/5 is:",
                "Question 20: The symbol for \"greater than\" is:"
        };

        String options[][] = {
                {"A. Positive", "B. Negative", "C. Zero", "D. One"},
                {"A. 3/2", "B. 2/3", "C. 4/6", "D. 6/4"},
                {"A. Isosceles", "B. Scalene", "C. Equilateral", "D. Right"},
                {"A. 25 cm", "B. 20 cm", "C. 10 cm", "D. 15 cm"},
                {"A. 5", "B. 10", "C. 15", "D. 20"},
                {"A. 90°", "B. 180°", "C. 360°", "D. 45°"},
                {"A. -7", "B. 0", "C. 7", "D. 14"},
                {"A. a/b where a and b are integers, b ≠ 0", "B. a/b where a and b are whole numbers", "C. a/b where b = 0", "D. Only whole numbers"},
                {"A. 12", "B. -12", "C. 7", "D. -7"},
                {"A. 4", "B. 5", "C. 6", "D. 7"},
                {"A. 20 cm²", "B. 24 cm²", "C. 10 cm²", "D. 12 cm²"},
                {"A. √2", "B. 0.5", "C. π", "D. √3"},
                {"A. -12", "B. 0", "C. 12", "D. 24"},
                {"A. 90°", "B. 180°", "C. 360°", "D. 270°"},
                {"A. 22 cm", "B. 44 cm", "C. 66 cm", "D. 88 cm"},
                {"A. Positive", "B. Negative", "C. Zero", "D. Undefined"},
                {"A. Equilateral", "B. Isosceles", "C. Scalene", "D. Right"},
                {"A. 5", "B. 50", "C. 500", "D. 56"},
                {"A. 0.6", "B. 0.3", "C. 0.5", "D. 0.2"},
                {"A. <", "B. >", "C. =", "D. ≤"}
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 850, 30);
            label2.setForeground(Color.GREEN);
            label2.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(label2);
        }

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 220), (i * 60 + 130), 220, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                group.add(btn);
                panel.add(btn);
            }
        }

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            JOptionPane.showConfirmDialog(null, "You want to submit");
            JOptionPane.showMessageDialog(null, "Submitted Successfully");
        });
        panel.add(buttonSubmit);

        JButton buttonBack = new JButton("BACK");
        buttonBack.setLayout(null);
        buttonBack.setBounds(450, 1340, 200, 30);
        buttonBack.setBackground(Color.BLUE);
        buttonBack.setForeground(Color.BLACK);
        buttonBack.setFont(new Font("Arial", Font.BOLD, 15));
        buttonBack.addActionListener(e -> {
            new MathsDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}