package Class.Class8.GeneralScience.Medium;

import Class.Class8.GeneralScience.GeneralScienceDashboard.GeneralScienceDashboard;
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
                "Question 1: Which human organ system is responsible for removing waste products from the body?",
                "Question 2: A chemical reaction in which a compound breaks down into simpler substances is called:",
                "Question 3: The force exerted by a liquid on a surface is called:",
                "Question 4: Substances that have a pH value greater than 7 are called:",
                "Question 5: The process in which a liquid is converted into vapour and then condensed back to liquid is called:",
                "Question 6: The part of the nervous system that transmits messages from the brain to other parts of the body is the:",
                "Question 7: Which of the following is a biodegradable pollutant?",
                "Question 8: The amount of matter in an object is called its:",
                "Question 9: The image formed by a convex lens is:",
                "Question 10: The transfer of heat through direct contact is called:",
                "Question 11: The process of refining petroleum is based on:",
                "Question 12: Cell division that results in two identical daughter cells is called:",
                "Question 13: The SI unit of pressure is the:",
                "Question 14: Which of the following is a characteristic of metals?",
                "Question 15: The part of the brain responsible for balance and coordination is the:",
                "Question 16: Which of the following is a non-metal?",
                "Question 17: A solution that contains the maximum amount of solute at a given temperature is called:",
                "Question 18: The speed of light in air is approximately:",
                "Question 19: Which of the following is a renewable source of energy?",
                "Question 20: The products of combustion of a hydrocarbon are:"
        };

        String options[][] = {
                {"A. Digestive system", "B. Excretory system", "C. Nervous system", "D. Respiratory system"},
                {"A. Combination reaction", "B. Decomposition reaction", "C. Displacement reaction", "D. Redox reaction"},
                {"A. Tension", "B. Thrust", "C. Pressure", "D. Friction"},
                {"A. Acids", "B. Bases or alkalis", "C. Salts", "D. Neutral substances"},
                {"A. Filtration", "B. Evaporation", "C. Distillation", "D. Sublimation"},
                {"A. Cerebrum", "B. Cerebellum", "C. Spinal cord", "D. Medulla oblongata"},
                {"A. Plastic bags", "B. Glass bottles", "C. Fruit peels", "D. Metal cans"},
                {"A. Weight", "B. Mass", "C. Volume", "D. Density"},
                {"A. Always virtual", "B. Always real", "C. Can be real or virtual depending on the object distance", "D. Always inverted"},
                {"A. Convection", "B. Radiation", "C. Conduction", "D. Evaporation"},
                {"A. Filtration", "B. Fractional distillation", "C. Sedimentation", "D. Decantation"},
                {"A. Meiosis", "B. Mitosis", "C. Budding", "D. Fragmentation"},
                {"A. Newton", "B. Pascal", "C. Joule", "D. Watt"},
                {"A. Non-conductor of heat", "B. Brittle", "C. Good conductor of electricity", "D. Dull appearance"},
                {"A. Cerebrum", "B. Cerebellum", "C. Medulla oblongata", "D. Hypothalamus"},
                {"A. Iron", "B. Copper", "C. Sulphur", "D. Aluminum"},
                {"A. Dilute solution", "B. Concentrated solution", "C. Saturated solution", "D. Unsaturated solution"},
                {"A. 3 × 10⁶ m/s", "B. 3 × 10⁸ m/s", "C. 3 × 10¹⁰ m/s", "D. 3 × 10⁴ m/s"},
                {"A. Natural gas", "B. Coal", "C. Solar energy", "D. Petroleum"},
                {"A. Carbon and hydrogen", "B. Carbon dioxide and water", "C. Carbon monoxide and hydrogen", "D. Methane and oxygen"}
        };

        int correctAnswers[] = {
                1,  // Q1: Excretory system
                1,  // Q2: Decomposition reaction
                2,  // Q3: Pressure
                1,  // Q4: Bases or alkalis
                2,  // Q5: Distillation
                2,  // Q6: Spinal cord
                2,  // Q7: Fruit peels
                1,  // Q8: Mass
                2,  // Q9: Can be real or virtual depending on the object distance
                2,  // Q10: Conduction
                1,  // Q11: Fractional distillation
                1,  // Q12: Mitosis
                1,  // Q13: Pascal
                2,  // Q14: Good conductor of electricity
                1,  // Q15: Cerebellum
                2,  // Q16: Sulphur
                2,  // Q17: Saturated solution
                1,  // Q18: 3 × 10⁸ m/s
                2,  // Q19: Solar energy
                1   // Q20: Carbon dioxide and water
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