package Class.Class8.Maths.Easy;

import Class.Class8.Maths.MathDashboard.MathsDashboard;
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
                "Question 1: The additive identity of rational numbers is:",
                "Question 2: The multiplicative identity of rational numbers is:",
                "Question 3: The sum of two rational numbers is always:",
                "Question 4: A quadrilateral with four equal sides and four right angles is called a:",
                "Question 5: The sum of all angles in a triangle is:",
                "Question 6: The sum of all angles in a quadrilateral is:",
                "Question 7: The square of 5 is:",
                "Question 8: The cube of 3 is:",
                "Question 9: The square root of 81 is:",
                "Question 10: The cube root of 64 is:",
                "Question 11: 10% of 200 is:",
                "Question 12: The area of a square with side 5 cm is:",
                "Question 13: The perimeter of a square with side 6 cm is:",
                "Question 14: A number that can be written in the form p/q where q ≠ 0 is called a:",
                "Question 15: In the expression 3x + 5, the coefficient of x is:",
                "Question 16: A triangle with all three sides equal is called:",
                "Question 17: The formula for the area of a rectangle is:",
                "Question 18: 0.25 as a fraction in simplest form is:",
                "Question 19: The value of 2³ is:",
                "Question 20: A line segment has how many endpoints?"
        };

        String options[][] = {
                {"A. 0", "B. 1", "C. -1", "D. 10"},
                {"A. 0", "B. 1", "C. -1", "D. 2"},
                {"A. A rational number", "B. An irrational number", "C. A natural number", "D. A whole number"},
                {"A. Rectangle", "B. Rhombus", "C. Square", "D. Parallelogram"},
                {"A. 90°", "B. 180°", "C. 270°", "D. 360°"},
                {"A. 90°", "B. 180°", "C. 270°", "D. 360°"},
                {"A. 10", "B. 15", "C. 20", "D. 25"},
                {"A. 9", "B. 18", "C. 27", "D. 36"},
                {"A. 7", "B. 8", "C. 9", "D. 10"},
                {"A. 2", "B. 3", "C. 4", "D. 5"},
                {"A. 10", "B. 20", "C. 30", "D. 40"},
                {"A. 10 cm²", "B. 15 cm²", "C. 20 cm²", "D. 25 cm²"},
                {"A. 12 cm", "B. 18 cm", "C. 24 cm", "D. 30 cm"},
                {"A. Natural number", "B. Whole number", "C. Integer", "D. Rational number"},
                {"A. 3", "B. 5", "C. 8", "D. x"},
                {"A. Isosceles triangle", "B. Scalene triangle", "C. Equilateral triangle", "D. Right triangle"},
                {"A. Length × Breadth", "B. 2(Length + Breadth)", "C. Length × Length", "D. Breadth × Breadth"},
                {"A. 1/2", "B. 1/4", "C. 1/5", "D. 1/8"},
                {"A. 4", "B. 6", "C. 8", "D. 10"},
                {"A. 0", "B. 1", "C. 2", "D. 3"}
        };

        int correctAnswers[] = {
                0,  // Q1: 0
                1,  // Q2: 1
                0,  // Q3: A rational number
                2,  // Q4: Square
                1,  // Q5: 180°
                3,  // Q6: 360°
                3,  // Q7: 25
                2,  // Q8: 27
                2,  // Q9: 9
                2,  // Q10: 4
                1,  // Q11: 20
                3,  // Q12: 25 cm²
                2,  // Q13: 24 cm
                3,  // Q14: Rational number
                0,  // Q15: 3
                2,  // Q16: Equilateral triangle
                0,  // Q17: Length × Breadth
                1,  // Q18: 1/4
                2,  // Q19: 8
                2   // Q20: 2
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
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