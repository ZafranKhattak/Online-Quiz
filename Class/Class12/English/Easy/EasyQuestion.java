package Class.Class12.English.Easy;

import Class.Class12.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The word that means the opposite of \"victory\" is:",
                "Question 2: A word that has the same meaning as another word is called a:",
                "Question 3: A word that shows an action is called a:",
                "Question 4: A group of words that expresses a complete thought is called a:",
                "Question 5: The past tense of \"write\" is:",
                "Question 6: A word that describes a noun is called a:",
                "Question 7: The present tense of \"ran\" is:",
                "Question 8: The plural of \"leaf\" is:",
                "Question 9: A question mark is used at the end of which type of sentence?",
                "Question 10: A noun that names a specific person, place, or thing (like \"Ali\" or \"Lahore\") is called a:",
                "Question 11: The word \"rapidly\" is an example of:",
                "Question 12: A word that shows the relationship between a noun and another word in a sentence is called a:",
                "Question 13: The phrase \"with great courage\" is an example of a:",
                "Question 14: The sentence \"She is a brilliant student\" is an example of:",
                "Question 15: A word that joins two sentences is called a:",
                "Question 16: The word \"generosity\" is an example of:",
                "Question 17: A story that teaches a moral lesson is called:",
                "Question 18: The term used for a person who writes a play is:",
                "Question 19: A composition that describes a person, place, or thing in detail is called:",
                "Question 20: The word that means \"to persist in a course of action\" is:"
        };

        String options[][] = {
                {"A. Triumph", "B. Success", "C. Defeat", "D. Achievement"},
                {"A. Antonym", "B. Homophone", "C. Synonym", "D. Homonym"},
                {"A. Noun", "B. Verb", "C. Adjective", "D. Adverb"},
                {"A. Phrase", "B. Clause", "C. Sentence", "D. Paragraph"},
                {"A. Write", "B. Writes", "C. Writing", "D. Wrote"},
                {"A. Verb", "B. Adverb", "C. Adjective", "D. Pronoun"},
                {"A. Run", "B. Runs", "C. Running", "D. Ran"},
                {"A. Leafs", "B. Leaves", "C. Leafes", "D. Leavs"},
                {"A. Declarative", "B. Imperative", "C. Interrogative", "D. Exclamatory"},
                {"A. Common noun", "B. Proper noun", "C. Abstract noun", "D. Collective noun"},
                {"A. Adjective", "B. Adverb", "C. Noun", "D. Verb"},
                {"A. Conjunction", "B. Interjection", "C. Preposition", "D. Adverb"},
                {"A. Noun phrase", "B. Verb phrase", "C. Adverb phrase", "D. Adjective phrase"},
                {"A. Interrogative sentence", "B. Imperative sentence", "C. Declarative sentence", "D. Exclamatory sentence"},
                {"A. Noun", "B. Conjunction", "C. Preposition", "D. Interjection"},
                {"A. Concrete noun", "B. Abstract noun", "C. Proper noun", "D. Collective noun"},
                {"A. A novel", "B. A drama", "C. A fable", "D. A poem"},
                {"A. Novelist", "B. Poet", "C. Dramatist", "D. Critic"},
                {"A. Narrative essay", "B. Descriptive essay", "C. Expository essay", "D. Persuasive essay"},
                {"A. Abandon", "B. Persevere", "C. Surrender", "D. Retreat"}
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 950, 30);
            label2.setForeground(Color.GREEN);
            label2.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(label2);
        }

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                group.add(btn);
                panel.add(btn);
            }
        }

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            JOptionPane.showConfirmDialog(null, "You want to submit");
            JOptionPane.showMessageDialog(null, "Submitted Successfully");
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