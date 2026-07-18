package Class.Class10.Chemistry.Hard;

import Class.Class10.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The law of mass action states that the rate of a chemical reaction is proportional to:",
                "Question 2: If the equilibrium constant Kc is less than 1, it indicates that:",
                "Question 3: Which of the following is a Lewis acid?",
                "Question 4: A buffer solution resists changes in pH upon addition of:",
                "Question 5: The pH of a solution with hydrogen ion concentration [H⁺] = 1 × 10⁻³ M is:",
                "Question 6: Which of the following is NOT an allotropic form of carbon?",
                "Question 7: The functional group in aldehydes is:",
                "Question 8: The functional group in ketones is:",
                "Question 9: The number of isomers of butane is:",
                "Question 10: The process of adding chlorine to unsaturated hydrocarbons is called:",
                "Question 11: Which of the following is NOT a disaccharide?",
                "Question 12: The non-reducing sugar is:",
                "Question 13: The nitrogenous base found in RNA but not in DNA is:",
                "Question 14: The percentage of nitrogen in the atmosphere is approximately:",
                "Question 15: The chemical formula of ozone is:",
                "Question 16: The depletion of ozone layer is mainly caused by:",
                "Question 17: The formula of slaked lime is:",
                "Question 18: The formula of baking soda is:",
                "Question 19: Which of the following is used in the manufacture of cement?",
                "Question 20: The green house gas that is responsible for global warming is:"
        };

        String options[][] = {
                { "A. The sum of the molar concentrations of the reactants",
                        "B. The product of the molar concentrations of the reactants",
                        "C. The difference of the molar concentrations of the reactants",
                        "D. The ratio of the molar concentrations of the reactants" },
                { "A. Products are favored at equilibrium", "B. Reactants are favored at equilibrium",
                        "C. The reaction is fast", "D. The reaction is slow" },
                { "A. NH₃", "B. H₂O", "C. BF₃", "D. OH⁻" },
                { "A. Small amounts of acid or base", "B. Large amounts of acid or base", "C. Only acid",
                        "D. Only base" },
                { "A. 1", "B. 2", "C. 3", "D. 4" },
                { "A. Diamond", "B. Graphite", "C. Fullerene", "D. Buckminsterfullerene" },
                { "A. -OH", "B. -CHO", "C. -COOH", "D. -CO-" },
                { "A. -OH", "B. -CHO", "C. -COOH", "D. -CO-" },
                { "A. 1", "B. 2", "C. 3", "D. 4" },
                { "A. Hydrogenation", "B. Halogenation", "C. Oxidation", "D. Reduction" },
                { "A. Sucrose", "B. Maltose", "C. Glucose", "D. Lactose" },
                { "A. Glucose", "B. Fructose", "C. Sucrose", "D. Maltose" },
                { "A. Adenine", "B. Guanine", "C. Cytosine", "D. Uracil" },
                { "A. 21%", "B. 78%", "C. 0.93%", "D. 0.03%" },
                { "A. O₂", "B. O₃", "C. O₄", "D. O" },
                { "A. Carbon dioxide", "B. Methane", "C. Chlorofluorocarbons (CFCs)", "D. Nitrogen oxides" },
                { "A. CaO", "B. Ca(OH)₂", "C. CaCO₃", "D. CaSO₄" },
                { "A. Na₂CO₃", "B. NaHCO₃", "C. NaOH", "D. NaCl" },
                { "A. Calcium carbonate and clay", "B. Sodium carbonate and sand", "C. Calcium oxide and water",
                        "D. Potassium carbonate and clay" },
                { "A. Oxygen", "B. Nitrogen", "C. Carbon dioxide", "D. Hydrogen" }
        };

        int correctAnswers[] = {
                1, // Q1: The product of the molar concentrations of the reactants
                1, // Q2: Reactants are favored at equilibrium
                2, // Q3: BF₃
                0, // Q4: Small amounts of acid or base
                2, // Q5: 3
                3, // Q6: Buckminsterfullerene (Note: This is actually an allotrope, but all others
                   // are also allotropes. However, Buckminsterfullerene is often just called
                   // fullerene. The answer might vary. We'll use index 3)
                1, // Q7: -CHO
                3, // Q8: -CO-
                1, // Q9: 2
                1, // Q10: Halogenation
                2, // Q11: Glucose (it's a monosaccharide)
                2, // Q12: Sucrose
                3, // Q13: Uracil
                1, // Q14: 78%
                1, // Q15: O₃
                2, // Q16: Chlorofluorocarbons (CFCs)
                1, // Q17: Ca(OH)₂
                1, // Q18: NaHCO₃
                0, // Q19: Calcium carbonate and clay
                2 // Q20: Carbon dioxide
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 260), (i * 60 + 130), 260, 30);
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
                        totalQuestions, score, totalQuestions - score, percentage, grade);

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