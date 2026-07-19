package Class.Class12.Biology.Easy;

import Class.Class12.Biology.BiologyDashboard.BiologyDashboard;
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
                "Question 1: The male gamete in flowering plants is produced in the:",
                "Question 2: The process of fusion of male and female gametes is called:",
                "Question 3: The female reproductive organ in humans that produces eggs is the:",
                "Question 4: The study of heredity and variation is called:",
                "Question 5: The father of genetics is:",
                "Question 6: DNA is the genetic material that carries:",
                "Question 7: The process by which organisms change over time is called:",
                "Question 8: Disease-causing organisms are called:",
                "Question 9: Malaria is caused by a:",
                "Question 10: Microbes that are used as bio-fertilizers are found in the roots of:",
                "Question 11: The technique of manipulating genes for practical purposes is called:",
                "Question 12: The first genetically modified crop developed commercially was:",
                "Question 13: An organism that lives inside or on another organism and causes harm is called a:",
                "Question 14: A community of living organisms and their physical environment is called an:",
                "Question 15: The variety of life on Earth is called:",
                "Question 16: The hormone that regulates blood sugar levels is:",
                "Question 17: The basic unit of inheritance is called the:",
                "Question 18: The type of cell division that occurs in gametes is:",
                "Question 19: The process by which plants lose water through leaves is called:",
                "Question 20: A state of balance maintained by living organisms is called:"
        };

        String options[][] = {
                {"A. Ovary", "B. Stigma", "C. Anther", "D. Petal"},
                {"A. Pollination", "B. Fertilization", "C. Germination", "D. Meiosis"},
                {"A. Uterus", "B. Ovary", "C. Vagina", "D. Fallopian tube"},
                {"A. Ecology", "B. Evolution", "C. Genetics", "D. Embryology"},
                {"A. Darwin", "B. Lamarck", "C. Mendel", "D. Watson"},
                {"A. Carbohydrates", "B. Lipids", "C. Hereditary information", "D. Proteins"},
                {"A. Evolution", "B. Reproduction", "C. Metabolism", "D. Homeostasis"},
                {"A. Antibodies", "B. Pathogens", "C. Vaccines", "D. Enzymes"},
                {"A. Bacterium", "B. Virus", "C. Fungus", "D. Protozoan"},
                {"A. Wheat", "B. Rice", "C. Legumes", "D. Corn"},
                {"A. Biotechnology", "B. Ecology", "C. Evolution", "D. Cytology"},
                {"A. Wheat", "B. Rice", "C. Bt cotton", "D. Soybean"},
                {"A. Predator", "B. Parasite", "C. Competitor", "D. Decomposer"},
                {"A. Population", "B. Ecosystem", "C. Biosphere", "D. Habitat"},
                {"A. Biosphere", "B. Population", "C. Biodiversity", "D. Ecosystem"},
                {"A. Adrenaline", "B. Insulin", "C. Thyroxine", "D. Estrogen"},
                {"A. Chromosome", "B. Gene", "C. DNA", "D. Protein"},
                {"A. Mitosis", "B. Meiosis", "C. Binary fission", "D. Budding"},
                {"A. Photosynthesis", "B. Respiration", "C. Transpiration", "D. Osmosis"},
                {"A. Metabolism", "B. Homeostasis", "C. Reproduction", "D. Evolution"}
        };

        int correctAnswers[] = {
                2,  // Q1: Anther
                1,  // Q2: Fertilization
                1,  // Q3: Ovary
                2,  // Q4: Genetics
                2,  // Q5: Mendel
                2,  // Q6: Hereditary information
                0,  // Q7: Evolution
                1,  // Q8: Pathogens
                3,  // Q9: Protozoan
                2,  // Q10: Legumes
                0,  // Q11: Biotechnology
                2,  // Q12: Bt cotton
                1,  // Q13: Parasite
                1,  // Q14: Ecosystem
                2,  // Q15: Biodiversity
                1,  // Q16: Insulin
                1,  // Q17: Gene
                1,  // Q18: Meiosis
                2,  // Q19: Transpiration
                1   // Q20: Homeostasis
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
            new BiologyDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}