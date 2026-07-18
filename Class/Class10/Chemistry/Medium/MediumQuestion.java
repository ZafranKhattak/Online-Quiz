package Class.Class10.Chemistry.Medium;

import Class.Class10.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: A reaction in which the products can recombine to form the reactants is called:",
                "Question 2: The state in which the forward and reverse reactions proceed at the same rate is called:",
                "Question 3: According to Le Chatelier's principle, if pressure is increased on a gaseous system at equilibrium, the system will shift:",
                "Question 4: The pH scale ranges from:",
                "Question 5: The reaction in which a substance burns in oxygen to produce heat and light is called:",
                "Question 6: Alkenes are hydrocarbons that contain:",
                "Question 7: The general formula of alkenes is:",
                "Question 8: The process by which large molecules are broken down into smaller ones in the body is called:",
                "Question 9: Enzymes are:",
                "Question 10: Acid rain is caused by:",
                "Question 11: The removal of hydrogen from a compound is called:",
                "Question 12: The addition of hydrogen to a compound is called:",
                "Question 13: Electrolysis of water produces:",
                "Question 14: The process of coating iron with zinc to prevent rusting is called:",
                "Question 15: The type of salt formed when a strong acid reacts with a weak base is called:",
                "Question 16: The type of salt formed when a weak acid reacts with a strong base is called:",
                "Question 17: The process of breaking down of glucose in the absence of oxygen is called:",
                "Question 18: The compounds containing -OH functional group are called:",
                "Question 19: The compounds containing -COOH functional group are called:",
                "Question 20: The bond formed by the sharing of electrons between atoms is called:"
        };

        String options[][] = {
                {"A. Irreversible reaction", "B. Reversible reaction", "C. Displacement reaction", "D. Combination reaction"},
                {"A. Chemical equilibrium", "B. Chemical reaction", "C. Dynamic state", "D. Steady state"},
                {"A. To the side with fewer gas molecules", "B. To the side with more gas molecules", "C. In the forward direction only", "D. In the reverse direction only"},
                {"A. 0 to 7", "B. 7 to 14", "C. 0 to 14", "D. 1 to 10"},
                {"A. Neutralization", "B. Combustion", "C. Decomposition", "D. Oxidation"},
                {"A. Only single bonds", "B. One or more double bonds", "C. One or more triple bonds", "D. Both double and triple bonds"},
                {"A. CₙH₂ₙ₊₂", "B. CₙH₂ₙ", "C. CₙH₂ₙ₋₂", "D. CₙH₂ₙ₊₆"},
                {"A. Anabolism", "B. Catabolism", "C. Metabolism", "D. Digestion"},
                {"A. Biological catalysts", "B. Inorganic compounds", "C. Simple sugars", "D. Fats"},
                {"A. Carbon dioxide and water", "B. Sulphur dioxide and nitrogen oxides", "C. Oxygen and nitrogen", "D. Hydrogen and water"},
                {"A. Reduction", "B. Oxidation", "C. Hydrogenation", "D. Dehydrogenation"},
                {"A. Reduction", "B. Oxidation", "C. Hydrogenation", "D. Dehydrogenation"},
                {"A. Oxygen only", "B. Hydrogen only", "C. Hydrogen and oxygen", "D. Water and oxygen"},
                {"A. Galvanization", "B. Alloying", "C. Electroplating", "D. Anodizing"},
                {"A. Acidic salt", "B. Basic salt", "C. Neutral salt", "D. Complex salt"},
                {"A. Acidic salt", "B. Basic salt", "C. Neutral salt", "D. Complex salt"},
                {"A. Aerobic respiration", "B. Anaerobic respiration", "C. Photosynthesis", "D. Fermentation"},
                {"A. Carboxylic acids", "B. Alcohols", "C. Aldehydes", "D. Ketones"},
                {"A. Carboxylic acids", "B. Alcohols", "C. Aldehydes", "D. Ketones"},
                {"A. Ionic bond", "B. Covalent bond", "C. Metallic bond", "D. Hydrogen bond"}
        };

        int correctAnswers[] = {
                1,  // Q1: Reversible reaction
                0,  // Q2: Chemical equilibrium
                0,  // Q3: To the side with fewer gas molecules
                2,  // Q4: 0 to 14
                1,  // Q5: Combustion
                1,  // Q6: One or more double bonds
                1,  // Q7: CₙH₂ₙ
                1,  // Q8: Catabolism
                0,  // Q9: Biological catalysts
                1,  // Q10: Sulphur dioxide and nitrogen oxides
                1,  // Q11: Oxidation (Note: Removal of hydrogen is oxidation)
                2,  // Q12: Hydrogenation (Note: Addition of hydrogen is hydrogenation)
                2,  // Q13: Hydrogen and oxygen
                0,  // Q14: Galvanization
                0,  // Q15: Acidic salt
                1,  // Q16: Basic salt
                1,  // Q17: Anaerobic respiration
                1,  // Q18: Alcohols
                0,  // Q19: Carboxylic acids
                1   // Q20: Covalent bond
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
            new ChemistryDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}