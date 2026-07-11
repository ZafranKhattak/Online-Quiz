package Class.Class6.English.Hard;

import Class.Class6.English.EnglishDashboard.EnglishDashboard;
import javax.swing.*;
import java.awt.*;

public class DifficultQuestion {

    public DifficultQuestion() {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ================= JPANEL ======================//
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1300, 700);
        panel.setPreferredSize(new Dimension(1750, 1500));
        panel.setBackground(Color.BLACK);

        // ================= NOTES FOR QUIZ ================== //
        JLabel label = new JLabel();
        label.setLayout(null);
        label.setText("<html>There are four options.Select the correct one<br>Take your time.Best of Luck.</br></html");
        label.setBounds(450, 40, 550, 60);
        label.setForeground(Color.RED);
        label.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(label);

        // ================== JScrollPane =================== //

        JScrollPane scroll = new JScrollPane(panel);
        scroll.setBounds(0, 0, 1300, 700);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        frame.add(scroll);
        // ================== QUESTIONS LOGIC ==================;

        String questions[] = {
                "Question 1: Which of the following words requires the article \"an\"?",
                "Question 2: Identify the Correct Pronoun: \"Neither of the boys has done _____ homework.\"",
                "Question 3: In the sentence \"It has been raining since morning,\" which tense is used?",
                "Question 4: Which verb form correctly completes the sentence? \"She _____ here since 2010.\"",
                "Question 5: The preposition \"between\" is correctly used in which sentence?",
                "Question 6: Identify the degree of comparison: \"Milk is more nutritious than any other drink.\"",
                "Question 7: Which pronoun correctly fits? \"Each of the girls _____ her own room.\"",
                "Question 8: What type of Noun is \"committee\"?",
                "Question 9: Correct form of verb: \"If I _____ you, I would not do that.\"",
                "Question 10: Which sentence has a correct use of the superlative degree?",
                "Question 11: \"I have never seen such a beautiful sight.\" The underlined word is:",
                "Question 12: Which preposition fits? \"We should stand _____ our friends in trouble.\"",
                "Question 13: Identify the verb phrase: \"They will have completed the project.\"",
                "Question 14: Which is the Past Participle form of \"teach\"?",
                "Question 15: Identify the error: \"He is one of those students who always helps others.\"",
                "Question 16: The sentence \"The thief was caught by the police\" is in:",
                "Question 17: Which conjunction fits? \"He worked hard _____ he might succeed.\"",
                "Question 18: \"I am going to the market.\" The word \"to\" here is:",
                "Question 19: The Antonym of \"optimistic\" is:",
                "Question 20: Which sentence has a correct use of the Present Perfect tense?"
        };

        String options[][] = {
                {
                        "A. University",
                        "B. Hour",
                        "C. European",
                        "D. Unique"
                },
                {
                        "A. his",
                        "B. their",
                        "C. our",
                        "D. your"
                },
                {
                        "A. Past Perfect",
                        "B. Present Perfect Continuous",
                        "C. Future Perfect",
                        "D. Past Continuous"
                },
                {
                        "A. is living",
                        "B. has been living",
                        "C. was living",
                        "D. will be living"
                },
                {
                        "A. Distribute the sweets between all the children.",
                        "B. The five friends decided among themselves.",
                        "C. Divide the mangoes between the two brothers.",
                        "D. The prize was shared among the two winners."
                },
                {
                        "A. Positive",
                        "B. Comparative",
                        "C. Superlative",
                        "D. None"
                },
                {
                        "A. have",
                        "B. has",
                        "C. had been",
                        "D. were having"
                },
                {
                        "A. Proper Noun",
                        "B. Common Noun",
                        "C. Abstract Noun",
                        "D. Collective Noun"
                },
                {
                        "A. was",
                        "B. were",
                        "C. am",
                        "D. have been"
                },
                {
                        "A. He is the better of the two players.",
                        "B. She is more intelligent than her sister.",
                        "C. This is the most beautiful painting.",
                        "D. He is elder than his brother."
                },
                {
                        "A. Demonstrative Pronoun",
                        "B. Emphatic Pronoun",
                        "C. Reflexive Pronoun",
                        "D. Interrogative Pronoun"
                },
                {
                        "A. with",
                        "B. by",
                        "C. for",
                        "D. from"
                },
                {
                        "A. completed",
                        "B. will have completed",
                        "C. have completed",
                        "D. will have"
                },
                {
                        "A. Teach",
                        "B. Taught",
                        "C. Teaching",
                        "D. Teaches"
                },
                {
                        "A. is",
                        "B. of",
                        "C. who",
                        "D. helps"
                },
                {
                        "A. Active Voice",
                        "B. Passive Voice",
                        "C. Present Tense",
                        "D. Direct Speech"
                },
                {
                        "A. so that",
                        "B. because",
                        "C. although",
                        "D. while"
                },
                {
                        "A. Preposition",
                        "B. Infinitive marker",
                        "C. Conjunction",
                        "D. Adverb"
                },
                {
                        "A. Hopeful",
                        "B. Positive",
                        "C. Pessimistic",
                        "D. Cheerful"
                },
                {
                        "A. She is going to school yesterday.",
                        "B. He has just left the house.",
                        "C. We will have reached by noon.",
                        "D. They are playing cricket now"
                }
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
                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                group.add(btn);
                panel.add(btn);
            }
        }

        // ========================= BUTTON FOR SUBMIT ==================== //

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

        // =========================== BACK BUTTON FOR DASHBOARD OF LEVEL
        // ================ //
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