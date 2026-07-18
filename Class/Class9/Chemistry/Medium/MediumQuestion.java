package Class.Class9.Chemistry.Medium;

import Class.Class9.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The study of the relationship between the composition and physical properties of matter is called:",
                "Question 2: The branch of chemistry that deals with the manufacturing of chemical compounds on a commercial scale is called:",
                "Question 3: The number of electrons in the outermost shell of an atom determines its:",
                "Question 4: A chemical species that has a positive or negative charge is called:",
                "Question 5: Avogadro's number is equal to:",
                "Question 6: The amount of substance that contains as many particles as there are atoms in exactly 12 grams of carbon-12 is called:",
                "Question 7: Atoms of the same element having the same atomic number but different mass numbers are called:",
                "Question 8: The valency of an element is:",
                "Question 9: A bond formed by the mutual sharing of electrons between atoms is called:",
                "Question 10: The ability of an atom to attract electrons towards itself in a chemical bond is called:",
                "Question 11: A substance that contains two or more elements physically mixed together is called:",
                "Question 12: The law that states that matter can neither be created nor destroyed is called the:",
                "Question 13: The number of protons and neutrons in the nucleus of an atom is called the:",
                "Question 14: The branch of chemistry that deals with the study of components of the environment and the effects of human activities is called:",
                "Question 15: A substance that dissolves in a solvent to form a solution is called:",
                "Question 16: The mass of one mole of a substance in grams is called its:",
                "Question 17: The particles that are neutral in charge inside an atom are called:",
                "Question 18: A covalent bond in which electrons are shared equally between atoms is called:",
                "Question 19: The amount of solute dissolved in a given amount of solvent is called:",
                "Question 20: The process of separating a solid from a liquid by passing through a filter paper is called:"
        };

        String options[][] = {
                {"A. Organic chemistry", "B. Physical chemistry", "C. Inorganic chemistry", "D. Analytical chemistry"},
                {"A. Organic chemistry", "B. Nuclear chemistry", "C. Industrial chemistry", "D. Biochemistry"},
                {"A. Atomic number", "B. Mass number", "C. Valency", "D. Isotope number"},
                {"A. Atom", "B. Molecule", "C. Ion", "D. Radical"},
                {"A. 6.02 × 10²²", "B. 6.02 × 10²³", "C. 6.02 × 10²⁴", "D. 6.02 × 10²⁵"},
                {"A. Gram", "B. Mole", "C. Kilogram", "D. Atomic mass unit"},
                {"A. Ions", "B. Isotopes", "C. Molecules", "D. Isomers"},
                {"A. Its atomic number", "B. Its mass number", "C. The number of electrons it needs to gain or lose to complete its octet", "D. The number of protons in its nucleus"},
                {"A. Ionic bond", "B. Covalent bond", "C. Metallic bond", "D. Hydrogen bond"},
                {"A. Ionization energy", "B. Electron affinity", "C. Electronegativity", "D. Atomic radius"},
                {"A. Compound", "B. Mixture", "C. Element", "D. Solution"},
                {"A. Law of definite proportions", "B. Law of conservation of mass", "C. Law of multiple proportions", "D. Law of constant composition"},
                {"A. Atomic number", "B. Mass number", "C. Valency", "D. Atomic mass"},
                {"A. Analytical chemistry", "B. Environmental chemistry", "C. Industrial chemistry", "D. Nuclear chemistry"},
                {"A. Solvent", "B. Solute", "C. Mixture", "D. Colloid"},
                {"A. Atomic mass", "B. Molecular mass", "C. Gram formula mass", "D. Molar mass"},
                {"A. Protons", "B. Electrons", "C. Neutrons", "D. Positrons"},
                {"A. Polar covalent bond", "B. Non-polar covalent bond", "C. Ionic bond", "D. Coordinate covalent bond"},
                {"A. Dilution", "B. Concentration", "C. Saturation", "D. Supersaturation"},
                {"A. Filtration", "B. Distillation", "C. Crystallization", "D. Sublimation"}
        };

        int correctAnswers[] = {
                1,  // Q1: Physical chemistry
                2,  // Q2: Industrial chemistry
                2,  // Q3: Valency
                2,  // Q4: Ion
                1,  // Q5: 6.02 × 10²³
                1,  // Q6: Mole
                1,  // Q7: Isotopes
                2,  // Q8: The number of electrons it needs to gain or lose to complete its octet
                1,  // Q9: Covalent bond
                2,  // Q10: Electronegativity
                1,  // Q11: Mixture
                1,  // Q12: Law of conservation of mass
                1,  // Q13: Mass number
                1,  // Q14: Environmental chemistry
                1,  // Q15: Solute
                3,  // Q16: Molar mass
                2,  // Q17: Neutrons
                1,  // Q18: Non-polar covalent bond
                1,  // Q19: Concentration
                0   // Q20: Filtration
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