package Class.Class7.GeoGraphy.Medium;

import Class.Class7.GeoGraphy.GeoGraphyDashboard.GeoGraphyDashboard;
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
                "Question 1: Which of the following is a change caused by internal forces of the Earth?",
                "Question 2: The idea that the Earth's surface is made up of several large plates is called:",
                "Question 3: When tectonic plates move towards each other, this is called:",
                "Question 4: Fold mountains are formed as a result of:",
                "Question 5: Which mountain range is an example of fold mountains?",
                "Question 6: When tectonic plates slide past each other, this movement is called:",
                "Question 7: The highest temperature in the atmosphere is found in the:",
                "Question 8: Which is the most important gas in the atmosphere for human survival?",
                "Question 9: The part of the atmosphere with the highest concentration of ozone is the:",
                "Question 10: Water covers approximately what percentage of the Earth's surface?",
                "Question 11: The movement of ocean water caused by the gravitational pull of the Moon and Sun is called:",
                "Question 12: A sudden and powerful ocean wave caused by an underwater earthquake is called:",
                "Question 13: Which type of forest is found in regions near the equator?",
                "Question 14: The natural vegetation of an area depends on:",
                "Question 15: What is the main advantage of road transport?",
                "Question 16: Which is the longest railway in the world?",
                "Question 17: The term \"Global Village\" refers to:",
                "Question 18: Which of the following is the quickest means of transport?",
                "Question 19: The Suez Canal connects:",
                "Question 20: What causes the movement of tectonic plates?"
        };

        String options[][] = {
                {"A. Weathering", "B. Erosion", "C. Earthquake", "D. Deposition"},
                {"A. Continental drift", "B. Plate tectonics", "C. Faulting", "D. Folding"},
                {"A. Divergent movement", "B. Convergent movement", "C. Transform movement", "D. Faulting"},
                {"A. Volcanic eruptions", "B. Faulting", "C. Convergent plate movement", "D. Erosion"},
                {"A. Sierra Nevada", "B. Harz Mountains", "C. Himalayas", "D. Baikal Rift"},
                {"A. Convergent", "B. Divergent", "C. Transform", "D. Subduction"},
                {"A. Troposphere", "B. Stratosphere", "C. Mesosphere", "D. Thermosphere"},
                {"A. Nitrogen", "B. Oxygen", "C. Carbon dioxide", "D. Argon"},
                {"A. Troposphere", "B. Stratosphere", "C. Mesosphere", "D. Exosphere"},
                {"A. 29%", "B. 50%", "C. 71%", "D. 90%"},
                {"A. Waves", "B. Currents", "C. Tides", "D. Tsunami"},
                {"A. Wave", "B. Tide", "C. Tsunami", "D. Current"},
                {"A. Coniferous forest", "B. Tropical rainforest", "C. Deciduous forest", "D. Tundra vegetation"},
                {"A. Climate", "B. Soil", "C. Relief", "D. All of the above"},
                {"A. Cheapest for long distances", "B. Door-to-door service", "C. Fastest means of transport", "D. Only for passengers"},
                {"A. Trans-Siberian Railway", "B. Orient Express", "C. Indian Railways", "D. Eurostar"},
                {"A. A village in all continents", "B. The world becoming a small place", "C. Villages connected by roads", "D. A type of settlement"},
                {"A. Road transport", "B. Railways", "C. Water transport", "D. Air transport"},
                {"A. Atlantic Ocean with Pacific Ocean", "B. Mediterranean Sea with Red Sea", "C. Red Sea with Arabian Sea", "D. Mediterranean Sea with Black Sea"},
                {"A. Wind and water", "B. Heat from the Earth's interior", "C. Gravity from the Moon", "D. Rotation of the Earth"}
        };

        int correctAnswers[] = {
                2,  // Q1: Earthquake
                1,  // Q2: Plate tectonics
                1,  // Q3: Convergent movement
                2,  // Q4: Convergent plate movement
                2,  // Q5: Himalayas
                2,  // Q6: Transform
                3,  // Q7: Thermosphere
                1,  // Q8: Oxygen
                1,  // Q9: Stratosphere
                2,  // Q10: 71%
                2,  // Q11: Tides
                2,  // Q12: Tsunami
                1,  // Q13: Tropical rainforest
                3,  // Q14: All of the above
                1,  // Q15: Door-to-door service
                0,  // Q16: Trans-Siberian Railway
                1,  // Q17: The world becoming a small place
                3,  // Q18: Air transport
                1,  // Q19: Mediterranean Sea with Red Sea
                1   // Q20: Heat from the Earth's interior
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