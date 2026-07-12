package Class.Class9.Maths.Medium;

import Class.Class9.Maths.MathsDashboard.MathsDashboard;
import javax.swing.*;
import java.awt.*;

public class MediumQuestion {

    public MediumQuestion() {

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
                "Question 1: A number that cannot be expressed as a terminating or repeating decimal is called:",
                "Question 2: The decimal form of 1/3 is:",
                "Question 3: The set of natural numbers is a subset of:",
                "Question 4: If A = {1, 2, 3} and B = {2, 3, 4}, then A ∩ B is:",
                "Question 5: The solution of the equation 2x + 5 = 13 is:",
                "Question 6: The solution of the equation 3x - 7 = 14 is:",
                "Question 7: If a point has coordinates (3, -4), it lies in which quadrant?",
                "Question 8: The distance between the points (0, 0) and (3, 4) is:",
                "Question 9: The value of log₁₀ 100 is:",
                "Question 10: The value of log₂ 8 is:",
                "Question 11: The factorization of x² - 16 is:",
                "Question 12: The factorization of x² + 7x + 12 is:",
                "Question 13: In the quadratic equation x² - 5x + 6 = 0, the value of c is:",
                "Question 14: The sum of roots of the quadratic equation ax² + bx + c = 0 is:",
                "Question 15: The product of roots of the quadratic equation ax² + bx + c = 0 is:",
                "Question 16: The discriminant of the quadratic equation ax² + bx + c = 0 is:",
                "Question 17: If the slope of a line is undefined, the line is:",
                "Question 18: The logarithm of 1 to any base is:",
                "Question 19: The sine of angle 0° is equal to:",
                "Question 20: The cosine of angle 0° is equal to:"
        };

        String options[][] = {
                {"A. Rational number", "B. Integer", "C. Irrational number", "D. Natural number"},
                {"A. 0.3", "B. 0.33", "C. 0.333...", "D. 0.3333"},
                {"A. Integers only", "B. Rational numbers only", "C. Both integers and rational numbers", "D. None of these"},
                {"A. {1, 2, 3, 4}", "B. {2, 3}", "C. {1, 4}", "D. {1, 2, 3}"},
                {"A. 2", "B. 3", "C. 4", "D. 5"},
                {"A. 5", "B. 6", "C. 7", "D. 8"},
                {"A. First", "B. Second", "C. Third", "D. Fourth"},
                {"A. 4", "B. 5", "C. 6", "D. 7"},
                {"A. 1", "B. 2", "C. 10", "D. 100"},
                {"A. 1", "B. 2", "C. 3", "D. 4"},
                {"A. (x - 4)(x - 4)", "B. (x + 4)(x + 4)", "C. (x - 4)(x + 4)", "D. (x - 16)(x + 1)"},
                {"A. (x + 3)(x + 4)", "B. (x + 2)(x + 6)", "C. (x + 1)(x + 12)", "D. (x + 3)(x + 3)"},
                {"A. 1", "B. -5", "C. 5", "D. 6"},
                {"A. -b/a", "B. b/a", "C. -c/a", "D. c/a"},
                {"A. -b/a", "B. b/a", "C. -c/a", "D. c/a"},
                {"A. b² + 4ac", "B. b² - 4ac", "C. a² - 4bc", "D. c² - 4ab"},
                {"A. Horizontal", "B. Vertical", "C. Parallel to x-axis", "D. Passing through origin"},
                {"A. 0", "B. 1", "C. -1", "D. The base itself"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"}
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
            new MathsDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}