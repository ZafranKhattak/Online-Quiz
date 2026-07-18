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

        int correctAnswers[] = {
                1,  // Q1: Irrational number
                2,  // Q2: Non-terminating non-recurring
                2,  // Q3: Real numbers
                0,  // Q4: {1, 2}
                3,  // Q5: 4
                0,  // Q6: 0
                1,  // Q7: y = mx
                2,  // Q8: 5
                2,  // Q9: aʸ
                2,  // Q10: 4
                2,  // Q11: 3 (Note: log₅125 = 3 since 5³ = 125)
                0,  // Q12: 3 and 4
                1,  // Q13: Real and equal
                2,  // Q14: Parallel to y-axis
                0,  // Q15: 2
                0,  // Q16: (2x + 1)(x + 3)
                0,  // Q17: 0
                1,  // Q18: 1/2
                2,  // Q19: 1
                2   // Q20: 7
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