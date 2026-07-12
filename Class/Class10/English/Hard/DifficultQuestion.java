package Class.Class10.English.Hard;

import Class.Class10.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The line \"If at first you don't succeed, try, try again\" in the poem \"Try Again\" is an example of:",
                "Question 2: The figure of speech used in \"The woods are lovely, dark and deep\" is:",
                "Question 3: In \"Try Again,\" the poet says we should not give up during failure because:",
                "Question 4: The word \"heed\" in the poem \"Try Again\" is used to mean:",
                "Question 5: In the line \"The clock is ticking\" in the grammar section, the verb \"ticking\" is in which form?",
                "Question 6: The pronoun in \"You shall pay attention to what you are told\" is an example of:",
                "Question 7: The line \"If you will persevere, You will conquer, never fear\" uses which type of tense in the conditional clause?",
                "Question 8: In \"Where is Science Taking Us?\", the author suggests that modern drugs have:",
                "Question 9: The antonym of the word \"fatal\" as used in the poem \"The Twins\" is:",
                "Question 10: The rhyme scheme of the poem \"Try Again\" is:",
                "Question 11: The phrase \"only keep this rule in view\" refers to:",
                "Question 12: In \"The Home-Coming,\" why did Phatik leave his village?",
                "Question 13: The word \"downy flake\" in Robert Frost's poem means:",
                "Question 14: In \"The Happy Prince,\" the swallow's decision to stay instead of going to Egypt suggests:",
                "Question 15: The tense used in \"They did not inform me about their plans\" is:",
                "Question 16: In \"The Rule of the Road,\" the author says liberty is:",
                "Question 17: The figure of speech in \"If you can meet with Triumph and Disaster and treat those two imposters just the same\" is:",
                "Question 18: The verb form in \"If you would at last prevail\" is an example of:",
                "Question 19: In \"The Dying Detective,\" the main character is:",
                "Question 20: The phrase \"You are greater than you think\" from \"The Secret of Happiness\" implies:"
        };

        String options[][] = {
                {"A. Simile", "B. Metaphor", "C. Personification", "D. Repetition"},
                {"A. Simile", "B. Alliteration", "C. Personification", "D. Metaphor"},
                {"A. Success is guaranteed", "B. Failure is temporary and can lead to success", "C. Others will help us", "D. Life is short"},
                {"A. To ignore", "B. To pay attention to", "C. To dislike", "D. To forget"},
                {"A. Present indefinite tense", "B. Past indefinite tense", "C. Present continuous tense", "D. Future indefinite tense"},
                {"A. Reflexive pronoun", "B. Personal pronoun", "C. Relative pronoun", "D. Emphatic pronoun"},
                {"A. Present indefinite tense", "B. Future indefinite tense", "C. Past indefinite tense", "D. Present continuous tense"},
                {"A. Eliminated all diseases", "B. Led to overcrowding in the upper age group", "C. Made people immortal", "D. Caused more health problems"},
                {"A. Deadly", "B. Harmless", "C. Dangerous", "D. Serious"},
                {"A. aabb", "B. abab", "C. abcb", "D. Free verse"},
                {"A. The rule of giving up", "B. The rule of trying again", "C. The rule of fearing failure", "D. The rule of avoiding work"},
                {"A. He was expelled from school", "B. His uncle took him to Calcutta", "C. He ran away from home", "D. He went to join the army"},
                {"A. Heavy snowflakes", "B. Soft, feathery snowflakes", "C. Icy snowflakes", "D. Melting snowflakes"},
                {"A. His loyalty to the prince", "B. His fear of winter", "C. His love for Egypt", "D. His dislike of the prince"},
                {"A. Present indefinite", "B. Past indefinite", "C. Future indefinite", "D. Present perfect"},
                {"A. A personal affair only", "B. A social contract", "C. Not important", "D. Absolute freedom"},
                {"A. Simile", "B. Personification", "C. Antithesis", "D. Hyperbole"},
                {"A. Present tense", "B. Past tense", "C. Subjunctive mood", "D. Imperative mood"},
                {"A. Phatik", "B. The Happy Prince", "C. Sherlock Holmes", "D. Jim"},
                {"A. People overestimate themselves", "B. People underestimate their potential", "C. People are always weak", "D. People should not believe in themselves"}
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
                btn.setBounds(80 + (j * 260), (i * 60 + 130), 260, 30);
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