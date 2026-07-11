package Class.Class6.GeneralScience.Medium;

import javax.swing.*;
import Class.Class6.GeneralScience.GeneralScienceDashboard.GeneralScienceDashboard;
import java.awt.*;

public class MediumQuestion {

        public MediumQuestion() {

                JFrame frame = new JFrame("Medium Question");
                frame.setVisible(true);
                frame.setSize(800, 700);
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // ================= JPANEL ======================//
                JPanel panel = new JPanel();
                panel.setLayout(null);
                panel.setBounds(0, 0, 1300, 700);
                panel.setBackground(Color.BLACK);
                panel.setPreferredSize(new Dimension(450, 1500)); // Height zyada
                frame.add(panel);

                // ================= NOTES FOR QUIZ ================== //
                JLabel label = new JLabel();
                label.setLayout(null);
                label.setText("<html>There are four options.Select the correct one<br>Take your time.Best of Luck.</br></html");
                label.setBounds(450, 40, 550, 60);
                label.setForeground(Color.RED);
                label.setFont(new Font("Arial", Font.ITALIC, 18));
                panel.add(label);

                // ================== JScrollbar =================== //
                JScrollPane scrol = new JScrollPane(panel);
                scrol.setBounds(0, 0, 1300, 700);
                scrol.setHorizontalScrollBar(null);
                scrol.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                scrol.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                frame.add(scrol);
                // ================== QUESTIONS LOGIC ==================;

                String questions[] = {
                                "Question 1: What is the basic unit of all living things?",
                                "Question 2: Which organ in the human body is responsible for the sense of sight?",
                                "Question 3: The process by which plants make their own food is called:",
                                "Question 4: Which of the following is an abiotic component of an environment?",
                                "Question 5: What is the smallest particle of an element?",
                                "Question 6: Which gas is the most abundant in the air we breathe?",
                                "Question 7: Water is known as a universal:",
                                "Question 8: The energy possessed by a moving object is called:",
                                "Question 9: A pulley is an example of a simple:",
                                "Question 10: The law of reflection states that the angle of incidence is equal to the angle of:",
                                "Question 11: Which of the following is a sense organ?",
                                "Question 12: What is the main function of the human skeleton?",
                                "Question 13: Which of the following is a natural satellite of the Earth?",
                                "Question 14: A mixture of sand and water can be separated by:",
                                "Question 15: Which of the following is a renewable source of energy?",
                                "Question 16: The instrument used to see very small objects like cells is called a:",
                                "Question 17: What is the function of the root in a plant?",
                                "Question 18: Which organ in the human body is used for hearing?",
                                "Question 19: The process of a liquid changing into a gas is called:",
                                "Question 20: Which of the following is an example of a compound?"
                };

                String options[][] = {
                                {
                                                "A. Organ",
                                                "B. Tissue",
                                                "C. Cell",
                                                "D. System"
                                },
                                {
                                                "A. Ear",
                                                "B. Nose",
                                                "C. Skin",
                                                "D. Eye"
                                },
                                {
                                                "A. Respiration",
                                                "B. Photosynthesis",
                                                "C. Transpiration",
                                                "D. Digestion"
                                },
                                {
                                                "A. Plants",
                                                "B. Animals",
                                                "C. Water",
                                                "D. Fungi"
                                },
                                {
                                                "A. Molecule",
                                                "B. Atom",
                                                "C. Compound",
                                                "D. Mixture"
                                },
                                {
                                                "A. Oxygen",
                                                "B. Carbon dioxide",
                                                "C. Nitrogen",
                                                "D. Hydrogen"
                                },
                                {
                                                "A. Solvent",
                                                "B. Suspension",
                                                "C. Solute",
                                                "D. Mixture"
                                },
                                {
                                                "A. Potential energy",
                                                "B. Kinetic energy",
                                                "C. Heat energy",
                                                "D. Sound energy"
                                },
                                {
                                                "A. Force",
                                                "B. Energy",
                                                "C. Machine",
                                                "D. Lever"
                                },
                                {
                                                "A. Refraction",
                                                "B. Absorption",
                                                "C. Transmission",
                                                "D. Reflection"
                                },
                                {
                                                "A. Heart",
                                                "B. Stomach",
                                                "C. Tongue",
                                                "D. Liver"
                                },
                                {
                                                "A. To produce food",
                                                "B. To provide support and protection",
                                                "C. To digest food",
                                                "D. To carry oxygen"
                                },
                                {
                                                "A. Sun",
                                                "B. Moon",
                                                "C. Mars",
                                                "D. Venus"
                                },
                                {
                                                "A. Filtration",
                                                "B. Evaporation",
                                                "C. Handpicking",
                                                "D. Winnowing"
                                },
                                {
                                                "A. Coal",
                                                "B. Natural gas",
                                                "C. Solar energy",
                                                "D. Petroleum"
                                },
                                {
                                                "A. Telescope",
                                                "B. Microscope",
                                                "C. Stethoscope",
                                                "D. Periscope"
                                },
                                {
                                                "A. To prepare food",
                                                "B. To absorb water and minerals",
                                                "C. To produce flowers",
                                                "D. To support the leaves"
                                },
                                {
                                                "A. Eye",
                                                "B. Skin",
                                                "C. Nose",
                                                "D. Ear"
                                },
                                {
                                                "A. Condensation",
                                                "B. Sublimation",
                                                "C. Evaporation",
                                                "D. Freezing"
                                },
                                {
                                                "A. Oxygen gas",
                                                "B. Salt (Sodium Chloride)",
                                                "C. Iron filings",
                                                "D. Air"
                                }
                };
                
                for (int i = 0; i < questions.length; i++) {
                        JLabel label2 = new JLabel(questions[i]);
                        // label2.setText(questions[i]);
                        label2.setBounds(80, 1 + (i * 60 + 100), 800, 30);
                        label2.setForeground(Color.GREEN);
                        label2.setFont(new Font("Arial", Font.BOLD, 16));
                        panel.add(label2);
                }

                for (int i = 0; i < options.length; i++) {
                        ButtonGroup group = new ButtonGroup();
                        for (int j = 0; j < 4; j++) {
                                JRadioButton btn = new JRadioButton(options[i][j]);
                                btn.setBounds(80 + (j * 200), (i * 60 + 130), 180, 30);
                                btn.setForeground(Color.WHITE);
                                btn.setBackground(Color.BLACK);
                                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                                group.add(btn);
                                panel.add(btn);
                        }
                }

                // ========================= BUTTON FOR SUBMIT ==================== //

                JButton buttonSubmit = new JButton("Submit");
                buttonSubmit.setLayout(null);
                buttonSubmit.setBounds(750, 1340, 200, 30);
                buttonSubmit.setBackground(Color.GREEN);
                buttonSubmit.setForeground(Color.BLACK);
                buttonSubmit.setFont(new Font("Arila" , Font.BOLD, 15));
                buttonSubmit.addActionListener(e -> {
                        JOptionPane.showConfirmDialog(null, "You want to submit");
                        JOptionPane.showMessageDialog(null, "Submitted Successfully");
                });
                panel.add(buttonSubmit);

                // =========================== BACK BUTTON FOR DASHBOARD OF LEVEL ================ //
                JButton buttonBack = new JButton("BACK");
                buttonBack.setLayout(null);
                buttonBack.setBounds(450, 1340, 200, 30);
                buttonBack.setBackground(Color.BLUE);
                buttonBack.setForeground(Color.BLACK);
                buttonBack.setFont(new Font("Arila" , Font.BOLD, 15));
                buttonBack.addActionListener(e -> {
                        
                        new GeneralScienceDashboard();
                        frame.dispose();
                });
                panel.add(buttonBack);
        }
}