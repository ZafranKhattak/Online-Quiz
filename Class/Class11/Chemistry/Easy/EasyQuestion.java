package Class.Class11.Chemistry.Easy;

import Class.Class11.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The number of elements arranged in the modern periodic table is:",
                "Question 2: How many horizontal rows called periods are there in the modern periodic table?",
                "Question 3: How many vertical columns called groups are there in the modern periodic table?",
                "Question 4: The law that states that properties of elements are periodic functions of their atomic numbers is called the:",
                "Question 5: Which scientist is considered the father of the periodic table?",
                "Question 6: The group of three elements with similar properties was called a:",
                "Question 7: Which of the following is a metalloid?",
                "Question 8: The positively charged subatomic particle present in the nucleus of an atom is called:",
                "Question 9: The smallest particle of an element that retains its properties is called:",
                "Question 10: The number of protons in the nucleus of an atom is called its:",
                "Question 11: The bond formed by the transfer of electrons from one atom to another is called:",
                "Question 12: The bond formed by the mutual sharing of electrons between atoms is called:",
                "Question 13: The amount of substance that contains 6.02 × 10²³ particles is called:",
                "Question 14: The Avogadro's number is approximately equal to:",
                "Question 15: The general formula of alkanes is:",
                "Question 16: The first member of the alkane family is:",
                "Question 17: A solution that contains the maximum amount of solute at a given temperature is called:",
                "Question 18: The pH of a neutral solution is:",
                "Question 19: Substances that have a pH value greater than 7 are called:",
                "Question 20: The process in which a liquid changes into vapour at its boiling point is called:"
        };

        String options[][] = {
                {"A. 108", "B. 112", "C. 116", "D. 118"},
                {"A. 5", "B. 6", "C. 7", "D. 8"},
                {"A. 12", "B. 14", "C. 16", "D. 18"},
                {"A. Döbereiner's law", "B. Mendeleev's law", "C. Modern periodic law", "D. Newlands' law of octaves"},
                {"A. Döbereiner", "B. Newlands", "C. Mendeleev", "D. Moseley"},
                {"A. Period", "B. Octave", "C. Triad", "D. Family"},
                {"A. Sodium", "B. Silicon", "C. Chlorine", "D. Iron"},
                {"A. Electron", "B. Proton", "C. Neutron", "D. Positron"},
                {"A. Molecule", "B. Atom", "C. Ion", "D. Compound"},
                {"A. Mass number", "B. Atomic number", "C. Atomic mass", "D. Valency"},
                {"A. Covalent bond", "B. Ionic bond", "C. Metallic bond", "D. Hydrogen bond"},
                {"A. Ionic bond", "B. Covalent bond", "C. Metallic bond", "D. Coordinate bond"},
                {"A. Gram", "B. Mole", "C. Kilogram", "D. Atomic mass unit"},
                {"A. 6.02 × 10²²", "B. 6.02 × 10²³", "C. 6.02 × 10²⁴", "D. 6.02 × 10²⁵"},
                {"A. CₙH₂ₙ", "B. CₙH₂ₙ₊₂", "C. CₙH₂ₙ₋₂", "D. CₙH₂ₙ₊₆"},
                {"A. Ethane", "B. Propane", "C. Methane", "D. Butane"},
                {"A. Dilute solution", "B. Concentrated solution", "C. Saturated solution", "D. Unsaturated solution"},
                {"A. 0", "B. 7", "C. 14", "D. 10"},
                {"A. Acids", "B. Bases", "C. Salts", "D. Neutral"},
                {"A. Evaporation", "B. Boiling", "C. Condensation", "D. Freezing"}
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
            new ChemistryDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}