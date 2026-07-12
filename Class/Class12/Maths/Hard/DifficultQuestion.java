package Class.Class12.Maths.Hard;

import Class.Class12.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: A function f is continuous at x = a if:",
                "Question 2: If limₓ→0 sin x/x is:",
                "Question 3: The derivative of a function at a point gives:",
                "Question 4: If y = f(x) and x = g(t), then dy/dt is equal to:",
                "Question 5: The radius of curvature of a curve at a point is given by:",
                "Question 6: The Fundamental Theorem of Calculus states:",
                "Question 7: The definite integral ∫ₐᵇ f(x) dx represents:",
                "Question 8: The area under the curve y = x² from x = 0 to x = 2 is:",
                "Question 9: The equation of the tangent to y = x² at (1, 1) is:",
                "Question 10: The equation of the normal to y = x² at (1, 1) is:",
                "Question 11: The line segment joining two points on a circle passing through the center is called:",
                "Question 12: The equation of the ellipse with major axis along x-axis is:",
                "Question 13: The equation of the hyperbola with transverse axis along x-axis is:",
                "Question 14: The area of the ellipse x²/a² + y²/b² = 1 is:",
                "Question 15: If a, b, and c are vectors, then (a × b) · c is called the:",
                "Question 16: The volume of a parallelepiped formed by vectors a, b, and c is:",
                "Question 17: The angle between two vectors a and b is given by:",
                "Question 18: The derivative of sin⁻¹ x with respect to x is:",
                "Question 19: The derivative of tan⁻¹ x with respect to x is:",
                "Question 20: The integral of 1/(1 + x²) with respect to x is:"
        };

        String options[][] = {
                {"A. limₓ→a f(x) = f(a)", "B. limₓ→a f(x) exists", "C. f(a) exists", "D. All of the above"},
                {"A. 0", "B. 1", "C. ∞", "D. Does not exist"},
                {"A. The slope of the tangent", "B. The slope of the secant", "C. The area under the curve", "D. The average rate of change"},
                {"A. dy/dx × dx/dt", "B. dy/dx + dx/dt", "C. dy/dx ÷ dx/dt", "D. dx/dt ÷ dy/dx"},
                {"A. 1/κ", "B. κ", "C. κ²", "D. 1/κ²"},
                {"A. Differentiation and integration are inverse processes", "B. Integration is independent of differentiation", "C. Differentiation is independent of integration", "D. They are unrelated"},
                {"A. Area under the curve", "B. Slope of tangent", "C. Rate of change", "D. Average value"},
                {"A. 2/3", "B. 4/3", "C. 8/3", "D. 16/3"},
                {"A. y = 2x - 1", "B. y = 2x + 1", "C. y = x² - 1", "D. y = x + 1"},
                {"A. x + 2y - 3 = 0", "B. x - 2y + 1 = 0", "C. 2x + y - 3 = 0", "D. 2x - y - 1 = 0"},
                {"A. Chord", "B. Diameter", "C. Radius", "D. Tangent"},
                {"A. x²/a² + y²/b² = 1 (a > b)", "B. x²/b² + y²/a² = 1 (a > b)", "C. x²/a² - y²/b² = 1", "D. x² + y² = a²"},
                {"A. x²/a² + y²/b² = 1", "B. x²/a² - y²/b² = 1", "C. x²/b² + y²/a² = 1", "D. x² + y² = a²"},
                {"A. πab", "B. 2πab", "C. π(a + b)", "D. π(a² + b²)"},
                {"A. Scalar triple product", "B. Vector triple product", "C. Dot product", "D. Cross product"},
                {"A. |(a × b) · c|", "B. |a × b|", "C. |a · b|", "D. |a × b| × |c|"},
                {"A. cos θ = (a · b)/(|a||b|)", "B. sin θ = (a · b)/(|a||b|)", "C. tan θ = (a · b)/(|a||b|)", "D. cos θ = (a × b)/(|a||b|)"},
                {"A. 1/√(1 - x²)", "B. -1/√(1 - x²)", "C. 1/(1 + x²)", "D. -1/(1 + x²)"},
                {"A. 1/√(1 - x²)", "B. -1/√(1 - x²)", "C. 1/(1 + x²)", "D. -1/(1 + x²)"},
                {"A. sin⁻¹ x + c", "B. tan⁻¹ x + c", "C. sec⁻¹ x + c", "D. cos⁻¹ x + c"}
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
                btn.setBounds(80 + (j * 280), (i * 60 + 130), 280, 30);
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