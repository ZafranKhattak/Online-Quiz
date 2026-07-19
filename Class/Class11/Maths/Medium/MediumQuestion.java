package Class.Class11.Maths.Medium;

import Class.Class11.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: The imaginary unit i is defined as:",
                "Question 2: The modulus of a complex number z = a + bi is:",
                "Question 3: The product of roots of the quadratic equation ax² + bx + c = 0 is:",
                "Question 4: If α and β are the roots of ax² + bx + c = 0, then the equation whose roots are 1/α and 1/β is:",
                "Question 5: The transpose of a matrix is obtained by:",
                "Question 6: The sum of the first n terms of an arithmetic progression is:",
                "Question 7: The number of permutations of n different objects taken r at a time is:",
                "Question 8: The number of combinations of n different objects taken r at a time is:",
                "Question 9: The binomial theorem for positive integral index n is:",
                "Question 10: The factor theorem states that (x - a) is a factor of p(x) if:",
                "Question 11: The sine of (π/2 - θ) is equal to:",
                "Question 12: The derivative of sin x with respect to x is:",
                "Question 13: The slope of the tangent to a curve y = f(x) at a point is:",
                "Question 14: The sum of an infinite geometric progression exists if:",
                "Question 15: Cramer's rule is used to solve:",
                "Question 16: The sum of the roots of the quadratic equation ax² + bx + c = 0 is:",
                "Question 17: The middle term of the binomial expansion of (x + a)ⁿ when n is even is:",
                "Question 18: The resolution of (x² - 1)/(x³ - 1) into partial fractions will have:",
                "Question 19: The value of ω, the complex cube root of unity, satisfies:",
                "Question 20: A rational fraction P(x)/Q(x) is called improper if:"
        };

        String options[][] = {
                {"A. √1", "B. √-1", "C. -√1", "D. 1/-1"},
                {"A. a² + b²", "B. √(a² + b²)", "C. a + b", "D. √(a - b)"},
                {"A. -b/a", "B. b/a", "C. -c/a", "D. c/a"},
                {"A. cx² + bx + a = 0", "B. cx² - bx + a = 0", "C. ax² - bx + c = 0", "D. ax² + bx - c = 0"},
                {"A. Multiplying rows by columns", "B. Interchanging rows and columns", "C. Multiplying all entries by -1", "D. Reversing the order of entries"},
                {"A. n/2 [2a₁ + (n-1)d]", "B. n/2 [a₁ + aₙ]", "C. Both A and B", "D. n(a₁ + aₙ)/2"},
                {"A. n!/(n-r)!", "B. n!/(n-r)!r!", "C. n!/r!", "D. (n-r)!/n!"},
                {"A. n!/(n-r)!", "B. n!/(n-r)!r!", "C. n!/r!", "D. (n-r)!/n!"},
                {"A. (x + a)ⁿ = Σⁿᵣ₌₀ ⁿCᵣ xⁿ⁻ʳ aʳ", "B. (x + a)ⁿ = Σⁿᵣ₌₀ ⁿCᵣ xʳ aⁿ⁻ʳ", "C. Both A and B", "D. (x + a)ⁿ = Σⁿᵣ₌₀ n!/(n-r)! xⁿ⁻ʳ aʳ"},
                {"A. p(0) = 0", "B. p(a) = 0", "C. p(-a) = 0", "D. p(1) = 0"},
                {"A. sin θ", "B. cos θ", "C. tan θ", "D. sec θ"},
                {"A. -sin x", "B. cos x", "C. -cos x", "D. tan x"},
                {"A. f(x)", "B. f'(x)", "C. ∫f(x) dx", "D. f''(x)"},
                {"A. r > 1", "B. r < 1", "C. |r| < 1", "D. |r| > 1"},
                {"A. Linear equations", "B. Quadratic equations", "C. Polynomial equations", "D. Exponential equations"},
                {"A. -b/a", "B. b/a", "C. -c/a", "D. c/a"},
                {"A. (n/2 + 1)th term", "B. (n/2)th term", "C. (n + 1)/2 th term", "D. n/2"},
                {"A. Three linear factors", "B. One linear and one quadratic factor", "C. Two linear and one quadratic factor", "D. Three quadratic factors"},
                {"A. 1 + ω + ω² = 0", "B. 1 + ω - ω² = 0", "C. 1 - ω + ω² = 0", "D. 1 + ω + ω² = 1"},
                {"A. Degree of P < Degree of Q", "B. Degree of P = Degree of Q", "C. Degree of P > Degree of Q", "D. P(x) = 0"}
        };

        int correctAnswers[] = {
                1,  // Q1: √-1
                1,  // Q2: √(a² + b²)
                3,  // Q3: c/a
                0,  // Q4: cx² + bx + a = 0
                1,  // Q5: Interchanging rows and columns
                2,  // Q6: Both A and B
                0,  // Q7: n!/(n-r)!
                1,  // Q8: n!/(n-r)!r!
                2,  // Q9: Both A and B
                1,  // Q10: p(a) = 0
                1,  // Q11: cos θ
                1,  // Q12: cos x
                1,  // Q13: f'(x)
                2,  // Q14: |r| < 1
                0,  // Q15: Linear equations
                0,  // Q16: -b/a
                0,  // Q17: (n/2 + 1)th term
                1,  // Q18: One linear and one quadratic factor
                0,  // Q19: 1 + ω + ω² = 0
                2   // Q20: Degree of P > Degree of Q
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 260), (i * 60 + 130), 260, 30);
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
            
            // Check each question
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
                if (percentage >= 80) {
                    grade = "Excellent!";
                } else if (percentage >= 60) {
                    grade = "Good!";
                } else if (percentage >= 40) {
                    grade = "Fair";
                } else {
                    grade = "Needs Improvement";
                }
                
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