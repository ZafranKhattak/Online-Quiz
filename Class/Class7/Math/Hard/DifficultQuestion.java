package Class.Class7.Math.Hard;

import Class.Class7.Math.MathsDashboard.MathsDashboard;
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
                "Question 1: The value of (-1) × (-2) × (-3) × (-4) × (-5) is:",
                "Question 2: The sum of the interior angles of a quadrilateral is:",
                "Question 3: The value of x in 3x/4 - 2 = 7 is:",
                "Question 4: The area of a triangle with sides 5 cm, 12 cm, and 13 cm is:",
                "Question 5: If a:b = 2:3 and b:c = 4:5, then a:c is:",
                "Question 6: The simple interest on Rs. 800 at 6% per annum for 3 years is:",
                "Question 7: If 5x + 3 = 2x + 15, then the value of x is:",
                "Question 8: The area of a circle with circumference 88 cm is:",
                "Question 9: The value of (3/4) ÷ (5/8) is:",
                "Question 10: The median of 10, 20, 30, 40, 50, 60, 70 is:",
                "Question 11: The value of (-2)³ × (-3)² is:",
                "Question 12: The area of a trapezium with parallel sides 10 cm and 14 cm and height 8 cm is:",
                "Question 13: The value of x in 7x - 3 = 4x + 12 is:",
                "Question 14: A shopkeeper bought an item for Rs. 500 and sold it for Rs. 600. The profit percentage is:",
                "Question 15: If 3/5 of a number is 15, the number is:",
                "Question 16: The sum of the exterior angles of any polygon is:",
                "Question 17: The value of (5a - 3b) when a = 2 and b = 1 is:",
                "Question 18: The square root of 196 is:",
                "Question 19: The value of (7/8) - (3/4) + (1/2) is:",
                "Question 20: The product of two consecutive integers is 12. The integers are:"
        };

        String options[][] = {
                {"A. 120", "B. -120", "C. 60", "D. -60"},
                {"A. 180°", "B. 360°", "C. 540°", "D. 720°"},
                {"A. 8", "B. 10", "C. 12", "D. 14"},
                {"A. 30 cm²", "B. 60 cm²", "C. 120 cm²", "D. 24 cm²"},
                {"A. 8:15", "B. 2:5", "C. 4:15", "D. 8:5"},
                {"A. Rs. 144", "B. Rs. 120", "C. Rs. 160", "D. Rs. 100"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. 616 cm²", "B. 154 cm²", "C. 308 cm²", "D. 77 cm²"},
                {"A. 6/5", "B. 5/6", "C. 15/32", "D. 12/20"},
                {"A. 30", "B. 40", "C. 50", "D. 60"},
                {"A. 72", "B. -72", "C. 36", "D. -36"},
                {"A. 96 cm²", "B. 48 cm²", "C. 192 cm²", "D. 24 cm²"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. 10%", "B. 15%", "C. 20%", "D. 25%"},
                {"A. 9", "B. 15", "C. 25", "D. 45"},
                {"A. 180°", "B. 360°", "C. 540°", "D. 720°"},
                {"A. 7", "B. 8", "C. 10", "D. 12"},
                {"A. 12", "B. 13", "C. 14", "D. 15"},
                {"A. 5/8", "B. 7/8", "C. 3/8", "D. 1/8"},
                {"A. 2 and 6", "B. 3 and 4", "C. 4 and 3", "D. 2 and 6"}
        };

        int correctAnswers[] = {
                1,  // Q1: -120
                1,  // Q2: 360°
                2,  // Q3: 12
                0,  // Q4: 30 cm²
                0,  // Q5: 8:15
                0,  // Q6: Rs. 144
                1,  // Q7: 4
                0,  // Q8: 616 cm²
                0,  // Q9: 6/5
                1,  // Q10: 40
                1,  // Q11: -72
                0,  // Q12: 96 cm²
                2,  // Q13: 5
                2,  // Q14: 20%
                2,  // Q15: 25
                1,  // Q16: 360°
                0,  // Q17: 7
                2,  // Q18: 14
                0,  // Q19: 5/8
                1   // Q20: 3 and 4
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