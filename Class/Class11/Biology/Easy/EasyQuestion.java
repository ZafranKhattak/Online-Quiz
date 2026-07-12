package Class.Class11.Biology.Easy;

import Class.Class11.Biology.BiologyDashboard.BiologyDashboard;
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
                "Question 1: The basic unit of life is called the:",
                "Question 2: The process by which plants make their own food using sunlight is called:",
                "Question 3: The green pigment found in plants that absorbs sunlight is called:",
                "Question 4: The building blocks of proteins are:",
                "Question 5: The organ that pumps blood throughout the body is the:",
                "Question 6: The male reproductive organ of a flower is called the:",
                "Question 7: Animals that eat only plants are called:",
                "Question 8: The gas released by plants during photosynthesis is:",
                "Question 9: The process by which living organisms produce offspring of their own kind is called:",
                "Question 10: The largest organ of the human body is the:",
                "Question 11: A living thing that is made of only one cell is called:",
                "Question 12: The part of the digestive system where most absorption of food takes place is the:",
                "Question 13: The small pores on the underside of leaves through which gases are exchanged are called:",
                "Question 14: The main source of energy for the body is:",
                "Question 15: The type of blood vessels that carry blood away from the heart are called:",
                "Question 16: A group of similar cells that perform a specific function is called a:",
                "Question 17: The largest artery in the human body is the:",
                "Question 18: The organism that causes malaria is a:",
                "Question 19: The skeleton of humans is made up of:",
                "Question 20: The gas essential for respiration in humans is:"
        };

        String options[][] = {
                {"A. Organ", "B. Tissue", "C. Cell", "D. System"},
                {"A. Respiration", "B. Transpiration", "C. Photosynthesis", "D. Germination"},
                {"A. Carotene", "B. Chlorophyll", "C. Xanthophyll", "D. Phycocyanin"},
                {"A. Fatty acids", "B. Amino acids", "C. Sugars", "D. Nucleotides"},
                {"A. Brain", "B. Liver", "C. Heart", "D. Kidney"},
                {"A. Pistil", "B. Stamen", "C. Sepal", "D. Petal"},
                {"A. Carnivores", "B. Omnivores", "C. Herbivores", "D. Decomposers"},
                {"A. Carbon dioxide", "B. Nitrogen", "C. Oxygen", "D. Hydrogen"},
                {"A. Respiration", "B. Reproduction", "C. Excretion", "D. Nutrition"},
                {"A. Liver", "B. Skin", "C. Brain", "D. Heart"},
                {"A. Multicellular", "B. Unicellular", "C. Complex", "D. Simple"},
                {"A. Stomach", "B. Oesophagus", "C. Small intestine", "D. Large intestine"},
                {"A. Stomata", "B. Xylem", "C. Phloem", "D. Chlorophyll"},
                {"A. Proteins", "B. Fats", "C. Carbohydrates", "D. Vitamins"},
                {"A. Veins", "B. Capillaries", "C. Arteries", "D. Nerves"},
                {"A. Organ", "B. Organ system", "C. Tissue", "D. Organelle"},
                {"A. Pulmonary artery", "B. Carotid artery", "C. Aorta", "D. Renal artery"},
                {"A. Virus", "B. Fungus", "C. Bacterium", "D. Protozoan"},
                {"A. Cartilage", "B. Bones", "C. Muscles", "D. Fats"},
                {"A. Carbon dioxide", "B. Nitrogen", "C. Oxygen", "D. Hydrogen"}
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
            new BiologyDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}