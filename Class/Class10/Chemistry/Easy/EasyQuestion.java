package Class.Class10.Chemistry.Easy;

import Class.Class10.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The branch of science that deals with the study of carbon compounds is called:",
                "Question 2: A substance that releases hydrogen ions (H⁺) in water is called:",
                "Question 3: The pH of a neutral solution is:",
                "Question 4: The reaction between an acid and a base to form salt and water is called:",
                "Question 5: Compounds that contain only carbon and hydrogen are called:",
                "Question 6: The general formula of alkanes is:",
                "Question 7: The first member of the alkane family is:",
                "Question 8: The building blocks of proteins are:",
                "Question 9: The main source of energy for the body is:",
                "Question 10: The process in which a solid changes directly into gas is called:",
                "Question 11: A substance that has a pH less than 7 is called:",
                "Question 12: A substance that has a pH greater than 7 is called:",
                "Question 13: The chemical formula of water is:",
                "Question 14: The process of rusting requires:",
                "Question 15: Which of the following is a natural polymer?",
                "Question 16: The process in which a liquid changes into vapour at its boiling point is called:",
                "Question 17: A mixture of two or more metals is called:",
                "Question 18: The substance that speeds up a chemical reaction without being consumed is called:",
                "Question 19: The pH of pure water is:",
                "Question 20: Which of the following is an example of a non-metal?"
        };

        String options[][] = {
                {"A. Inorganic chemistry", "B. Organic chemistry", "C. Physical chemistry", "D. Analytical chemistry"},
                {"A. Base", "B. Salt", "C. Acid", "D. Alkali"},
                {"A. 0", "B. 7", "C. 14", "D. 10"},
                {"A. Neutralization reaction", "B. Decomposition reaction", "C. Combustion reaction", "D. Displacement reaction"},
                {"A. Carbohydrates", "B. Hydrocarbons", "C. Proteins", "D. Lipids"},
                {"A. CₙH₂ₙ", "B. CₙH₂ₙ₊₂", "C. CₙH₂ₙ₋₂", "D. CₙH₂ₙ₊₆"},
                {"A. Ethane", "B. Propane", "C. Methane", "D. Butane"},
                {"A. Fatty acids", "B. Amino acids", "C. Monosaccharides", "D. Nucleotides"},
                {"A. Proteins", "B. Fats", "C. Carbohydrates", "D. Vitamins"},
                {"A. Sublimation", "B. Evaporation", "C. Condensation", "D. Melting"},
                {"A. Acidic", "B. Basic", "C. Neutral", "D. Salt"},
                {"A. Acidic", "B. Basic", "C. Neutral", "D. Salt"},
                {"A. H₂O", "B. H₂O₂", "C. H₃O", "D. OH"},
                {"A. Only oxygen", "B. Only water", "C. Both oxygen and water", "D. Neither oxygen nor water"},
                {"A. Plastic", "B. Nylon", "C. Cotton", "D. Polythene"},
                {"A. Evaporation", "B. Boiling", "C. Condensation", "D. Freezing"},
                {"A. Alloy", "B. Compound", "C. Solution", "D. Suspension"},
                {"A. Reactant", "B. Product", "C. Catalyst", "D. Inhibitor"},
                {"A. 5", "B. 6", "C. 7", "D. 8"},
                {"A. Iron", "B. Copper", "C. Sulphur", "D. Sodium"}
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