package Class.Class9.Chemistry.Easy;

import Class.Class9.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The branch of science that deals with the composition, structure, properties, and reactions of matter is called:",
                "Question 2: Anything that has mass and occupies space is called:",
                "Question 3: A substance made up of the same type of atoms is called:",
                "Question 4: The smallest particle of an element that can exist is called:",
                "Question 5: A substance that is composed of two or more elements chemically combined is called:",
                "Question 6: The central part of an atom that contains protons and neutrons is called the:",
                "Question 7: Which subatomic particle has a positive charge?",
                "Question 8: The number of protons in the nucleus of an atom is called the:",
                "Question 9: A bond formed by the transfer of electrons from one atom to another is called:",
                "Question 10: The study of covalent compounds of carbon and hydrogen is called:",
                "Question 11: A mixture that has a uniform composition throughout is called a:",
                "Question 12: The branch of chemistry that deals with radioactivity and nuclear processes is called:",
                "Question 13: Metals are generally:",
                "Question 14: The force that holds atoms together in a compound is called:",
                "Question 15: A solution that contains the maximum amount of solute at a given temperature is called:",
                "Question 16: The branch of chemistry that deals with the study of living organisms is called:",
                "Question 17: The particles that orbit around the nucleus of an atom are called:",
                "Question 18: The mass of an atom is concentrated in its:",
                "Question 19: The branch of chemistry that deals with the separation and analysis of a sample is called:",
                "Question 20: The process by which a liquid changes into vapour at its boiling point is called:"
        };

        String options[][] = {
                {"A. Physics", "B. Biology", "C. Chemistry", "D. Geology"},
                {"A. Energy", "B. Force", "C. Matter", "D. Light"},
                {"A. Compound", "B. Mixture", "C. Element", "D. Solution"},
                {"A. Molecule", "B. Atom", "C. Ion", "D. Compound"},
                {"A. Mixture", "B. Compound", "C. Alloy", "D. Solution"},
                {"A. Electron cloud", "B. Shell", "C. Nucleus", "D. Orbital"},
                {"A. Electron", "B. Proton", "C. Neutron", "D. Photon"},
                {"A. Mass number", "B. Atomic mass", "C. Atomic number", "D. Valency"},
                {"A. Covalent bond", "B. Ionic bond", "C. Metallic bond", "D. Hydrogen bond"},
                {"A. Inorganic chemistry", "B. Organic chemistry", "C. Biochemistry", "D. Physical chemistry"},
                {"A. Heterogeneous mixture", "B. Homogeneous mixture", "C. Compound", "D. Suspension"},
                {"A. Environmental chemistry", "B. Industrial chemistry", "C. Nuclear chemistry", "D. Analytical chemistry"},
                {"A. Good conductors of heat", "B. Non-conductors of electricity", "C. Brittle", "D. Dull in appearance"},
                {"A. Gravity", "B. Friction", "C. Chemical bond", "D. Magnetic force"},
                {"A. Dilute solution", "B. Concentrated solution", "C. Saturated solution", "D. Unsaturated solution"},
                {"A. Biochemistry", "B. Organic chemistry", "C. Inorganic chemistry", "D. Physical chemistry"},
                {"A. Protons", "B. Neutrons", "C. Electrons", "D. Nucleons"},
                {"A. Electron cloud", "B. Nucleus", "C. Orbitals", "D. Shells"},
                {"A. Organic chemistry", "B. Physical chemistry", "C. Analytical chemistry", "D. Inorganic chemistry"},
                {"A. Condensation", "B. Evaporation", "C. Boiling", "D. Melting"}
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
            new ChemistryDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}