package Class.Class9.English.Easy;

import Class.Class9.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The first chapter of the Class 9 English textbook is about:",
                "Question 2: A word that has the same meaning as another word is called a:",
                "Question 3: The poem \"Daffodils\" is written by:",
                "Question 4: The opposite of \"happy\" is:",
                "Question 5: The subject of a sentence is usually a:",
                "Question 6: A word that describes a noun is called:",
                "Question 7: The word \"patriotism\" refers to:",
                "Question 8: The word that means the opposite of \"enemy\" is:",
                "Question 9: A group of words that expresses a complete thought is called a:",
                "Question 10: The plural of \"child\" is:",
                "Question 11: The past tense of \"go\" is:",
                "Question 12: \"All men are not true\" means:",
                "Question 13: A word that shows action is called a:",
                "Question 14: The synonym of \"beautiful\" is:",
                "Question 15: The chapter \"Patriotism\" teaches us about:",
                "Question 16: A word that joins two sentences is called:",
                "Question 17: The word \"brave\" means:",
                "Question 18: The present tense of \"ate\" is:",
                "Question 19: A word that shows possession is called:",
                "Question 20: The word \"qualities\" refers to:"
        };

        String options[][] = {
                {"A. Patriotism", "B. Daffodils", "C. The Saviour of Mankind", "D. Hazrat Asma (R.A)"},
                {"A. Antonym", "B. Synonym", "C. Homophone", "D. Homonym"},
                {"A. William Wordsworth", "B. Henry S. Leigh", "C. Lenore Hetrick", "D. Robert Frost"},
                {"A. Joyful", "B. Cheerful", "C. Sad", "D. Glad"},
                {"A. Verb", "B. Noun or Pronoun", "C. Adjective", "D. Adverb"},
                {"A. Verb", "B. Adverb", "C. Adjective", "D. Pronoun"},
                {"A. Love for one's country", "B. Love for one's family", "C. Love for one's friends", "D. Love for one's school"},
                {"A. Foe", "B. Rival", "C. Friend", "D. Opponent"},
                {"A. Phrase", "B. Clause", "C. Sentence", "D. Paragraph"},
                {"A. Childs", "B. Children", "C. Childrens", "D. Childes"},
                {"A. Go", "B. Goes", "C. Going", "D. Went"},
                {"A. All men are true", "B. No men are true", "C. Some men are not true", "D. All men are liars"},
                {"A. Noun", "B. Adjective", "C. Verb", "D. Adverb"},
                {"A. Ugly", "B. Pretty", "C. Bad", "D. Terrible"},
                {"A. Love for money", "B. Love for power", "C. Love for one's country", "D. Love for fame"},
                {"A. Noun", "B. Conjunction", "C. Preposition", "D. Interjection"},
                {"A. Cowardly", "B. Strong", "C. Fearless", "D. Weak"},
                {"A. Eat", "B. Eats", "C. Eating", "D. Eaten"},
                {"A. Noun", "B. Pronoun", "C. Adjective", "D. Possessive"},
                {"A. Flaws", "B. Weaknesses", "C. Good characteristics", "D. Mistakes"}
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