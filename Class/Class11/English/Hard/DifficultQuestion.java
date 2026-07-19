package Class.Class11.English.Hard;

import Class.Class11.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: In the sentence \"The marathon runner, exhausted from the long race, collapsed at the finish line,\" the phrase \"exhausted from the long race\" is an example of:",
                "Question 2: The main purpose of the pattern of organization in a text is to:",
                "Question 3: A modal verb is used to express:",
                "Question 4: The figure of speech in the line \"O Wild West Wind, thou breath of Autumn's being\" is:",
                "Question 5: A clause that can stand alone as a complete sentence is called a:",
                "Question 6: The term \"zeugma\" in grammar refers to:",
                "Question 7: The literary device in which contradictory terms appear together (e.g., \"deafening silence\") is called:",
                "Question 8: A sonnet typically consists of how many lines?",
                "Question 9: The term \"foil\" in literature refers to:",
                "Question 10: The difference between \"denotation\" and \"connotation\" is:",
                "Question 11: The correct sequence of the communication process is:",
                "Question 12: The term \"euphemism\" refers to:",
                "Question 13: In \"The Gift of the Magi,\" the literary device used when the reader knows something the characters do not is called:",
                "Question 14: The term \"iambic pentameter\" refers to:",
                "Question 15: The sentence \"Having finished the assignment, he submitted it to the teacher\" contains a:",
                "Question 16: The correct use of \"who\" and \"whom\" is based on:",
                "Question 17: The term \"anagnorisis\" in Greek tragedy refers to:",
                "Question 18: The primary characteristic of a tragedy according to Aristotle is:",
                "Question 19: In \"The Great Gatsby,\" the green light at the end of Daisy's dock symbolizes:",
                "Question 20: The difference between a \"simile\" and a \"metaphor\" is that:"
        };

        String options[][] = {
                {"A. Absolute phrase", "B. Participial phrase", "C. Prepositional phrase", "D. Gerund phrase"},
                {"A. Make it entertaining", "B. Make it logical and easy to follow", "C. Add more words", "D. Impress the reader"},
                {"A. Necessity, ability, or permission", "B. Past tense only", "C. Future tense only", "D. Action verbs"},
                {"A. Simile", "B. Metaphor", "C. Apostrophe", "D. Personification"},
                {"A. Dependent clause", "B. Independent clause", "C. Relative clause", "D. Subordinate clause"},
                {"A. A figure of speech where a word applies to two others in different senses", "B. A type of punctuation", "C. A poetic meter", "D. A verb tense"},
                {"A. Oxymoron", "B. Paradox", "C. Antithesis", "D. Irony"},
                {"A. 12", "B. 14", "C. 16", "D. 18"},
                {"A. A character that contrasts with another character", "B. The main conflict in a story", "C. The climax of a play", "D. The chorus in a Greek play"},
                {"A. Denotation is literal meaning; connotation is implied meaning", "B. Denotation is implied meaning; connotation is literal meaning", "C. Both are the same", "D. Denotation is written; connotation is spoken"},
                {"A. Sender → Message → Channel → Receiver → Feedback", "B. Sender → Channel → Message → Receiver → Feedback", "C. Message → Sender → Channel → Receiver → Feedback", "D. Sender → Message → Receiver → Channel → Feedback"},
                {"A. A harsh or offensive expression", "B. A mild or indirect expression used in place of an offensive one", "C. A type of metaphor", "D. A poetic device"},
                {"A. Dramatic irony", "B. Situational irony", "C. Verbal irony", "D. Sarcasm"},
                {"A. A line with five feet, each consisting of an unstressed followed by a stressed syllable", "B. A line with five syllables", "C. A line with four feet", "D. A line with no stress pattern"},
                {"A. Gerund phrase", "B. Prepositional phrase", "C. Participial phrase", "D. Infinitive phrase"},
                {"A. Subject vs. object case", "B. Singular vs. plural", "C. Present vs. past tense", "D. Active vs. passive voice"},
                {"A. The final outcome", "B. The moment of recognition or discovery", "C. The hero's downfall", "D. The chorus's speech"},
                {"A. A happy ending", "B. The protagonist's flaw leading to their downfall", "C. The use of comic relief", "D. A chorus of angels"},
                {"A. Hope and the American Dream", "B. Money and wealth", "C. Nature and growth", "D. Jealousy and envy"},
                {"A. A simile uses \"like\" or \"as,\" while a metaphor does not", "B. A metaphor uses \"like\" or \"as,\" while a simile does not", "C. Both use \"like\" or \"as\"", "D. Neither uses \"like\" or \"as\""}
        };

        int correctAnswers[] = {
                1,  // Q1: Participial phrase
                1,  // Q2: Make it logical and easy to follow
                0,  // Q3: Necessity, ability, or permission
                2,  // Q4: Apostrophe
                1,  // Q5: Independent clause
                0,  // Q6: A figure of speech where a word applies to two others in different senses
                0,  // Q7: Oxymoron
                1,  // Q8: 14
                0,  // Q9: A character that contrasts with another character
                0,  // Q10: Denotation is literal meaning; connotation is implied meaning
                0,  // Q11: Sender → Message → Channel → Receiver → Feedback
                1,  // Q12: A mild or indirect expression used in place of an offensive one
                0,  // Q13: Dramatic irony
                0,  // Q14: A line with five feet, each consisting of an unstressed followed by a stressed syllable
                2,  // Q15: Participial phrase
                0,  // Q16: Subject vs. object case
                1,  // Q17: The moment of recognition or discovery
                1,  // Q18: The protagonist's flaw leading to their downfall
                0,  // Q19: Hope and the American Dream
                0   // Q20: A simile uses "like" or "as," while a metaphor does not
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 260), (i * 60 + 130), 260, 30);
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