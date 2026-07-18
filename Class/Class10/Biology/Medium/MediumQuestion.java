package Class.Class10.Biology.Medium;

import Class.Class10.Biology.BiologyDashboard.BiologyDashboard;
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
                "Question 1: The process by which living organisms maintain a stable internal environment is called:",
                "Question 2: Which of the following is NOT a part of the air passageway in humans?",
                "Question 3: The tiny air sacs in the lungs where gaseous exchange takes place are called:",
                "Question 4: The muscular organ that separates the chest cavity from the abdominal cavity is the:",
                "Question 5: The main excretory organ in humans is the:",
                "Question 6: The functional unit of the kidney is the:",
                "Question 7: Which of the following is NOT a method of removing kidney stones?",
                "Question 8: The part of the brain that controls balance and coordination is the:",
                "Question 9: The type of coordination that involves chemical messengers is called:",
                "Question 10: The basic unit of the nervous system is the:",
                "Question 11: The hormone that regulates blood sugar levels is:",
                "Question 12: The disease caused by insulin deficiency is:",
                "Question 13: Which of the following is a movable joint in the human body?",
                "Question 14: The two types of muscles that act as an antagonistic pair at the elbow joint are:",
                "Question 15: The type of reproduction that involves only one parent is called:",
                "Question 16: The transfer of pollen from the anther to the stigma is called:",
                "Question 17: The father of genetics is:",
                "Question 18: The level of ecological organization that includes all the living and non-living components in an area is called:",
                "Question 19: The process of using living organisms or their products to make useful products is called:",
                "Question 20: A substance that kills or inhibits the growth of bacteria is called:"
        };

        String options[][] = {
                {"A. Respiration", "B. Homeostasis", "C. Coordination", "D. Reproduction"},
                {"A. Nasal cavity", "B. Pharynx", "C. Oesophagus", "D. Trachea"},
                {"A. Bronchi", "B. Bronchioles", "C. Alveoli", "D. Capillaries"},
                {"A. Rib cage", "B. Larynx", "C. Diaphragm", "D. Epiglottis"},
                {"A. Skin", "B. Lungs", "C. Kidney", "D. Liver"},
                {"A. Neuron", "B. Nephron", "C. Alveolus", "D. Villus"},
                {"A. Lithotripsy", "B. Dialysis", "C. Surgery", "D. Medication"},
                {"A. Cerebrum", "B. Cerebellum", "C. Medulla oblongata", "D. Hypothalamus"},
                {"A. Nervous coordination", "B. Hormonal coordination", "C. Reflex action", "D. Synaptic coordination"},
                {"A. Nephron", "B. Neuron", "C. Alveolus", "D. Villus"},
                {"A. Adrenaline", "B. Insulin", "C. Thyroxine", "D. Estrogen"},
                {"A. Diabetes mellitus", "B. Goiter", "C. Gigantism", "D. Dwarfism"},
                {"A. Hinge joint", "B. Ball and socket joint", "C. Pivot joint", "D. All of the above"},
                {"A. Biceps and triceps", "B. Quadriceps and hamstrings", "C. Deltoid and pectoralis", "D. Trapezius and latissimus"},
                {"A. Sexual reproduction", "B. Asexual reproduction", "C. Fertilization", "D. Pollination"},
                {"A. Fertilization", "B. Pollination", "C. Germination", "D. Reproduction"},
                {"A. Darwin", "B. Mendel", "C. Lamarck", "D. Watson"},
                {"A. Population", "B. Community", "C. Ecosystem", "D. Biosphere"},
                {"A. Biotechnology", "B. Pharmacology", "C. Ecology", "D. Genetics"},
                {"A. Vaccine", "B. Antibiotic", "C. Analgesic", "D. Sedative"}
        };

        int correctAnswers[] = {
                1,  // Q1: Homeostasis
                2,  // Q2: Oesophagus
                2,  // Q3: Alveoli
                2,  // Q4: Diaphragm
                2,  // Q5: Kidney
                1,  // Q6: Nephron
                1,  // Q7: Dialysis
                1,  // Q8: Cerebellum
                1,  // Q9: Hormonal coordination
                1,  // Q10: Neuron
                1,  // Q11: Insulin
                0,  // Q12: Diabetes mellitus
                3,  // Q13: All of the above
                0,  // Q14: Biceps and triceps
                1,  // Q15: Asexual reproduction
                1,  // Q16: Pollination
                1,  // Q17: Mendel
                2,  // Q18: Ecosystem
                0,  // Q19: Biotechnology
                1   // Q20: Antibiotic
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
            new BiologyDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}