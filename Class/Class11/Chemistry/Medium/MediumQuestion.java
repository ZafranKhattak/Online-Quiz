package Class.Class11.Chemistry.Medium;

import Class.Class11.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The classification of elements by Döbereiner was based on the:",
                "Question 2: Newlands' law of octaves stated that the properties of every eighth element were similar when arranged by:",
                "Question 3: Moseley resolved the flaws in Mendeleev's periodic table by arranging elements according to their:",
                "Question 4: Elements in the same group of the periodic table have:",
                "Question 5: The s-block elements in the periodic table are:",
                "Question 6: The p-block elements consist of:",
                "Question 7: The elements of group IA are known as:",
                "Question 8: The elements of group VIIA are known as:",
                "Question 9: Which of the following statements about ionization energy is correct?",
                "Question 10: Electronegativity is defined as the ability of an atom to:",
                "Question 11: The quantum number that describes the shape of an orbital is the:",
                "Question 12: The maximum number of electrons that can occupy the s orbital is:",
                "Question 13: The law of conservation of mass states that:",
                "Question 14: The formula that shows the simplest whole number ratio of atoms in a compound is called:",
                "Question 15: Which of the following is a characteristic of ionic compounds?",
                "Question 16: The VSEPR theory states that the shape of a molecule is determined by:",
                "Question 17: The molecule with sp³ hybridization has a shape that is:",
                "Question 18: The statement \"at constant temperature, the rate of a chemical reaction is directly proportional to the active masses of the reactants\" is known as the:",
                "Question 19: The system that has the same composition throughout is called a:",
                "Question 20: The first law of thermodynamics states that:"
        };

        String options[][] = {
                {"A. Atomic number", "B. Atomic mass", "C. Valency", "D. Chemical properties"},
                {"A. Atomic number", "B. Increasing atomic mass", "C. Valence electrons", "D. Chemical reactivity"},
                {"A. Atomic mass", "B. Atomic number", "C. Valence electrons", "D. Chemical properties"},
                {"A. The same number of electron shells", "B. The same number of valence electrons", "C. The same atomic mass", "D. The same atomic number"},
                {"A. Metals", "B. Non-metals", "C. Metalloids", "D. Noble gases"},
                {"A. Only metals", "B. Only non-metals", "C. Metals, non-metals and metalloids", "D. Only noble gases"},
                {"A. Alkaline earth metals", "B. Halogens", "C. Alkali metals", "D. Noble gases"},
                {"A. Alkali metals", "B. Alkaline earth metals", "C. Halogens", "D. Noble gases"},
                {"A. It increases down a group", "B. It decreases across a period", "C. It generally increases across a period", "D. It remains constant across a period"},
                {"A. Lose electrons", "B. Gain electrons", "C. Attract shared electrons", "D. Form a bond"},
                {"A. Principal quantum number", "B. Azimuthal quantum number", "C. Magnetic quantum number", "D. Spin quantum number"},
                {"A. 2", "B. 4", "C. 6", "D. 8"},
                {"A. Matter can be created", "B. Matter can be destroyed", "C. Matter can neither be created nor destroyed", "D. Matter changes form"},
                {"A. Molecular formula", "B. Structural formula", "C. Empirical formula", "D. Condensed formula"},
                {"A. Low melting point", "B. Conduct electricity in molten state", "C. Soluble in organic solvents", "D. Formed by sharing of electrons"},
                {"A. The number of atoms", "B. The repulsion between electron pairs", "C. The electronegativity of atoms", "D. The size of atoms"},
                {"A. Linear", "B. Trigonal planar", "C. Tetrahedral", "D. Octahedral"},
                {"A. Law of mass action", "B. Law of conservation of mass", "C. Law of definite proportions", "D. Law of multiple proportions"},
                {"A. Heterogeneous system", "B. Homogeneous system", "C. Colloidal system", "D. Suspension"},
                {"A. Energy can be created", "B. Energy can be destroyed", "C. Energy can neither be created nor destroyed", "D. Energy is constant"}
        };

        int correctAnswers[] = {
                1,  // Q1: Atomic mass
                1,  // Q2: Increasing atomic mass
                1,  // Q3: Atomic number
                1,  // Q4: The same number of valence electrons
                0,  // Q5: Metals
                2,  // Q6: Metals, non-metals and metalloids
                2,  // Q7: Alkali metals
                2,  // Q8: Halogens
                2,  // Q9: It generally increases across a period
                2,  // Q10: Attract shared electrons
                1,  // Q11: Azimuthal quantum number
                0,  // Q12: 2
                2,  // Q13: Matter can neither be created nor destroyed
                2,  // Q14: Empirical formula
                1,  // Q15: Conduct electricity in molten state
                1,  // Q16: The repulsion between electron pairs
                2,  // Q17: Tetrahedral
                0,  // Q18: Law of mass action
                1,  // Q19: Homogeneous system
                2   // Q20: Energy can neither be created nor destroyed
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
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