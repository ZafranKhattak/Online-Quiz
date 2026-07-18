package Class.Class9.Physics.Medium;

import Class.Class9.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: Study of motion without discussing the cause of motion is called:",
                "Question 2: Physical quantities which are completely described by their magnitude and direction are called:",
                "Question 3: The shortest distance between two points is called:",
                "Question 4: The rate of displacement of a body is called:",
                "Question 5: A body moving along a straight line without any rotation is in:",
                "Question 6: The motion of the earth around the sun is an example of:",
                "Question 7: The area under a speed-time graph represents:",
                "Question 8: The slope of a distance-time graph represents:",
                "Question 9: The first equation of motion is:",
                "Question 10: The second equation of motion is:",
                "Question 11: Newton's first law of motion is also known as the law of:",
                "Question 12: Newton's second law of motion gives the relationship between force and:",
                "Question 13: The product of mass and velocity of a body is called its:",
                "Question 14: The rotational effect of a force is called:",
                "Question 15: The perpendicular distance between the line of action of force and the axis of rotation is called:",
                "Question 16: Newton's law of gravitation states that the force of attraction between two objects is directly proportional to:",
                "Question 17: The value of acceleration due to gravity (g) on Earth is approximately:",
                "Question 18: The formula for kinetic energy is:",
                "Question 19: The formula for gravitational potential energy is:",
                "Question 20: The rate of doing work is called:"
        };

        String options[][] = {
                {"A. Kinematics", "B. Dynamics", "C. Mechanics", "D. Thermodynamics"},
                {"A. Scalars", "B. Vectors", "C. Base quantities", "D. Derived quantities"},
                {"A. Distance", "B. Speed", "C. Displacement", "D. Velocity"},
                {"A. Speed", "B. Acceleration", "C. Velocity", "D. Force"},
                {"A. Rotatory motion", "B. Vibratory motion", "C. Translatory motion", "D. Circular motion"},
                {"A. Rotatory motion", "B. Circular motion", "C. Vibratory motion", "D. Linear motion"},
                {"A. Speed", "B. Volume", "C. Acceleration", "D. Distance travelled"},
                {"A. Acceleration", "B. Speed", "C. Displacement", "D. Force"},
                {"A. vf = vi + at", "B. s = vit + ½ at²", "C. vf² = vi² + 2as", "D. F = ma"},
                {"A. vf = vi + at", "B. s = vit + ½ at²", "C. vf² = vi² + 2as", "D. F = ma"},
                {"A. Inertia", "B. Acceleration", "C. Action and reaction", "D. Momentum"},
                {"A. Velocity", "B. Acceleration", "C. Displacement", "D. Work"},
                {"A. Force", "B. Acceleration", "C. Momentum", "D. Work"},
                {"A. Work", "B. Energy", "C. Torque", "D. Power"},
                {"A. Torque", "B. Moment arm", "C. Force arm", "D. Lever arm"},
                {"A. The distance between them", "B. The product of their masses", "C. The sum of their masses", "D. The square of the distance"},
                {"A. 9.8 m/s²", "B. 10 m/s²", "C. 8.9 m/s²", "D. 9.0 m/s²"},
                {"A. ½ mv²", "B. mgh", "C. Fd", "D. ½ kx²"},
                {"A. ½ mv²", "B. mgh", "C. Fd", "D. ½ kx²"},
                {"A. Energy", "B. Force", "C. Power", "D. Torque"}
        };

        int correctAnswers[] = {
                0,  // Q1: Kinematics
                1,  // Q2: Vectors
                2,  // Q3: Displacement
                2,  // Q4: Velocity
                2,  // Q5: Translatory motion
                1,  // Q6: Circular motion
                3,  // Q7: Distance travelled
                0,  // Q8: Acceleration
                0,  // Q9: vf = vi + at
                1,  // Q10: s = vit + ½ at²
                0,  // Q11: Inertia
                1,  // Q12: Acceleration
                2,  // Q13: Momentum
                2,  // Q14: Torque
                1,  // Q15: Moment arm
                1,  // Q16: The product of their masses
                0,  // Q17: 9.8 m/s²
                0,  // Q18: ½ mv²
                1,  // Q19: mgh
                2   // Q20: Power
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