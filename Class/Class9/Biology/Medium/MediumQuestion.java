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

        int correctAnswers[] = {
                2,  // Q1: Cell biology
                1,  // Q2: Observation
                3,  // Q3: Hypothesis
                2,  // Q4: Respiration
                0,  // Q5: Class
                1,  // Q6: Prokaryotes
                1,  // Q7: Plant cell
                1,  // Q8: Taxonomy
                1,  // Q9: Root hair
                1,  // Q10: Xylem
                1,  // Q11: Haemoglobin
                2,  // Q12: Interphase
                1,  // Q13: Mitosis
                1,  // Q14: Aerobic
                1,  // Q15: Transpiration
                1,  // Q16: Cytoplasm
                1,  // Q17: Heterotrophs
                2,  // Q18: Carbohydrates
                2,  // Q19: Aorta
                2   // Q20: Tissue
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                btn.setActionCommand(String.valueOf(j));
                group.add(btn);
                panel.add(btn);
                radioButtons[i][j] = btn;
            }
        }

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(80, 1280, 500, 30);
        resultLabel.setForeground(Color.YELLOW);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(resultLabel);

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            int score = 0;
            int totalQuestions = questions.length;
            
            // Check each question
            for (int i = 0; i < totalQuestions; i++) {
                for (int j = 0; j < 4; j++) {
                    if (radioButtons[i][j].isSelected() && j == correctAnswers[i]) {
                        score++;
                        break;
                    }
                }
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to submit?", 
                "Confirm Submission", 
                JOptionPane.YES_NO_OPTION);
                
            if (confirm == JOptionPane.YES_OPTION) {
                double percentage = (double) score / totalQuestions * 100;
                String grade;
                if (percentage >= 80) {
                    grade = "Excellent!";
                } else if (percentage >= 60) {
                    grade = "Good!";
                } else if (percentage >= 40) {
                    grade = "Fair";
                } else {
                    grade = "Needs Improvement";
                }
                
                String message = String.format(
                    "<html><body style='text-align: center;'>" +
                    "<h2>Quiz Results</h2>" +
                    "<p>Total Questions: %d</p>" +
                    "<p>Correct Answers: %d</p>" +
                    "<p>Wrong Answers: %d</p>" +
                    "<p>Percentage: %.1f%%</p>" +
                    "<p>Grade: %s</p>" +
                    "</body></html>",
                    totalQuestions, score, totalQuestions - score, percentage, grade
                );
                
                JOptionPane.showMessageDialog(null, message, "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
                resultLabel.setText(String.format("Score: %d/%d (%.1f%%)", score, totalQuestions, percentage));
            }
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