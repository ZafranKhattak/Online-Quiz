package Class.Class7.English.Medium;

import Class.Class7.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: Identify the helping verb: \"She has completed her homework.\"",
                "Question 2: The comparative degree of \"bad\" is:",
                "Question 3: \"Neither of the students _____ present.\" The correct verb is:",
                "Question 4: Which suffix can be added to \"hope\" to make an adjective?",
                "Question 5: \"The boy, with his friends, _____ playing.\" The correct verb is:",
                "Question 6: Identify the relative pronoun: \"The man who came here is my uncle.\"",
                "Question 7: The superlative degree of \"beautiful\" is:",
                "Question 8: \"The cattle _____ grazing in the field.\" The correct verb is:",
                "Question 9: Identify the prefix in \"rewrite\":",
                "Question 10: Which sentence has correct subject-verb agreement?",
                "Question 11: \"He is fond _____ music.\" The correct preposition is:",
                "Question 12: The word \"childish\" is formed by adding the suffix:",
                "Question 13: \"The book is _____ the table.\" The correct preposition is:",
                "Question 14: Identify the conjunction: \"He worked hard but he failed.\"",
                "Question 15: The antonym of \"optimistic\" is:",
                "Question 16: \"Either he or I _____ to go.\" The correct verb is:",
                "Question 17: Which word is a homophone of \"write\"?",
                "Question 18: \"She _____ here since 2010.\" The correct verb is:",
                "Question 19: Identify the abstract noun: \"Honesty is the best policy.\"",
                "Question 20: The word \"preview\" means:"
        };

        String options[][] = {
                {"A. She", "B. Has", "C. Completed", "D. Her"},
                {"A. Baddest", "B. More bad", "C. Worse", "D. Worst"},
                {"A. Are", "B. Were", "C. Is", "D. Have"},
                {"A. -less", "B. -ly", "C. -er", "D. -tion"},
                {"A. Are", "B. Were", "C. Was", "D. Have"},
                {"A. Man", "B. Who", "C. Here", "D. Uncle"},
                {"A. More beautiful", "B. Beautifuler", "C. Most beautiful", "D. Beautifullest"},
                {"A. Is", "B. Are", "C. Was", "D. Has"},
                {"A. Re", "B. Write", "C. Rite", "D. Rew"},
                {"A. The news are good.", "B. The news is good.", "C. The news were good.", "D. The news have good."},
                {"A. Of", "B. On", "C. For", "D. With"},
                {"A. -ish", "B. -less", "C. -ful", "D. -ly"},
                {"A. In", "B. On", "C. At", "D. Into"},
                {"A. Hard", "B. But", "C. He", "D. Failed"},
                {"A. Hopeful", "B. Positive", "C. Pessimistic", "D. Cheerful"},
                {"A. Is", "B. Am", "C. Are", "D. Was"},
                {"A. Right", "B. Rite", "C. Both A and B", "D. None"},
                {"A. Is living", "B. Has been living", "C. Was living", "D. Will be living"},
                {"A. Honesty", "B. Policy", "C. Best", "D. Is"},
                {"A. View before", "B. View after", "C. View again", "D. View against"}
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
                btn.setBounds(80 + (j * 220), (i * 60 + 130), 220, 30);
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