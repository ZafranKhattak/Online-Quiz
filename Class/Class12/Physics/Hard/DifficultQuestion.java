package Class.Class12.Physics.Hard;

import Class.Class12.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The electric flux through a Gaussian surface depends on:",
                "Question 2: The electric potential at a point due to a dipole varies as:",
                "Question 3: The electric field due to a uniformly charged infinite plane sheet is:",
                "Question 4: When a dielectric is inserted between the plates of a capacitor, its capacitance:",
                "Question 5: The temperature coefficient of resistance for a semiconductor is:",
                "Question 6: The condition for maximum current in a circuit containing a cell of internal resistance r and external resistance R is:",
                "Question 7: In a Wheatstone bridge, the condition for balance is:",
                "Question 8: The magnetic field on the axis of a current-carrying circular loop at a distance x from the center is proportional to:",
                "Question 9: The cyclotron frequency of a charged particle in a magnetic field depends on:",
                "Question 10: The magnetic dipole moment of a current-carrying loop is given by:",
                "Question 11: The magnetic susceptibility of a diamagnetic material is:",
                "Question 12: In an LCR circuit at resonance, the power factor is:",
                "Question 13: The quality factor (Q-factor) of a resonant circuit is a measure of:",
                "Question 14: The efficiency of a transformer is given by:",
                "Question 15: The displacement current was introduced by Maxwell to:",
                "Question 16: In Young's double slit experiment, the fringe width is directly proportional to:",
                "Question 17: The energy of a photon is given by:",
                "Question 18: The de Broglie wavelength of a particle is inversely proportional to its:",
                "Question 19: In Rutherford's alpha scattering experiment, the fact that most alpha particles passed straight through suggested that:",
                "Question 20: The binding energy per nucleon is maximum for:"
        };

        String options[][] = {
                {"A. The shape of the surface", "B. The size of the surface", "C. The charge enclosed", "D. The position of the surface"},
                {"A. 1/r", "B. 1/r²", "C. 1/r³", "D. r"},
                {"A. Independent of distance from the sheet", "B. Inversely proportional to distance", "C. Inversely proportional to square of distance", "D. Zero"},
                {"A. Increases", "B. Decreases", "C. Remains same", "D. Becomes zero"},
                {"A. Positive", "B. Negative", "C. Zero", "D. Infinite"},
                {"A. R = r", "B. R = 2r", "C. R = r/2", "D. R = 0"},
                {"A. P/Q = R/S", "B. P/Q = S/R", "C. P = Q", "D. R = S"},
                {"A. 1/x", "B. 1/x²", "C. 1/x³", "D. 1/x⁴"},
                {"A. Mass and charge", "B. Speed", "C. Magnetic field only", "D. Mass, charge and magnetic field"},
                {"A. IA", "B. I/A", "C. A/I", "D. I²A"},
                {"A. Positive and large", "B. Positive and small", "C. Negative", "D. Zero"},
                {"A. 0", "B. 1", "C. 0.5", "D. 0.707"},
                {"A. Sharpness of resonance", "B. Power factor", "C. Impedance", "D. Phase difference"},
                {"A. Output power/Input power", "B. Input power/Output power", "C. Output voltage/Input voltage", "D. Input voltage/Output voltage"},
                {"A. Explain the photoelectric effect", "B. Maintain consistency with Ampere's law", "C. Explain electromagnetic induction", "D. Explain blackbody radiation"},
                {"A. Wavelength of light", "B. Distance between slits", "C. Frequency of light", "D. Intensity of light"},
                {"A. E = mc²", "B. E = hf", "C. E = ½mv²", "D. E = qV"},
                {"A. Mass", "B. Velocity", "C. Momentum", "D. Energy"},
                {"A. Atoms are mostly empty space", "B. Atoms have a positive nucleus", "C. Electrons orbit the nucleus", "D. Alpha particles are waves"},
                {"A. Hydrogen", "B. Helium", "C. Iron", "D. Uranium"}
        };

        int correctAnswers[] = {
                2,  // Q1: The charge enclosed
                1,  // Q2: 1/r²
                0,  // Q3: Independent of distance from the sheet
                0,  // Q4: Increases
                1,  // Q5: Negative
                0,  // Q6: R = r
                0,  // Q7: P/Q = R/S
                0,  // Q8: 1/x²
                3,  // Q9: Mass, charge and magnetic field
                0,  // Q10: IA
                2,  // Q11: Negative
                0,  // Q12: 0
                0,  // Q13: Sharpness of resonance
                0,  // Q14: Output power/Input power
                1,  // Q15: Maintain consistency with Ampere's law
                0,  // Q16: Wavelength of light
                1,  // Q17: E = hf
                2,  // Q18: Momentum
                0,  // Q19: Atoms are mostly empty space
                2   // Q20: Iron
        };

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