package Class.Class10.Maths.Medium;

import Class.Class10.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: The set of rational numbers is denoted by:",
                "Question 2: The set of real numbers is denoted by:",
                "Question 3: If A = {1, 2, 3} and B = {2, 3, 4}, then A ∩ B is:",
                "Question 4: The solution of the equation 2x + 5 = 13 is:",
                "Question 5: The solution of the equation 3x - 7 = 14 is:",
                "Question 6: The roots of x² - 7x + 12 = 0 are:",
                "Question 7: The roots of x² + 5x + 6 = 0 are:",
                "Question 8: The value of sin 30° is:",
                "Question 9: The value of cos 60° is:",
                "Question 10: The value of tan 30° is:",
                "Question 11: The distance between the points (2, 3) and (5, 7) is:",
                "Question 12: The midpoint of the points (1, 2) and (5, 6) is:",
                "Question 13: The slope of the line passing through (1, 2) and (3, 6) is:",
                "Question 14: The equation of a line with slope 2 and y-intercept 3 is:",
                "Question 15: The area of a circle with radius 7 cm is:",
                "Question 16: The circumference of a circle with radius 7 cm is:",
                "Question 17: The sum of the first 10 natural numbers is:",
                "Question 18: The mean of 2, 4, 6, 8, 10 is:",
                "Question 19: The median of 3, 5, 7, 9, 11 is:",
                "Question 20: The mode of 2, 3, 2, 4, 5, 2, 6 is:"
        };

        String options[][] = {
                {"A. N", "B. W", "C. Z", "D. Q"},
                {"A. Q", "B. R", "C. Z", "D. N"},
                {"A. {1, 2, 3, 4}", "B. {2, 3}", "C. {1, 4}", "D. {1, 2, 3}"},
                {"A. 2", "B. 3", "C. 4", "D. 5"},
                {"A. 5", "B. 6", "C. 7", "D. 8"},
                {"A. 3 and 4", "B. 2 and 6", "C. 1 and 12", "D. 3 and 3"},
                {"A. -2 and -3", "B. 2 and 3", "C. -2 and 3", "D. 2 and -3"},
                {"A. 0", "B. 1/2", "C. 1/√2", "D. √3/2"},
                {"A. 0", "B. 1/2", "C. 1/√2", "D. √3/2"},
                {"A. 1/√3", "B. 1/2", "C. √3", "D. 1"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. (2, 4)", "B. (3, 4)", "C. (3, 5)", "D. (6, 8)"},
                {"A. 2", "B. 3", "C. 4", "D. 1"},
                {"A. y = 2x + 3", "B. y = 3x + 2", "C. y = 2x - 3", "D. y = x + 3"},
                {"A. 44 cm²", "B. 154 cm²", "C. 88 cm²", "D. 77 cm²"},
                {"A. 22 cm", "B. 44 cm", "C. 66 cm", "D. 88 cm"},
                {"A. 45", "B. 50", "C. 55", "D. 60"},
                {"A. 4", "B. 5", "C. 6", "D. 7"},
                {"A. 5", "B. 7", "C. 9", "D. 11"},
                {"A. 2", "B. 3", "C. 4", "D. 5"}
        };

        int correctAnswers[] = {
                3,  // Q1: Q (Rational numbers)
                1,  // Q2: R (Real numbers)
                1,  // Q3: {2, 3}
                2,  // Q4: 4 (2x = 8 → x = 4)
                2,  // Q5: 7 (3x = 21 → x = 7)
                0,  // Q6: 3 and 4
                1,  // Q7: 2 and 3
                1,  // Q8: 1/2
                1,  // Q9: 1/2
                0,  // Q10: 1/√3
                2,  // Q11: 5
                1,  // Q12: (3, 4) ((1+5)/2 = 3, (2+6)/2 = 4)
                0,  // Q13: 2 ((6-2)/(3-1) = 4/2 = 2)
                0,  // Q14: y = 2x + 3
                1,  // Q15: 154 cm² (π × 7² = 154)
                1,  // Q16: 44 cm (2π × 7 = 44)
                2,  // Q17: 55 (10×11/2 = 55)
                2,  // Q18: 6 (30/5 = 6)
                1,  // Q19: 7
                0   // Q20: 2
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