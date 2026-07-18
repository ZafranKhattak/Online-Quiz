package Class.Class9.English.Medium;

import Class.Class9.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: \"Grooming of a Boy\" teaches parents how to:",
                "Question 2: The phrase \"Time and tide wait for none\" means:",
                "Question 3: In the poem \"Daffodils\", the poet compares himself to:",
                "Question 4: The poem \"Open Thy Eyes and See Thy God\" is written by:",
                "Question 5: The phrase \"for every enemy there is a friend\" teaches us:",
                "Question 6: \"The test of fire makes fine steel\" means:",
                "Question 7: The poet of \"No Men Are Foreign\" is:",
                "Question 8: \"Budgeting Your Time\" teaches us to:",
                "Question 9: The phrase \"Now or Never\" means:",
                "Question 10: \"Journey by Night\" is a story about:",
                "Question 11: The poem \"The Nightingale and the Glow-worm\" is written by:",
                "Question 12: A \"homonym\" is a word that:",
                "Question 13: The word \"desolate\" means:",
                "Question 14: \"The Discovery of Moon\" tells us about:",
                "Question 15: The phrase \"steer him away from envy\" means:",
                "Question 16: The poet of \"The Nightingale and the Glow-worm\" uses animals to:",
                "Question 17: \"Three Great Indians\" is about:",
                "Question 18: The word \"furious\" means:",
                "Question 19: \"Plants also Breathe and Feel\" is about:",
                "Question 20: The word \"sublime\" means:"
        };

        String options[][] = {
                {"A. Make their child rich", "B. Raise a son with good values", "C. Teach their child to fight", "D. Make their child famous"},
                {"A. Time is slow", "B. Time is valuable and waits for no one", "C. Tide is faster than time", "D. Time can be stopped"},
                {"A. A cloud", "B. A flower", "C. A tree", "D. A bird"},
                {"A. William Wordsworth", "B. James Kirkup", "C. Rabindranath Tagore", "D. William Cowper"},
                {"A. Everyone is bad", "B. There is good in the world too", "C. We should have no friends", "D. Enemies are more important"},
                {"A. Fire is dangerous", "B. Difficulties make a person stronger", "C. Steel is made in fire", "D. Fire is not important"},
                {"A. Rabindranath Tagore", "B. James Kirkup", "C. William Cowper", "D. William Wordsworth"},
                {"A. Waste time", "B. Be punctual and manage time well", "C. Ignore time", "D. Sleep all day"},
                {"A. Wait for later", "B. Never do anything", "C. Act immediately", "D. Take your time"},
                {"A. A journey in a train", "B. A journey in an aeroplane", "C. A journey through a forest at night", "D. A journey in a ship"},
                {"A. Rabindranath Tagore", "B. James Kirkup", "C. William Cowper", "D. William Wordsworth"},
                {"A. Has the same spelling but different meaning", "B. Has the same sound but different spelling and meaning", "C. Has the same meaning as another word", "D. Has the opposite meaning of another word"},
                {"A. Beautiful", "B. Crowded", "C. Empty and deserted", "D. Green and lush"},
                {"A. The sun", "B. The stars", "C. The moon and its features", "D. The planets"},
                {"A. Encourage envy", "B. Discourage envy", "C. Ignore envy", "D. Envy is good"},
                {"A. Describe animals", "B. Teach a moral lesson", "C. Talk about nature", "D. Describe a zoo"},
                {"A. Three British men", "B. Three American leaders", "C. Indian freedom fighters", "D. Three kings"},
                {"A. Happy", "B. Sad", "C. Very angry", "D. Calm"},
                {"A. Plants are not alive", "B. Plants breathe and have feelings", "C. Plants are like rocks", "D. Plants do not need water"},
                {"A. Low", "B. Ordinary", "C. Noble and grand", "D. Bad"}
        };

        int correctAnswers[] = {
                1,  // Q1: Raise a son with good values
                1,  // Q2: Time is valuable and waits for no one
                0,  // Q3: A cloud
                2,  // Q4: Rabindranath Tagore
                1,  // Q5: There is good in the world too
                1,  // Q6: Difficulties make a person stronger
                0,  // Q7: Rabindranath Tagore
                1,  // Q8: Be punctual and manage time well
                2,  // Q9: Act immediately
                2,  // Q10: A journey through a forest at night
                2,  // Q11: William Cowper
                0,  // Q12: Has the same spelling but different meaning
                2,  // Q13: Empty and deserted
                2,  // Q14: The moon and its features
                1,  // Q15: Discourage envy
                1,  // Q16: Teach a moral lesson
                2,  // Q17: Indian freedom fighters
                2,  // Q18: Very angry
                1,  // Q19: Plants breathe and have feelings
                2   // Q20: Noble and grand
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
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