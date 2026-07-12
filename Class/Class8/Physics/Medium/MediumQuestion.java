package Class.Class8.Physics.Medium;

import Class.Class8.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: Which of the following is a contact force?",
                "Question 2: The force that pulls objects towards the centre of the Earth is called:",
                "Question 3: Pressure is defined as:",
                "Question 4: The image formed by a convex lens is:",
                "Question 5: Sound needs a medium to travel because it:",
                "Question 6: The time taken by a pendulum to complete one oscillation is called its:",
                "Question 7: Which of the following is a non-renewable source of energy?",
                "Question 8: The unit of frequency is the:",
                "Question 9: A solution that conducts electricity is called:",
                "Question 10: The transfer of heat through the movement of fluids is called:",
                "Question 11: The part of the eye that focuses light onto the retina is the:",
                "Question 12: The SI unit of electric charge is the:",
                "Question 13: The loudness of sound depends on the:",
                "Question 14: The pitch of sound depends on the:",
                "Question 15: The process of changing a liquid into vapour is called:",
                "Question 16: The image formed by a concave lens is always:",
                "Question 17: A device that converts chemical energy into electrical energy is called a:",
                "Question 18: The temperature at which a solid changes into a liquid is called its:",
                "Question 19: The greenhouse effect is primarily caused by the increase of which gas in the atmosphere?",
                "Question 20: The bending of light through a glass slab results in:"
        };

        String options[][] = {
                {"A. Gravitational force", "B. Magnetic force", "C. Electrostatic force", "D. Muscular force"},
                {"A. Magnetic force", "B. Electrostatic force", "C. Gravitational force", "D. Frictional force"},
                {"A. Force × Area", "B. Force / Area", "C. Area / Force", "D. Force + Area"},
                {"A. Always virtual", "B. Always real", "C. Can be real or virtual depending on the object distance", "D. Always inverted"},
                {"A. Is a form of energy", "B. Is a wave", "C. Requires particles to vibrate", "D. Has high speed"},
                {"A. Frequency", "B. Time period", "C. Amplitude", "D. Wavelength"},
                {"A. Solar energy", "B. Wind energy", "C. Coal", "D. Hydropower"},
                {"A. Hertz", "B. Metre", "C. Joule", "D. Pascal"},
                {"A. Insulator", "B. Conductor", "C. Electrolyte", "D. Resistor"},
                {"A. Conduction", "B. Convection", "C. Radiation", "D. Evaporation"},
                {"A. Cornea", "B. Pupil", "C. Lens", "D. Iris"},
                {"A. Ampere", "B. Volt", "C. Coulomb", "D. Ohm"},
                {"A. Frequency", "B. Amplitude", "C. Speed", "D. Wavelength"},
                {"A. Amplitude", "B. Frequency", "C. Speed", "D. Medium"},
                {"A. Condensation", "B. Evaporation", "C. Freezing", "D. Melting"},
                {"A. Real and inverted", "B. Virtual and erect", "C. Real and erect", "D. Virtual and inverted"},
                {"A. Generator", "B. Motor", "C. Cell", "D. Transformer"},
                {"A. Boiling point", "B. Melting point", "C. Freezing point", "D. Sublimation point"},
                {"A. Oxygen", "B. Nitrogen", "C. Carbon dioxide", "D. Hydrogen"},
                {"A. Lateral displacement", "B. Vertical displacement", "C. No displacement", "D. Total internal reflection"}
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