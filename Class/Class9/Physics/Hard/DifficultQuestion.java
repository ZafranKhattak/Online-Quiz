package Class.Class9.Physics.Hard;

import Class.Class9.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: Which of the following is a derived physical quantity?",
                "Question 2: The least count of a vernier callipers is:",
                "Question 3: Significant figures in a measurement indicate:",
                "Question 4: The slope of a speed-time graph gives:",
                "Question 5: If two bodies of masses m₁ and m₂ are hanging from the two ends of a string passing over a pulley, the acceleration of the system is:",
                "Question 6: The law of conservation of momentum states that:",
                "Question 7: The torque produced by a force depends on:",
                "Question 8: A body is said to be in stable equilibrium if:",
                "Question 9: The centre of gravity of a body is:",
                "Question 10: The gravitational field strength on the surface of the Earth is:",
                "Question 11: Escape velocity from the Earth's surface is approximately:",
                "Question 12: The efficiency of a machine is defined as:",
                "Question 13: The pressure exerted by a liquid column depends on:",
                "Question 14: A couple is formed by:",
                "Question 15: The first condition for equilibrium is:",
                "Question 16: The second condition for equilibrium is:",
                "Question 17: The mass of the Earth can be calculated using:",
                "Question 18: A geostationary satellite has a time period of:",
                "Question 19: The energy conversion in a hydroelectric power station is:",
                "Question 20: According to Newton's third law of motion, action and reaction:"
        };

        String options[][] = {
                {"A. Length", "B. Mass", "C. Volume", "D. Time"},
                {"A. 0.1 cm", "B. 0.01 cm", "C. 0.001 cm", "D. 0.0001 cm"},
                {"A. The magnitude of the quantity", "B. The precision of the measurement", "C. The accuracy of the instrument", "D. The size of the quantity"},
                {"A. Distance travelled", "B. Displacement", "C. Acceleration", "D. Velocity"},
                {"A. g", "B. (m₁ - m₂)g/(m₁ + m₂)", "C. (m₁ + m₂)g/(m₁ - m₂)", "D. (m₁m₂)g/(m₁ + m₂)"},
                {"A. Momentum is always lost in collisions", "B. Momentum of an isolated system remains constant", "C. Momentum is always gained in collisions", "D. Momentum is never conserved"},
                {"A. Force and distance", "B. Force and time", "C. Force and moment arm", "D. Force and velocity"},
                {"A. After a slight tilt it moves further away", "B. After a slight tilt it returns to its original position", "C. It remains in its new position after a slight tilt", "D. It does not move at all"},
                {"A. The point where its entire mass is concentrated", "B. The point where its entire weight is concentrated", "C. The centre of the body", "D. The lowest point of the body"},
                {"A. 9.8 N/kg", "B. 10 N/kg", "C. 8.9 N/kg", "D. 9.0 N/kg"},
                {"A. 7.9 km/s", "B. 11.2 km/s", "C. 14.5 km/s", "D. 16.0 km/s"},
                {"A. Work output/Work input", "B. Work input/Work output", "C. Power output/Power input", "D. Force output/Force input"},
                {"A. Density and height", "B. Density and area", "C. Height and area", "D. Mass and volume"},
                {"A. Two like parallel forces of equal magnitude", "B. Two unlike parallel forces of equal magnitude", "C. Two forces acting along the same line", "D. Two forces acting perpendicular to each other"},
                {"A. Net force = 0", "B. Net torque = 0", "C. Sum of all forces = 0", "D. Sum of all torques = 0"},
                {"A. Net force = 0", "B. Net torque = 0", "C. Sum of all forces = 0", "D. Sum of all velocities = 0"},
                {"A. Newton's first law", "B. Newton's second law", "C. Newton's law of gravitation", "D. The law of conservation of momentum"},
                {"A. 12 hours", "B. 24 hours", "C. 48 hours", "D. 7 days"},
                {"A. Kinetic → Electrical", "B. Potential → Kinetic → Electrical", "C. Chemical → Electrical", "D. Nuclear → Thermal → Electrical"},
                {"A. Act on the same body", "B. Act on different bodies", "C. Are always unequal", "D. Are always in the same direction"}
        };

        int correctAnswers[] = {
                2,  // Q1: Volume
                1,  // Q2: 0.01 cm
                1,  // Q3: The precision of the measurement
                2,  // Q4: Acceleration
                1,  // Q5: (m₁ - m₂)g/(m₁ + m₂)
                1,  // Q6: Momentum of an isolated system remains constant
                2,  // Q7: Force and moment arm
                1,  // Q8: After a slight tilt it returns to its original position
                1,  // Q9: The point where its entire weight is concentrated
                0,  // Q10: 9.8 N/kg
                1,  // Q11: 11.2 km/s
                0,  // Q12: Work output/Work input
                0,  // Q13: Density and height
                1,  // Q14: Two unlike parallel forces of equal magnitude
                2,  // Q15: Sum of all forces = 0
                1,  // Q16: Net torque = 0
                2,  // Q17: Newton's law of gravitation
                1,  // Q18: 24 hours
                1,  // Q19: Potential → Kinetic → Electrical
                1   // Q20: Act on different bodies
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 260), (i * 60 + 130), 260, 30);
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
            new PhysicsDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}