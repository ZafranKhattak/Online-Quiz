package Class.Class8.GeneralScience.Hard;

import Class.Class8.GeneralScience.GeneralScienceDashboard.GeneralScienceDashboard;
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
                "Question 1: In biotechnology, the process of using living organisms or their products to modify human health and environment is called:",
                "Question 2: The law stating that the angle of incidence equals the angle of reflection is called the:",
                "Question 3: Which of the following is a characteristic of a base?",
                "Question 4: The process by which plants lose water in the form of water vapour is called:",
                "Question 5: In a chemical reaction, the substances that undergo change are called:",
                "Question 6: The part of the eye that focuses light onto the retina is the:",
                "Question 7: Which of the following is NOT a fossil fuel?",
                "Question 8: An electrochemical cell that converts chemical energy into electrical energy is called a:",
                "Question 9: The temperature at which a solid changes into a liquid is called its:",
                "Question 10: Which organ system is responsible for the coordination and control of body activities?",
                "Question 11: The substances that are formed as a result of a chemical reaction are called:",
                "Question 12: The bending of light when it passes from one medium to another is called:",
                "Question 13: Which of the following statements about acids is TRUE?",
                "Question 14: The time taken by a pendulum to complete one oscillation is called:",
                "Question 15: The use of microorganisms in industry to produce products such as antibiotics is called:",
                "Question 16: The unit of electrical resistance is the:",
                "Question 17: The process of separating a mixture based on differences in boiling points is called:",
                "Question 18: The planet known as the \"Red Planet\" is:",
                "Question 19: The component of blood that is responsible for carrying oxygen is:",
                "Question 20: The greenhouse effect is primarily caused by the increase of which gas in the atmosphere?"
        };

        String options[][] = {
                {"A. Fermentation", "B. Genetic engineering", "C. Biotechnology", "D. Cloning"},
                {"A. Law of refraction", "B. Law of reflection", "C. Snell's law", "D. Hooke's law"},
                {"A. It turns blue litmus paper red", "B. It has a sour taste", "C. It turns red litmus paper blue", "D. It reacts with metals to produce hydrogen gas"},
                {"A. Photosynthesis", "B. Respiration", "C. Transpiration", "D. Condensation"},
                {"A. Products", "B. Reactants", "C. Catalysts", "D. Inhibitors"},
                {"A. Cornea", "B. Pupil", "C. Lens", "D. Iris"},
                {"A. Coal", "B. Natural gas", "C. Uranium", "D. Petroleum"},
                {"A. Voltaic cell", "B. Electrolytic cell", "C. Fuel cell", "D. Solar cell"},
                {"A. Boiling point", "B. Melting point", "C. Freezing point", "D. Sublimation point"},
                {"A. Circulatory system", "B. Nervous system", "C. Digestive system", "D. Skeletal system"},
                {"A. Reactants", "B. Products", "C. Catalysts", "D. Intermediates"},
                {"A. Reflection", "B. Refraction", "C. Dispersion", "D. Diffraction"},
                {"A. They turn red litmus paper blue", "B. They have a bitter taste", "C. They react with bases to form salts and water", "D. They are slippery to touch"},
                {"A. Frequency", "B. Time period", "C. Amplitude", "D. Wavelength"},
                {"A. Genetic engineering", "B. Fermentation", "C. Industrial microbiology", "D. Biochemistry"},
                {"A. Ampere", "B. Volt", "C. Ohm", "D. Watt"},
                {"A. Filtration", "B. Crystallization", "C. Fractional distillation", "D. Sublimation"},
                {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
                {"A. White blood cells", "B. Platelets", "C. Red blood cells", "D. Plasma"},
                {"A. Oxygen", "B. Nitrogen", "C. Carbon dioxide", "D. Hydrogen"}
        };

        int correctAnswers[] = {
                2,  // Q1: Biotechnology
                1,  // Q2: Law of reflection
                2,  // Q3: It turns red litmus paper blue
                2,  // Q4: Transpiration
                1,  // Q5: Reactants
                2,  // Q6: Lens
                2,  // Q7: Uranium
                0,  // Q8: Voltaic cell
                1,  // Q9: Melting point
                1,  // Q10: Nervous system
                1,  // Q11: Products
                1,  // Q12: Refraction
                2,  // Q13: They react with bases to form salts and water
                1,  // Q14: Time period
                2,  // Q15: Industrial microbiology
                2,  // Q16: Ohm
                2,  // Q17: Fractional distillation
                1,  // Q18: Mars
                2,  // Q19: Red blood cells
                2   // Q20: Carbon dioxide
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