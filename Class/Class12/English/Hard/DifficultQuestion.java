package Class.Class12.English.Hard;

import Class.Class12.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: In the sentence \"The exhausted runner collapsed at the finish line,\" the word \"exhausted\" is an example of a:",
                "Question 2: A clause that can stand alone as a complete sentence is called a:",
                "Question 3: A modal verb is used to express:",
                "Question 4: The literary device in which contradictory terms appear together (e.g., \"deafening silence\") is called:",
                "Question 5: A sonnet typically consists of how many lines?",
                "Question 6: The term \"foil\" in literature refers to:",
                "Question 7: The difference between \"denotation\" and \"connotation\" is:",
                "Question 8: The correct sequence of the communication process is:",
                "Question 9: The term \"euphemism\" refers to:",
                "Question 10: The term \"iambic pentameter\" refers to:",
                "Question 11: The sentence \"Having finished the assignment, he submitted it\" contains a:",
                "Question 12: The correct use of \"who\" and \"whom\" is based on:",
                "Question 13: The primary characteristic of a tragedy according to Aristotle is:",
                "Question 14: In The Last Lesson, the central theme is about:",
                "Question 15: The figure of speech in the line \"O Wild West Wind, thou breath of Autumn's being\" is:",
                "Question 16: The difference between a \"simile\" and a \"metaphor\" is that:",
                "Question 17: The literary device where the reader knows something the characters do not is called:",
                "Question 18: The term \"anagnorisis\" in Greek tragedy refers to:",
                "Question 19: The phrase \"Time and tide wait for none\" teaches us:",
                "Question 20: According to the new PTB syllabus, The Power of Digital Learning is included in the 12th Class English book. This indicates the syllabus emphasizes:"
        };

        String options[][] = {
                {"A. Participial phrase", "B. Prepositional phrase", "C. Gerund phrase", "D. Infinitive phrase"},
                {"A. Dependent clause", "B. Independent clause", "C. Relative clause", "D. Subordinate clause"},
                {"A. Necessity, ability, or permission", "B. Past tense only", "C. Future tense only", "D. Action verbs"},
                {"A. Oxymoron", "B. Paradox", "C. Antithesis", "D. Irony"},
                {"A. 12", "B. 14", "C. 16", "D. 18"},
                {"A. A character that contrasts with another character", "B. The main conflict in a story", "C. The climax of a play", "D. The chorus in a Greek play"},
                {"A. Denotation is literal meaning; connotation is implied meaning", "B. Denotation is implied meaning; connotation is literal meaning", "C. Both are the same", "D. Denotation is written; connotation is spoken"},
                {"A. Sender → Message → Channel → Receiver → Feedback", "B. Sender → Channel → Message → Receiver → Feedback", "C. Message → Sender → Channel → Receiver → Feedback", "D. Sender → Message → Receiver → Channel → Feedback"},
                {"A. A harsh or offensive expression", "B. A mild or indirect expression used in place of an offensive one", "C. A type of metaphor", "D. A poetic device"},
                {"A. A line with five feet, each consisting of an unstressed followed by a stressed syllable", "B. A line with five syllables", "C. A line with four feet", "D. A line with no stress pattern"},
                {"A. Gerund phrase", "B. Prepositional phrase", "C. Participial phrase", "D. Infinitive phrase"},
                {"A. Subject vs. object case", "B. Singular vs. plural", "C. Present vs. past tense", "D. Active vs. passive voice"},
                {"A. A happy ending", "B. The protagonist's flaw leading to their downfall", "C. The use of comic relief", "D. A chorus of angels"},
                {"A. War and violence", "B. Patriotism and the importance of language", "C. Love and romance", "D. Wealth and poverty"},
                {"A. Simile", "B. Metaphor", "C. Apostrophe", "D. Personification"},
                {"A. A simile uses \"like\" or \"as,\" while a metaphor does not", "B. A metaphor uses \"like\" or \"as,\" while a simile does not", "C. Both use \"like\" or \"as\"", "D. Neither uses \"like\" or \"as\""},
                {"A. Dramatic irony", "B. Situational irony", "C. Verbal irony", "D. Sarcasm"},
                {"A. The final outcome", "B. The moment of recognition or discovery", "C. The hero's downfall", "D. The chorus's speech"},
                {"A. Time is slow", "B. Time is valuable and waits for no one", "C. Tide is faster than time", "D. Time can be stopped"},
                {"A. Traditional learning methods", "B. Technology and modern education", "C. Historical events", "D. Poetry only"}
        };

        int correctAnswers[] = {
                0,  // Q1: Participial phrase
                1,  // Q2: Independent clause
                0,  // Q3: Necessity, ability, or permission
                0,  // Q4: Oxymoron
                1,  // Q5: 14
                0,  // Q6: A character that contrasts with another character
                0,  // Q7: Denotation is literal meaning; connotation is implied meaning
                0,  // Q8: Sender → Message → Channel → Receiver → Feedback
                1,  // Q9: A mild or indirect expression used in place of an offensive one
                0,  // Q10: A line with five feet, each consisting of an unstressed followed by a stressed syllable
                2,  // Q11: Participial phrase
                0,  // Q12: Subject vs. object case
                1,  // Q13: The protagonist's flaw leading to their downfall
                1,  // Q14: Patriotism and the importance of language
                2,  // Q15: Apostrophe
                0,  // Q16: A simile uses "like" or "as," while a metaphor does not
                0,  // Q17: Dramatic irony
                1,  // Q18: The moment of recognition or discovery
                1,  // Q19: Time is valuable and waits for no one
                1   // Q20: Technology and modern education
        };

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