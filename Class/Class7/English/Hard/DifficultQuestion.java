package Class.Class7.English.Hard;

import Class.Class7.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The verb form agrees with the subject in: \"A great Gandhian and leader _____ dead.\"",
                "Question 2: Identify the correct sentence with subject-verb agreement:",
                "Question 3: Convert to passive voice: \"Someone has stolen my book.\"",
                "Question 4: \"The leader and the speaker _____ sitting on the stage.\" The correct verb is:",
                "Question 5: Which sentence shows correct use of \"between\" and \"among\"?",
                "Question 6: The word formed by adding prefix \"mis-\" to \"understand\" means:",
                "Question 7: \"I, who _____ your friend, will help you.\" The correct verb is:",
                "Question 8: Convert to active voice: \"The thief was caught by the police.\"",
                "Question 9: The plural form of \"criterion\" is:",
                "Question 10: Identify the sentence with the correct use of \"as well as\":",
                "Question 11: The verb phrase in \"They will have completed the project\" is:",
                "Question 12: Which sentence has correct subject-verb agreement with a collective noun?",
                "Question 13: The word \"invisible\" is formed by adding prefix \"in-\" to \"visible\". The meaning is:",
                "Question 14: \"The quality of the fruits _____ very good.\" The correct verb is:",
                "Question 15: Identify the correct use of \"who\" and \"whom\":",
                "Question 16: The word formed by adding suffix \"-able\" to \"remark\" is:",
                "Question 17: \"Ram, with all his friends, _____ present.\" The correct verb is:",
                "Question 18: The correct direct to indirect speech conversion: He said, \"I am happy.\"",
                "Question 19: Identify the figure of speech: \"Time is money.\"",
                "Question 20: The verb form in \"If I _____ you, I would not go\" is:"
        };

        String options[][] = {
                {"A. Are", "B. Were", "C. Is", "D. Have"},
                {"A. Each of the boys have done their work.", "B. Each of the boys has done his work.", "C. Each of the boys have done his work.", "D. Each of the boys has done their work."},
                {"A. My book has stolen.", "B. My book has been stolen.", "C. My book was stolen.", "D. My book is stolen."},
                {"A. Is", "B. Was", "C. Are", "D. Has"},
                {"A. Divide the sweets between all the children.", "B. Divide the sweets among the two brothers.", "C. Divide the sweets between the two brothers.", "D. Divide the sweets among the brothers."},
                {"A. Understand again", "B. Understand correctly", "C. Understand wrongly", "D. Understand before"},
                {"A. Is", "B. Are", "C. Am", "D. Was"},
                {"A. The police caught the thief.", "B. The police catches the thief.", "C. The police has caught the thief.", "D. The police were catching the thief."},
                {"A. Criterions", "B. Criteria", "C. Criterion", "D. Criterias"},
                {"A. He as well as his friends is coming.", "B. He as well as his friends are coming.", "C. He as well as his friends have come.", "D. He as well as his friends were coming."},
                {"A. Completed", "B. Will have", "C. Will have completed", "D. Have completed"},
                {"A. The committee has chosen its chairman.", "B. The committee have chosen its chairman.", "C. The committee has chosen their chairman.", "D. The committee are chosen their chairman."},
                {"A. Able to see", "B. Not able to see", "C. See again", "D. See before"},
                {"A. Are", "B. Were", "C. Is", "D. Have"},
                {"A. Who did you meet?", "B. Whom is coming today?", "C. Whom did you meet?", "D. Who are you talking?"},
                {"A. Remarkful", "B. Remarkless", "C. Remarkable", "D. Remarkment"},
                {"A. Are", "B. Were", "C. Was", "D. Have"},
                {"A. He said that I am happy.", "B. He said that he is happy.", "C. He said that he was happy.", "D. He said that I was happy."},
                {"A. Simile", "B. Metaphor", "C. Personification", "D. Hyperbole"},
                {"A. Was", "B. Were", "C. Am", "D. Had been"}
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