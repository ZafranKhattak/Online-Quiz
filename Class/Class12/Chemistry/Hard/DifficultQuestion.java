package Class.Class12.Chemistry.Hard;

import Class.Class12.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: Lanthanide contraction is due to the:",
                "Question 2: The electronic configuration of chromium is:",
                "Question 3: The coordination number of platinum in [Pt(NH₃)₄]Cl₂ is:",
                "Question 4: Which of the following shows geometrical isomerism?",
                "Question 5: Tautomerism is exhibited by compounds containing:",
                "Question 6: Markovnikov's rule is applied to the addition of:",
                "Question 7: The anti-Markovnikov addition of HBr occurs in the presence of:",
                "Question 8: The mechanism of electrophilic substitution in benzene involves:",
                "Question 9: Grignard reagents are prepared from alkyl halides and:",
                "Question 10: The Cannizzaro reaction is given by aldehydes which:",
                "Question 11: Aldol condensation is a reaction between:",
                "Question 12: The peptide bond in proteins is formed between:",
                "Question 13: The primary structure of a protein refers to:",
                "Question 14: The enzyme that catalyzes the conversion of glucose to ethanol is:",
                "Question 15: The saponification reaction produces:",
                "Question 16: Biodiesel is produced from:",
                "Question 17: The Haber-Bosch process is used for the manufacture of:",
                "Question 18: The Contact process is used for the manufacture of:",
                "Question 19: The Ostwald process is used for the manufacture of:",
                "Question 20: BOD (Biological Oxygen Demand) is a measure of:"
        };

        String options[][] = {
                {"A. Poor shielding effect of f-orbitals", "B. Good shielding effect of f-orbitals", "C. Increase in nuclear charge", "D. Decrease in nuclear charge"},
                {"A. [Ar]3d⁴4s²", "B. [Ar]3d⁵4s¹", "C. [Ar]3d⁶4s⁰", "D. [Ar]3d³4s³"},
                {"A. 2", "B. 4", "C. 6", "D. 8"},
                {"A. Alkynes", "B. Alkenes", "C. Alkanes", "D. Cycloalkanes"},
                {"A. C=C and -OH", "B. C=O and α-H", "C. C≡C and -OH", "D. C=O and -NH₂"},
                {"A. H₂ to alkenes", "B. HX to alkenes", "C. X₂ to alkenes", "D. H₂ to alkynes"},
                {"A. Peroxide", "B. Acid", "C. Base", "D. Salt"},
                {"A. Formation of a sigma complex", "B. Formation of a pi complex", "C. Both A and B", "D. Direct substitution"},
                {"A. Magnesium", "B. Magnesium in dry ether", "C. Zinc", "D. Sodium"},
                {"A. Have α-hydrogen atoms", "B. Have no α-hydrogen atoms", "C. Are aromatic", "D. Are aliphatic"},
                {"A. Two aldehydes", "B. Aldehyde and ketone", "C. Both A and B", "D. Two ketones"},
                {"A. Two amino acids", "B. Amino acid and fatty acid", "C. Fatty acid and glycerol", "D. Glucose and fructose"},
                {"A. The sequence of amino acids", "B. The folding of the polypeptide chain", "C. The 3D arrangement of the protein", "D. The arrangement of multiple subunits"},
                {"A. Invertase", "B. Zymase", "C. Diastase", "D. Maltase"},
                {"A. Soap and glycerol", "B. Soap and alcohol", "C. Glycerol and alcohol", "D. Fatty acid and glycerol"},
                {"A. Animal fats", "B. Vegetable oils", "C. Both A and B", "D. Petroleum"},
                {"A. Ammonia", "B. Urea", "C. Nitric acid", "D. Sulphuric acid"},
                {"A. Ammonia", "B. Urea", "C. Nitric acid", "D. Sulphuric acid"},
                {"A. Ammonia", "B. Urea", "C. Nitric acid", "D. Sulphuric acid"},
                {"A. The amount of oxygen dissolved in water", "B. The amount of oxygen consumed by microorganisms", "C. The amount of carbon dioxide in water", "D. The amount of nitrogen in water"}
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
                btn.setBounds(80 + (j * 280), (i * 60 + 130), 280, 30);
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