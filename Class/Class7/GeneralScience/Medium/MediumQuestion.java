package Class.Class7.GeneralScience.Medium;

import Class.Class7.GeneralScience.GeneralScienceDashboard.GeneralScienceDashboard;
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
                "Question 1: The process of respiration in plants occurs:",
                "Question 2: The path of air in the human respiratory system is:",
                "Question 3: Which of the following is NOT a factor affecting the rate of transpiration?",
                "Question 4: The function of white blood cells in the human body is to:",
                "Question 5: The atomic number of an element tells the number of:",
                "Question 6: Which of the following is a chemical change?",
                "Question 7: A saturated solution is one in which:",
                "Question 8: The law of action and reaction states that:",
                "Question 9: The time period of a wave is the time taken for:",
                "Question 10: The part of the plant responsible for transporting water and minerals from the roots to other parts is the:",
                "Question 11: The human circulatory system consists of:",
                "Question 12: Rusting of iron occurs when iron reacts with:",
                "Question 13: The pitch of a sound depends on its:",
                "Question 14: The three states of matter on heating show:",
                "Question 15: Which statement about an atom is correct?",
                "Question 16: The solute and solvent in a solution together form the:",
                "Question 17: The fastest mode of heat transfer is:",
                "Question 18: Contact forces are those that:",
                "Question 19: The energy possessed by a moving object is called:",
                "Question 20: The word equation for photosynthesis is:"
        };

        String options[][] = {
                {"A. Only during the day", "B. Only at night", "C. Continuously day and night", "D. Only in the presence of light"},
                {"A. Nose → trachea → lungs → bronchi", "B. Nose → bronchi → trachea → lungs", "C. Nose → trachea → bronchi → lungs", "D. Nose → lungs → trachea → bronchi"},
                {"A. Temperature", "B. Wind", "C. Humidity", "D. Soil color"},
                {"A. Carry oxygen", "B. Clot blood", "C. Fight infection", "D. Transport nutrients"},
                {"A. Neutrons", "B. Protons", "C. Electrons and protons", "D. Protons and neutrons"},
                {"A. Dissolving sugar in water", "B. Melting wax", "C. Rusting of iron", "D. Breaking glass"},
                {"A. No more solute can dissolve", "B. More solute can dissolve", "C. Solvent is maximum", "D. Solute is minimum"},
                {"A. Forces act in pairs", "B. Forces are always attractive", "C. Forces depend on mass only", "D. Forces are never equal"},
                {"A. One complete vibration", "B. Half a vibration", "C. One hundred vibrations", "D. Two vibrations"},
                {"A. Phloem", "B. Xylem", "C. Stomata", "D. Epidermis"},
                {"A. Heart only", "B. Blood vessels only", "C. Heart and blood vessels", "D. Heart, blood vessels and blood"},
                {"A. Oxygen and water", "B. Only oxygen", "C. Only water", "D. Nitrogen and oxygen"},
                {"A. Amplitude", "B. Frequency", "C. Wavelength", "D. Speed"},
                {"A. Contraction", "B. Expansion", "C. No change", "D. Only liquid changes"},
                {"A. An atom is positively charged", "B. An atom is negatively charged", "C. An atom is neutral", "D. An atom has no protons"},
                {"A. Mixture", "B. Compound", "C. Solution", "D. Suspension"},
                {"A. Conduction", "B. Convection", "C. Radiation", "D. All are equal"},
                {"A. Act without touching", "B. Act only when objects touch", "C. Act through air only", "D. Act at a distance"},
                {"A. Potential energy", "B. Kinetic energy", "C. Heat energy", "D. Sound energy"},
                {"A. Carbon dioxide + water → glucose + oxygen", "B. Oxygen + water → glucose + carbon dioxide", "C. Glucose + oxygen → carbon dioxide + water", "D. Carbon dioxide + glucose → oxygen + water"}
        };

        int correctAnswers[] = {
                2,  // Q1: Continuously day and night
                2,  // Q2: Nose → trachea → bronchi → lungs
                3,  // Q3: Soil color
                2,  // Q4: Fight infection
                1,  // Q5: Protons
                2,  // Q6: Rusting of iron
                0,  // Q7: No more solute can dissolve
                0,  // Q8: Forces act in pairs
                0,  // Q9: One complete vibration
                1,  // Q10: Xylem
                3,  // Q11: Heart, blood vessels and blood
                0,  // Q12: Oxygen and water
                1,  // Q13: Frequency
                1,  // Q14: Expansion
                2,  // Q15: An atom is neutral
                2,  // Q16: Solution
                2,  // Q17: Radiation
                1,  // Q18: Act only when objects touch
                1,  // Q19: Kinetic energy
                0   // Q20: Carbon dioxide + water → glucose + oxygen
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
            new GeneralScienceDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}