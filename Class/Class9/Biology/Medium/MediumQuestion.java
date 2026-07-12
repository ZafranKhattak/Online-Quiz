package Class.Class9.Biology.Medium;

import Class.Class9.Biology.BiologyDashboard.BiologyDashboard;
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
                "Question 1: The branch of biology that deals with the study of the structure and function of cells is called:",
                "Question 2: The first step of the biological method is:",
                "Question 3: A tentative explanation for an observed phenomenon is called a:",
                "Question 4: The process by which living organisms take in oxygen and release carbon dioxide is called:",
                "Question 5: The taxonomic rank just below kingdom is:",
                "Question 6: Organisms that do not have a true nucleus are called:",
                "Question 7: The cell wall is present in which type of cell?",
                "Question 8: The process of identifying and naming organisms is called:",
                "Question 9: The structure that allows water and minerals to enter a plant root is the:",
                "Question 10: The tissue that transports water in plants is called:",
                "Question 11: The substance that gives red colour to blood is called:",
                "Question 12: The phase of cell cycle in which the cell grows and prepares for division is called:",
                "Question 13: The division of the nucleus is called:",
                "Question 14: The type of respiration that requires oxygen is called:",
                "Question 15: The loss of water vapour from plants through the stomata is called:",
                "Question 16: The fluid that fills the cell and contains all organelles is called:",
                "Question 17: Organisms that obtain their food from others are called:",
                "Question 18: The main source of energy for the body is:",
                "Question 19: The largest artery in the human body is the:",
                "Question 20: A group of similar cells that perform a specific function is called a:"
        };

        String options[][] = {
                {"A. Histology", "B. Anatomy", "C. Cell biology", "D. Physiology"},
                {"A. Hypothesis", "B. Observation", "C. Experiment", "D. Conclusion"},
                {"A. Theory", "B. Law", "C. Deduction", "D. Hypothesis"},
                {"A. Photosynthesis", "B. Transpiration", "C. Respiration", "D. Fermentation"},
                {"A. Class", "B. Order", "C. Family", "D. Phylum"},
                {"A. Eukaryotes", "B. Prokaryotes", "C. Autotrophs", "D. Heterotrophs"},
                {"A. Animal cell", "B. Plant cell", "C. Both", "D. Neither"},
                {"A. Ecology", "B. Taxonomy", "C. Genetics", "D. Evolution"},
                {"A. Leaf", "B. Root hair", "C. Stem", "D. Flower"},
                {"A. Phloem", "B. Xylem", "C. Epidermis", "D. Parenchyma"},
                {"A. Plasma", "B. Haemoglobin", "C. Platelet", "D. White blood cells"},
                {"A. Mitosis", "B. Meiosis", "C. Interphase", "D. Cytokinesis"},
                {"A. Cytokinesis", "B. Mitosis", "C. Meiosis", "D. Binary fission"},
                {"A. Anaerobic", "B. Aerobic", "C. Fermentation", "D. Glycolysis"},
                {"A. Respiration", "B. Transpiration", "C. Photosynthesis", "D. Osmosis"},
                {"A. Nucleoplasm", "B. Cytoplasm", "C. Cell sap", "D. Vacuole"},
                {"A. Autotrophs", "B. Heterotrophs", "C. Producers", "D. Decomposers"},
                {"A. Proteins", "B. Fats", "C. Carbohydrates", "D. Vitamins"},
                {"A. Pulmonary artery", "B. Carotid artery", "C. Aorta", "D. Renal artery"},
                {"A. Organ", "B. Organ system", "C. Tissue", "D. Organelle"}
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
            new BiologyDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}