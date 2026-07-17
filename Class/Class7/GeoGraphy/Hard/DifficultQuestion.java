package Class.Class7.GeoGraphy.Hard;

import Class.Class7.GeoGraphy.GeoGraphyDashboard.GeoGraphyDashboard;
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
                "Question 1: The mass of the Earth is divided into three concentric layers. The correct order from outer to inner is:",
                "Question 2: An upward, arch-like fold in rock layers is called:",
                "Question 3: A downward, U-shaped fold in rock layers is called:",
                "Question 4: When extreme stress causes a recumbent fold to fracture, it is called:",
                "Question 5: Rift valleys are formed as a result of:",
                "Question 6: Which of the following is NOT a type of plateau?",
                "Question 7: The Potohar Plateau and the Balochistan Plateau are located in:",
                "Question 8: Which statement correctly distinguishes between mountains and hills?",
                "Question 9: The Great Artesian Basin is an example of a:",
                "Question 10: The word equation for photosynthesis is:",
                "Question 11: The composition of the atmosphere includes which of the following in the correct order of abundance?",
                "Question 12: The Panama Canal connects:",
                "Question 13: Which port is located on the eastern coast of India?",
                "Question 14: The Denube River is an internal waterway of:",
                "Question 15: Which of the following correctly describes the Trans-Siberian Railway?",
                "Question 16: The bullet train of Japan runs at a speed of:",
                "Question 17: The Suez Canal connects which two seas?",
                "Question 18: Which of the following is an internal waterway of India?",
                "Question 19: The ozone layer is located in which part of the atmosphere?",
                "Question 20: Which of the following is NOT a component of \"Human Environment\"?"
        };

        String options[][] = {
                {"A. Core, Mantle, Crust", "B. Crust, Core, Mantle", "C. Crust, Mantle, Core", "D. Mantle, Core, Crust"},
                {"A. Syncline", "B. Anticline", "C. Fault", "D. Nappe"},
                {"A. Anticline", "B. Syncline", "C. Overfold", "D. Recumbent fold"},
                {"A. Fault", "B. Overthrust fold", "C. Nappe", "D. Rift valley"},
                {"A. Folding", "B. Volcanic activity", "C. Divergent plate movement", "D. Convergent plate movement"},
                {"A. Intermontane plateau", "B. Continental plateau", "C. Piedmont plateau", "D. Flood plateau"},
                {"A. India", "B. Pakistan", "C. China", "D. Iran"},
                {"A. Mountains have gentle slopes while hills have steep slopes", "B. Mountains have higher altitudes while hills have lower altitudes", "C. Mountains are formed only by folding while hills are formed only by faulting", "D. Mountains are always volcanic in origin"},
                {"A. Fold mountain", "B. Block mountain", "C. Plateau", "D. Plain"},
                {"A. Carbon dioxide + water → glucose + oxygen", "B. Oxygen + water → glucose + carbon dioxide", "C. Glucose + oxygen → carbon dioxide + water", "D. Carbon dioxide + glucose → oxygen + water"},
                {"A. Nitrogen, Oxygen, Carbon dioxide, Argon", "B. Oxygen, Nitrogen, Argon, Carbon dioxide", "C. Nitrogen, Oxygen, Argon, Carbon dioxide", "D. Oxygen, Carbon dioxide, Nitrogen, Argon"},
                {"A. Atlantic Ocean with Indian Ocean", "B. Atlantic Ocean with Pacific Ocean", "C. Pacific Ocean with Arctic Ocean", "D. Mediterranean Sea with Red Sea"},
                {"A. Mumbai", "B. Kandla", "C. Kolkata", "D. Cochin"},
                {"A. Russia", "B. India", "C. Europe", "D. South America"},
                {"A. Connects Saint Petersberg with Vladivostok", "B. Connects Moscow with Beijing", "C. Runs through North America", "D. Has a speed of 500 km per hour"},
                {"A. 300 km per hour", "B. 400 km per hour", "C. 500 km per hour", "D. 600 km per hour"},
                {"A. Mediterranean and Red", "B. Red and Equatorial", "C. Black and Mediterranean", "D. Caspian and Black"},
                {"A. The Ganges", "B. The Denube", "C. The Amazon", "D. The Yangste Kiang"},
                {"A. Troposphere", "B. Stratosphere", "C. Mesosphere", "D. Thermosphere"},
                {"A. Settlements", "B. Means of Transport", "C. Climate", "D. Means of Communication"}
        };

        int correctAnswers[] = {
                2,  // Q1: Crust, Mantle, Core
                1,  // Q2: Anticline
                1,  // Q3: Syncline
                0,  // Q4: Fault
                2,  // Q5: Divergent plate movement
                3,  // Q6: Flood plateau
                1,  // Q7: Pakistan
                1,  // Q8: Mountains have higher altitudes while hills have lower altitudes
                2,  // Q9: Plateau
                0,  // Q10: Carbon dioxide + water → glucose + oxygen
                2,  // Q11: Nitrogen, Oxygen, Argon, Carbon dioxide
                1,  // Q12: Atlantic Ocean with Pacific Ocean
                2,  // Q13: Kolkata
                2,  // Q14: Europe
                0,  // Q15: Connects Saint Petersberg with Vladivostok
                2,  // Q16: 500 km per hour
                0,  // Q17: Mediterranean and Red
                0,  // Q18: The Ganges
                1,  // Q19: Stratosphere
                2   // Q20: Climate
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
            new GeoGraphyDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}