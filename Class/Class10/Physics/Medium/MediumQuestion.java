package Class.Class10.Physics.Medium;

import Class.Class10.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The restoring force in Simple Harmonic Motion is directly proportional to:",
                "Question 2: The relationship between frequency (f) and time period (T) is:",
                "Question 3: In a ripple tank, the distance between two consecutive crests is called:",
                "Question 4: The speed of a wave is given by the formula:",
                "Question 5: A wave in which the particles of the medium vibrate parallel to the direction of wave propagation is called:",
                "Question 6: Sound waves are:",
                "Question 7: The speed of sound is fastest in which medium?",
                "Question 8: The phenomenon of sound reflection is called:",
                "Question 9: The minimum distance required for an echo to be heard is:",
                "Question 10: The law of reflection states that the angle of incidence is:",
                "Question 11: The image formed by a concave mirror when the object is beyond the centre of curvature is:",
                "Question 12: A convex mirror always forms:",
                "Question 13: The ability of an atom to attract electrons towards itself in a chemical bond is called:",
                "Question 14: The electric potential difference between two points is defined as:",
                "Question 15: Ohm's law states that:",
                "Question 16: In a series circuit, the current is:",
                "Question 17: A transformer that increases voltage is called:",
                "Question 18: A logic gate that gives a high output only when all inputs are high is called:",
                "Question 19: The amount of a radioactive substance that remains after one half-life is:",
                "Question 20: The process of splitting a heavy nucleus into two lighter nuclei is called:"
        };

        String options[][] = {
                {"A. Velocity", "B. Displacement", "C. Acceleration", "D. Time period"},
                {"A. f = T", "B. f = 1/T", "C. f = T²", "D. f = 1/T²"},
                {"A. Amplitude", "B. Frequency", "C. Wavelength", "D. Time period"},
                {"A. v = f/λ", "B. v = f × λ", "C. v = λ/f", "D. v = f + λ"},
                {"A. Transverse wave", "B. Longitudinal wave", "C. Electromagnetic wave", "D. Surface wave"},
                {"A. Transverse waves", "B. Longitudinal waves", "C. Electromagnetic waves", "D. Surface waves"},
                {"A. Gases", "B. Liquids", "C. Solids", "D. Vacuum"},
                {"A. Refraction", "B. Echo", "C. Diffraction", "D. Interference"},
                {"A. 17 m", "B. 34 m", "C. 10 m", "D. 50 m"},
                {"A. Greater than the angle of reflection", "B. Less than the angle of reflection", "C. Equal to the angle of reflection", "D. Not related to the angle of reflection"},
                {"A. Virtual and erect", "B. Real and inverted", "C. Virtual and inverted", "D. Real and erect"},
                {"A. Real and inverted image", "B. Virtual and erect image", "C. Real and erect image", "D. Virtual and inverted image"},
                {"A. Ionization energy", "B. Electron affinity", "C. Electronegativity", "D. Atomic radius"},
                {"A. Work done per unit charge", "B. Force per unit charge", "C. Energy per unit mass", "D. Power per unit charge"},
                {"A. V = I/R", "B. V = IR", "C. I = VR", "D. R = VI"},
                {"A. Different through each resistor", "B. The same through each resistor", "C. Zero through each resistor", "D. Maximum through the smallest resistor"},
                {"A. Step-down transformer", "B. Step-up transformer", "C. Power transformer", "D. Isolation transformer"},
                {"A. OR gate", "B. AND gate", "C. NOT gate", "D. NAND gate"},
                {"A. One-quarter of the original", "B. Half of the original", "C. One-third of the original", "D. Two-thirds of the original"},
                {"A. Nuclear fusion", "B. Nuclear fission", "C. Radioactive decay", "D. Alpha decay"}
        };

        int correctAnswers[] = {
                1,  // Q1: Displacement (F = -kx, restoring force is proportional to displacement)
                1,  // Q2: f = 1/T
                2,  // Q3: Wavelength
                1,  // Q4: v = f × λ
                1,  // Q5: Longitudinal wave
                1,  // Q6: Longitudinal waves
                2,  // Q7: Solids
                1,  // Q8: Echo
                0,  // Q9: 17 m (minimum distance for echo is 17m)
                2,  // Q10: Equal to the angle of reflection
                1,  // Q11: Real and inverted
                1,  // Q12: Virtual and erect image
                2,  // Q13: Electronegativity
                0,  // Q14: Work done per unit charge
                1,  // Q15: V = IR
                1,  // Q16: The same through each resistor
                1,  // Q17: Step-up transformer
                1,  // Q18: AND gate
                1,  // Q19: Half of the original
                1   // Q20: Nuclear fission
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
            new PhysicsDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}