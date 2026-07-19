package Class.Class11.English.Easy;

import Class.Class11.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The study of how words are formed and how they relate to each other in a sentence is called:",
                "Question 2: A word that has the same meaning as another word is called a:",
                "Question 3: The opposite of \"victory\" is:",
                "Question 4: A word that shows an action is called a:",
                "Question 5: A group of words that expresses a complete thought is called a:",
                "Question 6: The word that means \"to persist in a course of action\" is:",
                "Question 7: The past tense of \"write\" is:",
                "Question 8: A noun that names a specific person, place, or thing (like \"Ali\" or \"Lahore\") is called a:",
                "Question 9: A word that describes a noun is called a:",
                "Question 10: The phrase \"with great courage\" is an example of a:",
                "Question 11: The plural of \"leaf\" is:",
                "Question 12: A word that shows the relationship between a noun and another word in a sentence is called a:",
                "Question 13: The sentence \"She is a brilliant student\" is an example of:",
                "Question 14: The word \"rapidly\" is an example of:",
                "Question 15: A story that teaches a moral lesson is called:",
                "Question 16: The present tense of \"ran\" is:",
                "Question 17: A composition that describes a person, place, or thing in detail is called:",
                "Question 18: The term used for a person who writes a play is:",
                "Question 19: The word \"generosity\" is an example of:",
                "Question 20: A question mark is used at the end of which type of sentence?"
        };

        String options[][] = {
                {"A. Vocabulary", "B. Grammar", "C. Composition", "D. Comprehension"},
                {"A. Antonym", "B. Homophone", "C. Synonym", "D. Homonym"},
                {"A. Success", "B. Triumph", "C. Defeat", "D. Achievement"},
                {"A. Noun", "B. Verb", "C. Adjective", "D. Adverb"},
                {"A. Phrase", "B. Clause", "C. Sentence", "D. Paragraph"},
                {"A. Abandon", "B. Persevere", "C. Surrender", "D. Retreat"},
                {"A. Write", "B. Writes", "C. Writing", "D. Wrote"},
                {"A. Common noun", "B. Proper noun", "C. Abstract noun", "D. Collective noun"},
                {"A. Verb", "B. Adverb", "C. Adjective", "D. Pronoun"},
                {"A. Noun phrase", "B. Verb phrase", "C. Adverb phrase", "D. Adjective phrase"},
                {"A. Leafs", "B. Leaves", "C. Leafes", "D. Leavs"},
                {"A. Conjunction", "B. Interjection", "C. Preposition", "D. Adverb"},
                {"A. Interrogative sentence", "B. Imperative sentence", "C. Declarative sentence", "D. Exclamatory sentence"},
                {"A. Adjective", "B. Adverb", "C. Noun", "D. Verb"},
                {"A. A novel", "B. A drama", "C. A fable", "D. A poem"},
                {"A. Run", "B. Runs", "C. Running", "D. Ran"},
                {"A. Narrative essay", "B. Descriptive essay", "C. Expository essay", "D. Persuasive essay"},
                {"A. Novelist", "B. Poet", "C. Dramatist", "D. Critic"},
                {"A. Concrete noun", "B. Abstract noun", "C. Proper noun", "D. Collective noun"},
                {"A. Declarative", "B. Imperative", "C. Interrogative", "D. Exclamatory"}
        };

        int correctAnswers[] = {
                1,  // Q1: Grammar
                2,  // Q2: Synonym
                2,  // Q3: Defeat
                1,  // Q4: Verb
                2,  // Q5: Sentence
                1,  // Q6: Persevere
                3,  // Q7: Wrote
                1,  // Q8: Proper noun
                2,  // Q9: Adjective
                2,  // Q10: Adverb phrase
                1,  // Q11: Leaves
                2,  // Q12: Preposition
                2,  // Q13: Declarative sentence
                1,  // Q14: Adverb
                2,  // Q15: A fable
                0,  // Q16: Run
                1,  // Q17: Descriptive essay
                2,  // Q18: Dramatist
                1,  // Q19: Abstract noun
                2   // Q20: Interrogative
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
            new EnglishDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}