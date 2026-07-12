package Class.Class12.Physics.Medium;

import Class.Class12.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The principle of superposition in electrostatics states that the net force on a charge due to multiple charges is:",
                "Question 2: Gauss's law relates the electric flux through a closed surface to:",
                "Question 3: The electric field inside a uniformly charged thin spherical shell is:",
                "Question 4: Equipotential surfaces are surfaces where:",
                "Question 5: The capacitance of a parallel plate capacitor is directly proportional to:",
                "Question 6: The energy stored in a capacitor is given by:",
                "Question 7: The drift velocity of electrons in a conductor is:",
                "Question 8: The V-I characteristic of a non-linear resistor is:",
                "Question 9: The internal resistance of a cell is:",
                "Question 10: The magnetic field at the center of a current-carrying circular loop depends on:",
                "Question 11: The magnetic field inside a solenoid is:",
                "Question 12: The direction of force on a current-carrying conductor in a magnetic field is given by:",
                "Question 13: The force between two parallel current-carrying conductors is:",
                "Question 14: A galvanometer can be converted into a voltmeter by connecting a:",
                "Question 15: Faraday's law of electromagnetic induction states that the induced emf is proportional to:",
                "Question 16: Lenz's law determines the:",
                "Question 17: The phenomenon of self-induction is due to:",
                "Question 18: In an LCR series circuit at resonance:",
                "Question 19: A transformer works on the principle of:",
                "Question 20: A step-up transformer increases:"
        };

        String options[][] = {
                {"A. The product of individual forces", "B. The vector sum of individual forces", "C. The scalar sum of individual forces", "D. The difference of individual forces"},
                {"A. The total charge enclosed", "B. The total charge outside", "C. The electric field at the surface", "D. The potential at the surface"},
                {"A. Zero", "B. Maximum", "C. Constant", "D. Infinite"},
                {"A. Electric field is zero", "B. Electric potential is constant", "C. Charge density is constant", "D. Current is zero"},
                {"A. The distance between plates", "B. The area of plates", "C. The charge on plates", "D. The voltage across plates"},
                {"A. U = ½ CV²", "B. U = CV²", "C. U = ½ QV", "D. Both A and C"},
                {"A. Very large", "B. Very small", "C. Equal to speed of light", "D. Zero"},
                {"A. A straight line", "B. A curve", "C. A vertical line", "D. A horizontal line"},
                {"A. Zero", "B. Infinite", "C. A finite value", "D. Equal to external resistance"},
                {"A. Current and radius", "B. Current only", "C. Radius only", "D. Area of the loop"},
                {"A. Uniform", "B. Non-uniform", "C. Zero", "D. Maximum at the ends"},
                {"A. Right-hand rule", "B. Fleming's left-hand rule", "C. Fleming's right-hand rule", "D. Ampere's rule"},
                {"A. Always attractive", "B. Always repulsive", "C. Attractive if currents are in the same direction", "D. Repulsive if currents are in the same direction"},
                {"A. Shunt in parallel", "B. High resistance in series", "C. Low resistance in series", "D. Shunt in series"},
                {"A. The rate of change of magnetic flux", "B. The magnetic flux", "C. The current in the circuit", "D. The resistance of the circuit"},
                {"A. Magnitude of induced emf", "B. Direction of induced current", "C. Magnitude of magnetic field", "D. Direction of magnetic field"},
                {"A. The magnetic field of the current itself", "B. An external magnetic field", "C. The electric field of the current", "D. The temperature of the conductor"},
                {"A. Impedance is maximum", "B. Impedance is minimum", "C. Current is minimum", "D. Power factor is zero"},
                {"A. Self-induction", "B. Mutual induction", "C. Electromagnetic waves", "D. Electrostatic induction"},
                {"A. Voltage", "B. Current", "C. Power", "D. Resistance"}
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
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
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