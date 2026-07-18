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

        int correctAnswers[] = {
                2,  // Q1: Rational numbers
                1,  // Q2: 1
                1,  // Q3: 49
                2,  // Q4: 64
                1,  // Q5: 11
                2,  // Q6: Universal set
                1,  // Q7: A ∪ B
                1,  // Q8: ax + b = 0
                2,  // Q9: 3
                1,  // Q10: { } (Note: While φ is also used, {} is the correct display. We'll use index 1)
                0,  // Q11: √[(x₂ - x₁)² + (y₂ - y₁)²]
                1,  // Q12: Abscissa
                1,  // Q13: Common logarithm
                1,  // Q14: 1
                1,  // Q15: ax² + bx + c = 0
                2,  // Q16: Rational number
                1,  // Q17: Empty set
                1,  // Q18: 1
                0,  // Q19: 0
                0   // Q20: 0
        };

        // Create radio buttons and store them in a 2D array
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