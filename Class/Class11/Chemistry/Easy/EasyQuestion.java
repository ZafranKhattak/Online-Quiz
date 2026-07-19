package Class.Class11.Chemistry.Easy;

import Class.Class11.Chemistry.ChemistryDashboard.ChemistryDashboard;
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
                "Question 1: The number of elements arranged in the modern periodic table is:",
                "Question 2: How many horizontal rows called periods are there in the modern periodic table?",
                "Question 3: How many vertical columns called groups are there in the modern periodic table?",
                "Question 4: The law that states that properties of elements are periodic functions of their atomic numbers is called the:",
                "Question 5: Which scientist is considered the father of the periodic table?",
                "Question 6: The group of three elements with similar properties was called a:",
                "Question 7: Which of the following is a metalloid?",
                "Question 8: The positively charged subatomic particle present in the nucleus of an atom is called:",
                "Question 9: The smallest particle of an element that retains its properties is called:",
                "Question 10: The number of protons in the nucleus of an atom is called its:",
                "Question 11: The bond formed by the transfer of electrons from one atom to another is called:",
                "Question 12: The bond formed by the mutual sharing of electrons between atoms is called:",
                "Question 13: The amount of substance that contains 6.02 × 10²³ particles is called:",
                "Question 14: The Avogadro's number is approximately equal to:",
                "Question 15: The general formula of alkanes is:",
                "Question 16: The first member of the alkane family is:",
                "Question 17: A solution that contains the maximum amount of solute at a given temperature is called:",
                "Question 18: The pH of a neutral solution is:",
                "Question 19: Substances that have a pH value greater than 7 are called:",
                "Question 20: The process in which a liquid changes into vapour at its boiling point is called:"
        };

        String options[][] = {
                {"A. 108", "B. 112", "C. 116", "D. 118"},
                {"A. 5", "B. 6", "C. 7", "D. 8"},
                {"A. 12", "B. 14", "C. 16", "D. 18"},
                {"A. Döbereiner's law", "B. Mendeleev's law", "C. Modern periodic law", "D. Newlands' law of octaves"},
                {"A. Döbereiner", "B. Newlands", "C. Mendeleev", "D. Moseley"},
                {"A. Period", "B. Octave", "C. Triad", "D. Family"},
                {"A. Sodium", "B. Silicon", "C. Chlorine", "D. Iron"},
                {"A. Electron", "B. Proton", "C. Neutron", "D. Positron"},
                {"A. Molecule", "B. Atom", "C. Ion", "D. Compound"},
                {"A. Mass number", "B. Atomic number", "C. Atomic mass", "D. Valency"},
                {"A. Covalent bond", "B. Ionic bond", "C. Metallic bond", "D. Hydrogen bond"},
                {"A. Ionic bond", "B. Covalent bond", "C. Metallic bond", "D. Coordinate bond"},
                {"A. Gram", "B. Mole", "C. Kilogram", "D. Atomic mass unit"},
                {"A. 6.02 × 10²²", "B. 6.02 × 10²³", "C. 6.02 × 10²⁴", "D. 6.02 × 10²⁵"},
                {"A. CₙH₂ₙ", "B. CₙH₂ₙ₊₂", "C. CₙH₂ₙ₋₂", "D. CₙH₂ₙ₊₆"},
                {"A. Ethane", "B. Propane", "C. Methane", "D. Butane"},
                {"A. Dilute solution", "B. Concentrated solution", "C. Saturated solution", "D. Unsaturated solution"},
                {"A. 0", "B. 7", "C. 14", "D. 10"},
                {"A. Acids", "B. Bases", "C. Salts", "D. Neutral"},
                {"A. Evaporation", "B. Boiling", "C. Condensation", "D. Freezing"}
        };

        int correctAnswers[] = {
                3,  // Q1: 118
                2,  // Q2: 7
                3,  // Q3: 18
                2,  // Q4: Modern periodic law
                2,  // Q5: Mendeleev
                2,  // Q6: Triad
                1,  // Q7: Silicon
                1,  // Q8: Proton
                1,  // Q9: Atom
                1,  // Q10: Atomic number
                1,  // Q11: Ionic bond
                1,  // Q12: Covalent bond
                1,  // Q13: Mole
                1,  // Q14: 6.02 × 10²³
                1,  // Q15: CₙH₂ₙ₊₂
                2,  // Q16: Methane
                2,  // Q17: Saturated solution
                1,  // Q18: 7
                1,  // Q19: Bases
                1   // Q20: Boiling
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
            new ChemistryDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}