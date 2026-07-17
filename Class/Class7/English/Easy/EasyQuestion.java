package Class.Class7.English.Easy;

import Class.Class7.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: A word used in place of a noun is called a:",
                "Question 2: Which of the following is a noun?",
                "Question 3: The past tense of \"go\" is:",
                "Question 4: \"He is writing a letter.\" The verb in this sentence is:",
                "Question 5: Which word is a preposition?",
                "Question 6: The plural of \"child\" is:",
                "Question 7: Which word is an adjective?",
                "Question 8: \"I am a student.\" The pronoun in this sentence is:",
                "Question 9: The future tense of \"play\" is:",
                "Question 10: Which word is a conjunction?",
                "Question 11: The opposite of \"happy\" is:",
                "Question 12: \"She sings beautifully.\" The adverb in this sentence is:",
                "Question 13: The plural of \"man\" is:",
                "Question 14: Which article is used before \"apple\"?",
                "Question 15: \"We are going to school.\" The verb in this sentence is:",
                "Question 16: The past tense of \"eat\" is:",
                "Question 17: Which of the following is a proper noun?",
                "Question 18: \"He runs fast.\" The word \"fast\" is a/an:",
                "Question 19: The article used before \"umbrella\" is:",
                "Question 20: The present participle of \"swim\" is:"
        };

        String options[][] = {
                {"A. Verb", "B. Adjective", "C. Pronoun", "D. Adverb"},
                {"A. Run", "B. Beautiful", "C. Book", "D. Quickly"},
                {"A. Go", "B. Going", "C. Gone", "D. Went"},
                {"A. He", "B. Is", "C. Writing", "D. Letter"},
                {"A. Under", "B. Happy", "C. Quickly", "D. Beautiful"},
                {"A. Childs", "B. Children", "C. Childrens", "D. Childes"},
                {"A. Tall", "B. Run", "C. On", "D. Slowly"},
                {"A. Am", "B. A", "C. Student", "D. I"},
                {"A. Played", "B. Playing", "C. Will play", "D. Plays"},
                {"A. On", "B. And", "C. Under", "D. Slowly"},
                {"A. Glad", "B. Joyful", "C. Sad", "D. Cheerful"},
                {"A. She", "B. Sings", "C. Beautifully", "D. The"},
                {"A. Mans", "B. Men", "C. Mens", "D. Manes"},
                {"A. A", "B. An", "C. The", "D. No article"},
                {"A. We", "B. Are", "C. Going", "D. School"},
                {"A. Eated", "B. Eat", "C. Ate", "D. Eating"},
                {"A. City", "B. Lahore", "C. Boy", "D. River"},
                {"A. Noun", "B. Verb", "C. Adjective", "D. Adverb"},
                {"A. A", "B. An", "C. The", "D. None"},
                {"A. Swiming", "B. Swam", "C. Swimming", "D. Swum"}
        };

        int correctAnswers[] = {
                2,  // Q1: Pronoun
                2,  // Q2: Book
                3,  // Q3: Went
                2,  // Q4: Writing
                0,  // Q5: Under
                1,  // Q6: Children
                0,  // Q7: Tall
                3,  // Q8: I
                2,  // Q9: Will play
                1,  // Q10: And
                2,  // Q11: Sad
                2,  // Q12: Beautifully
                1,  // Q13: Men
                1,  // Q14: An
                2,  // Q15: Going
                2,  // Q16: Ate
                1,  // Q17: Lahore
                3,  // Q18: Adverb
                1,  // Q19: An
                2   // Q20: Swimming
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 200), (i * 60 + 130), 200, 30);
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