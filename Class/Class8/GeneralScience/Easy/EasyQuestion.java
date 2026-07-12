package Class.Class8.GeneralScience.Easy;

import Class.Class8.GeneralScience.GeneralScienceDashboard.GeneralScienceDashboard;
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
                "Question 1: The basic unit of life is called the:",
                "Question 2: The organ that pumps blood throughout the body is the:",
                "Question 3: Which gas is released by plants during photosynthesis?",
                "Question 4: The substance that dissolves in water to form a solution is called the:",
                "Question 5: A force that opposes motion between two surfaces in contact is called:",
                "Question 6: The standard unit for measuring force is the:",
                "Question 7: An instrument used to measure temperature is called a:",
                "Question 8: Which of the following is a non-renewable source of energy?",
                "Question 9: The part of the eye that controls the amount of light entering is the:",
                "Question 10: A substance that has a pH value less than 7 is called:",
                "Question 11: The process by which a liquid changes into a gas is called:",
                "Question 12: Which organ system is responsible for breathing?",
                "Question 13: A mixture of two or more metals is called:",
                "Question 14: The movement of a pendulum is an example of:",
                "Question 15: The device used to measure electric current is called:",
                "Question 16: Which of the following is a fossil fuel?",
                "Question 17: The major component of air is:",
                "Question 18: A lens that is thicker in the middle than at the edges is called:",
                "Question 19: The control centre of the body is the:",
                "Question 20: The Earth revolves around the:"
        };

        String options[][] = {
                {"A. Organ", "B. Tissue", "C. Cell", "D. System"},
                {"A. Brain", "B. Heart", "C. Liver", "D. Kidney"},
                {"A. Carbon dioxide", "B. Nitrogen", "C. Oxygen", "D. Hydrogen"},
                {"A. Solvent", "B. Solute", "C. Mixture", "D. Compound"},
                {"A. Pressure", "B. Friction", "C. Gravity", "D. Magnetism"},
                {"A. Joule", "B. Watt", "C. Newton", "D. Pascal"},
                {"A. Barometer", "B. Thermometer", "C. Speedometer", "D. Ammeter"},
                {"A. Sunlight", "B. Wind", "C. Coal", "D. Water"},
                {"A. Iris", "B. Pupil", "C. Lens", "D. Retina"},
                {"A. Base", "B. Salt", "C. Acid", "D. Neutral"},
                {"A. Condensation", "B. Evaporation", "C. Freezing", "D. Melting"},
                {"A. Digestive system", "B. Nervous system", "C. Respiratory system", "D. Circulatory system"},
                {"A. Alloy", "B. Compound", "C. Solution", "D. Suspension"},
                {"A. Linear motion", "B. Circular motion", "C. Oscillatory motion", "D. Random motion"},
                {"A. Voltmeter", "B. Ammeter", "C. Galvanometer", "D. Ohmmeter"},
                {"A. Wood", "B. Petroleum", "C. Water", "D. Sunlight"},
                {"A. Oxygen", "B. Carbon dioxide", "C. Nitrogen", "D. Hydrogen"},
                {"A. Concave lens", "B. Convex lens", "C. Plano lens", "D. Cylindrical lens"},
                {"A. Heart", "B. Spinal cord", "C. Brain", "D. Nerves"},
                {"A. Moon", "B. Sun", "C. Mars", "D. Jupiter"}
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
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
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