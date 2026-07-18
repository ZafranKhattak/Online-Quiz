package Class.Class10.Maths.Easy;

import Class.Class10.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: The set of natural numbers is denoted by:",
                "Question 2: The set of integers is denoted by:",
                "Question 3: The union of two sets A and B is denoted by:",
                "Question 4: The intersection of two sets A and B is denoted by:",
                "Question 5: The empty set is denoted by:",
                "Question 6: The quadratic equation ax² + bx + c = 0 has how many roots?",
                "Question 7: The discriminant of the quadratic equation ax² + bx + c = 0 is:",
                "Question 8: If the discriminant is zero, the roots are:",
                "Question 9: The sum of roots of ax² + bx + c = 0 is:",
                "Question 10: The product of roots of ax² + bx + c = 0 is:",
                "Question 11: The value of sin 0° is:",
                "Question 12: The value of cos 0° is:",
                "Question 13: The value of tan 45° is:",
                "Question 14: The value of sin 90° is:",
                "Question 15: The distance formula between two points (x₁, y₁) and (x₂, y₂) is:",
                "Question 16: The midpoint formula between two points (x₁, y₁) and (x₂, y₂) is:",
                "Question 17: The slope of a horizontal line is:",
                "Question 18: The slope of a vertical line is:",
                "Question 19: The equation of a line with slope m and y-intercept c is:",
                "Question 20: The area of a circle with radius r is:"
        };

        String options[][] = {
                {"A. Z", "B. N", "C. W", "D. Q"},
                {"A. N", "B. W", "C. Z", "D. Q"},
                {"A. A ∩ B", "B. A ∪ B", "C. A - B", "D. A'"},
                {"A. A ∪ B", "B. A - B", "C. A ∩ B", "D. A'"},
                {"A. {0}", "B. { }", "C. φ", "D. Both B and C"},
                {"A. 1", "B. 2", "C. 3", "D. 4"},
                {"A. b² + 4ac", "B. b² - 4ac", "C. a² - 4bc", "D. c² - 4ab"},
                {"A. Real and equal", "B. Real and distinct", "C. Imaginary", "D. Complex"},
                {"A. -b/a", "B. b/a", "C. -c/a", "D. c/a"},
                {"A. -b/a", "B. b/a", "C. -c/a", "D. c/a"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. 0", "B. 1/2", "C. 1", "D. √3"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. √[(x₂ - x₁)² + (y₂ - y₁)²]", "B. (x₂ - x₁)² + (y₂ - y₁)²", "C. √[(x₂ - x₁)³ + (y₂ - y₁)³]", "D. (x₂ - x₁) + (y₂ - y₁)"},
                {"A. ((x₁+x₂)/2, (y₁+y₂)/2)", "B. ((x₁-x₂)/2, (y₁-y₂)/2)", "C. (x₁+x₂, y₁+y₂)", "D. (x₁x₂, y₁y₂)"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. 0", "B. 1", "C. -1", "D. Undefined"},
                {"A. y = mx + c", "B. y = mx", "C. x = my + c", "D. y = mx - c"},
                {"A. πr", "B. 2πr", "C. πr²", "D. 2πr²"}
        };

        int correctAnswers[] = {
                1,  // Q1: N
                2,  // Q2: Z
                1,  // Q3: A ∪ B
                2,  // Q4: A ∩ B
                3,  // Q5: Both B and C
                1,  // Q6: 2
                1,  // Q7: b² - 4ac
                0,  // Q8: Real and equal
                0,  // Q9: -b/a
                3,  // Q10: c/a
                0,  // Q11: 0
                1,  // Q12: 1
                2,  // Q13: 1
                1,  // Q14: 1
                0,  // Q15: √[(x₂ - x₁)² + (y₂ - y₁)²]
                0,  // Q16: ((x₁+x₂)/2, (y₁+y₂)/2)
                0,  // Q17: 0
                3,  // Q18: Undefined
                0,  // Q19: y = mx + c
                2   // Q20: πr²
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