package Class.Class10.Biology.Hard;

import Class.Class10.Biology.BiologyDashboard.BiologyDashboard;
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
                "Question 1: Gaseous exchange in plants occurs through which structures?",
                "Question 2: The percentage of carbon dioxide in expired air is approximately:",
                "Question 3: Which of the following respiratory disorders is caused by the breakdown of alveoli walls?",
                "Question 4: The three processes involved in urine formation are:",
                "Question 5: The type of dialysis that uses the patient's own peritoneal membrane as the filter is called:",
                "Question 6: The contribution of Al-Farabi and Abul-Qasim to the field of medicine was related to:",
                "Question 7: The part of the brain that contains the pituitary gland is the:",
                "Question 8: The type of neuron that carries impulses from the sensory organs to the central nervous system is called:",
                "Question 9: The condition in which the eye cannot focus on distant objects is called:",
                "Question 10: The deficiency of which vitamin causes night blindness?",
                "Question 11: The contributions of Ibn-al-Haitham to biology were related to:",
                "Question 12: The condition in which bone density decreases, making them fragile, is called:",
                "Question 13: The scientist who described the bones and muscles in humans was:",
                "Question 14: The type of joint that allows movement in one plane only is the:",
                "Question 15: The disease characterized by inflammation of joints is called:",
                "Question 16: The process by which cells divide to produce gametes is called:",
                "Question 17: The type of immunity that is acquired through vaccination is called:",
                "Question 18: The process of nitrogen fixation in the ecosystem is carried out by:",
                "Question 19: The technique of introducing genes from one organism into another is called:",
                "Question 20: The type of drug that reduces pain and produces sleep is called:"
        };

        String options[][] = {
                {"A. Stomata and lenticels", "B. Roots and stems only", "C. Flowers and fruits", "D. Seeds and spores"},
                {"A. 0.04%", "B. 4%", "C. 16%", "D. 21%"},
                {"A. Bronchitis", "B. Pneumonia", "C. Emphysema", "D. Asthma"},
                {"A. Filtration, reabsorption, and secretion", "B. Filtration, digestion, and absorption", "C. Reabsorption, secretion, and excretion", "D. Filtration, secretion, and elimination"},
                {"A. Haemodialysis", "B. Peritoneal dialysis", "C. Filtration dialysis", "D. Membrane dialysis"},
                {"A. Removal of kidney stones", "B. Discovery of antibiotics", "C. Structure of DNA", "D. Photosynthesis"},
                {"A. Cerebrum", "B. Cerebellum", "C. Hypothalamus", "D. Medulla oblongata"},
                {"A. Motor neuron", "B. Sensory neuron", "C. Interneuron", "D. Relay neuron"},
                {"A. Myopia", "B. Hypermetropia", "C. Astigmatism", "D. Presbyopia"},
                {"A. Vitamin A", "B. Vitamin B", "C. Vitamin C", "D. Vitamin D"},
                {"A. The circulatory system", "B. The structure of the eye", "C. The digestive system", "D. Genetics"},
                {"A. Arthritis", "B. Osteoporosis", "C. Rickets", "D. Scurvy"},
                {"A. Ibn-al-Haitham", "B. Vi Salius", "C. Mendel", "D. Darwin"},
                {"A. Ball and socket joint", "B. Hinge joint", "C. Pivot joint", "D. Gliding joint"},
                {"A. Osteoporosis", "B. Arthritis", "C. Rickets", "D. Scurvy"},
                {"A. Mitosis", "B. Meiosis", "C. Binary fission", "D. Budding"},
                {"A. Active immunity", "B. Passive immunity", "C. Natural immunity", "D. Innate immunity"},
                {"A. Plants", "B. Animals", "C. Bacteria", "D. Fungi"},
                {"A. Fermentation", "B. Genetic engineering", "C. Cloning", "D. Hybridization"},
                {"A. Antibiotic", "B. Vaccine", "C. Sedative", "D. Antibody"}
        };

        int correctAnswers[] = {
                0,  // Q1: Stomata and lenticels
                1,  // Q2: 4%
                2,  // Q3: Emphysema
                0,  // Q4: Filtration, reabsorption, and secretion
                1,  // Q5: Peritoneal dialysis
                0,  // Q6: Removal of kidney stones
                2,  // Q7: Hypothalamus
                1,  // Q8: Sensory neuron
                0,  // Q9: Myopia
                0,  // Q10: Vitamin A
                1,  // Q11: The structure of the eye
                1,  // Q12: Osteoporosis
                1,  // Q13: Vi Salius
                1,  // Q14: Hinge joint
                1,  // Q15: Arthritis
                1,  // Q16: Meiosis
                0,  // Q17: Active immunity
                2,  // Q18: Bacteria
                1,  // Q19: Genetic engineering
                2   // Q20: Sedative
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