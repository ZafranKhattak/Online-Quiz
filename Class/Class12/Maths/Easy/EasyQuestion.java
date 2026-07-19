package Class.Class12.Maths.Easy;

import Class.Class12.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: The domain of a function is the set of all:",
                "Question 2: The notation f(x) is read as:",
                "Question 3: The derivative of a constant is:",
                "Question 4: The derivative of xⁿ with respect to x is:",
                "Question 5: Integration is the inverse process of:",
                "Question 6: The anti-derivative of 2x is:",
                "Question 7: The distance between two points (x₁, y₁) and (x₂, y₂) is given by:",
                "Question 8: The slope of a horizontal line is:",
                "Question 9: An inequality of the form ax + by ≤ c is called:",
                "Question 10: The equation of a circle with center (0, 0) and radius r is:",
                "Question 11: The equation x² = 4ay represents a:",
                "Question 12: A vector quantity has both:",
                "Question 13: The sum of two vectors is called their:",
                "Question 14: A scalar is a quantity that has:",
                "Question 15: The product of a vector and a positive scalar:",
                "Question 16: The derivative of sin x with respect to x is:",
                "Question 17: The derivative of cos x with respect to x is:",
                "Question 18: The integral of eˣ with respect to x is:",
                "Question 19: The formula for the area of a circle is:",
                "Question 20: The line y = mx + c is in:"
        };

        String options[][] = {
                {"A. Output values", "B. Input values", "C. Both input and output values", "D. None of these"},
                {"A. f times x", "B. f of x", "C. f plus x", "D. f minus x"},
                {"A. 1", "B. 0", "C. The constant itself", "D. Undefined"},
                {"A. nxⁿ⁻¹", "B. n xⁿ⁺¹", "C. (n-1)xⁿ", "D. xⁿ/n"},
                {"A. Addition", "B. Subtraction", "C. Differentiation", "D. Multiplication"},
                {"A. x² + c", "B. 2x² + c", "C. x²", "D. 2x"},
                {"A. √[(x₂ - x₁)² + (y₂ - y₁)²]", "B. (x₂ - x₁)² + (y₂ - y₁)²", "C. √[(x₂ - x₁)³ + (y₂ - y₁)³]", "D. (x₂ - x₁) + (y₂ - y₁)"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. Linear equation", "B. Linear inequality", "C. Quadratic equation", "D. Polynomial equation"},
                {"A. x² + y² = r", "B. x² + y² = r²", "C. x + y = r", "D. x² - y² = r²"},
                {"A. Circle", "B. Parabola", "C. Ellipse", "D. Hyperbola"},
                {"A. Speed and time", "B. Magnitude and direction", "C. Distance and displacement", "D. Only magnitude"},
                {"A. Product", "B. Difference", "C. Resultant", "D. Scalar"},
                {"A. Only magnitude", "B. Only direction", "C. Both magnitude and direction", "D. Neither magnitude nor direction"},
                {"A. Changes its direction", "B. Does not change its direction", "C. Reverses its direction", "D. Makes it zero"},
                {"A. -sin x", "B. cos x", "C. -cos x", "D. tan x"},
                {"A. -sin x", "B. sin x", "C. -cos x", "D. tan x"},
                {"A. eˣ + c", "B. eˣ", "C. -eˣ + c", "D. ln x + c"},
                {"A. πr", "B. 2πr", "C. πr²", "D. 2πr²"},
                {"A. Point-slope form", "B. Slope-intercept form", "C. Two-point form", "D. Intercept form"}
        };

        int correctAnswers[] = {
                1,  // Q1: Input values
                1,  // Q2: f of x
                1,  // Q3: 0
                0,  // Q4: nxⁿ⁻¹
                2,  // Q5: Differentiation
                0,  // Q6: x² + c
                0,  // Q7: √[(x₂ - x₁)² + (y₂ - y₁)²]
                0,  // Q8: 0
                1,  // Q9: Linear inequality
                1,  // Q10: x² + y² = r²
                1,  // Q11: Parabola
                1,  // Q12: Magnitude and direction
                2,  // Q13: Resultant
                0,  // Q14: Only magnitude
                1,  // Q15: Does not change its direction
                1,  // Q16: cos x
                0,  // Q17: -sin x
                0,  // Q18: eˣ + c
                2,  // Q19: πr²
                1   // Q20: Slope-intercept form
        };

        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                btn.setActionCommand(String.valueOf(j));
                group.add(btn);
                panel.add(btn);
                radioButtons[i][j] = btn;
            }
        }

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(80, 1280, 500, 30);
        resultLabel.setForeground(Color.YELLOW);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(resultLabel);

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            int score = 0;
            int totalQuestions = questions.length;
            
            for (int i = 0; i < totalQuestions; i++) {
                for (int j = 0; j < 4; j++) {
                    if (radioButtons[i][j].isSelected() && j == correctAnswers[i]) {
                        score++;
                        break;
                    }
                }
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to submit?", 
                "Confirm Submission", 
                JOptionPane.YES_NO_OPTION);
                
            if (confirm == JOptionPane.YES_OPTION) {
                double percentage = (double) score / totalQuestions * 100;
                String grade;
                if (percentage >= 80) grade = "Excellent!";
                else if (percentage >= 60) grade = "Good!";
                else if (percentage >= 40) grade = "Fair";
                else grade = "Needs Improvement";
                
                String message = String.format(
                    "<html><body style='text-align: center;'>" +
                    "<h2>Quiz Results</h2>" +
                    "<p>Total Questions: %d</p>" +
                    "<p>Correct Answers: %d</p>" +
                    "<p>Wrong Answers: %d</p>" +
                    "<p>Percentage: %.1f%%</p>" +
                    "<p>Grade: %s</p>" +
                    "</body></html>",
                    totalQuestions, score, totalQuestions - score, percentage, grade
                );
                
                JOptionPane.showMessageDialog(null, message, "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
                resultLabel.setText(String.format("Score: %d/%d (%.1f%%)", score, totalQuestions, percentage));
            }
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