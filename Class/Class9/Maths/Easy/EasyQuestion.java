package Class.Class9.Maths.Easy;

import Class.Class9.Maths.MathsDashboard.MathsDashboard;
import javax.swing.*;
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
                "Question 1: The numbers that can be expressed in the form p/q where p and q are integers and q ≠ 0 are called:",
                "Question 2: The multiplicative identity of real numbers is:",
                "Question 3: The square of 7 is:",
                "Question 4: The cube of 4 is:",
                "Question 5: The square root of 121 is:",
                "Question 6: A set that contains all the elements under consideration is called:",
                "Question 7: The union of two sets A and B is denoted by:",
                "Question 8: A linear equation in one variable has the form:",
                "Question 9: The number of elements in set A = {1, 2, 3} is:",
                "Question 10: The empty set is denoted by:",
                "Question 11: The distance formula between two points (x₁, y₁) and (x₂, y₂) is:",
                "Question 12: The x-coordinate of a point is also called its:",
                "Question 13: The logarithm of a number to base 10 is called:",
                "Question 14: The value of log₁₀ 10 is:",
                "Question 15: The standard form of a quadratic equation is:",
                "Question 16: The product of two rational numbers is always a:",
                "Question 17: A set with no elements is called:",
                "Question 18: The degree of a linear equation is:",
                "Question 19: The value of √0 is:",
                "Question 20: A point on the x-axis has y-coordinate equal to:"
        };

        String options[][] = {
                {"A. Natural numbers", "B. Irrational numbers", "C. Rational numbers", "D. Integers"},
                {"A. 0", "B. 1", "C. -1", "D. 10"},
                {"A. 42", "B. 49", "C. 56", "D. 63"},
                {"A. 16", "B. 32", "C. 64", "D. 128"},
                {"A. 10", "B. 11", "C. 12", "D. 13"},
                {"A. Subset", "B. Power set", "C. Universal set", "D. Empty set"},
                {"A. A ∩ B", "B. A ∪ B", "C. A - B", "D. A'"},
                {"A. ax² + bx + c = 0", "B. ax + b = 0", "C. ax³ + bx² + cx + d = 0", "D. ax⁴ + bx² + c = 0"},
                {"A. 1", "B. 2", "C. 3", "D. 4"},
                {"A. {0}", "B. { }", "C. μ", "D. φ"},
                {"A. √[(x₂ - x₁)² + (y₂ - y₁)²]", "B. (x₂ - x₁)² + (y₂ - y₁)²", "C. √[(x₂ - x₁)³ + (y₂ - y₁)³]", "D. (x₂ - x₁) + (y₂ - y₁)"},
                {"A. Ordinate", "B. Abscissa", "C. Origin", "D. Coordinate"},
                {"A. Natural logarithm", "B. Common logarithm", "C. Binary logarithm", "D. None of these"},
                {"A. 0", "B. 1", "C. 10", "D. 100"},
                {"A. ax + b = 0", "B. ax² + bx + c = 0", "C. ax³ + bx² + cx + d = 0", "D. ax + by = c"},
                {"A. Natural number", "B. Irrational number", "C. Rational number", "D. Integer"},
                {"A. Singleton set", "B. Empty set", "C. Finite set", "D. Infinite set"},
                {"A. 0", "B. 1", "C. 2", "D. 3"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. 0", "B. 1", "C. -1", "D. Any value"}
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