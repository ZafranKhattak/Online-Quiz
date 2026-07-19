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

        int correctAnswers[] = {
                2,  // Q1: Cell
                2,  // Q2: Photosynthesis
                1,  // Q3: Chlorophyll
                1,  // Q4: Amino acids
                2,  // Q5: Heart
                1,  // Q6: Stamen
                2,  // Q7: Herbivores
                2,  // Q8: Oxygen
                1,  // Q9: Reproduction
                1,  // Q10: Skin
                1,  // Q11: Unicellular
                2,  // Q12: Small intestine
                0,  // Q13: Stomata
                2,  // Q14: Carbohydrates
                2,  // Q15: Arteries
                2,  // Q16: Tissue
                2,  // Q17: Aorta
                3,  // Q18: Protozoan
                1,  // Q19: Bones
                2   // Q20: Oxygen
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
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