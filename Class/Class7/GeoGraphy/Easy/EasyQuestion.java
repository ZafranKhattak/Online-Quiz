package Class.Class7.GeoGraphy.Easy;

import Class.Class7.GeoGraphy.GeoGraphyDashboard.GeoGraphyDashboard;
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
                "Question 1: The surroundings of human beings are called:",
                "Question 2: Which of the following is NOT a component of the environment?",
                "Question 3: The solid part of the Earth's surface is called:",
                "Question 4: The layer of air surrounding the Earth is called:",
                "Question 5: All the water bodies on Earth together form the:",
                "Question 6: The zone where land, water and air meet is called:",
                "Question 7: The largest ocean in the world is:",
                "Question 8: Which type of vegetation grows naturally in an area?",
                "Question 9: Human settlements include:",
                "Question 10: Which is the oldest mode of transport?",
                "Question 11: Which of the following is a means of communication?",
                "Question 12: The process of moving from one place to another is called:",
                "Question 13: A group of houses is called:",
                "Question 14: Which of the following is a major landform?",
                "Question 15: The early civilizations developed near:",
                "Question 16: The layer of air is essential for:",
                "Question 17: Which of the following is a renewable natural resource?",
                "Question 18: The study of distribution of natural resources is part of:",
                "Question 19: Which of the following is an example of a man-made environment?",
                "Question 20: The environment is important because it provides:"
        };

        String options[][] = {
                {"A. Atmosphere", "B. Environment", "C. Hydrosphere", "D. Lithosphere"},
                {"A. Land", "B. Water", "C. Air", "D. Population"},
                {"A. Atmosphere", "B. Hydrosphere", "C. Lithosphere", "D. Biosphere"},
                {"A. Lithosphere", "B. Hydrosphere", "C. Biosphere", "D. Atmosphere"},
                {"A. Lithosphere", "B. Hydrosphere", "C. Atmosphere", "D. Biosphere"},
                {"A. Lithosphere", "B. Hydrosphere", "C. Atmosphere", "D. Biosphere"},
                {"A. Atlantic Ocean", "B. Indian Ocean", "C. Arctic Ocean", "D. Pacific Ocean"},
                {"A. Plantation", "B. Natural vegetation", "C. Agricultural crops", "D. Ornamental plants"},
                {"A. Villages only", "B. Cities only", "C. Both villages and cities", "D. Forests only"},
                {"A. Air transport", "B. Water transport", "C. Road transport", "D. Railway transport"},
                {"A. Road", "B. Telephone", "C. Railway", "D. Ship"},
                {"A. Communication", "B. Transportation", "C. Settlement", "D. Migration"},
                {"A. A village", "B. A settlement", "C. A town", "D. All of the above"},
                {"A. Mountain", "B. Plain", "C. Plateau", "D. All of the above"},
                {"A. Deserts", "B. River valleys", "C. Mountains", "D. Forests"},
                {"A. Breathing", "B. Agriculture", "C. Climate", "D. All of the above"},
                {"A. Coal", "B. Petroleum", "C. Forest", "D. Natural gas"},
                {"A. Geography", "B. Biology", "C. Physics", "D. Chemistry"},
                {"A. Mountain", "B. River", "C. Road", "D. Forest"},
                {"A. Air to breathe", "B. Water to drink", "C. Food to eat", "D. All of the above"}
        };

        int correctAnswers[] = {
                1,  // Q1: Environment
                3,  // Q2: Population
                2,  // Q3: Lithosphere
                3,  // Q4: Atmosphere
                1,  // Q5: Hydrosphere
                3,  // Q6: Biosphere
                3,  // Q7: Pacific Ocean
                1,  // Q8: Natural vegetation
                2,  // Q9: Both villages and cities
                1,  // Q10: Water transport
                1,  // Q11: Telephone
                1,  // Q12: Transportation
                3,  // Q13: All of the above
                3,  // Q14: All of the above
                1,  // Q15: River valleys
                3,  // Q16: All of the above
                2,  // Q17: Forest
                0,  // Q18: Geography
                2,  // Q19: Road
                3   // Q20: All of the above
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 220), (i * 60 + 130), 220, 30);
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
            new GeoGraphyDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}