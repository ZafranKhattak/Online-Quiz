package Class.Class9.English.Hard;

import Class.Class9.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The central theme of the poem \"Open Thy Eyes and See Thy God\" is:",
                "Question 2: In \"The Death of Abhimanyu\", the warrior entered:",
                "Question 3: The meaning of \"civilians\" as used in the context of the textbook:",
                "Question 4: The word that means \"habitable\" is:",
                "Question 5: The phrase \"breathed another prayer of thanks\" means:",
                "Question 6: The word \"scattered\" means:",
                "Question 7: The phrase \"sublime faith in himself\" means:",
                "Question 8: The word \"unanimously\" means:",
                "Question 9: The phrase \"time of truce\" refers to:",
                "Question 10: The word \"ambition\" means:",
                "Question 11: The moral of the poem \"The Nightingale and the Glow-worm\" is:",
                "Question 12: The word \"massacre\" means:",
                "Question 13: The phrase \"the sky blazed with stars\" uses which literary device?",
                "Question 14: The word \"renounced\" means:",
                "Question 15: In \"The Death of Abhimanyu\", the hero died because:",
                "Question 16: The phrase \"the earth we pace\" refers to:",
                "Question 17: The word \"wailing\" as used in \"Journey by Night\" means:",
                "Question 18: The phrase \"lost in the throes of fear\" means:",
                "Question 19: The word \"visionary\" as used in the textbook means:",
                "Question 20: The theme of \"Three Great Indians\" is:"
        };

        String options[][] = {
                {"A. Wealth is important", "B. See God in everyone and everything", "C. Power is everything", "D. Ignore the poor"},
                {"A. A cave", "B. A fortress", "C. Chakravyuh", "D. A castle"},
                {"A. Soldiers", "B. Non-military citizens", "C. Government officials", "D. Police officers"},
                {"A. Fit to live in", "B. Fit to eat", "C. Fit to drink", "D. Fit to play"},
                {"A. Prayed for revenge", "B. Gave thanks for being safe", "C. Asked for help", "D. Asked for food"},
                {"A. Gathered together", "B. Spread over a wide area", "C. Kept in one place", "D. Thrown away"},
                {"A. Low self-esteem", "B. Strong and noble belief in oneself", "C. Faith in others", "D. Faith in money"},
                {"A. In disagreement", "B. With everyone agreeing", "C. With confusion", "D. With anger"},
                {"A. Time to fight", "B. Time of peace or ceasefire", "C. Time to rest", "D. Time to eat"},
                {"A. Laziness", "B. A strong desire to achieve something", "C. Fear of success", "D. Contentment"},
                {"A. Animals are better than humans", "B. Might is right", "C. Wisdom can save a life", "D. Birds are beautiful"},
                {"A. Peaceful gathering", "B. Celebration", "C. Brutal killing of many people", "D. Festival"},
                {"A. Simile", "B. Metaphor", "C. Personification", "D. Imagery"},
                {"A. Kept", "B. Gave up", "C. Ignored", "D. Received"},
                {"A. He was ill", "B. He was old", "C. He fought alone against many warriors", "D. He surrendered"},
                {"A. The world we run on", "B. The world we walk on", "C. The world we ignore", "D. The world we fly over"},
                {"A. Laughing", "B. Crying loudly", "C. Singing", "D. Sleeping"},
                {"A. Happy", "B. Experiencing extreme fear", "C. Brave", "D. Calm"},
                {"A. Imaginary", "B. Real", "C. Proven", "D. Visible"},
                {"A. Sacrifice and bravery for the nation", "B. Wealth and power", "C. Art and culture", "D. Education and learning"}
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
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
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