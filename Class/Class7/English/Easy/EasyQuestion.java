package Class.Class7.English.Easy;

import Class.Class7.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: A word used in place of a noun is called a:",
                "Question 2: Which of the following is a noun?",
                "Question 3: The past tense of \"go\" is:",
                "Question 4: \"He is writing a letter.\" The verb in this sentence is:",
                "Question 5: Which word is a preposition?",
                "Question 6: The plural of \"child\" is:",
                "Question 7: Which word is an adjective?",
                "Question 8: \"I am a student.\" The pronoun in this sentence is:",
                "Question 9: The future tense of \"play\" is:",
                "Question 10: Which word is a conjunction?",
                "Question 11: The opposite of \"happy\" is:",
                "Question 12: \"She sings beautifully.\" The adverb in this sentence is:",
                "Question 13: The plural of \"man\" is:",
                "Question 14: Which article is used before \"apple\"?",
                "Question 15: \"We are going to school.\" The verb in this sentence is:",
                "Question 16: The past tense of \"eat\" is:",
                "Question 17: Which of the following is a proper noun?",
                "Question 18: \"He runs fast.\" The word \"fast\" is a/an:",
                "Question 19: The article used before \"umbrella\" is:",
                "Question 20: The present participle of \"swim\" is:"
        };

        String options[][] = {
                {"A. Verb", "B. Adjective", "C. Pronoun", "D. Adverb"},
                {"A. Run", "B. Beautiful", "C. Book", "D. Quickly"},
                {"A. Go", "B. Going", "C. Gone", "D. Went"},
                {"A. He", "B. Is", "C. Writing", "D. Letter"},
                {"A. Under", "B. Happy", "C. Quickly", "D. Beautiful"},
                {"A. Childs", "B. Children", "C. Childrens", "D. Childes"},
                {"A. Tall", "B. Run", "C. On", "D. Slowly"},
                {"A. Am", "B. A", "C. Student", "D. I"},
                {"A. Played", "B. Playing", "C. Will play", "D. Plays"},
                {"A. On", "B. And", "C. Under", "D. Slowly"},
                {"A. Glad", "B. Joyful", "C. Sad", "D. Cheerful"},
                {"A. She", "B. Sings", "C. Beautifully", "D. The"},
                {"A. Mans", "B. Men", "C. Mens", "D. Manes"},
                {"A. A", "B. An", "C. The", "D. No article"},
                {"A. We", "B. Are", "C. Going", "D. School"},
                {"A. Eated", "B. Eat", "C. Ate", "D. Eating"},
                {"A. City", "B. Lahore", "C. Boy", "D. River"},
                {"A. Noun", "B. Verb", "C. Adjective", "D. Adverb"},
                {"A. A", "B. An", "C. The", "D. None"},
                {"A. Swiming", "B. Swam", "C. Swimming", "D. Swum"}
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 850, 30);
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