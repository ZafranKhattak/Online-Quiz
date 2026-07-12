package Class.Class8.English.Easy;

import Class.Class8.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: What is the main topic of Unit 1 in the Class 8 English textbook?",
                "Question 2: The theme of Unit 2 is:",
                "Question 3: A word that has the opposite meaning of another word is called:",
                "Question 4: The poem \"The Twins\" is written by:",
                "Question 5: Which unit focuses on road safety?",
                "Question 6: A word that has the same meaning as another word is called:",
                "Question 7: The poem \"The Earth Speaks\" is written by:",
                "Question 8: Which unit deals with the life of Hazrat Umar (RA)?",
                "Question 9: The theme of Unit 6 is:",
                "Question 10: A person who flies an aircraft is called a:",
                "Question 11: The poem \"Daffodils\" is written by:",
                "Question 12: The theme of Unit 10 is:",
                "Question 13: The unit \"Settling the Quarrel\" has which theme?",
                "Question 14: The theme of Unit 9 is:",
                "Question 15: The poem \"Stopping by Woods on a Snowy Evening\" is written by:",
                "Question 16: The theme of Unit 11 is:",
                "Question 17: The study of how words are formed and how they relate to each other is called:",
                "Question 18: Which unit is about \"Mountaineering\"?",
                "Question 19: The poem \"The Earth Speaks\" has which theme?",
                "Question 20: The last unit of the textbook is titled:"
        };

        String options[][] = {
                {"A. Patriotism", "B. Tolerance of the Rasoolullah (ﷺ)", "C. Dignity of Labour", "D. Sportsmanship"},
                {"A. Ethics and Values", "B. Peaceful co-existence", "C. Sports", "D. Adventure"},
                {"A. Synonym", "B. Homophone", "C. Antonym", "D. Homonym"},
                {"A. William Wordsworth", "B. Henry S. Leigh", "C. Lenore Hetrick", "D. Robert Frost"},
                {"A. Unit 3", "B. Unit 4", "C. Unit 5", "D. Unit 6"},
                {"A. Synonym", "B. Antonym", "C. Homophone", "D. Homonym"},
                {"A. Lenore Hetrick", "B. Henry S. Leigh", "C. William Wordsworth", "D. Robert Frost"},
                {"A. Unit 4", "B. Unit 5", "C. Unit 6", "D. Unit 7"},
                {"A. Adventure", "B. Sports", "C. Role Models", "D. Environmental Education"},
                {"A. Driver", "B. Pilot", "C. Captain", "D. Conductor"},
                {"A. Lenore Hetrick", "B. Henry S. Leigh", "C. William Wordsworth", "D. Robert Frost"},
                {"A. Adventure", "B. Sports", "C. Dignity of Labour", "D. Environmental Education"},
                {"A. Participatory Citizenship", "B. Avoiding Social Evils", "C. Environmental Education", "D. Peaceful co-existence"},
                {"A. Adventure", "B. Sports", "C. Role Models", "D. Dignity of Labour"},
                {"A. Lenore Hetrick", "B. Henry S. Leigh", "C. William Wordsworth", "D. Robert Frost"},
                {"A. Adventure", "B. Sports", "C. Environmental Education", "D. Dignity of Labour"},
                {"A. Grammar", "B. Vocabulary", "C. Composition", "D. Comprehension"},
                {"A. Unit 8", "B. Unit 9", "C. Unit 10", "D. Unit 11"},
                {"A. Sports", "B. Adventure", "C. Environmental Education", "D. Role Models"},
                {"A. \"All is not Lost\"", "B. \"Drug Addiction\"", "C. \"Three Days to See\"", "D. \"The Quaid's Vision and Pakistan\""}
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