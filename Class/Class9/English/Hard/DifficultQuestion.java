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

        int correctAnswers[] = {
                1,  // Q1: See God in everyone and everything
                2,  // Q2: Chakravyuh
                1,  // Q3: Non-military citizens
                0,  // Q4: Fit to live in
                1,  // Q5: Gave thanks for being safe
                1,  // Q6: Spread over a wide area
                1,  // Q7: Strong and noble belief in oneself
                1,  // Q8: With everyone agreeing
                1,  // Q9: Time of peace or ceasefire
                1,  // Q10: A strong desire to achieve something
                2,  // Q11: Wisdom can save a life
                2,  // Q12: Brutal killing of many people
                2,  // Q13: Personification
                1,  // Q14: Gave up
                2,  // Q15: He fought alone against many warriors
                1,  // Q16: The world we walk on
                1,  // Q17: Crying loudly
                1,  // Q18: Experiencing extreme fear
                0,  // Q19: Imaginary
                0   // Q20: Sacrifice and bravery for the nation
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                btn.setActionCommand(String.valueOf(j));
                group.add(btn);
                panel.add(btn);
                radioButtons[i][j] = btn;
            }
        }

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(80, 1280, 500, 30);
        resultLabel.setForeground(Color.YELLOW);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(resultLabel);

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            int score = 0;
            int totalQuestions = questions.length;
            
            // Check each question
            for (int i = 0; i < totalQuestions; i++) {
                for (int j = 0; j < 4; j++) {
                    if (radioButtons[i][j].isSelected() && j == correctAnswers[i]) {
                        score++;
                        break;
                    }
                }
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to submit?", 
                "Confirm Submission", 
                JOptionPane.YES_NO_OPTION);
                
            if (confirm == JOptionPane.YES_OPTION) {
                double percentage = (double) score / totalQuestions * 100;
                String grade;
                if (percentage >= 80) {
                    grade = "Excellent!";
                } else if (percentage >= 60) {
                    grade = "Good!";
                } else if (percentage >= 40) {
                    grade = "Fair";
                } else {
                    grade = "Needs Improvement";
                }
                
                String message = String.format(
                    "<html><body style='text-align: center;'>" +
                    "<h2>Quiz Results</h2>" +
                    "<p>Total Questions: %d</p>" +
                    "<p>Correct Answers: %d</p>" +
                    "<p>Wrong Answers: %d</p>" +
                    "<p>Percentage: %.1f%%</p>" +
                    "<p>Grade: %s</p>" +
                    "</body></html>",
                    totalQuestions, score, totalQuestions - score, percentage, grade
                );
                
                JOptionPane.showMessageDialog(null, message, "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
                resultLabel.setText(String.format("Score: %d/%d (%.1f%%)", score, totalQuestions, percentage));
            }
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