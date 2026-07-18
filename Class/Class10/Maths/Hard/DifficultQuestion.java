package Class.Class10.Maths.Hard;

import Class.Class10.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: The number of elements in the power set of A = {a, b, c} is:",
                "Question 2: If A = {1, 2, 3, 4} and B = {3, 4, 5, 6}, then A Δ B is:",
                "Question 3: The solution set of x² - 5x + 6 = 0 is:",
                "Question 4: If the roots of ax² + bx + c = 0 are real and equal, then:",
                "Question 5: The discriminant of 2x² - 3x + 1 = 0 is:",
                "Question 6: The sum of the first n natural numbers is:",
                "Question 7: The sum of the first n odd natural numbers is:",
                "Question 8: The nth term of an arithmetic progression with first term a and common difference d is:",
                "Question 9: If a, b, c are in arithmetic progression, then:",
                "Question 10: The value of sin²θ + cos²θ is:",
                "Question 11: The value of 1 + tan²θ is:",
                "Question 12: The value of sin(90° - θ) is:",
                "Question 13: The distance of the point (3, 4) from the origin is:",
                "Question 14: The area of a triangle with vertices (0,0), (4,0), (0,3) is:",
                "Question 15: The slope of the line 2x + 3y = 6 is:",
                "Question 16: The equation of a line passing through (1,2) with slope 3 is:",
                "Question 17: The area of a sector of a circle with radius r and angle θ (in radians) is:",
                "Question 18: The length of an arc of a circle with radius r and angle θ (in radians) is:",
                "Question 19: If the mean of 2, 4, 6, 8, x is 6, then x is:",
                "Question 20: The median of 2, 4, 6, 8, 10, 12 is:"
        };

        String options[][] = {
                {"A. 4", "B. 6", "C. 8", "D. 12"},
                {"A. {1, 2, 5, 6}", "B. {3, 4}", "C. {1, 2, 3, 4}", "D. {5, 6}"},
                {"A. {2, 3}", "B. {1, 6}", "C. {2, 4}", "D. {3, 5}"},
                {"A. b² - 4ac = 0", "B. b² - 4ac > 0", "C. b² - 4ac < 0", "D. b² = 4ac"},
                {"A. 1", "B. -1", "C. 7", "D. -7"},
                {"A. n(n+1)/2", "B. n(n-1)/2", "C. n²", "D. n(n+1)"},
                {"A. n²", "B. n(n+1)/2", "C. n(n-1)/2", "D. 2n"},
                {"A. a + (n-1)d", "B. a + nd", "C. a - nd", "D. a + (n+1)d"},
                {"A. b = (a+c)/2", "B. b = a+c", "C. b = (a-c)/2", "D. b = 2ac"},
                {"A. 0", "B. 1", "C. -1", "D. 2"},
                {"A. sin²θ", "B. cos²θ", "C. sec²θ", "D. cosec²θ"},
                {"A. sin θ", "B. cos θ", "C. tan θ", "D. cot θ"},
                {"A. 3", "B. 4", "C. 5", "D. 7"},
                {"A. 3", "B. 6", "C. 9", "D. 12"},
                {"A. -2/3", "B. 2/3", "C. -3/2", "D. 3/2"},
                {"A. y = 3x - 1", "B. y = 3x + 1", "C. y = 3x - 3", "D. y = 3x + 3"},
                {"A. ½ r²θ", "B. r²θ", "C. 2r²θ", "D. r²θ/2"},
                {"A. rθ", "B. r²θ", "C. 2rθ", "D. rθ/2"},
                {"A. 10", "B. 8", "C. 12", "D. 6"},
                {"A. 6", "B. 7", "C. 8", "D. 9"}
        };

        int correctAnswers[] = {
                2,  // Q1: 8 (Power set has 2³ = 8 elements)
                0,  // Q2: {1, 2, 5, 6} (Symmetric difference)
                0,  // Q3: {2, 3}
                0,  // Q4: b² - 4ac = 0
                0,  // Q5: 1 (D = 9 - 8 = 1)
                0,  // Q6: n(n+1)/2
                0,  // Q7: n²
                0,  // Q8: a + (n-1)d
                0,  // Q9: b = (a+c)/2
                1,  // Q10: 1
                2,  // Q11: sec²θ
                1,  // Q12: cos θ
                2,  // Q13: 5 (√(9+16) = 5)
                1,  // Q14: 6 (Area = ½ × 4 × 3 = 6)
                0,  // Q15: -2/3 (2x + 3y = 6 → y = -2/3x + 2)
                0,  // Q16: y = 3x - 1 (y - 2 = 3(x - 1) → y = 3x - 1)
                0,  // Q17: ½ r²θ
                0,  // Q18: rθ
                0,  // Q19: 10 (Sum = 2+4+6+8+x = 20+x, mean = (20+x)/5 = 6 → x = 10)
                1   // Q20: 7 (Median of even number of terms = average of middle two = (6+8)/2 = 7)
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