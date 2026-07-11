package Class.Class6.GeneralScience.Easy;

import javax.swing.*;

import Class.Class6.GeneralScience.GeneralScienceDashboard.GeneralScienceDashboard;

import java.awt.*;

public class EasyQuestion {

        public EasyQuestion() {

                JFrame frame = new JFrame();
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
                                "Question 1: Which of the following is NOT a basic component of food?",
                                "Question 2: A substance that dissolves in water is called:",
                                "Question 3: The root system of a plant that has one main root with smaller branches is called:",
                                "Question 4: The part of the flower that produces pollen is the:",
                                "Question 5: Humans are examples of:",
                                "Question 6: Which of the following is a method to separate grains from a harvested crop?",
                                "Question 7: The gas that is essential for respiration in humans and animals is:",
                                "Question 8: In a simple electric circuit, the switch is used to:",
                                "Question 9: Animals that eat only plants are called:",
                                "Question 10: The standard unit for measuring length is the:",
                                "Question 11: The part of the brain that controls all the activities of the body is the:",
                                "Question 12: Materials like glass that allow light to pass through them clearly are known as:",
                                "Question 13: The only planet in our solar system that is known to support life is:",
                                "Question 14: When two magnets are brought closer, their like poles will:",
                                "Question 15: The process by which plants make their own food using sunlight is called:",
                                "Question 16: A plant that has a woody stem and branches near the ground is called a:",
                                "Question 17: The movement of a swing is an example of which type of motion?",
                                "Question 18: The part of the body that protects our internal organs like the heart and lungs is the:",
                                "Question 19: A mixture of two or more pure substances is called a:",
                                "Question 20: The device that is used to find directions is called a:"
                };

                String options[][] = {
                                {
                                                "A. Carbohydrates",
                                                "B. Proteins",
                                                "C. Plastic",
                                                "D. Vitamins"
                                },
                                {
                                                "A. Insoluble",
                                                "B. Soluble",
                                                "C. Saturated",
                                                "D. Unsaturated"
                                },
                                {
                                                "A. Fibrous root",
                                                "B. Tap root",
                                                "C. Shoot root",
                                                "D. Stem root"
                                },
                                {
                                                "A. Ovary",
                                                "B. Sepal",
                                                "C. Stamen",
                                                "D. Petal"
                                },
                                {
                                                "A. Herbivores",
                                                "B. Carnivores",
                                                "C. Omnivores",
                                                "D. Decomposers"
                                },
                                {
                                                " A. Filtration",
                                                "B. Sedimentation",
                                                "C. Threshing",
                                                "D. Evaporation"
                                },
                                {
                                                "A. Nitrogen",
                                                "B. Oxygen",
                                                "C. Carbon dioxide",
                                                "D. Hydrogen"
                                },
                                {
                                                "A. Make the bulb glow brighter",
                                                "B. Connect the wires",
                                                "C. Complete or break the circuit",
                                                "D. Increase the electricity"
                                },
                                {
                                                "A. Omnivores",
                                                "B. Carnivores",
                                                "C. Insectivores",
                                                "D. Herbivores"
                                },
                                {
                                                "A. Handspan",
                                                "B. Cubit",
                                                "C. Metre",
                                                "D. Pace"
                                },
                                {
                                                "A. Cerebrum",
                                                "B. Cerebellum",
                                                "C. Medulla",
                                                "D. Spinal cord"
                                },
                                {
                                                "A. Transparent",
                                                "B. Translucent",
                                                "C. Opaque",
                                                "D. Reflective"
                                },
                                {

                                                "A. Mars",
                                                "B. Venus",
                                                "C. Earth",
                                                "D. Jupiter"
                                },
                                {

                                                "A. Attract each other",
                                                "B. Repel each other",
                                                "C. Stick together",
                                                "D. Cancel each other"
                                },
                                {

                                                "A. Respiration",
                                                "B. Transpiration",
                                                "C. Photosynthesis",
                                                "D. Germination"
                                },
                                {
                                                "A. Herb",
                                                "B. Shrub",
                                                "C. Tree",
                                                "D. Climber"
                                },
                                {

                                                "A. Rotatory",
                                                "B. Translatory",
                                                "C. Oscillatory",
                                                "D. Periodic"
                                },
                                {

                                                "A. Skull",
                                                "B. Rib cage",
                                                "C. Backbone",
                                                "D. Pelvis",
                                },
                                {

                                                "A. Compound",
                                                "B. Element",
                                                "C. Solution",
                                                "D. Mixture"
                                },
                                {

                                                "A. Barometer",
                                                "B. Thermometer",
                                                "C. Compass",
                                                "D. Ammeter"
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
                                btn.setBounds(80 + (j * 200), (i * 60 + 130), 150, 30);
                                btn.setForeground(Color.BLACK); // Optional: to match theme
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
