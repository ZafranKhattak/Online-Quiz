package Class.Class8.English.Medium;

import Class.Class8.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The first unit of the Class 8 English textbook is about the tolerance of which personality?",
                "Question 2: What is the theme of Unit 3, which includes the poem \"The Twins\"?",
                "Question 3: Which unit discusses a person's perspective on sight and its importance?",
                "Question 4: What is the theme of Unit 8, \"Settling the Quarrel\"?",
                "Question 5: Which of the following is a theme from the Class 8 English textbook?",
                "Question 6: The theme of Unit 1, \"Tolerance of the Rasoolullah (ﷺ)\", is:",
                "Question 7: Which unit deals with \"Noise in the Environment\"?",
                "Question 8: The theme of Unit 5, covering Hazrat Umar (RA), is:",
                "Question 9: Which unit promotes \"Participatory Citizenship\"?",
                "Question 10: The poem \"Daffodils\" has which theme?",
                "Question 11: Which unit discusses \"Drug Addiction\"?",
                "Question 12: The theme of Unit 7, \"The Earth Speaks\", is:",
                "Question 13: Which unit is about \"All is not Lost\"?",
                "Question 14: What is the theme of Unit 4, \"Let's Make our Roads Safer!\"?",
                "Question 15: The poem \"The Twins\" is included in which unit?",
                "Question 16: The skill of listening, speaking, reading, and writing together are known as:",
                "Question 17: Which theme is associated with Unit 2, \"A Great Virtue\"?",
                "Question 18: What is the theme of Unit 6, \"Sports and Sportsmanship\"?",
                "Question 19: A group of words that expresses a complete thought is called a:",
                "Question 20: The poet of \"The Earth Speaks\" is:"
        };

        String options[][] = {
                { "A. Hazrat Umar (RA)", "B. The Quaid", "C. The Rasoolullah (ﷺ)", "D. Hazrat Asma (RA)" },
                { "A. Ethics and Values", "B. Personality Development", "C. Peaceful co-existence",
                        "D. Participatory Citizenship" },
                { "A. \"All is not Lost\"", "B. \"Drug Addiction\"", "C. \"Three Days to See\"",
                        "D. \"The Quaid's Vision and Pakistan\"" },
                { "A. Participatory Citizenship", "B. Avoiding Social Evils", "C. Environmental Education",
                        "D. Peaceful co-existence" },
                { "A. Space Exploration", "B. Participatory Citizenship", "C. Artificial Intelligence", "D. Robotics" },
                { "A. Ethics and Values", "B. Role Models", "C. Peaceful co-existence", "D. Personality Development" },
                { "A. Unit 9", "B. Unit 10", "C. Unit 11", "D. Unit 12" },
                { "A. Adventure", "B. Sports", "C. Role Models", "D. Dignity of Labour" },
                { "A. Unit 3: The Twins", "B. Unit 4: Let's Make our Roads Safer!",
                        "C. Unit 6: Sports and Sportsmanship", "D. Unit 8: Settling the Quarrel" },
                { "A. Adventure", "B. Environmental Education", "C. Personality Development", "D. Sports" },
                { "A. Unit 9", "B. Unit 10", "C. Unit 11", "D. Unit 12" },
                { "A. Environmental Education", "B. Adventure", "C. Sports", "D. Role Models" },
                { "A. Unit 8", "B. Unit 9", "C. Unit 10", "D. Unit 11" },
                { "A. Participatory Citizenship", "B. Ethics and Values", "C. Peaceful co-existence",
                        "D. Avoiding Social Evils" },
                { "A. Unit 1", "B. Unit 2", "C. Unit 3", "D. Unit 4" },
                { "A. Language skills", "B. Thinking skills", "C. Analytical skills", "D. Creative skills" },
                { "A. Sports", "B. Adventure", "C. Peaceful co-existence", "D. Environmental Education" },
                { "A. Adventure", "B. Role Models", "C. Sports", "D. Ethics and Values" },
                { "A. Phrase", "B. Clause", "C. Sentence", "D. Paragraph" },
                { "A. Lenore Hetrick", "B. Henry S. Leigh", "C. William Wordsworth", "D. Robert Frost" }
        };

        int correctAnswers[] = {
                2, // Q1: The Rasoolullah (ﷺ)
                0, // Q2: Ethics and Values
                2, // Q3: "Three Days to See"
                0, // Q4: Participatory Citizenship
                1, // Q5: Participatory Citizenship
                0, // Q6: Ethics and Values
                2, // Q7: Unit 11
                2, // Q8: Role Models
                3, // Q9: Unit 8: Settling the Quarrel
                1, // Q10: Environmental Education
                0, // Q11: Unit 9
                0, // Q12: Environmental Education
                1, // Q13: Unit 9
                0, // Q14: Participatory Citizenship
                2, // Q15: Unit 3
                0, // Q16: Language skills
                2, // Q17: Peaceful co-existence
                2, // Q18: Sports
                2, // Q19: Sentence
                0 // Q20: Lenore Hetrick
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
            new EnglishDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}