package Class.Class7.GeneralScience.Easy;

import Class.Class7.GeneralScience.GeneralScienceDashboard.GeneralScienceDashboard;
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
                "Question 1: The root and shoot systems together make up the:",
                "Question 2: The process by which plants make their own food is called:",
                "Question 3: Which gas do humans breathe in from the air?",
                "Question 4: The organ that pumps blood throughout the human body is the:",
                "Question 5: The tiny air sacs in the lungs where gas exchange occurs are called:",
                "Question 6: The smallest particle of an element is called a/an:",
                "Question 7: Which of the following is a physical change?",
                "Question 8: In a solution, the substance that dissolves is called the:",
                "Question 9: The SI unit of force is the:",
                "Question 10: A wave that requires a medium to travel is called a:",
                "Question 11: Sound is an example of a:",
                "Question 12: The process by which plants lose water through their leaves is called:",
                "Question 13: Blood is composed of plasma, red blood cells, white blood cells, and:",
                "Question 14: The process of a liquid changing into a gas is called:",
                "Question 15: The movement of water molecules from a region of higher concentration to lower concentration is called:",
                "Question 16: Which of the following is a non-contact force?",
                "Question 17: The speed of an object is calculated by dividing distance by:",
                "Question 18: The number of vibrations per second is called:",
                "Question 19: Which type of blood vessel carries blood away from the heart?",
                "Question 20: The outer layer of the Earth where living organisms exist is called:"
        };

        String options[][] = {
                {"A. Flower", "B. Plant body", "C. Fruit", "D. Seed"},
                {"A. Respiration", "B. Transpiration", "C. Photosynthesis", "D. Evaporation"},
                {"A. Carbon dioxide", "B. Nitrogen", "C. Oxygen", "D. Hydrogen"},
                {"A. Liver", "B. Heart", "C. Kidney", "D. Lungs"},
                {"A. Bronchi", "B. Trachea", "C. Alveoli", "D. Capillaries"},
                {"A. Molecule", "B. Atom", "C. Compound", "D. Mixture"},
                {"A. Rusting of iron", "B. Burning of wood", "C. Melting of ice", "D. Cooking food"},
                {"A. Solvent", "B. Solute", "C. Mixture", "D. Compound"},
                {"A. Joule", "B. Watt", "C. Newton", "D. Pascal"},
                {"A. Light wave", "B. Electromagnetic wave", "C. Mechanical wave", "D. Radio wave"},
                {"A. Light wave", "B. Mechanical wave", "C. Electromagnetic wave", "D. Radio wave"},
                {"A. Photosynthesis", "B. Respiration", "C. Transpiration", "D. Condensation"},
                {"A. Platelets", "B. Minerals", "C. Nutrients", "D. Oxygen"},
                {"A. Condensation", "B. Freezing", "C. Evaporation", "D. Sublimation"},
                {"A. Diffusion", "B. Osmosis", "C. Transpiration", "D. Respiration"},
                {"A. Friction", "B. Gravity", "C. Pushing", "D. Pulling"},
                {"A. Time", "B. Mass", "C. Weight", "D. Force"},
                {"A. Wavelength", "B. Time period", "C. Frequency", "D. Amplitude"},
                {"A. Vein", "B. Artery", "C. Capillary", "D. Nerve"},
                {"A. Mantle", "B. Core", "C. Crust", "D. Atmosphere"}
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 900, 30);
            label2.setForeground(Color.GREEN);
            label2.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(label2);
        }

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 220), (i * 60 + 130), 220, 30);
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