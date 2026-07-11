package Class.Class6.GeoGraphy.Easy;

import Class.Class6.GeoGraphy.GeaGraphyDashboard.GeaGraphy;
import javax.swing.*;
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
        panel.setPreferredSize(new Dimension(1750, 1500));
        panel.setBackground(Color.BLACK);

        // ================= NOTES FOR QUIZ ================== //
        JLabel label = new JLabel();
        label.setLayout(null);
        label.setText("<html>There are four options.Select the correct one<br>Take your time.Best of Luck.</br></html");
        label.setBounds(450, 40, 550, 60);
        label.setForeground(Color.RED);
        label.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(label);

        // ================== JScrollPane =================== //

        JScrollPane scroll = new JScrollPane(panel);
        scroll.setBounds(0, 0, 1300, 700);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        frame.add(scroll);
        // ================== QUESTIONS LOGIC ==================;

        String questions[] = {
                "Question 1: The solid part of the Earth that includes all landmasses like mountains and plateaus is called:",
                "Question 2: What are the large landmasses surrounded by seas and oceans called?",
                "Question 3: Which is the largest continent in the world?",
                "Question 4: The large water bodies of the Earth are called:",
                "Question 5: Which is the largest ocean in the world?",
                "Question 6: The layer of gases that surrounds the Earth is called:",
                "Question 7: Which gas is most abundant in the atmosphere?",
                "Question 8: A map is drawn on a flat surface according to a:",
                "Question 9: What are the four main directions called?",
                "Question 10: Generally, water bodies are shown in which colour on a physical map?",
                "Question 11: The flat-topped tableland standing above the surrounding area is called a:",
                "Question 12: A small piece of land surrounded by water on all sides is called:",
                "Question 13: The Indian Ocean gets its name from:",
                "Question 14: Which continent is also known as the \"White Continent\" because it is covered with snow throughout the year?",
                "Question 15: What is the natural elevation of the Earth's surface with peaks and a broad base called?",
                "Question 16: Plains are generally very thickly populated because they are:",
                "Question 17: The narrow zone where land, water, and air meet and all life exists is called:",
                "Question 18: The height of all landmasses is measured from:",
                "Question 19: Moving air is called:",
                "Question 20: The Bering Strait connects the Arctic Ocean with which other ocean?"
        };

        String options[][] = {
                {
                        "A. Hydrosphere",
                        "B. Atmosphere",
                        "C. Lithosphere",
                        "D. Biosphere"
                },
                {
                        "A. Islands",
                        "B. Continents",
                        "C. Plateaus",
                        "D. Ranges"
                },
                {
                        "A. Africa",
                        "B. North America",
                        "C. Asia",
                        "D. Antarctica"
                },
                {
                        "A. Rivers",
                        "B. Lakes",
                        "C. Oceans",
                        "D. Ponds"
                },
                {
                        "A. Atlantic Ocean",
                        "B. Indian Ocean",
                        "C. Arctic Ocean",
                        "D. Pacific Ocean"
                },
                {
                        "A. Lithosphere",
                        "B. Hydrosphere",
                        "C. Atmosphere",
                        "D. Biosphere"
                },
                {
                        "A. Oxygen",
                        "B. Carbon dioxide",
                        "C. Nitrogen",
                        "D. Hydrogen"
                },
                {
                        "A. Symbol",
                        "B. Scale",
                        "C. Direction",
                        "D. Colour"
                },
                {
                        "A. Intermediate directions",
                        "B. Ordinal directions",
                        "C. Cardinal directions",
                        "D. Compass directions"
                },
                {
                        "A. Green",
                        "B. Blue",
                        "C. Brown",
                        "D. Yellow"
                },
                {
                        "A. Mountain",
                        "B. Plain",
                        "C. Plateau",
                        "D. Range"
                },
                {
                        "A. Peninsula",
                        "B. Island",
                        "C. Strait",
                        "D. Isthmus"
                },
                {
                        "A. A famous explorer",
                        "B. The country India",
                        "C. An ancient king",
                        "D. A sea animal"
                },
                {
                        "A. Europe",
                        "B. Australia",
                        "C. Antarctica",
                        "D. North America"
                },
                {
                        "A. Plateau",
                        "B. Plain",
                        "C. Mountain",
                        "D. Valley"
                },
                {
                        "A. Fertile and favourable for human activities",
                        "B. Covered with forests",
                        "C. Rich in minerals only",
                        "D. Very high above sea level"
                },
                {
                        "A. Lithosphere",
                        "B. Hydrosphere",
                        "C. Atmosphere",
                        "D. Biosphere"
                },
                {
                        "A. The highest mountain peak",
                        "B. The sea level",
                        "C. The centre of the Earth",
                        "D. The lowest valley"
                },
                {
                        "A. Breeze",
                        "B. Wind",
                        "C. Storm",
                        "D. Typhoon"
                },
                {
                        "A. Atlantic Ocean",
                        "B. Indian Ocean",
                        "C. Pacific Ocean",
                        "D. Southern Ocean"
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
        buttonSubmit.setFont(new Font("Arila", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            JOptionPane.showConfirmDialog(null, "You want to submit");
            JOptionPane.showMessageDialog(null, "Submitted Successfully");
        });
        panel.add(buttonSubmit);

        // =========================== BACK BUTTON FOR DASHBOARD OF LEVEL
        // ================ //
        JButton buttonBack = new JButton("BACK");
        buttonBack.setLayout(null);
        buttonBack.setBounds(450, 1340, 200, 30);
        buttonBack.setBackground(Color.BLUE);
        buttonBack.setForeground(Color.BLACK);
        buttonBack.setFont(new Font("Arila", Font.BOLD, 15));
        buttonBack.addActionListener(e -> {

            new GeaGraphy();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}
