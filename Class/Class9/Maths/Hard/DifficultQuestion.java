package Class.Class9.Maths.Hard;

import Class.Class9.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: The value of √2 is an example of:",
                "Question 2: The decimal expansion of π is:",
                "Question 3: The union of the set of rational numbers and irrational numbers gives:",
                "Question 4: If A = {1, 2, 3, 4} and B = {3, 4, 5, 6}, then A \\ B is:",
                "Question 5: The number of elements in the power set of A = {a, b} is:",
                "Question 6: If A and B are disjoint sets, then n(A ∩ B) is:",
                "Question 7: The equation of a line passing through the origin with slope m is:",
                "Question 8: The distance between the points (2, 3) and (5, 7) is:",
                "Question 9: If logₐ x = y, then x is equal to:",
                "Question 10: The value of log₃ 81 is:",
                "Question 11: The value of log₅ 125 is:",
                "Question 12: The roots of the equation x² - 7x + 12 = 0 are:",
                "Question 13: If the discriminant of a quadratic equation is zero, the roots are:",
                "Question 14: The line x = 3 is:",
                "Question 15: The slope of the line passing through (1, 2) and (3, 6) is:",
                "Question 16: The factorization of 2x² + 7x + 3 is:",
                "Question 17: The value of cos 90° is:",
                "Question 18: The value of sin 30° is:",
                "Question 19: The value of tan 45° is:",
                "Question 20: If two sets A and B have 3 and 4 elements respectively, then the maximum number of elements in A ∪ B is:"
        };

        String options[][] = {
                {"A. Rational number", "B. Irrational number", "C. Integer", "D. Natural number"},
                {"A. Terminating", "B. Recurring", "C. Non-terminating non-recurring", "D. Repeating"},
                {"A. Integers", "B. Natural numbers", "C. Real numbers", "D. Complex numbers"},
                {"A. {1, 2}", "B. {5, 6}", "C. {3, 4}", "D. {1, 2, 3, 4, 5, 6}"},
                {"A. 1", "B. 2", "C. 3", "D. 4"},
                {"A. 0", "B. 1", "C. n(A)", "D. n(B)"},
                {"A. y = mx + c", "B. y = mx", "C. x = my", "D. y = x"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. a/y", "B. a × y", "C. aʸ", "D. yᵃ"},
                {"A. 2", "B. 3", "C. 4", "D. 5"},
                {"A. 2", "B. 3", "C. 4", "D. 5"},
                {"A. 3 and 4", "B. 2 and 6", "C. 1 and 12", "D. 3 and 3"},
                {"A. Real and distinct", "B. Real and equal", "C. Imaginary", "D. Complex"},
                {"A. Parallel to x-axis", "B. Perpendicular to y-axis", "C. Parallel to y-axis", "D. Passing through origin"},
                {"A. 2", "B. 3", "C. 4", "D. 1"},
                {"A. (2x + 1)(x + 3)", "B. (2x + 3)(x + 1)", "C. (x + 1)(2x + 3)", "D. (x + 3)(2x + 1)"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. 0", "B. 1/2", "C. 1/√2", "D. √3/2"},
                {"A. 0", "B. 1/2", "C. 1", "D. √3"},
                {"A. 3", "B. 4", "C. 7", "D. 12"}
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
                btn.setBounds(80 + (j * 260), (i * 60 + 130), 260, 30);
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