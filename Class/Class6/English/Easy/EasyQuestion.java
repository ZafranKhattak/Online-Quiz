package Class.Class6.English.Easy;

import Class.Class6.English.EnglishDashboard.EnglishDashboard;
import javax.swing.*;
import java.awt.*;

public class EasyQuestion {

    public EasyQuestion() {

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
                "Question 1: Which article is used before words starting with a vowel sound?",
                "Question 2: Identify the verb in this sentence: \"The sun rises in the east.\"",
                "Question 3: Which word is used in place of a noun?",
                "Question 4: \"The Ganges\" is an example of using which article?",
                "Question 5: The past tense of \"go\" is:",
                "Question 6: \"I am writing a poem.\" This sentence is in which tense?",
                "Question 7: Which word is a preposition?",
                "Question 8: \"The moon\" is an example of using which article?",
                "Question 9: The correct pronoun to fill the blank: \"That horse is _____.\" (our / ours)",
                "Question 10: The comparative degree of \"tall\" is:",
                "Question 11: Which of these is a verb?",
                "Question 12: \"He did not take my pen.\" The helping verb in this sentence is:",
                "Question 13: The superlative degree of \"good\" is:",
                "Question 14: Which preposition fits: \"I am fond _____ music.\"",
                "Question 15: The correct article for \"_____ useful thing\" is:",
                "Question 16: The word \"I\" is which type of pronoun?",
                "Question 17: The present participle form of \"run\" is:",
                "Question 18: Which word is an adjective?",
                "Question 19: \"She will come tomorrow.\" This sentence is in which tense?",
                "Question 20: The correct article for \"_____ honest man\" is:"
        };

        String options[][] = {
                {
                        "A. A",
                        "B. An",
                        "C. The",
                        "D. None"
                },
                {
                        "A. Sun",
                        "B. Rises",
                        "C. East",
                        "D. The"
                },
                {
                        "A. Verb",
                        "B. Adjective",
                        "C. Pronoun",
                        "D. Adverb"
                },
                {
                        "A. A",
                        "B. An",
                        "C. The",
                        "D. No article"
                },
                {
                        "A. Go",
                        "B. Going",
                        "C. Gone",
                        "D. Went"
                },
                {
                        "A. Past Tense",
                        "B. Future Tense",
                        "C. Present Tense",
                        "D. Past Perfect Tense"
                },
                {
                        "A. Happy",
                        "B. Under",
                        "C. Quickly",
                        "D. Beautiful"
                },
                {
                        "A. A",
                        "B. An",
                        "C. The",
                        "D. No article"
                },
                {
                        "A. Our",
                        "B. Ours",
                        "C. We",
                        "D. Us"
                },
                {
                        "A. Taller",
                        "B. Tallest",
                        "C. More tall",
                        "D. Most tall"
                },
                {
                        "A. Beautiful",
                        "B. Slowly",
                        "C. Sleep",
                        "D. Under"
                },
                {
                        "A. Take",
                        "B. Pen",
                        "C. Did",
                        "D. My"
                },
                {
                        "A. Gooder",
                        "B. More good",
                        "C. Best",
                        "D. Better"
                },
                {
                        "A. Of",
                        "B. On",
                        "C. For",
                        "D. With"
                },
                {
                        "A. A",
                        "B. An",
                        "C. The",
                        "D. No article"
                },
                {
                        "A. First Person",
                        "B. Second Person",
                        "C. Third Person",
                        "D. None"
                },
                {
                        "A. Ran",
                        "B. Run",
                        "C. Running",
                        "D. Runs"
                },
                {
                        "A. Run",
                        "B. Tall",
                        "C. Slowly",
                        "D. On"
                },
                {
                        "A. Past Tense",
                        "B. Present Tense",
                        "C. Future Tense",
                        "D. Past Continuous"
                },
                {
                        "A. A",
                        "B. An",
                        "C. The",
                        "D. No article"
                }
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 900, 30);
            label2.setForeground(Color.GREEN);
            label2.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(label2);
        }

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 200), (i * 60 + 130), 200, 30);
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