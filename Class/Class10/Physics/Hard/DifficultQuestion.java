package Class.Class10.Physics.Hard;

import Class.Class10.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The acceleration of a body executing SHM is given by:",
                "Question 2: The total energy of a body executing SHM is:",
                "Question 3: The Doppler effect is the change in:",
                "Question 4: A sound wave of frequency 1000 Hz has a speed of 340 m/s. Its wavelength is:",
                "Question 5: The critical angle is the angle of incidence for which the angle of refraction is:",
                "Question 6: The refractive index of a medium is given by:",
                "Question 7: The power of a lens is measured in:",
                "Question 8: A lens of power +2.5 D has a focal length of:",
                "Question 9: Coulomb's law states that the force between two charges is:",
                "Question 10: The capacitance of a parallel plate capacitor depends on:",
                "Question 11: The equivalent resistance of two resistors R₁ and R₂ connected in parallel is:",
                "Question 12: The energy dissipated in a resistor is given by:",
                "Question 13: Fleming's left-hand rule is used to find the direction of:",
                "Question 14: The law of electromagnetic induction states that:",
                "Question 15: The truth table of a NAND gate is the inverse of:",
                "Question 16: The Boolean expression for a NOR gate is:",
                "Question 17: A semiconductor doped with pentavalent impurity is called:",
                "Question 18: The half-life of a radioactive element is 10 years. After 30 years, the fraction remaining is:",
                "Question 19: In nuclear fusion, two light nuclei combine to form a heavier nucleus and:",
                "Question 20: The binding energy of a nucleus is:"
        };

        String options[][] = {
                {"A. a = -ω²x", "B. a = ω²x", "C. a = -ωx", "D. a = ωx"},
                {"A. Directly proportional to displacement", "B. Directly proportional to the square of amplitude", "C. Inversely proportional to amplitude", "D. Independent of amplitude"},
                {"A. Speed of sound due to motion of the source", "B. Frequency of sound due to motion of the source or observer", "C. Amplitude of sound due to motion of the source", "D. Wavelength of sound due to motion of the source"},
                {"A. 0.34 m", "B. 34 m", "C. 3.4 m", "D. 0.034 m"},
                {"A. 0°", "B. 45°", "C. 90°", "D. 180°"},
                {"A. n = sin i / sin r", "B. n = sin r / sin i", "C. n = sin i × sin r", "D. n = sin i + sin r"},
                {"A. Metres", "B. Dioptres", "C. Watts", "D. Joules"},
                {"A. 0.4 m", "B. 2.5 m", "C. 0.25 m", "D. 4.0 m"},
                {"A. Directly proportional to the product of charges and inversely proportional to the square of distance", "B. Directly proportional to the product of charges and directly proportional to the square of distance", "C. Inversely proportional to the product of charges and directly proportional to the square of distance", "D. Directly proportional to the sum of charges and inversely proportional to the square of distance"},
                {"A. Plate area, distance between plates, and dielectric constant", "B. Plate area only", "C. Distance between plates only", "D. Dielectric constant only"},
                {"A. R₁ + R₂", "B. (R₁ × R₂)/(R₁ + R₂)", "C. (R₁ + R₂)/(R₁ × R₂)", "D. R₁ - R₂"},
                {"A. I²R", "B. I²Rt", "C. V²R", "D. IRt"},
                {"A. Magnetic field", "B. Force on a current-carrying conductor", "C. Current induced in a conductor", "D. Electric field"},
                {"A. Current is induced in a conductor when it is placed in a magnetic field", "B. Current is induced in a conductor when the magnetic flux linking it changes", "C. Current is induced in a conductor when it is heated", "D. Current is induced in a conductor when it is cooled"},
                {"A. AND gate", "B. OR gate", "C. NOR gate", "D. NOT gate"},
                {"A. Y = A + B", "B. Y = A · B", "C. Y = A + B", "D. Y = A · B"},
                {"A. P-type semiconductor", "B. N-type semiconductor", "C. Intrinsic semiconductor", "D. Extrinsic semiconductor"},
                {"A. 1/2", "B. 1/4", "C. 1/8", "D. 1/16"},
                {"A. Absorb energy", "B. Release energy", "C. Neither absorb nor release energy", "D. Release neutrons only"},
                {"A. The energy required to break the nucleus into its constituent nucleons", "B. The energy released when the nucleus forms", "C. Both A and B", "D. The energy of the electrons in the atom"}
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