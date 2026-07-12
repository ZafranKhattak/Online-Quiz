package Class.Class8.English.Medium;

import Class.Class8.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The first unit of the Class 8 English textbook is about the tolerance of which personality?",
                "Question 2: What is the theme of Unit 3, which includes the poem \"The Twins\"?",
                "Question 3: Which unit discusses a person's perspective on sight and its importance?",
                "Question 4: What is the theme of Unit 8, \"Settling the Quarrel\"?",
                "Question 5: Which of the following is a theme from the Class 8 English textbook?",
                "Question 6: The theme of Unit 1, \"Tolerance of the Rasoolullah (ﷺ)\", is:",
                "Question 7: Which unit deals with \"Noise in the Environment\"?",
                "Question 8: The theme of Unit 5, covering Hazrat Umar (RA), is:",
                "Question 9: Which unit promotes \"Participatory Citizenship\"?",
                "Question 10: The poem \"Daffodils\" has which theme?",
                "Question 11: Which unit discusses \"Drug Addiction\"?",
                "Question 12: The theme of Unit 7, \"The Earth Speaks\", is:",
                "Question 13: Which unit is about \"All is not Lost\"?",
                "Question 14: What is the theme of Unit 4, \"Let's Make our Roads Safer!\"?",
                "Question 15: The poem \"The Twins\" is included in which unit?",
                "Question 16: The skill of listening, speaking, reading, and writing together are known as:",
                "Question 17: Which theme is associated with Unit 2, \"A Great Virtue\"?",
                "Question 18: What is the theme of Unit 6, \"Sports and Sportsmanship\"?",
                "Question 19: A group of words that expresses a complete thought is called a:",
                "Question 20: The poet of \"The Earth Speaks\" is:"
        };

        String options[][] = {
                {"A. Hazrat Umar (RA)", "B. The Quaid", "C. The Rasoolullah (ﷺ)", "D. Hazrat Asma (RA)"},
                {"A. Ethics and Values", "B. Personality Development", "C. Peaceful co-existence", "D. Participatory Citizenship"},
                {"A. \"All is not Lost\"", "B. \"Drug Addiction\"", "C. \"Three Days to See\"", "D. \"The Quaid's Vision and Pakistan\""},
                {"A. Participatory Citizenship", "B. Avoiding Social Evils", "C. Environmental Education", "D. Peaceful co-existence"},
                {"A. Space Exploration", "B. Participatory Citizenship", "C. Artificial Intelligence", "D. Robotics"},
                {"A. Ethics and Values", "B. Role Models", "C. Peaceful co-existence", "D. Personality Development"},
                {"A. Unit 9", "B. Unit 10", "C. Unit 11", "D. Unit 12"},
                {"A. Adventure", "B. Sports", "C. Role Models", "D. Dignity of Labour"},
                {"A. Unit 3: The Twins", "B. Unit 4: Let's Make our Roads Safer!", "C. Unit 6: Sports and Sportsmanship", "D. Unit 8: Settling the Quarrel"},
                {"A. Adventure", "B. Environmental Education", "C. Personality Development", "D. Sports"},
                {"A. Unit 9", "B. Unit 10", "C. Unit 11", "D. Unit 12"},
                {"A. Environmental Education", "B. Adventure", "C. Sports", "D. Role Models"},
                {"A. Unit 8", "B. Unit 9", "C. Unit 10", "D. Unit 11"},
                {"A. Participatory Citizenship", "B. Ethics and Values", "C. Peaceful co-existence", "D. Avoiding Social Evils"},
                {"A. Unit 1", "B. Unit 2", "C. Unit 3", "D. Unit 4"},
                {"A. Language skills", "B. Thinking skills", "C. Analytical skills", "D. Creative skills"},
                {"A. Sports", "B. Adventure", "C. Peaceful co-existence", "D. Environmental Education"},
                {"A. Adventure", "B. Role Models", "C. Sports", "D. Ethics and Values"},
                {"A. Phrase", "B. Clause", "C. Sentence", "D. Paragraph"},
                {"A. Lenore Hetrick", "B. Henry S. Leigh", "C. William Wordsworth", "D. Robert Frost"}
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