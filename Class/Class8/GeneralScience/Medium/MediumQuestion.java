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
                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
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
            new GeneralScienceDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}