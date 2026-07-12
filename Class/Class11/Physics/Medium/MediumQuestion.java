package Class.Class11.Physics.Medium;

import Class.Class11.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: Dimensional analysis is used to:",
                "Question 2: The number of significant figures in 0.00450 is:",
                "Question 3: When two vectors are added, the resultant is maximum when the angle between them is:",
                "Question 4: The acceleration of a body is zero when:",
                "Question 5: A body moving with uniform acceleration covers a distance s = vit + ½ at². This is:",
                "Question 6: The slope of a velocity-time graph gives:",
                "Question 7: Newton's second law of motion gives the relationship between force and:",
                "Question 8: The law of conservation of linear momentum states that:",
                "Question 9: A collision in which kinetic energy is conserved is called:",
                "Question 10: The torque produced by a force depends on:",
                "Question 11: The centre of mass of a two-particle system lies:",
                "Question 12: The moment of inertia of a body depends on:",
                "Question 13: Kepler's first law states that planets move in:",
                "Question 14: The escape velocity from the Earth's surface is approximately:",
                "Question 15: Pascal's law states that pressure applied to an enclosed fluid is:",
                "Question 16: Bernoulli's principle states that as the speed of a fluid increases:",
                "Question 17: The first law of thermodynamics states that:",
                "Question 18: In an adiabatic process:",
                "Question 19: The equation of state for an ideal gas is:",
                "Question 20: The law of equipartition of energy states that the average energy per degree of freedom is:"
        };

        String options[][] = {
                {"A. Measure physical quantities", "B. Check the consistency of equations", "C. Determine the numerical value of constants", "D. Calculate the error in measurements"},
                {"A. 2", "B. 3", "C. 4", "D. 5"},
                {"A. 0°", "B. 45°", "C. 90°", "D. 180°"},
                {"A. Its velocity is zero", "B. Its velocity is constant", "C. Its velocity is changing", "D. It is at rest"},
                {"A. The first equation of motion", "B. The second equation of motion", "C. The third equation of motion", "D. The law of conservation"},
                {"A. Distance travelled", "B. Displacement", "C. Acceleration", "D. Velocity"},
                {"A. Velocity", "B. Acceleration", "C. Displacement", "D. Work"},
                {"A. Momentum is always lost in collisions", "B. The momentum of an isolated system remains constant", "C. Momentum is always gained in collisions", "D. Momentum is never conserved"},
                {"A. Inelastic collision", "B. Elastic collision", "C. Perfectly inelastic collision", "D. Head-on collision"},
                {"A. Force only", "B. Distance only", "C. Force and moment arm", "D. Force and time"},
                {"A. At the midpoint of the two particles", "B. Closer to the heavier particle", "C. Closer to the lighter particle", "D. Outside the system"},
                {"A. Mass only", "B. Shape only", "C. Mass and distribution of mass about the axis of rotation", "D. Velocity only"},
                {"A. Circular orbits", "B. Elliptical orbits with the Sun at one focus", "C. Parabolic orbits", "D. Hyperbolic orbits"},
                {"A. 7.9 km/s", "B. 11.2 km/s", "C. 14.5 km/s", "D. 16.0 km/s"},
                {"A. Transmitted undiminished to every part of the fluid", "B. Transmitted only to the walls of the container", "C. Reduced in proportion to the area", "D. Increased in proportion to the depth"},
                {"A. Pressure increases", "B. Pressure decreases", "C. Pressure remains constant", "D. Density increases"},
                {"A. Energy cannot be created or destroyed", "B. Energy can be created", "C. Energy can be destroyed", "D. Entropy always increases"},
                {"A. Temperature remains constant", "B. No heat is exchanged with the surroundings", "C. Pressure remains constant", "D. Volume remains constant"},
                {"A. PV = nRT", "B. PV = RT", "C. P = nRT/V", "D. V = nRT/P"},
                {"A. kT", "B. ½ kT", "C. 3/2 kT", "D. 2 kT"}
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
                btn.setBounds(80 + (j * 260), (i * 60 + 130), 260, 30);
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