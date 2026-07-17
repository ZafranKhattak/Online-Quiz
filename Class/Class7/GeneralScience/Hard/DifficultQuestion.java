package Class.Class7.GeneralScience.Hard;

import Class.Class7.GeneralScience.GeneralScienceDashboard.GeneralScienceDashboard;
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
                "Question 1: The process by which plants take in oxygen and release carbon dioxide is known as:",
                "Question 2: In the human respiratory system, the exchange of gases takes place in the:",
                "Question 3: The function of platelets in human blood is to:",
                "Question 4: The xylem and phloem in plants are responsible for the transport of:",
                "Question 5: In the structure of an atom, the electrons are found in:",
                "Question 6: Which of the following is NOT a way to accelerate the dissolving process?",
                "Question 7: The formula for calculating average speed is:",
                "Question 8: The relationship between time period (T) and frequency (f) is:",
                "Question 9: The process of converting Celsius to Fahrenheit uses the formula:",
                "Question 10: When a substance dissolves, the particles of the solute:",
                "Question 11: The large number of organisms called pathogens that cause infectious diseases include:",
                "Question 12: The three lines of defence against pathogens in the human body are:",
                "Question 13: An electromagnetic wave can travel through:",
                "Question 14: The prevention of rusting can be done by:",
                "Question 15: The difference between longitudinal and transverse waves is that in longitudinal waves:",
                "Question 16: If the temperature of a solvent increases, the solubility of a solute generally:",
                "Question 17: The characteristics that distinguish different sounds are:",
                "Question 18: The correct order of Earth's layers from outer to inner is:",
                "Question 19: The process by which energy is transferred through a material without the movement of the material itself is called:",
                "Question 20: In a distance-time graph, a steeper slope indicates:"
        };

        String options[][] = {
                {"A. Photosynthesis", "B. Transpiration", "C. Respiration", "D. Evaporation"},
                {"A. Trachea", "B. Bronchi", "C. Alveoli", "D. Nasal cavity"},
                {"A. Carry oxygen", "B. Fight germs", "C. Help in blood clotting", "D. Transport nutrients"},
                {"A. Food and water respectively", "B. Water and food respectively", "C. Both water and food together", "D. Only minerals"},
                {"A. The nucleus", "B. Shells or orbits around the nucleus", "C. Between protons and neutrons", "D. Outside the atom"},
                {"A. Stirring the solution", "B. Increasing temperature", "C. Breaking solute into smaller pieces", "D. Keeping the solution still"},
                {"A. Distance × Time", "B. Time ÷ Distance", "C. Distance ÷ Time", "D. Speed ÷ Time"},
                {"A. T = 2f", "B. T = f²", "C. T = 1/f", "D. T = f"},
                {"A. F = (C × 9/5) + 32", "B. F = (C × 5/9) - 32", "C. F = (C + 32) × 9/5", "D. F = C × 32"},
                {"A. Disappear completely", "B. Get distributed among solvent particles", "C. React chemically with the solvent", "D. Become larger in size"},
                {"A. Bacteria and viruses only", "B. Bacteria, viruses, fungi and protozoa", "C. Bacteria and fungi only", "D. Viruses only"},
                {"A. Physical barriers, chemical barriers and immune response", "B. Skin only", "C. Blood only", "D. Lungs only"},
                {"A. Only solid materials", "B. Only air", "C. A vacuum without a medium", "D. Only water"},
                {"A. Painting, galvanizing and oiling", "B. Adding salt to iron", "C. Keeping iron in water", "D. Exposing iron to air"},
                {"A. Particles vibrate perpendicular to wave direction", "B. Particles vibrate parallel to wave direction", "C. There is no vibration", "D. Particles travel with the wave"},
                {"A. Decreases", "B. Increases", "C. Remains the same", "D. Becomes zero"},
                {"A. Loudness, pitch and quality", "B. Color and brightness", "C. Speed and density", "D. Temperature and pressure"},
                {"A. Core, Mantle, Crust", "B. Crust, Core, Mantle", "C. Crust, Mantle, Core", "D. Mantle, Core, Crust"},
                {"A. Convection", "B. Conduction", "C. Radiation", "D. Transpiration"},
                {"A. Slower speed", "B. Higher speed", "C. No motion", "D. Equal speed"}
        };

        int correctAnswers[] = {
                2,  // Q1: Respiration
                2,  // Q2: Alveoli
                2,  // Q3: Help in blood clotting
                1,  // Q4: Water and food respectively
                1,  // Q5: Shells or orbits around the nucleus
                3,  // Q6: Keeping the solution still
                2,  // Q7: Distance ÷ Time
                2,  // Q8: T = 1/f
                0,  // Q9: F = (C × 9/5) + 32
                1,  // Q10: Get distributed among solvent particles
                1,  // Q11: Bacteria, viruses, fungi and protozoa
                0,  // Q12: Physical barriers, chemical barriers and immune response
                2,  // Q13: A vacuum without a medium
                0,  // Q14: Painting, galvanizing and oiling
                1,  // Q15: Particles vibrate parallel to wave direction
                1,  // Q16: Increases
                0,  // Q17: Loudness, pitch and quality
                2,  // Q18: Crust, Mantle, Core
                1,  // Q19: Conduction
                1   // Q20: Higher speed
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
            new GeneralScienceDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}