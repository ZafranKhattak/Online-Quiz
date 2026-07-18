package Class.Class8.Physics.Medium;

import Class.Class8.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: Which of the following is a contact force?",
                "Question 2: The force that pulls objects towards the centre of the Earth is called:",
                "Question 3: Pressure is defined as:",
                "Question 4: The image formed by a convex lens is:",
                "Question 5: Sound needs a medium to travel because it:",
                "Question 6: The time taken by a pendulum to complete one oscillation is called its:",
                "Question 7: Which of the following is a non-renewable source of energy?",
                "Question 8: The unit of frequency is the:",
                "Question 9: A solution that conducts electricity is called:",
                "Question 10: The transfer of heat through the movement of fluids is called:",
                "Question 11: The part of the eye that focuses light onto the retina is the:",
                "Question 12: The SI unit of electric charge is the:",
                "Question 13: The loudness of sound depends on the:",
                "Question 14: The pitch of sound depends on the:",
                "Question 15: The process of changing a liquid into vapour is called:",
                "Question 16: The image formed by a concave lens is always:",
                "Question 17: A device that converts chemical energy into electrical energy is called a:",
                "Question 18: The temperature at which a solid changes into a liquid is called its:",
                "Question 19: The greenhouse effect is primarily caused by the increase of which gas in the atmosphere?",
                "Question 20: The bending of light through a glass slab results in:"
        };

        String options[][] = {
                {"A. Gravitational force", "B. Magnetic force", "C. Electrostatic force", "D. Muscular force"},
                {"A. Magnetic force", "B. Electrostatic force", "C. Gravitational force", "D. Frictional force"},
                {"A. Force × Area", "B. Force / Area", "C. Area / Force", "D. Force + Area"},
                {"A. Always virtual", "B. Always real", "C. Can be real or virtual depending on the object distance", "D. Always inverted"},
                {"A. Is a form of energy", "B. Is a wave", "C. Requires particles to vibrate", "D. Has high speed"},
                {"A. Frequency", "B. Time period", "C. Amplitude", "D. Wavelength"},
                {"A. Solar energy", "B. Wind energy", "C. Coal", "D. Hydropower"},
                {"A. Hertz", "B. Metre", "C. Joule", "D. Pascal"},
                {"A. Insulator", "B. Conductor", "C. Electrolyte", "D. Resistor"},
                {"A. Conduction", "B. Convection", "C. Radiation", "D. Evaporation"},
                {"A. Cornea", "B. Pupil", "C. Lens", "D. Iris"},
                {"A. Ampere", "B. Volt", "C. Coulomb", "D. Ohm"},
                {"A. Frequency", "B. Amplitude", "C. Speed", "D. Wavelength"},
                {"A. Amplitude", "B. Frequency", "C. Speed", "D. Medium"},
                {"A. Condensation", "B. Evaporation", "C. Freezing", "D. Melting"},
                {"A. Real and inverted", "B. Virtual and erect", "C. Real and erect", "D. Virtual and inverted"},
                {"A. Generator", "B. Motor", "C. Cell", "D. Transformer"},
                {"A. Boiling point", "B. Melting point", "C. Freezing point", "D. Sublimation point"},
                {"A. Oxygen", "B. Nitrogen", "C. Carbon dioxide", "D. Hydrogen"},
                {"A. Lateral displacement", "B. Vertical displacement", "C. No displacement", "D. Total internal reflection"}
        };

        int correctAnswers[] = {
                3,  // Q1: Muscular force
                2,  // Q2: Gravitational force
                1,  // Q3: Force / Area
                2,  // Q4: Can be real or virtual depending on the object distance
                2,  // Q5: Requires particles to vibrate
                1,  // Q6: Time period
                2,  // Q7: Coal
                0,  // Q8: Hertz
                2,  // Q9: Electrolyte
                1,  // Q10: Convection
                2,  // Q11: Lens
                2,  // Q12: Coulomb
                1,  // Q13: Amplitude
                1,  // Q14: Frequency
                1,  // Q15: Evaporation
                1,  // Q16: Virtual and erect
                2,  // Q17: Cell
                1,  // Q18: Melting point
                2,  // Q19: Carbon dioxide
                0   // Q20: Lateral displacement
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