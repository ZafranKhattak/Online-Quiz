package Class.Class9.Chemistry.Hard;

import Class.Class9.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The empirical formula of a compound is:",
                "Question 2: The mass of an atom of carbon-12 is exactly:",
                "Question 3: The molar mass of water (H₂O) is approximately:",
                "Question 4: The electronic configuration of sodium (atomic number 11) is:",
                "Question 5: The number of electrons in the valence shell of carbon is:",
                "Question 6: The bond formed by the donation of a lone pair of electrons from one atom to another is called:",
                "Question 7: The octet rule states that atoms tend to:",
                "Question 8: Which of the following is an example of a polar covalent bond?",
                "Question 9: The type of intermolecular force present in water molecules is:",
                "Question 10: The solubility of most solids in water generally:",
                "Question 11: The formula mass of sodium chloride (NaCl) is:",
                "Question 12: Which of the following is NOT a characteristic of ionic compounds?",
                "Question 13: The mass number of an atom with 20 protons and 20 neutrons is:",
                "Question 14: The relative atomic mass of an element is the average mass of its isotopes compared to:",
                "Question 15: The maximum number of electrons that can occupy the second shell of an atom is:",
                "Question 16: The atoms of elements in the same group of the periodic table have:",
                "Question 17: The bond between two chlorine atoms is:",
                "Question 18: Which of the following factors does NOT affect the solubility of a solute?",
                "Question 19: The molecular formula of benzene is C₆H₆. Its empirical formula is:",
                "Question 20: When one mole of a substance contains 6.02 × 10²³ particles, the number is called:"
        };

        String options[][] = {
                {"A. The actual number of atoms of each element in a molecule", "B. The simplest whole number ratio of atoms of each element", "C. The total number of atoms in a molecule", "D. The mass of one mole of the compound"},
                {"A. 1 amu", "B. 12 amu", "C. 6 amu", "D. 14 amu"},
                {"A. 16 g/mol", "B. 18 g/mol", "C. 20 g/mol", "D. 22 g/mol"},
                {"A. 2, 8, 1", "B. 2, 8, 2", "C. 2, 8, 3", "D. 2, 8, 4"},
                {"A. 2", "B. 3", "C. 4", "D. 6"},
                {"A. Ionic bond", "B. Covalent bond", "C. Coordinate covalent bond", "D. Metallic bond"},
                {"A. Gain or lose electrons to achieve 8 electrons in their valence shell", "B. Gain or lose protons to achieve stability", "C. Share neutrons to form bonds", "D. Have 8 protons in their nucleus"},
                {"A. H-H", "B. Cl-Cl", "C. H-Cl", "D. O=O"},
                {"A. London dispersion forces", "B. Hydrogen bonding", "C. Dipole-dipole forces", "D. Ionic bonding"},
                {"A. Increases with increasing temperature", "B. Decreases with increasing temperature", "C. Remains constant with temperature", "D. First increases then decreases"},
                {"A. 58.5 amu", "B. 58.5 g", "C. 23 amu", "D. 35.5 amu"},
                {"A. High melting point", "B. Conduct electricity in molten state", "C. Soluble in organic solvents", "D. Crystalline solid"},
                {"A. 20", "B. 30", "C. 40", "D. 60"},
                {"A. 1/12th of the mass of a carbon-12 atom", "B. The mass of a hydrogen atom", "C. The mass of an oxygen atom", "D. 1/16th of the mass of an oxygen-16 atom"},
                {"A. 2", "B. 8", "C. 18", "D. 32"},
                {"A. The same atomic number", "B. The same mass number", "C. The same number of valence electrons", "D. The same number of shells"},
                {"A. Ionic bond", "B. Non-polar covalent bond", "C. Polar covalent bond", "D. Metallic bond"},
                {"A. Temperature", "B. Pressure", "C. Nature of solute and solvent", "D. Volume of solvent"},
                {"A. C₆H₆", "B. CH", "C. C₂H₂", "D. C₃H₃"},
                {"A. Dalton's number", "B. Avogadro's number", "C. Rutherford's number", "D. Thomson's number"}
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
            new ChemistryDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}
