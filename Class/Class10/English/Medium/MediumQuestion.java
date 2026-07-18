package Class.Class10.English.Medium;

import Class.Class10.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The poet says, \"If we strive, 'tis no disgrace.\" This means:",
                "Question 2: According to \"Try Again,\" what should one do if one's task is hard?",
                "Question 3: The phrase \"Time will bring you your reward\" means:",
                "Question 4: In \"The Happy Prince,\" why did the prince weep?",
                "Question 5: The lesson \"Where is Science Taking Us?\" discusses:",
                "Question 6: The central idea of the poem \"Where the Mind is Without Fear\" is about:",
                "Question 7: The word \"persevere\" in the poem \"Try Again\" means:",
                "Question 8: In \"A Gift for Christmas,\" what was Jim's proud possession?",
                "Question 9: The phrase \"If you would at last prevail\" means:",
                "Question 10: The lesson \"The Secret of Happiness\" teaches:",
                "Question 11: The word \"patience\" in the poem \"Try Again\" means:",
                "Question 12: The future indefinite tense in \"We shall visit our uncle\" indicates:",
                "Question 13: In \"The Home-Coming,\" Phatik Chakravarti was:",
                "Question 14: The phrase \"All that other folk can do\" refers to:",
                "Question 15: The poem \"The Making of the Earth\" is about:",
                "Question 16: A superlative degree of adjective is used in:",
                "Question 17: In \"The Rule of the Road,\" the author discusses:",
                "Question 18: A possessive pronoun is:",
                "Question 19: The word \"prevail\" as used in \"Try Again\" means:",
                "Question 20: The lesson \"Some Glimpses of Ancient Indian Thought and Practices\" mentions:"
        };

        String options[][] = {
                {"A. Trying is shameful", "B. There is no shame in trying hard", "C. Only success matters", "D. Failure is a disgrace"},
                {"A. Give up immediately", "B. Blame others", "C. Keep trying with patience", "D. Change the task"},
                {"A. Success will come with time and effort", "B. Time is not important", "C. Success comes instantly", "D. Reward is not necessary"},
                {"A. He was sad about his statue", "B. He saw the suffering of the poor people", "C. He missed his palace", "D. He was angry at the swallow"},
                {"A. The benefits of science only", "B. The harms of science only", "C. Both the benefits and potential dangers of science", "D. The history of science"},
                {"A. Fear and danger", "B. Freedom and courage", "C. Wealth and power", "D. Nature and beauty"},
                {"A. To give up easily", "B. To continue despite difficulties", "C. To fear failure", "D. To avoid work"},
                {"A. His coat", "B. His gold watch", "C. His car", "D. His house"},
                {"A. If you want to fail", "B. If you want to win in the end", "C. If you want to give up", "D. If you want to rest"},
                {"A. Happiness comes from wealth", "B. Fear is a common enemy", "C. Success is everything", "D. Power leads to happiness"},
                {"A. Anger", "B. Tolerance and perseverance", "C. Laziness", "D. Indifference"},
                {"A. Past action", "B. Present action", "C. Future action", "D. Completed action"},
                {"A. A quiet and obedient boy", "B. The ring-leader among the village boys", "C. A rich businessman", "D. A school teacher"},
                {"A. Only family members", "B. Only children", "C. All people in general", "D. Only rich people"},
                {"A. The creation of life", "B. The formation of the earth and solar system", "C. The history of mankind", "D. The evolution of animals"},
                {"A. \"He is taller than me\"", "B. \"She is the prettiest girl\"", "C. \"The car is fast\"", "D. \"He runs quickly\""},
                {"A. Traffic rules", "B. Personal liberty and social responsibility", "C. Driving safety", "D. Public transport"},
                {"A. I, we, they", "B. Me, him, us", "C. Mine, his, hers", "D. Who, which, that"},
                {"A. To lose", "B. To win or prove more powerful", "C. To give up", "D. To fear"},
                {"A. Modern technology", "B. Values like sharing and unity of life", "C. Western philosophy", "D. Political systems"}
        };

        int correctAnswers[] = {
                1,  // Q1: There is no shame in trying hard
                2,  // Q2: Keep trying with patience
                0,  // Q3: Success will come with time and effort
                1,  // Q4: He saw the suffering of the poor people
                2,  // Q5: Both the benefits and potential dangers of science
                1,  // Q6: Freedom and courage
                1,  // Q7: To continue despite difficulties
                1,  // Q8: His gold watch
                1,  // Q9: If you want to win in the end
                1,  // Q10: Fear is a common enemy
                1,  // Q11: Tolerance and perseverance
                2,  // Q12: Future action
                1,  // Q13: The ring-leader among the village boys
                2,  // Q14: All people in general
                1,  // Q15: The formation of the earth and solar system
                1,  // Q16: "She is the prettiest girl"
                1,  // Q17: Personal liberty and social responsibility
                2,  // Q18: Mine, his, hers
                1,  // Q19: To win or prove more powerful
                1   // Q20: Values like sharing and unity of life
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