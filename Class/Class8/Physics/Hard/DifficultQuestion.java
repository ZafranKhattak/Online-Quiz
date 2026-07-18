package Class.Class8.Physics.Hard;

import Class.Class8.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The SI unit of pressure, the Pascal, is defined as:",
                "Question 2: The process of charging an object by rubbing it with another object is called:",
                "Question 3: The speed of sound is fastest in which medium?",
                "Question 4: The refractive index of a medium is the ratio of:",
                "Question 5: The heat required to change a liquid into gas without changing temperature is called:",
                "Question 6: In a simple electric circuit, the current is directly proportional to voltage. This is known as:",
                "Question 7: The force acting on a body is 10 N and the area is 2 m². The pressure exerted is:",
                "Question 8: A boy of mass 50 kg is standing on the ground. What is the force exerted by him on the ground? (Take g = 10 m/s²)",
                "Question 9: The angle of refraction is 0° when light passes from air to glass at an angle of incidence of:",
                "Question 10: When two resistors of 2 Ω and 3 Ω are connected in series, the equivalent resistance is:",
                "Question 11: The magnifying power of a convex lens increases when:",
                "Question 12: A force of 20 N acts on a body and produces an acceleration of 4 m/s². The mass of the body is:",
                "Question 13: A concave mirror forms a real and inverted image when the object is placed:",
                "Question 14: A convex mirror always forms:",
                "Question 15: The number of images formed by two plane mirrors inclined at 90° is:",
                "Question 16: The mass of a body is 10 kg on Earth. Its weight on the moon will be approximately:",
                "Question 17: The frequency of a wave is 50 Hz and its wavelength is 2 m. The speed of the wave is:",
                "Question 18: The coefficient of linear expansion of a metal is α. When heated, its length increases by:",
                "Question 19: A device that steps up or steps down voltage is called a:",
                "Question 20: In a parallel combination of resistors, the total resistance is:"
        };

        String options[][] = {
                { "A. 1 N/m", "B. 1 N/m²", "C. 1 kg/m²", "D. 1 J/m²" },
                { "A. Induction", "B. Conduction", "C. Friction", "D. Radiation" },
                { "A. Gases", "B. Liquids", "C. Solids", "D. Vacuum" },
                { "A. Speed of light in vacuum to speed of light in the medium",
                        "B. Speed of light in medium to speed of light in vacuum",
                        "C. Wavelength in vacuum to wavelength in medium",
                        "D. Frequency in vacuum to frequency in medium" },
                { "A. Specific heat", "B. Latent heat of fusion", "C. Latent heat of vaporization",
                        "D. Sensible heat" },
                { "A. Faraday's law", "B. Lenz's law", "C. Ohm's law", "D. Joule's law" },
                { "A. 5 Pa", "B. 10 Pa", "C. 20 Pa", "D. 0.2 Pa" },
                { "A. 5 N", "B. 50 N", "C. 500 N", "D. 5000 N" },
                { "A. 0°", "B. 30°", "C. 45°", "D. 60°" },
                { "A. 1.2 Ω", "B. 5 Ω", "C. 6 Ω", "D. 1 Ω" },
                { "A. The focal length increases", "B. The focal length decreases", "C. The object distance increases",
                        "D. The image distance decreases" },
                { "A. 5 kg", "B. 16 kg", "C. 24 kg", "D. 80 kg" },
                { "A. Between the pole and focus", "B. At the focus", "C. Between focus and centre of curvature",
                        "D. At infinity" },
                { "A. Real and inverted image", "B. Virtual and erect image", "C. Real and erect image",
                        "D. Virtual and inverted image" },
                { "A. 2", "B. 3", "C. 4", "D. 5" },
                { "A. 10 N", "B. 16.6 N", "C. 98 N", "D. 100 N" },
                { "A. 25 m/s", "B. 52 m/s", "C. 100 m/s", "D. 48 m/s" },
                { "A. L × α × ΔT", "B. L / (α × ΔT)", "C. L × α / ΔT", "D. L / α × ΔT" },
                { "A. Motor", "B. Generator", "C. Transformer", "D. Rectifier" },
                { "A. Greater than the largest resistor", "B. Less than the smallest resistor",
                        "C. Equal to the sum of all resistors", "D. Equal to the average of all resistors" }
        };

        int correctAnswers[] = {
                1, // Q1: 1 N/m²
                2, // Q2: Friction
                2, // Q3: Solids
                0, // Q4: Speed of light in vacuum to speed of light in the medium
                2, // Q5: Latent heat of vaporization
                2, // Q6: Ohm's law
                0, // Q7: 5 Pa
                2, // Q8: 500 N
                0, // Q9: 0°
                1, // Q10: 5 Ω
                1, // Q11: The focal length decreases
                0, // Q12: 5 kg
                2, // Q13: Between focus and centre of curvature
                1, // Q14: Virtual and erect image
                1, // Q15: 3
                1, // Q16: 16.6 N
                2, // Q17: 100 m/s
                0, // Q18: L × α × ΔT
                2, // Q19: Transformer
                1 // Q20: Less than the smallest resistor
        };

        // Create radio buttons and store them in a 2D array
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
                        totalQuestions, score, totalQuestions - score, percentage, grade);

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