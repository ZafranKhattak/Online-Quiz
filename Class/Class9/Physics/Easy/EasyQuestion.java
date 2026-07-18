package Class.Class9.Physics.Easy;

import Class.Class9.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The branch of science that deals with the study of matter, energy, and their interaction is called:",
                "Question 2: A push or pull acting on a body is called:",
                "Question 3: The SI unit of force is the:",
                "Question 4: The force that opposes motion between two surfaces in contact is called:",
                "Question 5: The instrument used to measure temperature is called a:",
                "Question 6: The SI unit of length is the:",
                "Question 7: The SI unit of time is the:",
                "Question 8: The SI unit of mass is the:",
                "Question 9: A body at rest does not change its position with respect to its surroundings. This is called:",
                "Question 10: Study of motion of bodies is known as:",
                "Question 11: The distance covered in unit time is called:",
                "Question 12: Work is done when a force acting on a body displaces it in the direction of:",
                "Question 13: The energy possessed by a body due to its motion is called:",
                "Question 14: The energy possessed by a body due to its height is called:",
                "Question 15: The unit of work is the:",
                "Question 16: The spinning motion of a body about its axis is known as:",
                "Question 17: The motion of a pendulum is an example of:",
                "Question 18: A quantity that is completely described by its magnitude only is called:",
                "Question 19: The rate of change of velocity is called:",
                "Question 20: The force that pulls objects towards the centre of the Earth is called:"
        };

        String options[][] = {
                {"A. Chemistry", "B. Biology", "C. Physics", "D. Geology"},
                {"A. Pressure", "B. Force", "C. Friction", "D. Motion"},
                {"A. Joule", "B. Watt", "C. Newton", "D. Pascal"},
                {"A. Gravitational force", "B. Magnetic force", "C. Friction", "D. Muscular force"},
                {"A. Barometer", "B. Thermometer", "C. Speedometer", "D. Ammeter"},
                {"A. Foot", "B. Metre", "C. Kilogram", "D. Second"},
                {"A. Hour", "B. Minute", "C. Second", "D. Day"},
                {"A. Gram", "B. Kilogram", "C. Pound", "D. Ton"},
                {"A. Motion", "B. Rest", "C. Velocity", "D. Acceleration"},
                {"A. Heat", "B. Light", "C. Mechanics", "D. Atomic physics"},
                {"A. Velocity", "B. Acceleration", "C. Speed", "D. Displacement"},
                {"A. Force", "B. Displacement", "C. Friction", "D. Motion"},
                {"A. Potential energy", "B. Kinetic energy", "C. Chemical energy", "D. Heat energy"},
                {"A. Kinetic energy", "B. Potential energy", "C. Chemical energy", "D. Sound energy"},
                {"A. Watt", "B. Newton", "C. Joule", "D. Pascal"},
                {"A. Translatory motion", "B. Vibratory motion", "C. Rotatory motion", "D. Linear motion"},
                {"A. Translatory motion", "B. Rotatory motion", "C. Vibratory motion", "D. Circular motion"},
                {"A. Vector quantity", "B. Scalar quantity", "C. Derived quantity", "D. Base quantity"},
                {"A. Speed", "B. Displacement", "C. Acceleration", "D. Force"},
                {"A. Magnetic force", "B. Electrostatic force", "C. Gravitational force", "D. Frictional force"}
        };

        int correctAnswers[] = {
                2,  // Q1: Physics
                1,  // Q2: Force
                2,  // Q3: Newton
                2,  // Q4: Friction
                1,  // Q5: Thermometer
                1,  // Q6: Metre
                2,  // Q7: Second
                1,  // Q8: Kilogram
                1,  // Q9: Rest
                2,  // Q10: Mechanics
                2,  // Q11: Speed
                1,  // Q12: Displacement
                1,  // Q13: Kinetic energy
                1,  // Q14: Potential energy
                2,  // Q15: Joule
                2,  // Q16: Rotatory motion
                2,  // Q17: Vibratory motion
                1,  // Q18: Scalar quantity
                2,  // Q19: Acceleration
                2   // Q20: Gravitational force
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