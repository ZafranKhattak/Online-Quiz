package Class.Class12.Biology.Hard;

import Class.Class12.Biology.BiologyDashboard.BiologyDashboard;
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
                "Question 1: The development of a seed without fertilization is called:",
                "Question 2: In the human menstrual cycle, ovulation occurs around day:",
                "Question 3: Assisted reproductive technology (ART) includes:",
                "Question 4: Mendel's law of segregation states that:",
                "Question 5: Pleiotropy refers to:",
                "Question 6: The central dogma of molecular biology describes:",
                "Question 7: The human genome project aimed to:",
                "Question 8: DNA fingerprinting is based on:",
                "Question 9: The modern synthetic theory of evolution combines:",
                "Question 10: Gene flow in a population refers to:",
                "Question 11: Cancer cells are characterized by:",
                "Question 12: Riot control and bio-control agents are examples of:",
                "Question 13: The role of restriction enzymes in genetic engineering is to:",
                "Question 14: A plasmid is used as a vector in genetic engineering because it:",
                "Question 15: Gene therapy is a method for:",
                "Question 16: Biopiracy refers to:",
                "Question 17: The Red Data Book lists:",
                "Question 18: A Ramsar site is a wetland site designated to be of international importance under:",
                "Question 19: The energy flow in an ecosystem is:",
                "Question 20: The relationship between a nitrogen-fixing bacterium and a leguminous plant is an example of:"
        };

        String options[][] = {
                {"A. Parthenocarpy", "B. Apomixis", "C. Polyembryony", "D. Double fertilization"},
                {"A. 5", "B. 14", "C. 21", "D. 28"},
                {"A. IVF, ZIFT, and GIFT", "B. Only IVF", "C. Only ZIFT", "D. Only GIFT"},
                {"A. Genes are inherited in pairs", "B. Alleles separate during gamete formation", "C. Traits are linked on chromosomes", "D. Gene expression is dominant"},
                {"A. Multiple genes affecting one trait", "B. A single gene affecting multiple traits", "C. Incomplete dominance", "D. Linkage of genes"},
                {"A. The flow of genetic information from DNA to RNA to protein", "B. DNA replication only", "C. The structure of DNA", "D. The process of evolution"},
                {"A. Clone human organs", "B. Map all human genes", "C. Cure genetic diseases", "D. Study evolution"},
                {"A. Differences in protein sequences", "B. Differences in DNA sequence patterns", "C. Differences in RNA sequences", "D. Differences in lipid composition"},
                {"A. Darwinism and Mendelian genetics", "B. Lamarckism and Darwinism", "C. Only natural selection", "D. Only mutation"},
                {"A. Movement of genes within a population", "B. Exchange of genes between populations", "C. Mutation within a population", "D. Natural selection within a population"},
                {"A. Controlled cell division", "B. Uncontrolled cell division", "C. Normal cell cycle regulation", "D. Lack of mutations"},
                {"A. Chemical pesticides", "B. Biological pest control using living organisms", "C. Synthetic fertilizers", "D. Antibiotics"},
                {"A. Join DNA fragments", "B. Cut DNA at specific sequences", "C. Copy DNA sequences", "D. Express foreign genes"},
                {"A. Is a linear DNA fragment", "B. Can replicate independently in a bacterial cell", "C. Is not found in bacteria", "D. Cannot carry foreign genes"},
                {"A. Treating genetic disorders by replacing defective genes", "B. Preventing bacterial infections", "C. Improving crop yield", "D. Cloning animals"},
                {"A. Biotechnological research for profit", "B. Patenting traditional knowledge and biological resources without proper compensation", "C. Biological warfare", "D. Sustainable use of biodiversity"},
                {"A. All plant and animal species", "B. Threatened and endangered species", "C. Only extinct species", "D. Only plants"},
                {"A. The CITES convention", "B. The Ramsar Convention", "C. The Convention on Biological Diversity", "D. The Stockholm Convention"},
                {"A. Cyclic", "B. Unidirectional", "C. Both cyclic and unidirectional", "D. None of the above"},
                {"A. Parasitism", "B. Commensalism", "C. Mutualism", "D. Competition"}
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
                btn.setBounds(80 + (j * 260), (i * 60 + 130), 260, 30);
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