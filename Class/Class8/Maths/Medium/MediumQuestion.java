package Class.Class8.Maths.Medium;

import Class.Class8.Maths.MathDashboard.MathsDashboard;
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
                "Question 1: The property that allows you to change the order of numbers in addition is called:",
                "Question 2: The property that allows you to group numbers differently in addition is called:",
                "Question 3: The square root of 144 is:",
                "Question 4: The cube root of 125 is:",
                "Question 5: A number whose square is 169 is:",
                "Question 6: A parallelogram with all sides equal and opposite angles equal is called a:",
                "Question 7: The solution of the equation x + 7 = 12 is:",
                "Question 8: The solution of the equation 2x = 16 is:",
                "Question 9: If a = 3 and b = 4, the value of a² + b² is:",
                "Question 10: The perimeter of a rectangle with length 8 cm and breadth 5 cm is:",
                "Question 11: The area of a triangle with base 10 cm and height 6 cm is:",
                "Question 12: The simple interest on Rs. 1000 at 5% per annum for 2 years is:",
                "Question 13: The sum of two consecutive natural numbers is 21. The numbers are:",
                "Question 14: The value of (2³)² is:",
                "Question 15: The number 0.75 as a percentage is:",
                "Question 16: The diagonal of a square with side 5 cm divides it into:",
                "Question 17: If x/3 = 5, then x is equal to:",
                "Question 18: A quadrilateral with one pair of opposite sides parallel is called:",
                "Question 19: The value of (-2)³ is:",
                "Question 20: The common factor of 12 and 18 is:"
        };

        String options[][] = {
                { "A. Commutative property", "B. Associative property", "C. Distributive property",
                        "D. Identity property" },
                { "A. Commutative property", "B. Associative property", "C. Distributive property",
                        "D. Identity property" },
                { "A. 10", "B. 11", "C. 12", "D. 13" },
                { "A. 3", "B. 4", "C. 5", "D. 6" },
                { "A. 11", "B. 12", "C. 13", "D. 14" },
                { "A. Rectangle", "B. Rhombus", "C. Square", "D. Trapezium" },
                { "A. 3", "B. 4", "C. 5", "D. 6" },
                { "A. 4", "B. 6", "C. 8", "D. 10" },
                { "A. 12", "B. 16", "C. 20", "D. 25" },
                { "A. 13 cm", "B. 20 cm", "C. 26 cm", "D. 40 cm" },
                { "A. 20 cm²", "B. 30 cm²", "C. 40 cm²", "D. 60 cm²" },
                { "A. Rs. 50", "B. Rs. 100", "C. Rs. 150", "D. Rs. 200" },
                { "A. 10 and 11", "B. 9 and 12", "C. 8 and 13", "D. 7 and 14" },
                { "A. 32", "B. 64", "C. 128", "D. 256" },
                { "A. 25%", "B. 50%", "C. 75%", "D. 100%" },
                { "A. Two rectangles", "B. Two triangles", "C. Four triangles", "D. Two squares" },
                { "A. 5", "B. 10", "C. 15", "D. 20" },
                { "A. Parallelogram", "B. Rhombus", "C. Trapezium", "D. Kite" },
                { "A. 8", "B. -8", "C. 6", "D. -6" },
                { "A. 2", "B. 4", "C. 6", "D. 9" }
        };

        int correctAnswers[] = {
                0, // Q1: Commutative property
                1, // Q2: Associative property
                2, // Q3: 12
                2, // Q4: 5
                2, // Q5: 13
                1, // Q6: Rhombus
                2, // Q7: 5
                2, // Q8: 8
                3, // Q9: 25
                2, // Q10: 26 cm
                1, // Q11: 30 cm²
                1, // Q12: Rs. 100
                0, // Q13: 10 and 11
                1, // Q14: 64
                2, // Q15: 75%
                1, // Q16: Two triangles
                2, // Q17: 15
                2, // Q18: Trapezium
                1, // Q19: -8
                0 // Q20: 2
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
                        totalQuestions, score, totalQuestions - score, percentage, grade);

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