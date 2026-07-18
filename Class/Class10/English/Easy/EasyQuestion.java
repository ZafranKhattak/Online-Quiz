package Class.Class10.English.Easy;

import Class.Class10.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: What is the message of the poem \"Try Again\"?",
                "Question 2: The poem \"Try Again\" is written by:",
                "Question 3: A word that has the same meaning as another word is called a:",
                "Question 4: The opposite of \"success\" is:",
                "Question 5: A word that shows action is called a:",
                "Question 6: The Happy Prince lived in a:",
                "Question 7: The poet of \"Where the Mind is Without Fear\" is:",
                "Question 8: A group of words that expresses a complete thought is called a:",
                "Question 9: The word that means the opposite of \"courage\" is:",
                "Question 10: The verb that means \"to continue in a course or persist\" is:",
                "Question 11: The gift bought by Della for Jim in \"A Gift for Christmas\" was a:",
                "Question 12: The pronoun \"I\" is an example of:",
                "Question 13: The word \"reward\" means:",
                "Question 14: The past tense of \"bring\" is:",
                "Question 15: The poem \"Try Again\" teaches us to:",
                "Question 16: A word that describes a noun is called:",
                "Question 17: The word \"disgrace\" means:",
                "Question 18: The phrase \"Tis a lesson you should heed\" means:",
                "Question 19: The word \"conquer\" means:",
                "Question 20: In \"The Happy Prince,\" what was the swallow's final task?"
        };

        String options[][] = {
                {"A. Never try anything new", "B. If at first you don't succeed, try again", "C. Success is impossible", "D. Failure should be accepted"},
                {"A. William Wordsworth", "B. William Edward Hickson", "C. Rabindranath Tagore", "D. Robert Frost"},
                {"A. Antonym", "B. Synonym", "C. Homophone", "D. Homonym"},
                {"A. Victory", "B. Triumph", "C. Failure", "D. Achievement"},
                {"A. Noun", "B. Adjective", "C. Verb", "D. Adverb"},
                {"A. Palace", "B. Castle", "C. Statue", "D. Garden"},
                {"A. William Wordsworth", "B. Robert Frost", "C. Rabindranath Tagore", "D. Henry S. Leigh"},
                {"A. Phrase", "B. Clause", "C. Sentence", "D. Paragraph"},
                {"A. Bravery", "B. Fear", "C. Strength", "D. Boldness"},
                {"A. Heed", "B. Persevere", "C. Prevail", "D. Conquer"},
                {"A. Watch", "B. Set of combs", "C. Platinum watch-chain", "D. Gold ring"},
                {"A. Present pronoun", "B. Personal pronoun", "C. Demonstrative pronoun", "D. Reflexive pronoun"},
                {"A. Punishment", "B. Prize", "C. Loss", "D. Failure"},
                {"A. Bring", "B. Brings", "C. Bringing", "D. Brought"},
                {"A. Give up easily", "B. Never lose hope", "C. Fear failure", "D. Avoid challenges"},
                {"A. Verb", "B. Adverb", "C. Adjective", "D. Pronoun"},
                {"A. Honor", "B. Pride", "C. Dishonor", "D. Respect"},
                {"A. You should ignore the lesson", "B. You should pay attention to the lesson", "C. You should forget the lesson", "D. You should teach the lesson"},
                {"A. Lose", "B. Surrender", "C. Overcome", "D. Retreat"},
                {"A. To deliver the sapphire", "B. To bring the ruby", "C. To take the two most precious things to God", "D. To stay in Egypt"}
        };

        int correctAnswers[] = {
                1,  // Q1: If at first you don't succeed, try again
                1,  // Q2: William Edward Hickson
                1,  // Q3: Synonym
                2,  // Q4: Failure
                2,  // Q5: Verb
                2,  // Q6: Statue
                2,  // Q7: Rabindranath Tagore
                2,  // Q8: Sentence
                1,  // Q9: Fear
                1,  // Q10: Persevere
                2,  // Q11: Platinum watch-chain
                1,  // Q12: Personal pronoun
                1,  // Q13: Prize
                3,  // Q14: Brought
                1,  // Q15: Never lose hope
                2,  // Q16: Adjective
                2,  // Q17: Dishonor
                1,  // Q18: You should pay attention to the lesson
                2,  // Q19: Overcome
                2   // Q20: To take the two most precious things to God
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
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