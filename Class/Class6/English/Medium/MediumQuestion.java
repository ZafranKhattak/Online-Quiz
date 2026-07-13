package Class.Class6.English.Medium;

import Class.Class6.English.EnglishDashboard.EnglishDashboard;
import javax.swing.*;
import java.awt.*;

public class MediumQuestion {

        public MediumQuestion() {

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
                                "Question 1: He is ______ European.",
                                "Question 2: If it is 8 o'clock, and my friend came here at 8, I should say:",
                                "Question 3: Which is the correct past form of the verb \"teach\"?",
                                "Question 4: \"The sun rises in the east.\" The verb \"rises\" shows:",
                                "Question 5: Rewrite the sentence in singular: \"Houses have roofs.\"",
                                "Question 6: The comparative degree of \"bad\" is:",
                                "Question 7: \"I am fond ______ music.\" The correct preposition is:",
                                "Question 8: Which word is a Demonstrative Pronoun?",
                                "Question 9: The three forms of the verb \"speak\" are:",
                                "Question 10: In the sentence \"He is writing a poem\", the Auxiliary verb is:",
                                "Question 11: The preposition \"between\" is used for:",
                                "Question 12: The superlative degree of \"beautiful\" is:",
                                "Question 13: Correct the sentence: \"I go for the walk in evening.\"",
                                "Question 14: In the sentence \"Who teaches you English?\", the word \"Who\" is a/an:",
                                "Question 15: The present participle form of \"swim\" is:",
                                "Question 16: The two brothers divided the property ______ themselves.",
                                "Question 17: \"This book is mine.\" The underlined word \"mine\" is a:",
                                "Question 18: The past negative form of \"She cooks food for me\" is:",
                                "Question 19: A Collective Noun is the name of:",
                                "Question 20: Complete the sentence using the correct preposition: \"Please keep the books ______ the shelf.\""
                };

                String options[][] = {
                                {
                                                "A. a",
                                                "B. an",
                                                "C. the",
                                                "D. no article"
                                },
                                {
                                                "A. My friend came here in 8 o'clock.",
                                                "B. My friend came here on 8 o'clock.",
                                                "C. My friend came here at 8 o'clock.",
                                                "D. My friend came here by 8 o'clock."
                                },
                                {
                                                "A. Teach",
                                                "B. Taught",
                                                "C. Teached",
                                                "D. Teaching"
                                },
                                {
                                                "A. Past state",
                                                "B. Habitual action",
                                                "C. Future action",
                                                "D. Past action"
                                },
                                {
                                                "A. A house have a roof.",
                                                "B. A house has a roof.",
                                                "C. A house has roofs.",
                                                "D. House has roof."
                                },
                                {
                                                "A. Worse",
                                                "B. Worst",
                                                "C. Badder",
                                                "D. More bad"
                                },
                                {
                                                "A. on",
                                                "B. for",
                                                "C. of",
                                                "D. with"
                                },
                                {
                                                "A. Who",
                                                "B. She",
                                                "C. This",
                                                "D. Yourself"
                                },
                                {
                                                "A. speak, spoke, spoken",
                                                "B. speak, speaked, spoken",
                                                "C. speak, spoke, spoke",
                                                "D. speak, spoken, spoke"
                                },
                                {
                                                "A. He",
                                                "B. is",
                                                "C. writing",
                                                "D. poem"
                                },
                                {
                                                "A. More than two persons",
                                                "B. Two persons",
                                                "C. A single person",
                                                "D. A place"
                                },
                                {
                                                "A. Beautifuler",
                                                "B. More beautiful",
                                                "C. Most beautiful",
                                                "D. Beautifullest"
                                },
                                {
                                                "A. I go for walk in evening.",
                                                "B. I go for a walk in the evening.",
                                                "C. I go for a walk in evening.",
                                                "D. I go for the walk in a evening."
                                },
                                {
                                                "A. Personal Pronoun",
                                                "B. Demonstrative Pronoun",
                                                "C. Interrogative Pronoun",
                                                "D. Reflexive Pronoun"
                                },
                                {
                                                "A. Swiming",
                                                "B. Swimming",
                                                "C. Swam",
                                                "D. Swum"
                                },
                                {
                                                "A. among",
                                                "B. between",
                                                "C. with",
                                                "D. from"
                                },
                                {
                                                "A. Verb",
                                                "B. Adjective",
                                                "C. Personal Pronoun",
                                                "D. Preposition"
                                },
                                {
                                                "A. She did not cook food for me.",
                                                "B. She did not cooked food for me.",
                                                "C. She does not cook food for me.",
                                                "D. She was not cook food for me."
                                },
                                {
                                                "A. A particular person",
                                                "B. A group of persons or things",
                                                "C. A quality or feeling",
                                                "D. A common thing"
                                },
                                {
                                                "A. in",
                                                "B. at",
                                                "C. on",
                                                "D. into"
                                }
                        };

int[] correctAnswers = {
    0, // Q1 -> A. a
    2, // Q2 -> C. My friend came here at 8 o'clock.
    1, // Q3 -> B. Taught
    1, // Q4 -> B. Habitual action
    1, // Q5 -> B. A house has a roof.
    0, // Q6 -> A. Worse
    2, // Q7 -> C. of
    2, // Q8 -> C. This
    0, // Q9 -> A. speak, spoke, spoken
    1, // Q10 -> B. is
    1, // Q11 -> B. Two persons
    2, // Q12 -> C. Most beautiful
    1, // Q13 -> B. I go for a walk in the evening.
    2, // Q14 -> C. Interrogative Pronoun
    1, // Q15 -> B. Swimming
    1, // Q16 -> B. between
    2, // Q17 -> C. Personal Pronoun
    0, // Q18 -> A. She did not cook food for me.
    1, // Q19 -> B. A group of persons or things
    2  // Q20 -> C. on
};
                for (int i = 0; i < questions.length; i++) {
                        JLabel label2 = new JLabel(questions[i]);
                        label2.setBounds(80, 1 + (i * 60 + 100), 950, 30);
                        label2.setForeground(Color.GREEN);
                        label2.setFont(new Font("Arial", Font.BOLD, 16));
                        panel.add(label2);
                }

