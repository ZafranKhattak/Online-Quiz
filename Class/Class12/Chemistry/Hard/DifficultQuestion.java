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

        int correctAnswers[] = {
                0,  // Q1: Poor shielding effect of f-orbitals
                1,  // Q2: [Ar]3d⁵4s¹
                1,  // Q3: 4
                1,  // Q4: Alkenes
                1,  // Q5: C=O and α-H
                1,  // Q6: HX to alkenes
                0,  // Q7: Peroxide
                2,  // Q8: Both A and B
                1,  // Q9: Magnesium in dry ether
                1,  // Q10: Have no α-hydrogen atoms
                2,  // Q11: Both A and B
                0,  // Q12: Two amino acids
                0,  // Q13: The sequence of amino acids
                1,  // Q14: Zymase
                0,  // Q15: Soap and glycerol
                2,  // Q16: Both A and B
                0,  // Q17: Ammonia
                3,  // Q18: Sulphuric acid
                2,  // Q19: Nitric acid
                1   // Q20: The amount of oxygen consumed by microorganisms
        };

        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 280), (i * 60 + 130), 280, 30);
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
                if (percentage >= 80) grade = "Excellent!";
                else if (percentage >= 60) grade = "Good!";
                else if (percentage >= 40) grade = "Fair";
                else grade = "Needs Improvement";
                
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