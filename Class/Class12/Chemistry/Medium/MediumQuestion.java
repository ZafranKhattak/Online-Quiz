package Class.Class12.Chemistry.Medium;

import Class.Class12.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The modern periodic table is based on:",
                "Question 2: Elements in the same group of the periodic table have:",
                "Question 3: The first ionization energy generally:",
                "Question 4: Which of the following is a property of transition metals?",
                "Question 5: The phenomenon in which a compound has the same molecular formula but different structures is called:",
                "Question 6: A homologous series is a group of organic compounds with:",
                "Question 7: Cracking of petroleum is a process of:",
                "Question 8: The octane number is a measure of:",
                "Question 9: The substitution reaction in benzene is called:",
                "Question 10: Wurtz synthesis is used to prepare:",
                "Question 11: The dehydration of ethanol produces:",
                "Question 12: The IUPAC name of CH₃CH₂OH is:",
                "Question 13: Formaldehyde is the simplest:",
                "Question 14: Acetone is the simplest:",
                "Question 15: Formic acid is the simplest:",
                "Question 16: The monomer of polythene is:",
                "Question 17: Urea is manufactured by the reaction of CO₂ with:",
                "Question 18: The chemical formula of cement is:",
                "Question 19: The depletion of ozone layer is caused by:",
                "Question 20: Eutrophication is caused by the excessive presence of:"
        };

        String options[][] = {
                {"A. Atomic mass", "B. Atomic number", "C. Valence electrons", "D. Chemical properties"},
                {"A. The same number of electron shells", "B. The same number of valence electrons", "C. The same atomic mass", "D. The same atomic number"},
                {"A. Decreases across a period", "B. Increases across a period", "C. Remains constant across a period", "D. Is irregular across a period"},
                {"A. Low melting point", "B. Coloured compounds", "C. Non-conductors of electricity", "D. Low density"},
                {"A. Tautomerism", "B. Isomerism", "C. Resonance", "D. Hybridization"},
                {"A. Different functional groups", "B. Same general formula", "C. Different chemical properties", "D. Different structures"},
                {"A. Breaking large hydrocarbons into smaller ones", "B. Combining smaller hydrocarbons", "C. Adding hydrogen to hydrocarbons", "D. Removing hydrogen from hydrocarbons"},
                {"A. The quality of petrol", "B. The quality of diesel", "C. The quality of lubricating oil", "D. The quality of kerosene"},
                {"A. Addition reaction", "B. Elimination reaction", "C. Electrophilic substitution", "D. Nucleophilic substitution"},
                {"A. Alcohols", "B. Alkanes", "C. Aldehydes", "D. Carboxylic acids"},
                {"A. Ethane", "B. Ethene", "C. Ethyne", "D. Ethyl ether"},
                {"A. Methanol", "B. Ethanol", "C. Propanol", "D. Butanol"},
                {"A. Ketone", "B. Aldehyde", "C. Alcohol", "D. Carboxylic acid"},
                {"A. Ketone", "B. Aldehyde", "C. Alcohol", "D. Carboxylic acid"},
                {"A. Ketone", "B. Aldehyde", "C. Alcohol", "D. Carboxylic acid"},
                {"A. Methane", "B. Ethane", "C. Ethene", "D. Ethyne"},
                {"A. Ammonia", "B. Hydrogen", "C. Nitrogen", "D. Water"},
                {"A. CaO", "B. Ca(OH)₂", "C. CaCO₃", "D. Complex silicate mixture"},
                {"A. Carbon dioxide", "B. Chlorofluorocarbons (CFCs)", "C. Methane", "D. Nitrogen oxides"},
                {"A. Heavy metals", "B. Nitrates and phosphates", "C. Hydrocarbons", "D. Pesticides"}
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
            new ChemistryDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}