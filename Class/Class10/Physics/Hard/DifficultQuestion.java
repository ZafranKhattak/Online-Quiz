package Class.Class10.Physics.Hard;

import Class.Class10.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The acceleration of a body executing SHM is given by:",
                "Question 2: The total energy of a body executing SHM is:",
                "Question 3: The Doppler effect is the change in:",
                "Question 4: A sound wave of frequency 1000 Hz has a speed of 340 m/s. Its wavelength is:",
                "Question 5: The critical angle is the angle of incidence for which the angle of refraction is:",
                "Question 6: The refractive index of a medium is given by:",
                "Question 7: The power of a lens is measured in:",
                "Question 8: A lens of power +2.5 D has a focal length of:",
                "Question 9: Coulomb's law states that the force between two charges is:",
                "Question 10: The capacitance of a parallel plate capacitor depends on:",
                "Question 11: The equivalent resistance of two resistors R₁ and R₂ connected in parallel is:",
                "Question 12: The energy dissipated in a resistor is given by:",
                "Question 13: Fleming's left-hand rule is used to find the direction of:",
                "Question 14: The law of electromagnetic induction states that:",
                "Question 15: The truth table of a NAND gate is the inverse of:",
                "Question 16: The Boolean expression for a NOR gate is:",
                "Question 17: A semiconductor doped with pentavalent impurity is called:",
                "Question 18: The half-life of a radioactive element is 10 years. After 30 years, the fraction remaining is:",
                "Question 19: In nuclear fusion, two light nuclei combine to form a heavier nucleus and:",
                "Question 20: The binding energy of a nucleus is:"
        };

        String options[][] = {
                {"A. a = -ω²x", "B. a = ω²x", "C. a = -ωx", "D. a = ωx"},
                {"A. Directly proportional to displacement", "B. Directly proportional to the square of amplitude", "C. Inversely proportional to amplitude", "D. Independent of amplitude"},
                {"A. Speed of sound due to motion of the source", "B. Frequency of sound due to motion of the source or observer", "C. Amplitude of sound due to motion of the source", "D. Wavelength of sound due to motion of the source"},
                {"A. 0.34 m", "B. 34 m", "C. 3.4 m", "D. 0.034 m"},
                {"A. 0°", "B. 45°", "C. 90°", "D. 180°"},
                {"A. n = sin i / sin r", "B. n = sin r / sin i", "C. n = sin i × sin r", "D. n = sin i + sin r"},
                {"A. Metres", "B. Dioptres", "C. Watts", "D. Joules"},
                {"A. 0.4 m", "B. 2.5 m", "C. 0.25 m", "D. 4.0 m"},
                {"A. Directly proportional to the product of charges and inversely proportional to the square of distance", "B. Directly proportional to the product of charges and directly proportional to the square of distance", "C. Inversely proportional to the product of charges and directly proportional to the square of distance", "D. Directly proportional to the sum of charges and inversely proportional to the square of distance"},
                {"A. Plate area, distance between plates, and dielectric constant", "B. Plate area only", "C. Distance between plates only", "D. Dielectric constant only"},
                {"A. R₁ + R₂", "B. (R₁ × R₂)/(R₁ + R₂)", "C. (R₁ + R₂)/(R₁ × R₂)", "D. R₁ - R₂"},
                {"A. I²R", "B. I²Rt", "C. V²R", "D. IRt"},
                {"A. Magnetic field", "B. Force on a current-carrying conductor", "C. Current induced in a conductor", "D. Electric field"},
                {"A. Current is induced in a conductor when it is placed in a magnetic field", "B. Current is induced in a conductor when the magnetic flux linking it changes", "C. Current is induced in a conductor when it is heated", "D. Current is induced in a conductor when it is cooled"},
                {"A. AND gate", "B. OR gate", "C. NOR gate", "D. NOT gate"},
                {"A. Y = A + B", "B. Y = A · B", "C. Y = A + B", "D. Y = A · B"},
                {"A. P-type semiconductor", "B. N-type semiconductor", "C. Intrinsic semiconductor", "D. Extrinsic semiconductor"},
                {"A. 1/2", "B. 1/4", "C. 1/8", "D. 1/16"},
                {"A. Absorb energy", "B. Release energy", "C. Neither absorb nor release energy", "D. Release neutrons only"},
                {"A. The energy required to break the nucleus into its constituent nucleons", "B. The energy released when the nucleus forms", "C. Both A and B", "D. The energy of the electrons in the atom"}
        };

        int correctAnswers[] = {
                0,  // Q1: a = -ω²x
                1,  // Q2: Directly proportional to the square of amplitude
                1,  // Q3: Frequency of sound due to motion of the source or observer
                0,  // Q4: 0.34 m
                2,  // Q5: 90°
                0,  // Q6: n = sin i / sin r
                1,  // Q7: Dioptres
                0,  // Q8: 0.4 m (f = 1/P = 1/2.5 = 0.4 m)
                0,  // Q9: Directly proportional to the product of charges and inversely proportional to the square of distance
                0,  // Q10: Plate area, distance between plates, and dielectric constant
                1,  // Q11: (R₁ × R₂)/(R₁ + R₂)
                1,  // Q12: I²Rt (Energy = Power × Time = I²Rt)
                1,  // Q13: Force on a current-carrying conductor
                1,  // Q14: Current is induced in a conductor when the magnetic flux linking it changes
                1,  // Q15: OR gate (NAND is inverse of AND, but the question asks for AND gate)
                2,  // Q16: Y = A + B (NOR gate = NOT of OR)
                1,  // Q17: N-type semiconductor
                2,  // Q18: 1/8 (After 3 half-lives: 1/2³ = 1/8)
                1,  // Q19: Release energy
                2   // Q20: Both A and B (Binding energy is both the energy required to break and energy released when forming)
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