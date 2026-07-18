package Class.Class8.Maths.Hard;

import Class.Class8.Maths.MathDashboard.MathsDashboard;
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
                "Question 1: The rational number that is neither positive nor negative is:",
                "Question 2: The reciprocal of -3/5 is:",
                "Question 3: The product of two rational numbers is 1 if they are:",
                "Question 4: The solution of the equation 3x + 5 = 20 is:",
                "Question 5: The solution of the equation x/4 - 2 = 3 is:",
                "Question 6: A polygon with 8 sides is called an:",
                "Question 7: The number of diagonals in a quadrilateral is:",
                "Question 8: If x varies directly as y and x = 10 when y = 5, the value of x when y = 8 is:",
                "Question 9: The compound interest on Rs. 2000 at 10% per annum for 2 years is:",
                "Question 10: The factorization of x² - 9 is:",
                "Question 11: The factorization of x² + 5x + 6 is:",
                "Question 12: The area of a trapezium with parallel sides 10 cm and 6 cm and height 5 cm is:",
                "Question 13: The surface area of a cube with side 4 cm is:",
                "Question 14: The volume of a cube with side 3 cm is:",
                "Question 15: If two quantities are in inverse proportion, then their product is always:",
                "Question 16: The square root of a number that is not a perfect square is:",
                "Question 17: The value of (a + b)² is:",
                "Question 18: The value of (a - b)² is:",
                "Question 19: If the volume of a cube is 216 cm³, the length of its edge is:",
                "Question 20: The median of the data 3, 7, 9, 12, 15 is:"
        };

        String options[][] = {
                {"A. 0", "B. 1", "C. -1", "D. 1/2"},
                {"A. -3/5", "B. 3/5", "C. -5/3", "D. 5/3"},
                {"A. Equal", "B. Reciprocals", "C. Opposite", "D. Identical"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. 10", "B. 15", "C. 20", "D. 25"},
                {"A. Hexagon", "B. Heptagon", "C. Octagon", "D. Nonagon"},
                {"A. 1", "B. 2", "C. 3", "D. 4"},
                {"A. 12", "B. 14", "C. 16", "D. 18"},
                {"A. Rs. 400", "B. Rs. 420", "C. Rs. 440", "D. Rs. 460"},
                {"A. (x - 3)(x - 3)", "B. (x + 3)(x + 3)", "C. (x - 3)(x + 3)", "D. (x - 9)(x + 1)"},
                {"A. (x + 2)(x + 3)", "B. (x + 2)(x + 4)", "C. (x + 3)(x + 3)", "D. (x + 1)(x + 6)"},
                {"A. 30 cm²", "B. 40 cm²", "C. 50 cm²", "D. 60 cm²"},
                {"A. 64 cm²", "B. 72 cm²", "C. 80 cm²", "D. 96 cm²"},
                {"A. 9 cm³", "B. 18 cm³", "C. 27 cm³", "D. 36 cm³"},
                {"A. Zero", "B. One", "C. Constant", "D. Variable"},
                {"A. A rational number", "B. An irrational number", "C. A natural number", "D. A whole number"},
                {"A. a² + b²", "B. a² + 2ab + b²", "C. a² - 2ab + b²", "D. a² + 2a + b²"},
                {"A. a² + b²", "B. a² + 2ab + b²", "C. a² - 2ab + b²", "D. a² - 2a + b²"},
                {"A. 4 cm", "B. 5 cm", "C. 6 cm", "D. 7 cm"},
                {"A. 7", "B. 9", "C. 10", "D. 12"}
        };

        int correctAnswers[] = {
                0,  // Q1: 0
                2,  // Q2: -5/3
                1,  // Q3: Reciprocals
                2,  // Q4: 5
                2,  // Q5: 20
                2,  // Q6: Octagon
                1,  // Q7: 2
                2,  // Q8: 16
                1,  // Q9: Rs. 420
                2,  // Q10: (x - 3)(x + 3)
                0,  // Q11: (x + 2)(x + 3)
                1,  // Q12: 40 cm²
                3,  // Q13: 96 cm²
                2,  // Q14: 27 cm³
                2,  // Q15: Constant
                1,  // Q16: An irrational number
                1,  // Q17: a² + 2ab + b²
                2,  // Q18: a² - 2ab + b²
                2,  // Q19: 6 cm
                1   // Q20: 9
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