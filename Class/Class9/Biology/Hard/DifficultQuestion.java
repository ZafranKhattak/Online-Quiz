package Class.Class9.Biology.Hard;

import Class.Class9.Biology.BiologyDashboard.BiologyDashboard;
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
                "Question 1: Which of the following is NOT a characteristic of enzymes?",
                "Question 2: The lock and key model is used to explain:",
                "Question 3: ATP stands for:",
                "Question 4: The fluid that fills the chloroplast is called:",
                "Question 5: In which part of the cell does glycolysis take place?",
                "Question 6: The energy currency of the cell is:",
                "Question 7: Which of the following is a limiting factor for photosynthesis?",
                "Question 8: The process by which food is absorbed into the blood is called:",
                "Question 9: The semi-permeable membrane in a cell is the:",
                "Question 10: The organelle responsible for intracellular digestion is the:",
                "Question 11: The process of programmed cell death is called:",
                "Question 12: The exchange of oxygen and carbon dioxide in the lungs takes place in the:",
                "Question 13: The formation of urea takes place in the:",
                "Question 14: The type of tissue that covers the surface of the body and lines internal organs is:",
                "Question 15: The primary function of white blood cells is:",
                "Question 16: The disorder caused by iron deficiency is:",
                "Question 17: Blood vessels that carry blood towards the heart are called:",
                "Question 18: The pH of the stomach is approximately:",
                "Question 19: The protein present in the blood that carries oxygen is:",
                "Question 20: Atherosclerosis is a disorder that affects the:"
        };

        String options[][] = {
                {"A. They are proteins", "B. They are consumed in the reaction", "C. They are specific", "D. They speed up reactions"},
                {"A. Cell division", "B. Enzyme action", "C. Photosynthesis", "D. Respiration"},
                {"A. Adenosine Triphosphate", "B. Amino Triphosphate", "C. Adenosine Triprotein", "D. Adenosine Diphosphate"},
                {"A. Stroma", "B. Thylakoid", "C. Matrix", "D. Granum"},
                {"A. Mitochondria", "B. Cytoplasm", "C. Nucleus", "D. Ribosome"},
                {"A. Glucose", "B. ATP", "C. NADH", "D. FADH₂"},
                {"A. Temperature", "B. Light intensity", "C. Carbon dioxide concentration", "D. All of the above"},
                {"A. Ingestion", "B. Assimilation", "C. Absorption", "D. Egestion"},
                {"A. Cell wall", "B. Cytoplasm", "C. Cell membrane", "D. Nucleus"},
                {"A. Ribosome", "B. Lysosome", "C. Golgi apparatus", "D. Endoplasmic reticulum"},
                {"A. Necrosis", "B. Apoptosis", "C. Cytokinesis", "D. Interphase"},
                {"A. Trachea", "B. Bronchi", "C. Alveoli", "D. Bronchioles"},
                {"A. Kidney", "B. Liver", "C. Heart", "D. Lungs"},
                {"A. Connective tissue", "B. Muscular tissue", "C. Epithelial tissue", "D. Nervous tissue"},
                {"A. Carrying oxygen", "B. Clotting blood", "C. Fighting infection", "D. Carrying nutrients"},
                {"A. Scurvy", "B. Rickets", "C. Anaemia", "D. Night blindness"},
                {"A. Arteries", "B. Veins", "C. Capillaries", "D. Venules"},
                {"A. 1-2", "B. 4-5", "C. 7-8", "D. 10-11"},
                {"A. Albumin", "B. Fibrinogen", "C. Haemoglobin", "D. Myoglobin"},
                {"A. Heart", "B. Lungs", "C. Liver", "D. Blood vessels"}
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
            new BiologyDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}
