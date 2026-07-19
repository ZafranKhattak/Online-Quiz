package Class.Class11.Biology.Hard;

import Class.Class11.Biology.BiologyDashboard.BiologyDashboard;
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
                "Question 1: The lock and key model is used to explain:",
                "Question 2: ATP stands for:",
                "Question 3: The fluid that fills the chloroplast is called:",
                "Question 4: In which part of the cell does glycolysis take place?",
                "Question 5: The energy currency of the cell is:",
                "Question 6: Which of the following is a limiting factor for photosynthesis?",
                "Question 7: The semi-permeable membrane in a cell is the:",
                "Question 8: The organelle responsible for intracellular digestion is the:",
                "Question 9: The process of programmed cell death is called:",
                "Question 10: The exchange of oxygen and carbon dioxide in the lungs takes place in the:",
                "Question 11: The formation of urea takes place in the:",
                "Question 12: The type of tissue that covers the surface of the body and lines internal organs is:",
                "Question 13: The primary function of white blood cells is:",
                "Question 14: The disorder caused by iron deficiency is:",
                "Question 15: Blood vessels that carry blood towards the heart are called:",
                "Question 16: The pH of the stomach is approximately:",
                "Question 17: The protein present in the blood that carries oxygen is:",
                "Question 18: Atherosclerosis is a disorder that affects the:",
                "Question 19: The photochemical phase of photosynthesis involves:",
                "Question 20: The respiratory quotient is defined as:"
        };

        String options[][] = {
                {"A. Cell division", "B. Enzyme action", "C. Photosynthesis", "D. Respiration"},
                {"A. Adenosine Triphosphate", "B. Amino Triphosphate", "C. Adenosine Triprotein", "D. Adenosine Diphosphate"},
                {"A. Stroma", "B. Thylakoid", "C. Matrix", "D. Granum"},
                {"A. Mitochondria", "B. Cytoplasm", "C. Nucleus", "D. Ribosome"},
                {"A. Glucose", "B. ATP", "C. NADH", "D. FADH₂"},
                {"A. Temperature", "B. Light intensity", "C. Carbon dioxide concentration", "D. All of the above"},
                {"A. Cell wall", "B. Cytoplasm", "C. Cell membrane", "D. Nucleus"},
                {"A. Ribosome", "B. Lysosome", "C. Golgi apparatus", "D. Endoplasmic reticulum"},
                {"A. Necrosis", "B. Apoptosis", "C. Cytokinesis", "D. Interphase"},
                {"A. Trachea", "B. Bronchi", "C. Alveoli", "D. Bronchioles"},
                {"A. Kidney", "B. Liver", "C. Heart", "D. Lungs"},
                {"A. Connective tissue", "B. Muscular tissue", "C. Epithelial tissue", "D. Nervous tissue"},
                {"A. Carrying oxygen", "B. Clotting blood", "C. Fighting infection", "D. Carrying nutrients"},
                {"A. Scurvy", "B. Rickets", "C. Anaemia", "D. Night blindness"},
                {"A. Arteries", "B. Veins", "C. Capillaries", "D. Venules"},
                {"A. 1-2", "B. 4-5", "C. 7-8", "D. 10-11"},
                {"A. Albumin", "B. Fibrinogen", "C. Haemoglobin", "D. Myoglobin"},
                {"A. Heart", "B. Lungs", "C. Liver", "D. Blood vessels"},
                {"A. Calvin cycle only", "B. Light-dependent reactions", "C. Light-independent reactions", "D. Carbon fixation"},
                {"A. Volume of CO₂ released / Volume of O₂ consumed", "B. Volume of O₂ consumed / Volume of CO₂ released", "C. Rate of respiration / Rate of photosynthesis", "D. Rate of photosynthesis / Rate of respiration"}
        };

        int correctAnswers[] = {
                1,  // Q1: Enzyme action
                0,  // Q2: Adenosine Triphosphate
                0,  // Q3: Stroma
                1,  // Q4: Cytoplasm
                1,  // Q5: ATP
                3,  // Q6: All of the above
                2,  // Q7: Cell membrane
                1,  // Q8: Lysosome
                1,  // Q9: Apoptosis
                2,  // Q10: Alveoli
                1,  // Q11: Liver
                2,  // Q12: Epithelial tissue
                2,  // Q13: Fighting infection
                2,  // Q14: Anaemia
                1,  // Q15: Veins
                0,  // Q16: 1-2
                2,  // Q17: Haemoglobin
                3,  // Q18: Blood vessels
                1,  // Q19: Light-dependent reactions
                0   // Q20: Volume of CO₂ released / Volume of O₂ consumed
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