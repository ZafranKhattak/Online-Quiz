package Class.Class12.Maths.Medium;

import Class.Class12.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: A function f is called one-to-one if:",
                "Question 2: The limit of a function f(x) as x approaches a is written as:",
                "Question 3: The derivative of tan x with respect to x is:",
                "Question 4: The derivative of sec x with respect to x is:",
                "Question 5: Integration by substitution is also known as:",
                "Question 6: The integration of 1/x with respect to x is:",
                "Question 7: The slope of a line passing through points (x₁, y₁) and (x₂, y₂) is:",
                "Question 8: Two lines with slopes m₁ and m₂ are parallel if:",
                "Question 9: Two lines with slopes m₁ and m₂ are perpendicular if:",
                "Question 10: The equation of a line through the origin with slope m is:",
                "Question 11: In linear programming, the region satisfying all constraints is called the:",
                "Question 12: The center of the circle x² + y² + 2gx + 2fy + c = 0 is:",
                "Question 13: The general equation of a conic with center at origin is:",
                "Question 14: The eccentricity of a circle is:",
                "Question 15: A vector a is perpendicular to vector b if:",
                "Question 16: The dot product of two vectors is also called:",
                "Question 17: The cross product of two vectors is also called:",
                "Question 18: The derivative of ln x with respect to x is:",
                "Question 19: The integral of sin x with respect to x is:",
                "Question 20: The integral of cos x with respect to x is:"
        };

        String options[][] = {
                {"A. f(a) = f(b) implies a = b", "B. f(a) = f(b) implies a ≠ b", "C. f(a) ≠ f(b) implies a = b", "D. Every element has a unique image"},
                {"A. lim f(x) = L", "B. limₓ→a f(x) = L", "C. lim f(a) = L", "D. limₓ→∞ f(x) = L"},
                {"A. sec² x", "B. -sec² x", "C. cosec² x", "D. -cosec² x"},
                {"A. sec x tan x", "B. -sec x tan x", "C. cosec x cot x", "D. -cosec x cot x"},
                {"A. Chain rule", "B. Change of variable method", "C. Product rule", "D. Quotient rule"},
                {"A. ln x + c", "B. eˣ + c", "C. x ln x + c", "D. 1/x² + c"},
                {"A. (y₂ - y₁)/(x₂ - x₁)", "B. (x₂ - x₁)/(y₂ - y₁)", "C. y₂ - y₁", "D. x₂ - x₁"},
                {"A. m₁ = m₂", "B. m₁ × m₂ = -1", "C. m₁ + m₂ = 0", "D. m₁ = 1/m₂"},
                {"A. m₁ = m₂", "B. m₁ × m₂ = -1", "C. m₁ + m₂ = 0", "D. m₁ = -m₂"},
                {"A. y = mx + c", "B. y = mx", "C. x = my", "D. y = x"},
                {"A. Feasible region", "B. Infeasible region", "C. Optimal region", "D. Constraint region"},
                {"A. (-g, -f)", "B. (g, f)", "C. (-g, f)", "D. (g, -f)"},
                {"A. x²/a² + y²/b² = 1", "B. x²/a² - y²/b² = 1", "C. Both A and B", "D. x² + y² = a²"},
                {"A. 0", "B. 1", "C. Less than 1", "D. Greater than 1"},
                {"A. a · b = 0", "B. a · b = 1", "C. a × b = 0", "D. a × b = 1"},
                {"A. Cross product", "B. Scalar product", "C. Vector product", "D. Triple product"},
                {"A. Dot product", "B. Scalar product", "C. Vector product", "D. Triple product"},
                {"A. 1/x", "B. x", "C. eˣ", "D. 1/eˣ"},
                {"A. cos x + c", "B. -cos x + c", "C. sin x + c", "D. -sin x + c"},
                {"A. sin x + c", "B. -sin x + c", "C. cos x + c", "D. -cos x + c"}
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