package Class.Class12.Chemistry.Easy;

import Class.Class12.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The number of elements in the fourth period of the periodic table is:",
                "Question 2: The s-block elements include:",
                "Question 3: The elements of group IA are known as:",
                "Question 4: Which of the following is an alkaline earth metal?",
                "Question 5: The elements of group VIIA are known as:",
                "Question 6: Transition elements are also called:",
                "Question 7: The study of carbon compounds is called:",
                "Question 8: The general formula of alkanes is:",
                "Question 9: The first member of the alkane family is:",
                "Question 10: A functional group containing -OH is found in:",
                "Question 11: Benzene is an example of:",
                "Question 12: Alkyl halides contain which halogen atom attached to carbon?",
                "Question 13: Aldehydes contain the functional group:",
                "Question 14: Ketones contain the functional group:",
                "Question 15: Carboxylic acids contain the functional group:",
                "Question 16: The pH of a neutral solution is:",
                "Question 17: SO₂ is a major cause of:",
                "Question 18: Greenhouse gases include:",
                "Question 19: The chemical formula of washing soda is:",
                "Question 20: The chemical formula of baking soda is:"
        };

        String options[][] = {
                {"A. 8", "B. 18", "C. 32", "D. 24"},
                {"A. Metals only", "B. Non-metals only", "C. Metalloids", "D. Both metals and non-metals"},
                {"A. Alkaline earth metals", "B. Halogens", "C. Alkali metals", "D. Noble gases"},
                {"A. Sodium", "B. Magnesium", "C. Chlorine", "D. Carbon"},
                {"A. Alkali metals", "B. Alkaline earth metals", "C. Halogens", "D. Noble gases"},
                {"A. p-block elements", "B. s-block elements", "C. d-block elements", "D. f-block elements"},
                {"A. Inorganic chemistry", "B. Physical chemistry", "C. Organic chemistry", "D. Analytical chemistry"},
                {"A. CₙH₂ₙ", "B. CₙH₂ₙ₊₂", "C. CₙH₂ₙ₋₂", "D. CₙH₂ₙ₊₆"},
                {"A. Ethane", "B. Propane", "C. Methane", "D. Butane"},
                {"A. Aldehydes", "B. Ketones", "C. Alcohols", "D. Carboxylic acids"},
                {"A. Aliphatic hydrocarbon", "B. Aromatic hydrocarbon", "C. Saturated hydrocarbon", "D. Alkane"},
                {"A. Oxygen", "B. Nitrogen", "C. Halogen", "D. Hydrogen"},
                {"A. -OH", "B. -CHO", "C. -COOH", "D. -CO-"},
                {"A. -OH", "B. -CHO", "C. -COOH", "D. -CO-"},
                {"A. -OH", "B. -CHO", "C. -COOH", "D. -CO-"},
                {"A. 0", "B. 7", "C. 14", "D. 10"},
                {"A. Acid rain", "B. Global warming", "C. Ozone depletion", "D. Eutrophication"},
                {"A. Oxygen", "B. Nitrogen", "C. Carbon dioxide", "D. Hydrogen"},
                {"A. Na₂CO₃", "B. NaHCO₃", "C. NaOH", "D. NaCl"},
                {"A. Na₂CO₃", "B. NaHCO₃", "C. NaOH", "D. NaCl"}
        };

        int correctAnswers[] = {
                1,  // Q1: 18
                0,  // Q2: Metals only
                2,  // Q3: Alkali metals
                1,  // Q4: Magnesium
                2,  // Q5: Halogens
                2,  // Q6: d-block elements
                2,  // Q7: Organic chemistry
                1,  // Q8: CₙH₂ₙ₊₂
                2,  // Q9: Methane
                2,  // Q10: Alcohols
                1,  // Q11: Aromatic hydrocarbon
                2,  // Q12: Halogen
                1,  // Q13: -CHO
                3,  // Q14: -CO-
                2,  // Q15: -COOH
                1,  // Q16: 7
                0,  // Q17: Acid rain
                2,  // Q18: Carbon dioxide
                0,  // Q19: Na₂CO₃
                1   // Q20: NaHCO₃
        };

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