                // Create radio buttons
        JRadioButton[][] buttons = new JRadioButton[questions.length][4];
        ButtonGroup[] groups = new ButtonGroup[questions.length];
                for (int i = 0; i < options.length; i++) {
                        groups[i] = new ButtonGroup();
                        for (int j = 0; j < 4; j++) {
                                JRadioButton btn = new JRadioButton(options[i][j]);
                                buttons[i][j] = btn;                             
                                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
                                btn.setForeground(Color.WHITE);
                                btn.setBackground(Color.BLACK);
                                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                                groups[i].add(btn);
                        }
                }

                // ========================= BUTTON FOR SUBMIT ==================== //

                JButton buttonSubmit = new JButton("Submit");
                buttonSubmit.setLayout(null);
                buttonSubmit.setBounds(750, 1340, 200, 30);
                buttonSubmit.setBackground(Color.GREEN);
                buttonSubmit.setForeground(Color.BLACK);
                buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
                buttonSubmit.addActionListener(e ->
                         {
                    int marks = 0;
            // Calculate marks
            for (int i = 0; i < questions.length; i++) {
                for (int j = 0; j < 4; j++) {
                    if (buttons[i][j].isSelected() && j == correctAnswers[i]) {
                        marks++;
                        break;
                    }
                }
            }
            int confirm = JOptionPane.showConfirmDialog(null, "You want to Submit Quiz" , "Submit Quiz" , 
                JOptionPane.YES_NO_OPTION);

                if(confirm == JOptionPane.YES_OPTION)
                {
                        JOptionPane.showMessageDialog(null, "You scored " + marks + " out of " + questions.length + 
                    "\n\nPercentage: " + (marks * 100 / questions.length) + "%",
                    "Quiz Result",
                        JOptionPane.INFORMATION_MESSAGE
                        );
                }});
                panel.add(buttonSubmit);

                // =========================== BACK BUTTON FOR DASHBOARD OF LEVEL
                // ================ //
                JButton buttonBack = new JButton("BACK");
                buttonBack.setLayout(null);
                buttonBack.setBounds(450, 1340, 200, 30);
                buttonBack.setBackground(Color.BLUE);
                buttonBack.setForeground(Color.BLACK);
                buttonBack.setFont(new Font("Arial", Font.BOLD, 15));
                buttonBack.addActionListener(e ->
                {
                        new EnglishDashboard();
                        frame.dispose();
                }
        );
                panel.add(buttonBack);

}
}