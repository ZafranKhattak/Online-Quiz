package Class.Class11.Maths.Hard;

import Class.Class11.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: The cube roots of unity are:",
                "Question 2: De Morgan's laws for sets state that:",
                "Question 3: The number of elements in the power set of A = {a, b, c} is:",
                "Question 4: The roots of the equation x² + 2x + 5 = 0 are:",
                "Question 5: If the discriminant of a quadratic equation is negative, the roots are:",
                "Question 6: The rank of a matrix is:",
                "Question 7: A group (G, *) is called abelian if:",
                "Question 8: The formula for the sum of squares of the first n natural numbers is:",
                "Question 9: The number of ways in which a group of 3 students can be selected from 10 students is:",
                "Question 10: If a function is defined from the set of integers to the set of integers by f(x) = 2x, then f is:",
                "Question 11: A relation R on a set A is called an equivalence relation if it is:",
                "Question 12: The truth set of a statement P(x) is:",
                "Question 13: The value of sin 15° using trigonometric identities is:",
                "Question 14: The derivative of eˣ with respect to x is:",
                "Question 15: A vector in three-dimensional space is denoted as:",
                "Question 16: The dot product of two vectors a and b is zero when they are:",
                "Question 17: A binary operation * on a set G is associative if:",
                "Question 18: In a group, the identity element is:",
                "Question 19: The limit of (sin x)/x as x approaches 0 is:",
                "Question 20: The derivative of tan x with respect to x is:"
        };

        String options[][] = {
                {"A. 1, ω, ω²", "B. 1, -1, i", "C. 1, i, -i", "D. 1, -1, 0"},
                {"A. (A ∪ B)' = A' ∩ B'", "B. (A ∪ B)' = A' ∪ B'", "C. (A ∩ B)' = A' ∪ B'", "D. Both A and C"},
                {"A. 4", "B. 8", "C. 6", "D. 16"},
                {"A. Real and equal", "B. Real and distinct", "C. Complex conjugates", "D. Rational and distinct"},
                {"A. Real and distinct", "B. Real and equal", "C. Complex conjugates", "D. Rational and distinct"},
                {"A. The number of non-zero rows", "B. The order of the largest non-singular submatrix", "C. The determinant of the matrix", "D. The sum of all entries"},
                {"A. The operation * is associative", "B. The operation * is commutative", "C. Every element has an inverse", "D. The identity element exists"},
                {"A. n(n+1)(2n+1)/6", "B. [n(n+1)/2]²", "C. n(n+1)/2", "D. n²(n+1)²/4"},
                {"A. 120", "B. 720", "C. 240", "D. 100"},
                {"A. One-to-one but not onto", "B. Onto but not one-to-one", "C. Both one-to-one and onto", "D. Neither one-to-one nor onto"},
                {"A. Reflexive and symmetric", "B. Symmetric and transitive", "C. Reflexive, symmetric and transitive", "D. Reflexive only"},
                {"A. The set of all values for which P(x) is false", "B. The set of all values for which P(x) is true", "C. The complement of the universal set", "D. The empty set"},
                {"A. (√3 - 1)/2√2", "B. (√3 + 1)/2√2", "C. (√6 - √2)/4", "D. (√6 + √2)/4"},
                {"A. eˣ", "B. x eˣ⁻¹", "C. ln x · eˣ", "D. 1/eˣ"},
                {"A. a = (x, y)", "B. a = (x, y, z)", "C. a = (x, y, z, w)", "D. a = (r, θ)"},
                {"A. Parallel", "B. Perpendicular", "C. Collinear", "D. Equal"},
                {"A. a * b = b * a", "B. a * (b * c) = (a * b) * c", "C. a * e = a", "D. a * a⁻¹ = e"},
                {"A. Always 1", "B. Always 0", "C. Unique", "D. Not unique"},
                {"A. 0", "B. 1", "C. ∞", "D. Does not exist"},
                {"A. sec² x", "B. -sec² x", "C. sin x", "D. cos x"}
        };

        int correctAnswers[] = {
                0,  // Q1: 1, ω, ω²
                3,  // Q2: Both A and C
                1,  // Q3: 8
                2,  // Q4: Complex conjugates
                2,  // Q5: Complex conjugates
                1,  // Q6: The order of the largest non-singular submatrix
                1,  // Q7: The operation * is commutative
                0,  // Q8: n(n+1)(2n+1)/6
                0,  // Q9: 120 (¹⁰C₃ = 120)
                2,  // Q10: Both one-to-one and onto
                2,  // Q11: Reflexive, symmetric and transitive
                1,  // Q12: The set of all values for which P(x) is true
                2,  // Q13: (√6 - √2)/4
                0,  // Q14: eˣ
                1,  // Q15: a = (x, y, z)
                1,  // Q16: Perpendicular
                1,  // Q17: a * (b * c) = (a * b) * c
                2,  // Q18: Unique
                1,  // Q19: 1
                0   // Q20: sec² x
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