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

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 950, 30);
            label2.setForeground(Color.GREEN);
            label2.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(label2);
        }

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                group.add(btn);
                panel.add(btn);
            }
        }

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            JOptionPane.showConfirmDialog(null, "You want to submit");
            JOptionPane.showMessageDialog(null, "Submitted Successfully");
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