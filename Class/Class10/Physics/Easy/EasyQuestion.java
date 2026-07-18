package Class.Class10.Physics.Easy;

import Class.Class10.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The to-and-fro motion of a body about its mean position is called:",
                "Question 2: The maximum displacement of a vibrating body from its mean position is called:",
                "Question 3: The number of vibrations completed in one second is called:",
                "Question 4: The time required to complete one vibration is called:",
                "Question 5: A disturbance that transfers energy from one place to another without transferring matter is called:",
                "Question 6: Waves in which the particles of the medium vibrate perpendicular to the direction of wave propagation are called:",
                "Question 7: Sound is produced by:",
                "Question 8: The unit of frequency is:",
                "Question 9: The bending of light when it passes from one medium to another is called:",
                "Question 10: A lens that is thicker in the middle than at the edges is called a:",
                "Question 11: The SI unit of electric charge is the:",
                "Question 12: The device used to measure electric current is called:",
                "Question 13: The unit of electrical resistance is the:",
                "Question 14: A material that allows electric current to pass through it is called:",
                "Question 15: The region around a magnet where its magnetic effect can be felt is called the:",
                "Question 16: A device that converts electrical energy into mechanical energy is called a:",
                "Question 17: A device that converts mechanical energy into electrical energy is called a:",
                "Question 18: The smallest particle of an element that retains its properties is called:",
                "Question 19: The number of protons in the nucleus of an atom is called the:",
                "Question 20: The spontaneous emission of radiation from unstable atomic nuclei is called:"
        };

        String options[][] = {
                {"A. Linear motion", "B. Circular motion", "C. Simple Harmonic Motion", "D. Random motion"},
                {"A. Frequency", "B. Time period", "C. Amplitude", "D. Wavelength"},
                {"A. Amplitude", "B. Frequency", "C. Time period", "D. Wavelength"},
                {"A. Amplitude", "B. Frequency", "C. Time period", "D. Wavelength"},
                {"A. Force", "B. Wave", "C. Motion", "D. Energy"},
                {"A. Longitudinal waves", "B. Transverse waves", "C. Sound waves", "D. Mechanical waves"},
                {"A. Light", "B. Vibrations", "C. Heat", "D. Electricity"},
                {"A. Hertz", "B. Metre", "C. Second", "D. Pascal"},
                {"A. Reflection", "B. Refraction", "C. Dispersion", "D. Diffraction"},
                {"A. Concave lens", "B. Convex lens", "C. Plano lens", "D. Cylindrical lens"},
                {"A. Ampere", "B. Volt", "C. Coulomb", "D. Ohm"},
                {"A. Voltmeter", "B. Ammeter", "C. Galvanometer", "D. Ohmmeter"},
                {"A. Ampere", "B. Volt", "C. Ohm", "D. Watt"},
                {"A. Insulator", "B. Conductor", "C. Semiconductor", "D. Resistor"},
                {"A. Electric field", "B. Magnetic field", "C. Gravitational field", "D. Electric potential"},
                {"A. Generator", "B. Motor", "C. Transformer", "D. Battery"},
                {"A. Motor", "B. Generator", "C. Battery", "D. Transformer"},
                {"A. Molecule", "B. Atom", "C. Ion", "D. Proton"},
                {"A. Mass number", "B. Atomic number", "C. Atomic mass", "D. Valency"},
                {"A. Radioactivity", "B. Radioactivity", "C. Fission", "D. Fusion"}
        };

        int correctAnswers[] = {
                2,  // Q1: Simple Harmonic Motion
                2,  // Q2: Amplitude
                1,  // Q3: Frequency
                2,  // Q4: Time period
                1,  // Q5: Wave
                1,  // Q6: Transverse waves
                1,  // Q7: Vibrations
                0,  // Q8: Hertz
                1,  // Q9: Refraction
                1,  // Q10: Convex lens
                2,  // Q11: Coulomb
                1,  // Q12: Ammeter
                2,  // Q13: Ohm
                1,  // Q14: Conductor
                1,  // Q15: Magnetic field
                1,  // Q16: Motor
                1,  // Q17: Generator
                1,  // Q18: Atom
                1,  // Q19: Atomic number
                0   // Q20: Radioactivity
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
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