package Class.Class6.Math.Hard;

import Class.Class6.Math.MathDashboard.MathDashboard;
import javax.swing.*;
import java.awt.*;

public class DifficultQuestion {

    public DifficultQuestion() {

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
                "Question 1: The greatest 4-digit number divisible by 12, 15, and 20 is:",
                "Question 2: Find the greatest number which divides 145 and 235 leaving remainder 1 in each case.",
                "Question 3: If L.C.M. of two numbers is 36, which cannot be their H.C.F.?",
                "Question 4: Take two digits, 2 and 3. Make the greatest four-digit number using both digits equal number of times.",
                "Question 5: The product of three consecutive numbers is always divisible by:",
                "Question 6: Which statement is NOT true?",
                "Question 7: The sum of two consecutive odd numbers is always divisible by:",
                "Question 8: Make the smallest four-digit number from digits 9, 0, 5 using one digit twice.",
                "Question 9: Rounded off 45553 to nearest hundreds is:",
                "Question 10: Find using distributive property: 504 × 35.",
                "Question 11: Which of the following is meaningless in Roman numerals?",
                "Question 12: The diameter of a circle is equal to:",
                "Question 13: A radius is:",
                "Question 14: The sum of two consecutive odd numbers is always divisible by 4. Which example verifies this?",
                "Question 15: If a number exactly divides the sum of two numbers, it:",
                "Question 16: Seventeen million twenty-four thousand fifty-four = _____.",
                "Question 17: Find the number of matchsticks for pattern of letter T with 'n' patterns.",
                "Question 18: A circle divides all points in a plane into how many parts?",
                "Question 19: The region enclosed by a chord and arc is called:",
                "Question 20: If 12 students sit in each row, the number of students in 'n' rows is:"
        };

        String options[][] = {
                {"A. 9990", "B. 9000", "C. 9960", "D. 9999"},
                {"A. 24", "B. 18", "C. 19", "D. 17"},
                {"A. 9", "B. 12", "C. 8", "D. 18"},
                {"A. 3232", "B. 3322", "C. 3223", "D. 2323"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. If a number is factor of two numbers, it is factor of their sum", "B. If a number is factor of two numbers, it is factor of their difference", "C. 15 and 24 are co-prime", "D. 1 is neither prime nor composite"},
                {"A. 2", "B. 3", "C. 4", "D. 5"},
                {"A. 9005", "B. 9905", "C. 9950", "D. 9050"},
                {"A. 45500", "B. 45550", "C. 45600", "D. 45650"},
                {"A. 17640", "B. 17650", "C. 17630", "D. 17620"},
                {"A. LXIX", "B. XC", "C. IL", "D. LI"},
                {"A. radius", "B. chord", "C. twice radius", "D. circumference"},
                {"A. always a chord", "B. never a chord", "C. sometimes a chord", "D. diameter"},
                {"A. 1+3=4", "B. 1+5=6", "C. 3+7=10", "D. 5+9=14"},
                {"A. must divide each separately", "B. may not divide each separately", "C. never divides each separately", "D. divides only one"},
                {"A. 172454", "B. 170024054", "C. 170240054", "D. 17024054"},
                {"A. 3n", "B. 4n", "C. 2n", "D. 5n"},
                {"A. 2", "B. 3", "C. 4", "D. 1"},
                {"A. sector", "B. segment", "C. circumference", "D. diameter"},
                {"A. 12 + n", "B. 12 - n", "C. 12n", "D. n ÷ 12"}
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 950, 30);
            label2.setForeground(Color.GREEN);
            label2.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(label2);
        }

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
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
            new MathDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}