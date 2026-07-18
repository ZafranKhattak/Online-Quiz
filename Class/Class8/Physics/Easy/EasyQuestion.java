package Class.Class8.Physics.Easy;

import Class.Class8.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: A push or pull acting on an object is called:",
                "Question 2: The SI unit of force is the:",
                "Question 3: The force that opposes motion between two surfaces in contact is called:",
                "Question 4: The instrument used to measure temperature is called a:",
                "Question 5: The transfer of heat through direct contact is called:",
                "Question 6: A lens that is thicker in the middle than at the edges is called a:",
                "Question 7: The device used to measure electric current is called:",
                "Question 8: Sound is produced by:",
                "Question 9: The law that states the angle of incidence equals the angle of reflection is called the:",
                "Question 10: The bending of light when it passes from one medium to another is called:",
                "Question 11: The standard unit for measuring length is the:",
                "Question 12: The force exerted by a liquid on a surface is called:",
                "Question 13: The unit of electrical resistance is the:",
                "Question 14: A freely suspended bar magnet always aligns itself in which direction?",
                "Question 15: When two magnets are brought closer, their like poles will:",
                "Question 16: The speed of light in air is approximately:",
                "Question 17: The movement of a pendulum is an example of:",
                "Question 18: Heat energy travels from:",
                "Question 19: A material that allows light to pass through it clearly is called:",
                "Question 20: The unit of pressure is the:"
        };

        String options[][] = {
                {"A. Pressure", "B. Force", "C. Friction", "D. Motion"},
                {"A. Joule", "B. Watt", "C. Newton", "D. Pascal"},
                {"A. Gravitational force", "B. Magnetic force", "C. Friction", "D. Muscular force"},
                {"A. Barometer", "B. Thermometer", "C. Speedometer", "D. Ammeter"},
                {"A. Convection", "B. Radiation", "C. Conduction", "D. Evaporation"},
                {"A. Concave lens", "B. Convex lens", "C. Plano lens", "D. Cylindrical lens"},
                {"A. Voltmeter", "B. Ammeter", "C. Galvanometer", "D. Ohmmeter"},
                {"A. Light", "B. Vibrations", "C. Heat", "D. Electricity"},
                {"A. Law of refraction", "B. Law of reflection", "C. Snell's law", "D. Hooke's law"},
                {"A. Reflection", "B. Refraction", "C. Dispersion", "D. Diffraction"},
                {"A. Handspan", "B. Cubit", "C. Metre", "D. Pace"},
                {"A. Tension", "B. Thrust", "C. Pressure", "D. Friction"},
                {"A. Ampere", "B. Volt", "C. Ohm", "D. Watt"},
                {"A. East-West", "B. North-South", "C. North-East", "D. South-West"},
                {"A. Attract each other", "B. Repel each other", "C. Stick together", "D. Cancel each other"},
                {"A. 3 × 10⁶ m/s", "B. 3 × 10⁸ m/s", "C. 3 × 10¹⁰ m/s", "D. 3 × 10⁴ m/s"},
                {"A. Linear motion", "B. Circular motion", "C. Oscillatory motion", "D. Random motion"},
                {"A. Cold to hot body", "B. Hot to cold body", "C. Both directions", "D. Neither direction"},
                {"A. Transparent", "B. Translucent", "C. Opaque", "D. Reflective"},
                {"A. Newton", "B. Pascal", "C. Joule", "D. Watt"}
        };

        int correctAnswers[] = {
                1,  // Q1: Force
                2,  // Q2: Newton
                2,  // Q3: Friction
                1,  // Q4: Thermometer
                2,  // Q5: Conduction
                1,  // Q6: Convex lens
                1,  // Q7: Ammeter
                1,  // Q8: Vibrations
                1,  // Q9: Law of reflection
                1,  // Q10: Refraction
                2,  // Q11: Metre
                2,  // Q12: Pressure
                2,  // Q13: Ohm
                1,  // Q14: North-South
                1,  // Q15: Repel each other
                1,  // Q16: 3 × 10⁸ m/s
                2,  // Q17: Oscillatory motion
                1,  // Q18: Hot to cold body
                0,  // Q19: Transparent
                1   // Q20: Pascal
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