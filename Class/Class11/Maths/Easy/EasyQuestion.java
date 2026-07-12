package Class.Class11.Maths.Easy;

import Class.Class11.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: A number of the form a + ib, where a and b are real numbers and i = √-1, is called a:",
                "Question 2: The conjugate of the complex number 3 + 4i is:",
                "Question 3: A relation in which every element of domain has a unique image in codomain is called a:",
                "Question 4: The standard form of a quadratic equation is:",
                "Question 5: A matrix with the same number of rows and columns is called a:",
                "Question 6: A rational fraction P(x)/Q(x) is called proper if:",
                "Question 7: A sequence in which the difference between consecutive terms is constant is called:",
                "Question 8: The nth term of an arithmetic progression is given by:",
                "Question 9: The value of 0! (zero factorial) is:",
                "Question 10: The formula for ⁵C₂ is:",
                "Question 11: The identity sin²θ + cos²θ is equal to:",
                "Question 12: The derivative of xⁿ with respect to x is:",
                "Question 13: A vector quantity has both:",
                "Question 14: The discriminant of the quadratic equation ax² + bx + c = 0 is:",
                "Question 15: A sequence in which the ratio between consecutive terms is constant is called:",
                "Question 16: The determinant of a 2 × 2 matrix [[a, b], [c, d]] is:",
                "Question 17: The remainder theorem states that when a polynomial p(x) is divided by (x - a), the remainder is:",
                "Question 18: The formula for the sum of the first n natural numbers is:",
                "Question 19: A matrix that has an inverse is called:",
                "Question 20: The derivative of a constant is:"
        };

        String options[][] = {
                {"A. Natural number", "B. Real number", "C. Complex number", "D. Rational number"},
                {"A. 3 - 4i", "B. -3 + 4i", "C. -3 - 4i", "D. 3 + 4i"},
                {"A. Relation", "B. Function", "C. Set", "D. Group"},
                {"A. ax + b = 0", "B. ax² + bx + c = 0", "C. ax³ + bx² + cx + d = 0", "D. ax + by = c"},
                {"A. Row matrix", "B. Column matrix", "C. Square matrix", "D. Rectangular matrix"},
                {"A. Degree of P < Degree of Q", "B. Degree of P > Degree of Q", "C. Degree of P = Degree of Q", "D. P(x) = Q(x)"},
                {"A. Geometric progression", "B. Arithmetic progression", "C. Harmonic progression", "D. Fibonacci sequence"},
                {"A. aₙ = a₁ + (n-1)d", "B. aₙ = a₁rⁿ⁻¹", "C. aₙ = a₁ + nd", "D. aₙ = a₁rⁿ"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. 20", "B. 10", "C. 5", "D. 25"},
                {"A. 0", "B. 1", "C. sin²θ", "D. cos²θ"},
                {"A. nxⁿ⁻¹", "B. n xⁿ⁺¹", "C. (n-1)xⁿ", "D. xⁿ/n"},
                {"A. Speed and time", "B. Magnitude and direction", "C. Distance and displacement", "D. Only magnitude"},
                {"A. b² + 4ac", "B. b² - 4ac", "C. a² - 4bc", "D. c² - 4ab"},
                {"A. Arithmetic progression", "B. Geometric progression", "C. Harmonic progression", "D. Fibonacci sequence"},
                {"A. ab - cd", "B. ad - bc", "C. ac - bd", "D. bc - ad"},
                {"A. p(0)", "B. p(a)", "C. p(-a)", "D. 0"},
                {"A. n(n+1)/2", "B. n(n-1)/2", "C. n²", "D. n(n+1)(2n+1)/6"},
                {"A. Singular matrix", "B. Non-singular matrix", "C. Symmetric matrix", "D. Skew-symmetric matrix"},
                {"A. 1", "B. 0", "C. The constant itself", "D. Undefined"}
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