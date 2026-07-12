package Class.Class10.Physics.Easy;

import Class.Class10.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The to-and-fro motion of a body about its mean position is called:",
                "Question 2: The maximum displacement of a vibrating body from its mean position is called:",
                "Question 3: The number of vibrations completed in one second is called:",
                "Question 4: The time required to complete one vibration is called:",
                "Question 5: A disturbance that transfers energy from one place to another without transferring matter is called:",
                "Question 6: Waves in which the particles of the medium vibrate perpendicular to the direction of wave propagation are called:",
                "Question 7: Sound is produced by:",
                "Question 8: The unit of frequency is:",
                "Question 9: The bending of light when it passes from one medium to another is called:",
                "Question 10: A lens that is thicker in the middle than at the edges is called a:",
                "Question 11: The SI unit of electric charge is the:",
                "Question 12: The device used to measure electric current is called:",
                "Question 13: The unit of electrical resistance is the:",
                "Question 14: A material that allows electric current to pass through it is called:",
                "Question 15: The region around a magnet where its magnetic effect can be felt is called the:",
                "Question 16: A device that converts electrical energy into mechanical energy is called a:",
                "Question 17: A device that converts mechanical energy into electrical energy is called a:",
                "Question 18: The smallest particle of an element that retains its properties is called:",
                "Question 19: The number of protons in the nucleus of an atom is called the:",
                "Question 20: The spontaneous emission of radiation from unstable atomic nuclei is called:"
        };

        String options[][] = {
                {"A. Linear motion", "B. Circular motion", "C. Simple Harmonic Motion", "D. Random motion"},
                {"A. Frequency", "B. Time period", "C. Amplitude", "D. Wavelength"},
                {"A. Amplitude", "B. Frequency", "C. Time period", "D. Wavelength"},
                {"A. Amplitude", "B. Frequency", "C. Time period", "D. Wavelength"},
                {"A. Force", "B. Wave", "C. Motion", "D. Energy"},
                {"A. Longitudinal waves", "B. Transverse waves", "C. Sound waves", "D. Mechanical waves"},
                {"A. Light", "B. Vibrations", "C. Heat", "D. Electricity"},
                {"A. Hertz", "B. Metre", "C. Second", "D. Pascal"},
                {"A. Reflection", "B. Refraction", "C. Dispersion", "D. Diffraction"},
                {"A. Concave lens", "B. Convex lens", "C. Plano lens", "D. Cylindrical lens"},
                {"A. Ampere", "B. Volt", "C. Coulomb", "D. Ohm"},
                {"A. Voltmeter", "B. Ammeter", "C. Galvanometer", "D. Ohmmeter"},
                {"A. Ampere", "B. Volt", "C. Ohm", "D. Watt"},
                {"A. Insulator", "B. Conductor", "C. Semiconductor", "D. Resistor"},
                {"A. Electric field", "B. Magnetic field", "C. Gravitational field", "D. Electric potential"},
                {"A. Generator", "B. Motor", "C. Transformer", "D. Battery"},
                {"A. Motor", "B. Generator", "C. Battery", "D. Transformer"},
                {"A. Molecule", "B. Atom", "C. Ion", "D. Proton"},
                {"A. Mass number", "B. Atomic number", "C. Atomic mass", "D. Valency"},
                {"A. Radioactivity", "B. Radioactivity", "C. Fission", "D. Fusion"}
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
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
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