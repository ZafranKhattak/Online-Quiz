package Class.Class12.English.Medium;

import Class.Class12.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The main character of a story or play is called the:",
                "Question 2: The sequence of events in a story is called the:",
                "Question 3: The central idea or message of a literary work is called its:",
                "Question 4: A figure of speech that compares two unlike things using \"like\" or \"as\" is called:",
                "Question 5: A figure of speech that gives human qualities to non-human things is called:",
                "Question 6: A group of lines in a poem is called a:",
                "Question 7: The change in the form of a verb to indicate time is called:",
                "Question 8: A short poem that expresses personal emotions and feelings is called:",
                "Question 9: A play that ends with the downfall of the main character is called:",
                "Question 10: The direct speech \"He said, 'I am tired'\" when changed to indirect speech becomes:",
                "Question 11: The active voice sentence \"The boy kicked the ball\" when changed to passive voice becomes:",
                "Question 12: A short story with animal characters that teaches a moral is called:",
                "Question 13: A type of essay that presents an argument and tries to persuade the reader is called:",
                "Question 14: The expression \"the early bird catches the worm\" is an example of:",
                "Question 15: The purpose of punctuation in writing is to:",
                "Question 16: A formal letter written to apply for a job is called:",
                "Question 17: The word \"courage\" is derived from which language?",
                "Question 18: The quality that makes a poem rhythmic is called:",
                "Question 19: The direct speech of a character in a play is called:",
                "Question 20: A figure of speech that uses exaggerated statements is called:"
        };

        String options[][] = {
                {"A. Antagonist", "B. Protagonist", "C. Narrator", "D. Hero"},
                {"A. Setting", "B. Theme", "C. Plot", "D. Character"},
                {"A. Plot", "B. Setting", "C. Theme", "D. Character"},
                {"A. Metaphor", "B. Personification", "C. Simile", "D. Hyperbole"},
                {"A. Simile", "B. Metaphor", "C. Personification", "D. Hyperbole"},
                {"A. Verse", "B. Stanza", "C. Paragraph", "D. Section"},
                {"A. Tense", "B. Voice", "C. Mood", "D. Aspect"},
                {"A. Epic", "B. Ode", "C. Lyric", "D. Ballad"},
                {"A. Comedy", "B. Tragedy", "C. Farce", "D. Melodrama"},
                {"A. He said that he is tired", "B. He said that he was tired", "C. He said that I am tired", "D. He said that I was tired"},
                {"A. The ball was kicked by the boy", "B. The ball is kicked by the boy", "C. The ball will be kicked by the boy", "D. The ball had been kicked by the boy"},
                {"A. Parable", "B. Fable", "C. Fairy tale", "D. Folklore"},
                {"A. Narrative", "B. Descriptive", "C. Expository", "D. Persuasive"},
                {"A. Simile", "B. Metaphor", "C. Proverb", "D. Idiom"},
                {"A. Make it look beautiful", "B. Clarify meaning and show pauses", "C. Add extra words", "D. Change the subject"},
                {"A. Cover letter", "B. Resignation letter", "C. Complaint letter", "D. Inquiry letter"},
                {"A. French", "B. Latin", "C. Greek", "D. Arabic"},
                {"A. Meter", "B. Rhyme", "C. Alliteration", "D. Assonance"},
                {"A. Dialogue", "B. Monologue", "C. Soliloquy", "D. Narration"},
                {"A. Simile", "B. Metaphor", "C. Personification", "D. Hyperbole"}
        };

        int correctAnswers[] = {
                1,  // Q1: Protagonist
                2,  // Q2: Plot
                2,  // Q3: Theme
                2,  // Q4: Simile
                2,  // Q5: Personification
                1,  // Q6: Stanza
                0,  // Q7: Tense
                2,  // Q8: Lyric
                1,  // Q9: Tragedy
                1,  // Q10: He said that he was tired
                0,  // Q11: The ball was kicked by the boy
                1,  // Q12: Fable
                3,  // Q13: Persuasive
                2,  // Q14: Proverb
                1,  // Q15: Clarify meaning and show pauses
                0,  // Q16: Cover letter
                1,  // Q17: Latin
                0,  // Q18: Meter
                0,  // Q19: Dialogue
                3   // Q20: Hyperbole
        };

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
                if (percentage >= 80) grade = "Excellent!";
                else if (percentage >= 60) grade = "Good!";
                else if (percentage >= 40) grade = "Fair";
                else grade = "Needs Improvement";
                
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