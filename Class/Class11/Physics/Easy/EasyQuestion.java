package Class.Class11.Physics.Easy;

import Class.Class11.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: Physics is the branch of science that deals with the study of:",
                "Question 2: The smallest unit of measurement of length is:",
                "Question 3: A scalar quantity is one that has:",
                "Question 4: Which of the following is a scalar quantity?",
                "Question 5: A body at rest will remain at rest unless acted upon by an external force. This is:",
                "Question 6: The SI unit of force is:",
                "Question 7: The ability to do work is called:",
                "Question 8: The energy possessed by a body due to its motion is called:",
                "Question 9: The force of attraction between any two objects in the universe is called:",
                "Question 10: What is the value of acceleration due to gravity (g) on the surface of the Earth?",
                "Question 11: The to-and-fro motion of a body about its mean position is called:",
                "Question 12: The number of oscillations completed in one second is called:",
                "Question 13: A wave in which the particles of the medium vibrate perpendicular to the direction of wave propagation is called:",
                "Question 14: The maximum displacement of a vibrating body from its mean position is called:",
                "Question 15: The principle of superposition of waves states that:",
                "Question 16: The product of mass and velocity of a body is called its:",
                "Question 17: The time required to complete one vibration is called:",
                "Question 18: Elasticity is the property of a body to:",
                "Question 19: The relation between stress and strain is given by:",
                "Question 20: The specific heat capacity is the amount of heat required to raise the temperature of:"
        };

        String options[][] = {
                {"A. Living organisms", "B. Matter, energy and their interaction", "C. Chemical reactions", "D. The Earth's structure"},
                {"A. Meter", "B. Centimeter", "C. Millimeter", "D. Kilometer"},
                {"A. Only magnitude", "B. Only direction", "C. Both magnitude and direction", "D. Neither magnitude nor direction"},
                {"A. Force", "B. Velocity", "C. Speed", "D. Displacement"},
                {"A. Newton's first law of motion", "B. Newton's second law of motion", "C. Newton's third law of motion", "D. Law of conservation of energy"},
                {"A. Joule", "B. Newton", "C. Watt", "D. Pascal"},
                {"A. Force", "B. Power", "C. Energy", "D. Momentum"},
                {"A. Potential energy", "B. Kinetic energy", "C. Chemical energy", "D. Heat energy"},
                {"A. Electrostatic force", "B. Magnetic force", "C. Gravitational force", "D. Frictional force"},
                {"A. 8.9 m/s²", "B. 9.8 m/s²", "C. 10.8 m/s²", "D. 11.8 m/s²"},
                {"A. Linear motion", "B. Circular motion", "C. Oscillatory motion", "D. Random motion"},
                {"A. Amplitude", "B. Frequency", "C. Time period", "D. Wavelength"},
                {"A. Longitudinal wave", "B. Transverse wave", "C. Sound wave", "D. Electromagnetic wave"},
                {"A. Frequency", "B. Time period", "C. Amplitude", "D. Wavelength"},
                {"A. Waves cancel each other", "B. The displacement of a particle is the sum of displacements of individual waves", "C. Waves travel in straight lines", "D. Waves only travel in one direction"},
                {"A. Force", "B. Acceleration", "C. Momentum", "D. Energy"},
                {"A. Amplitude", "B. Frequency", "C. Time period", "D. Wavelength"},
                {"A. Remain permanently deformed", "B. Return to its original shape after removing deforming force", "C. Resist any deformation", "D. Break under stress"},
                {"A. Hooke's law", "B. Newton's law", "C. Pascal's law", "D. Archimedes' principle"},
                {"A. 1 kg of substance by 1°C", "B. 1 g of substance by 1°C", "C. 1 kg of substance by 100°C", "D. 10 kg of substance by 1°C"}
        };

        int correctAnswers[] = {
                1,  // Q1: Matter, energy and their interaction
                2,  // Q2: Millimeter
                0,  // Q3: Only magnitude
                2,  // Q4: Speed
                0,  // Q5: Newton's first law of motion
                1,  // Q6: Newton
                2,  // Q7: Energy
                1,  // Q8: Kinetic energy
                2,  // Q9: Gravitational force
                1,  // Q10: 9.8 m/s²
                2,  // Q11: Oscillatory motion
                1,  // Q12: Frequency
                1,  // Q13: Transverse wave
                2,  // Q14: Amplitude
                1,  // Q15: The displacement of a particle is the sum of displacements of individual waves
                2,  // Q16: Momentum
                2,  // Q17: Time period
                1,  // Q18: Return to its original shape after removing deforming force
                0,  // Q19: Hooke's law
                0   // Q20: 1 kg of substance by 1°C
        };

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
                if (percentage >= 80) grade = "Excellent!";
                else if (percentage >= 60) grade = "Good!";
                else if (percentage >= 40) grade = "Fair";
                else grade = "Needs Improvement";
                
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