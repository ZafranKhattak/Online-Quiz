package Class.Class7.Math.Medium;

import Class.Class7.Math.MathsDashboard.MathsDashboard;
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
                "Question 1: The value of (-2) × (-3) × (-4) is:",
                "Question 2: The mode of the data 2, 3, 2, 4, 5, 2, 6 is:",
                "Question 3: The perimeter of a rectangle with length 12 cm and breadth 8 cm is:",
                "Question 4: The value of 2³ × 2² is:",
                "Question 5: The mean of first 5 natural numbers is:",
                "Question 6: The sum of supplementary angles is:",
                "Question 7: The value of x in 2x + 3 = 11 is:",
                "Question 8: The area of a triangle with base 8 cm and height 6 cm is:",
                "Question 9: The product of two integers with opposite signs is:",
                "Question 10: The median of 3, 5, 7, 9, 11 is:",
                "Question 11: The value of 5² - 3² is:",
                "Question 12: The simple interest on Rs. 500 at 5% for 2 years is:",
                "Question 13: The sum of two adjacent angles on a straight line is:",
                "Question 14: The value of x in 3x - 5 = 16 is:",
                "Question 15: The circumference of a circle with diameter 14 cm is:",
                "Question 16: The area of a circle with radius 7 cm is:",
                "Question 17: The value of (3/4) × (8/9) is:",
                "Question 18: The median of 2, 4, 6, 8, 10, 12 is:",
                "Question 19: The area of a parallelogram with base 10 cm and height 6 cm is:",
                "Question 20: The value of (-5) + (-8) is:"
        };

        String options[][] = {
                {"A. 24", "B. -24", "C. 12", "D. -12"},
                {"A. 2", "B. 3", "C. 4", "D. 6"},
                {"A. 20 cm", "B. 40 cm", "C. 96 cm", "D. 32 cm"},
                {"A. 2⁵", "B. 2⁶", "C. 2¹", "D. 2⁰"},
                {"A. 2", "B. 3", "C. 4", "D. 5"},
                {"A. 90°", "B. 180°", "C. 360°", "D. 60°"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. 48 cm²", "B. 24 cm²", "C. 14 cm²", "D. 28 cm²"},
                {"A. Positive", "B. Negative", "C. Zero", "D. One"},
                {"A. 5", "B. 7", "C. 9", "D. 11"},
                {"A. 4", "B. 16", "C. 8", "D. 12"},
                {"A. Rs. 25", "B. Rs. 50", "C. Rs. 75", "D. Rs. 100"},
                {"A. 90°", "B. 180°", "C. 360°", "D. 60°"},
                {"A. 5", "B. 6", "C. 7", "D. 8"},
                {"A. 22 cm", "B. 44 cm", "C. 66 cm", "D. 88 cm"},
                {"A. 154 cm²", "B. 44 cm²", "C. 88 cm²", "D. 308 cm²"},
                {"A. 1/3", "B. 2/3", "C. 3/2", "D. 2"},
                {"A. 6", "B. 7", "C. 8", "D. 9"},
                {"A. 60 cm²", "B. 30 cm²", "C. 16 cm²", "D. 120 cm²"},
                {"A. 13", "B. -13", "C. 3", "D. -3"}
        };

        int correctAnswers[] = {
                1,  // Q1: -24
                0,  // Q2: 2
                1,  // Q3: 40 cm
                0,  // Q4: 2⁵
                1,  // Q5: 3
                1,  // Q6: 180°
                1,  // Q7: 4
                1,  // Q8: 24 cm²
                1,  // Q9: Negative
                1,  // Q10: 7
                1,  // Q11: 16
                1,  // Q12: Rs. 50
                1,  // Q13: 180°
                2,  // Q14: 7
                1,  // Q15: 44 cm
                0,  // Q16: 154 cm²
                1,  // Q17: 2/3
                1,  // Q18: 7
                0,  // Q19: 60 cm²
                1   // Q20: -13
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 220), (i * 60 + 130), 220, 30);
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