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

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 950, 30);
            label2.setForeground(Color.GREEN);
            label2.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(label2);
        }

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                group.add(btn);
                panel.add(btn);
            }
        }

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            JOptionPane.showConfirmDialog(null, "You want to submit");
            JOptionPane.showMessageDialog(null, "Submitted Successfully");
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