package Class.Class8.English.Easy;

import Class.Class8.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: What is the main topic of Unit 1 in the Class 8 English textbook?",
                "Question 2: The theme of Unit 2 is:",
                "Question 3: A word that has the opposite meaning of another word is called:",
                "Question 4: The poem \"The Twins\" is written by:",
                "Question 5: Which unit focuses on road safety?",
                "Question 6: A word that has the same meaning as another word is called:",
                "Question 7: The poem \"The Earth Speaks\" is written by:",
                "Question 8: Which unit deals with the life of Hazrat Umar (RA)?",
                "Question 9: The theme of Unit 6 is:",
                "Question 10: A person who flies an aircraft is called a:",
                "Question 11: The poem \"Daffodils\" is written by:",
                "Question 12: The theme of Unit 10 is:",
                "Question 13: The unit \"Settling the Quarrel\" has which theme?",
                "Question 14: The theme of Unit 9 is:",
                "Question 15: The poem \"Stopping by Woods on a Snowy Evening\" is written by:",
                "Question 16: The theme of Unit 11 is:",
                "Question 17: The study of how words are formed and how they relate to each other is called:",
                "Question 18: Which unit is about \"Mountaineering\"?",
                "Question 19: The poem \"The Earth Speaks\" has which theme?",
                "Question 20: The last unit of the textbook is titled:"
        };

        String options[][] = {
                {"A. Patriotism", "B. Tolerance of the Rasoolullah (ﷺ)", "C. Dignity of Labour", "D. Sportsmanship"},
                {"A. Ethics and Values", "B. Peaceful co-existence", "C. Sports", "D. Adventure"},
                {"A. Synonym", "B. Homophone", "C. Antonym", "D. Homonym"},
                {"A. William Wordsworth", "B. Henry S. Leigh", "C. Lenore Hetrick", "D. Robert Frost"},
                {"A. Unit 3", "B. Unit 4", "C. Unit 5", "D. Unit 6"},
                {"A. Synonym", "B. Antonym", "C. Homophone", "D. Homonym"},
                {"A. Lenore Hetrick", "B. Henry S. Leigh", "C. William Wordsworth", "D. Robert Frost"},
                {"A. Unit 4", "B. Unit 5", "C. Unit 6", "D. Unit 7"},
                {"A. Adventure", "B. Sports", "C. Role Models", "D. Environmental Education"},
                {"A. Driver", "B. Pilot", "C. Captain", "D. Conductor"},
                {"A. Lenore Hetrick", "B. Henry S. Leigh", "C. William Wordsworth", "D. Robert Frost"},
                {"A. Adventure", "B. Sports", "C. Dignity of Labour", "D. Environmental Education"},
                {"A. Participatory Citizenship", "B. Avoiding Social Evils", "C. Environmental Education", "D. Peaceful co-existence"},
                {"A. Adventure", "B. Sports", "C. Role Models", "D. Dignity of Labour"},
                {"A. Lenore Hetrick", "B. Henry S. Leigh", "C. William Wordsworth", "D. Robert Frost"},
                {"A. Adventure", "B. Sports", "C. Environmental Education", "D. Dignity of Labour"},
                {"A. Grammar", "B. Vocabulary", "C. Composition", "D. Comprehension"},
                {"A. Unit 8", "B. Unit 9", "C. Unit 10", "D. Unit 11"},
                {"A. Sports", "B. Adventure", "C. Environmental Education", "D. Role Models"},
                {"A. \"All is not Lost\"", "B. \"Drug Addiction\"", "C. \"Three Days to See\"", "D. \"The Quaid's Vision and Pakistan\""}
        };

        int correctAnswers[] = {
                1,  // Q1: Tolerance of the Rasoolullah (ﷺ)
                1,  // Q2: Peaceful co-existence
                2,  // Q3: Antonym
                1,  // Q4: Henry S. Leigh
                0,  // Q5: Unit 3
                0,  // Q6: Synonym
                0,  // Q7: Lenore Hetrick
                1,  // Q8: Unit 5
                3,  // Q9: Environmental Education
                1,  // Q10: Pilot
                2,  // Q11: William Wordsworth
                1,  // Q12: Sports
                0,  // Q13: Participatory Citizenship
                1,  // Q14: Sports
                3,  // Q15: Robert Frost
                0,  // Q16: Adventure
                0,  // Q17: Grammar
                0,  // Q18: Unit 8
                2,  // Q19: Environmental Education
                2   // Q20: "Three Days to See"
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
            new EnglishDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}