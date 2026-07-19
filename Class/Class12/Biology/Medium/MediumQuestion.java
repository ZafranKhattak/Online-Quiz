package Class.Class12.Biology.Medium;

import Class.Class12.Biology.BiologyDashboard.BiologyDashboard;
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
                "Question 1: Double fertilization is a characteristic feature of:",
                "Question 2: In human reproduction, the embryo implants in the:",
                "Question 3: Gametogenesis in humans includes:",
                "Question 4: Amniocentesis is a technique used to:",
                "Question 5: In Mendelian inheritance, the term for the physical appearance of an organism is:",
                "Question 6: Incomplete dominance is observed in which of the following?",
                "Question 7: Sex-linked inheritance includes traits such as:",
                "Question 8: The chemical component of DNA that pairs with guanine is:",
                "Question 9: The process by which mRNA is synthesized from DNA is called:",
                "Question 10: The lac operon is a model for understanding:",
                "Question 11: Darwin's theory of evolution is based on the concept of:",
                "Question 12: The Hardy-Weinberg principle describes:",
                "Question 13: HIV (Human Immunodeficiency Virus) primarily attacks which cells in the body?",
                "Question 14: Antibiotics are effective against:",
                "Question 15: The production of human insulin using bacteria is an example of:",
                "Question 16: The term \"Bt\" in Bt cotton refers to a toxin from:",
                "Question 17: Transgenic animals have:",
                "Question 18: Competition between different species for the same resources is called:",
                "Question 19: An ecological pyramid that shows the number of individuals at each trophic level is called:",
                "Question 20: Hotspots of biodiversity are areas that:"
        };

        String options[][] = {
                {"A. Bryophytes", "B. Angiosperms", "C. Gymnosperms", "D. Pteridophytes"},
                {"A. Ovary", "B. Fallopian tube", "C. Uterus", "D. Vagina"},
                {"A. Only spermatogenesis", "B. Only oogenesis", "C. Both spermatogenesis and oogenesis", "D. Only fertilization"},
                {"A. Treat genetic disorders", "B. Detect chromosomal abnormalities in the fetus", "C. Prevent pregnancy", "D. Cure STDs"},
                {"A. Genotype", "B. Phenotype", "C. Allele", "D. Locus"},
                {"A. Blood groups", "B. Snapdragon flower color", "C. Human height", "D. Seed shape"},
                {"A. Height and weight", "B. Blood groups", "C. Haemophilia and color blindness", "D. Eye color"},
                {"A. Adenine", "B. Thymine", "C. Cytosine", "D. Uracil"},
                {"A. Replication", "B. Transcription", "C. Translation", "D. Transformation"},
                {"A. DNA replication", "B. Gene expression and regulation", "C. Protein synthesis", "D. Cell division"},
                {"A. Use and disuse", "B. Natural selection", "C. Inheritance of acquired characters", "D. Genetic drift"},
                {"A. Allelic frequency equilibrium in a population", "B. Speciation in isolated populations", "C. The rate of mutation", "D. The process of natural selection"},
                {"A. Red blood cells", "B. Helper T cells (CD4+ cells)", "C. Brain cells", "D. Liver cells"},
                {"A. Viruses only", "B. Bacteria only", "C. Both bacteria and viruses", "D. Fungi only"},
                {"A. Genetic engineering", "B. Fermentation", "C. Tissue culture", "D. Hybridization"},
                {"A. Virus", "B. Fungus", "C. Bacterium (Bacillus thuringiensis)", "D. Protozoan"},
                {"A. No genetic material", "B. Foreign genes inserted into their genome", "C. Only bacterial genes", "D. No chromosomes"},
                {"A. Interspecific competition", "B. Intraspecific competition", "C. Mutualism", "D. Commensalism"},
                {"A. Pyramid of biomass", "B. Pyramid of energy", "C. Pyramid of numbers", "D. Pyramid of productivity"},
                {"A. Are uninhabited by humans", "B. Have high species richness and endemism", "C. Have no endangered species", "D. Are protected from all human activity"}
        };

        int correctAnswers[] = {
                1,  // Q1: Angiosperms
                2,  // Q2: Uterus
                2,  // Q3: Both spermatogenesis and oogenesis
                1,  // Q4: Detect chromosomal abnormalities in the fetus
                1,  // Q5: Phenotype
                1,  // Q6: Snapdragon flower color
                2,  // Q7: Haemophilia and color blindness
                2,  // Q8: Cytosine (G pairs with C)
                1,  // Q9: Transcription
                1,  // Q10: Gene expression and regulation
                1,  // Q11: Natural selection
                0,  // Q12: Allelic frequency equilibrium in a population
                1,  // Q13: Helper T cells (CD4+ cells)
                1,  // Q14: Bacteria only
                0,  // Q15: Genetic engineering
                2,  // Q16: Bacterium (Bacillus thuringiensis)
                1,  // Q17: Foreign genes inserted into their genome
                0,  // Q18: Interspecific competition
                2,  // Q19: Pyramid of numbers
                1   // Q20: Have high species richness and endemism
        };

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