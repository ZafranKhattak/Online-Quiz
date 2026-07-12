package Class.Class8.English.Hard;

import Class.Class8.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: In Unit 1, what is the central theme of \"Tolerance of the Rasoolullah (ﷺ)\"?",
                "Question 2: According to Unit 4, which of the following is a road safety measure?",
                "Question 3: The poem \"The Twins\" is about:",
                "Question 4: What does Unit 8, \"Settling the Quarrel\", teach us?",
                "Question 5: Which unit covers the importance of respecting all types of work?",
                "Question 6: In Unit 5, what is highlighted about Hazrat Umar (RA)?",
                "Question 7: The central idea of Unit 12, \"Three Days to See\", is:",
                "Question 8: Which unit discusses the harmful effects of noise pollution?",
                "Question 9: Unit 2, \"A Great Virtue\", emphasizes:",
                "Question 10: The poem \"Stopping by Woods on a Snowy Evening\" explores the theme of:",
                "Question 11: Unit 6, \"Sports and Sportsmanship\", teaches that:",
                "Question 12: What is the message of the poem \"The Earth Speaks\"?",
                "Question 13: Unit 9, \"Mountaineering\", is about:",
                "Question 14: In Unit 10, what is the value of \"Dignity of Labour\"?",
                "Question 15: Unit 3, \"The Twins\", has which theme?",
                "Question 16: The poet of \"Stopping by Woods on a Snowy Evening\" is:",
                "Question 17: Unit 8, \"Settling the Quarrel\", encourages:",
                "Question 18: What is the main message of Unit 12, \"Three Days to See\"?",
                "Question 19: Unit 2, \"A Great Virtue\", promotes:",
                "Question 20: The poem \"The Twins\" is written by Henry S. Leigh and is about:"
        };

        String options[][] = {
                {"A. Justice and equality", "B. Patience and forgiveness", "C. Bravery and leadership", "D. Wealth and generosity"},
                {"A. Driving at high speed", "B. Wearing a seatbelt", "C. Ignoring traffic signals", "D. Overtaking on curves"},
                {"A. Two brothers", "B. Two sisters", "C. A humorous comparison between two people", "D. Two countries"},
                {"A. How to win an argument", "B. The importance of revenge", "C. How to resolve disputes peacefully", "D. The value of competition"},
                {"A. Unit 9: Mountaineering", "B. Unit 10: Dignity of Labour", "C. Unit 11: Noise in the Environment", "D. Unit 12: Three Days to See"},
                {"A. His business skills", "B. His poetry", "C. His justice and leadership", "D. His military strategies"},
                {"A. The importance of technology", "B. Appreciating the gift of sight", "C. The value of wealth", "D. The importance of travel"},
                {"A. Unit 9: Mountaineering", "B. Unit 10: Dignity of Labour", "C. Unit 11: Noise in the Environment", "D. Unit 12: Three Days to See"},
                {"A. Courage", "B. Honesty", "C. Tolerance", "D. Strength"},
                {"A. Adventure", "B. Nature and solitude", "C. Sportsmanship", "D. Environmental protection"},
                {"A. Winning is everything", "B. Fair play is important", "C. Sports are only for the strong", "D. Competition is harmful"},
                {"A. The earth is beautiful", "B. Protecting the environment is important", "C. The earth is dangerous", "D. Nature is not important"},
                {"A. The dangers of climbing", "B. The spirit of adventure", "C. The history of mountains", "D. The importance of equipment"},
                {"A. All work is valuable", "B. Only some work is valuable", "C. Labour is not important", "D. Only physical labour matters"},
                {"A. Ethics and Values", "B. Personality Development", "C. Peaceful co-existence", "D. Participatory Citizenship"},
                {"A. Lenore Hetrick", "B. Henry S. Leigh", "C. William Wordsworth", "D. Robert Frost"},
                {"A. Fighting for what you want", "B. Peaceful resolution of conflicts", "C. Ignoring problems", "D. Seeking revenge"},
                {"A. Sight is overrated", "B. We should appreciate what we have", "C. Only the blind understand sight", "D. Technology is more important than sight"},
                {"A. Selfishness", "B. Peaceful co-existence", "C. Competition", "D. Isolation"},
                {"A. Two identical people", "B. Two opposing forces", "C. A humorous situation", "D. Nature and beauty"}
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