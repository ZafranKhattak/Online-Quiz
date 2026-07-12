package Class.Class10.Physics.Medium;

import Class.Class10.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The restoring force in Simple Harmonic Motion is directly proportional to:",
                "Question 2: The relationship between frequency (f) and time period (T) is:",
                "Question 3: In a ripple tank, the distance between two consecutive crests is called:",
                "Question 4: The speed of a wave is given by the formula:",
                "Question 5: A wave in which the particles of the medium vibrate parallel to the direction of wave propagation is called:",
                "Question 6: Sound waves are:",
                "Question 7: The speed of sound is fastest in which medium?",
                "Question 8: The phenomenon of sound reflection is called:",
                "Question 9: The minimum distance required for an echo to be heard is:",
                "Question 10: The law of reflection states that the angle of incidence is:",
                "Question 11: The image formed by a concave mirror when the object is beyond the centre of curvature is:",
                "Question 12: A convex mirror always forms:",
                "Question 13: The ability of an atom to attract electrons towards itself in a chemical bond is called:",
                "Question 14: The electric potential difference between two points is defined as:",
                "Question 15: Ohm's law states that:",
                "Question 16: In a series circuit, the current is:",
                "Question 17: A transformer that increases voltage is called:",
                "Question 18: A logic gate that gives a high output only when all inputs are high is called:",
                "Question 19: The amount of a radioactive substance that remains after one half-life is:",
                "Question 20: The process of splitting a heavy nucleus into two lighter nuclei is called:"
        };

        String options[][] = {
                {"A. Velocity", "B. Displacement", "C. Acceleration", "D. Time period"},
                {"A. f = T", "B. f = 1/T", "C. f = T²", "D. f = 1/T²"},
                {"A. Amplitude", "B. Frequency", "C. Wavelength", "D. Time period"},
                {"A. v = f/λ", "B. v = f × λ", "C. v = λ/f", "D. v = f + λ"},
                {"A. Transverse wave", "B. Longitudinal wave", "C. Electromagnetic wave", "D. Surface wave"},
                {"A. Transverse waves", "B. Longitudinal waves", "C. Electromagnetic waves", "D. Surface waves"},
                {"A. Gases", "B. Liquids", "C. Solids", "D. Vacuum"},
                {"A. Refraction", "B. Echo", "C. Diffraction", "D. Interference"},
                {"A. 17 m", "B. 34 m", "C. 10 m", "D. 50 m"},
                {"A. Greater than the angle of reflection", "B. Less than the angle of reflection", "C. Equal to the angle of reflection", "D. Not related to the angle of reflection"},
                {"A. Virtual and erect", "B. Real and inverted", "C. Virtual and inverted", "D. Real and erect"},
                {"A. Real and inverted image", "B. Virtual and erect image", "C. Real and erect image", "D. Virtual and inverted image"},
                {"A. Ionization energy", "B. Electron affinity", "C. Electronegativity", "D. Atomic radius"},
                {"A. Work done per unit charge", "B. Force per unit charge", "C. Energy per unit mass", "D. Power per unit charge"},
                {"A. V = I/R", "B. V = IR", "C. I = VR", "D. R = VI"},
                {"A. Different through each resistor", "B. The same through each resistor", "C. Zero through each resistor", "D. Maximum through the smallest resistor"},
                {"A. Step-down transformer", "B. Step-up transformer", "C. Power transformer", "D. Isolation transformer"},
                {"A. OR gate", "B. AND gate", "C. NOT gate", "D. NAND gate"},
                {"A. One-quarter of the original", "B. Half of the original", "C. One-third of the original", "D. Two-thirds of the original"},
                {"A. Nuclear fusion", "B. Nuclear fission", "C. Radioactive decay", "D. Alpha decay"}
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