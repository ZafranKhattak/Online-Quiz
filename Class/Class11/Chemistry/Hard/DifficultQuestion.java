package Class.Class11.Chemistry.Hard;

import Class.Class11.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The periodic table is arranged into four blocks associated with the four sublevels:",
                "Question 2: In the periodic table, the period number (n) represents:",
                "Question 3: The trend of atomic radius across a period is:",
                "Question 4: The trend of ionization energy down a group is:",
                "Question 5: The electron affinity of an element is the:",
                "Question 6: The electronic configuration of chromium (atomic number 24) is:",
                "Question 7: The bond order of a molecule is defined as:",
                "Question 8: The molecular orbital configuration of O₂ shows that it has:",
                "Question 9: The limiting reactant in a chemical reaction is the one that:",
                "Question 10: The relationship between the equilibrium constant Kc and Gibbs free energy ΔG° is:",
                "Question 11: Le Chatelier's principle states that when a change in conditions is applied to a system at equilibrium, the system will:",
                "Question 12: When the concentration of a reactant is increased in a system at equilibrium, the system will:",
                "Question 13: For an exothermic reaction, an increase in temperature will:",
                "Question 14: The pH of a solution with hydrogen ion concentration [H⁺] = 1 × 10⁻⁵ M is:",
                "Question 15: The Henderson-Hasselbalch equation is used to calculate:",
                "Question 16: The degree of ionization of a weak electrolyte:",
                "Question 17: The common ion effect refers to:",
                "Question 18: The oxidation number of chromium in K₂Cr₂O₇ is:",
                "Question 19: The phenomenon of resonance in benzene is responsible for its:",
                "Question 20: According to the first law of thermodynamics, the change in internal energy (ΔU) is equal to:"
        };

        String options[][] = {
                {"A. s, p, d, f", "B. s, p, d, g", "C. s, p, d, h", "D. s, p, d, e"},
                {"A. The number of valence electrons", "B. The outer energy level occupied by electrons", "C. The number of protons", "D. The mass number"},
                {"A. Increases", "B. Decreases", "C. Remains constant", "D. First increases then decreases"},
                {"A. Increases", "B. Decreases", "C. Remains constant", "D. First decreases then increases"},
                {"A. Energy required to remove an electron", "B. Energy released when an atom gains an electron", "C. Energy required to add an electron", "D. Energy released when an atom loses an electron"},
                {"A. [Ar]3d⁴4s²", "B. [Ar]3d⁵4s¹", "C. [Ar]3d⁶4s⁰", "D. [Ar]3d³4s³"},
                {"A. Number of bonds formed", "B. Half of the difference between bonding and anti-bonding electrons", "C. The total number of electron pairs", "D. The number of unpaired electrons"},
                {"A. Diamagnetic nature", "B. Paramagnetic nature", "C. Ferromagnetic nature", "D. No magnetic property"},
                {"A. Is present in excess", "B. Is completely consumed", "C. Does not react", "D. Is formed at the end"},
                {"A. ΔG° = -RT ln Kc", "B. ΔG° = RT ln Kc", "C. ΔG° = -RT Kc", "D. ΔG° = RT/Kc"},
                {"A. Move in the direction that increases the change", "B. Move in the direction that counteracts the change", "C. Remain unchanged", "D. Move towards the products only"},
                {"A. Shift towards reactants", "B. Shift towards products", "C. Remain unchanged", "D. Increase the temperature"},
                {"A. Increase the value of Kc", "B. Decrease the value of Kc", "C. Have no effect on Kc", "D. Double the value of Kc"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. The pH of a buffer solution", "B. The Ka of an acid", "C. The concentration of a base", "D. The solubility product"},
                {"A. Increases with dilution", "B. Decreases with dilution", "C. Remains constant with dilution", "D. Is independent of dilution"},
                {"A. The decrease in solubility of a salt in a solution containing a common ion", "B. The increase in solubility of a salt in a solution containing a common ion", "C. The reaction between ions", "D. The formation of precipitates"},
                {"A. +4", "B. +5", "C. +6", "D. +7"},
                {"A. High reactivity", "B. Unusual stability", "C. Low boiling point", "D. High melting point"},
                {"A. q + w", "B. q - w", "C. q × w", "D. q/w"}
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