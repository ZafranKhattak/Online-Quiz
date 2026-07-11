package Class.Class6.GeoGraphy.Medium;

import Class.Class6.GeoGraphy.GeaGraphyDashboard.GeaGraphy;
import javax.swing.*;
import java.awt.*;

public class MediumQuestion {

    public MediumQuestion() {

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
                "Question 1: The word \"Geography\" is derived from two Greek words. What do \"Geo\" and \"Graphy\" mean respectively?",
                "Question 2: The line of longitude that passes through Greenwich, England, and is used as the reference for measuring time is called the:",
                "Question 3: On a physical map, plains are generally shown in which colour, and mountains in which colour?",
                "Question 4: The Earth is divided into three main layers based on its internal structure. Which is the correct order from outermost to innermost?",
                "Question 5: Why are plains generally the most thickly populated regions of the world?",
                "Question 6: What is the approximate distance between the Earth's surface and its centre?",
                "Question 7: The Bering Strait connects the Arctic Ocean with which other ocean?",
                "Question 8: Which of the following statements about the Northern and Southern Hemispheres is correct according to the textbook?",
                "Question 9: What is the name of the deepest part of the Earth, which is located in the Pacific Ocean?",
                "Question 10: Which of the following is a narrow and shallow stretch of water connecting two larger water bodies?",
                "Question 11: The process by which rocks are formed from the solidification of molten material (lava or magma) is used to classify which type of rocks?",
                "Question 12: Why do we not feel the Earth moving, even though it rotates at a speed of about 100 kilometers per hour?",
                "Question 13: Which continent is known as the \"White Continent\" and is the only uninhabited continent due to its extreme cold climate?",
                "Question 14: What is the main difference between weather and climate as studied in geography?",
                "Question 15: Which of the following is the largest ocean and which is the smallest ocean in the world?",
                "Question 16: The Earth's axis is tilted at an angle of:",
                "Question 17: The three main components of a map that help us to read and understand it are distance, direction, and:",
                "Question 18: The outermost part of the Earth, on which oceans and continents exist, is known as the:",
                "Question 19: Which ocean is the busiest in terms of ocean routes and promotes trade and commerce between North America and Europe?",
                "Question 20: In a map, which of the following intermediate directions helps to locate a place more accurately?"
        };

        String options[][] = {
                {
                        "A. Earth and Description",
                        "B. Land and Study",
                        "C. World and Mapping",
                        "D. Nature and Science"
                },
                {
                        "A. Tropic of Cancer",
                        "B. Equator",
                        "C. Prime Meridian",
                        "D. International Date Line"
                },
                {
                        "A. Blue and Brown",
                        "B. Green and Brown",
                        "C. Yellow and Green",
                        "D. Brown and Blue"
                },
                {
                        "A. Core, Mantle, Crust",
                        "B. Mantle, Crust, Core",
                        "C. Crust, Mantle, Core",
                        "D. Core, Crust, Mantle"
                },
                {
                        "A. They are rich in minerals and forests",
                        "B. They are fertile and favourable for human activities like farming and construction",
                        "C. They have a very cold climate which preserves food",
                        "D. They are located along the coast for fishing"
                },
                {
                        "A. 12750 kilometers",
                        "B. 510 million kilometers",
                        "C. 6371 kilometers",
                        "D. 40,000 kilometers"
                },
                {
                        "A. Atlantic Ocean",
                        "B. Indian Ocean",
                        "C. Pacific Ocean",
                        "D. Southern Ocean"
                },
                {
                        "A. Both hemispheres have equal amounts of land and water",
                        "B. The Northern Hemisphere is known as the \"Land Hemisphere\"",
                        "C. The Southern Hemisphere is known as the \"Land Hemisphere\"",
                        "D. Both hemispheres are completely covered by water"
                },
                {
                        "A. The Dead Sea",
                        "B. The Mariana Trench",
                        "C. The Grand Canyon",
                        "D. The Deccan Plateau"
                },
                {
                        "A. Isthmus",
                        "B. Strait",
                        "C. Peninsula",
                        "D. Gulf"
                },
                {
                        "A. Sedimentary Rocks",
                        "B. Metamorphic Rocks",
                        "C. Igneous Rocks",
                        "D. Fossil Rocks"
                },
                {
                        "A. Because the Earth is very large and we move with it",
                        "B. Because the Earth's movement is too slow to be felt",
                        "C. Because the Earth's atmosphere absorbs all the motion",
                        "D. Because the Earth only moves at night"
                },
                {
                        "A. Europe",
                        "B. Australia",
                        "C. Antarctica",
                        "D. North America"
                },
                {
                        "A. Weather is the condition of the atmosphere for a long period, while climate is for a short period",
                        "B. Weather is the condition of the atmosphere at a particular place and time, while climate is the average weather over a long period",
                        "C. Weather and climate are exactly the same thing",
                        "D. Weather is studied by geographers, while climate is studied by biologists"
                },
                {
                        "A. Atlantic and Arctic",
                        "B. Pacific and Arctic",
                        "C. Pacific and Southern",
                        "D. Indian and Northern"
                },
                {
                        "A. 23.5 degrees",
                        "B. 66.5 degrees",
                        "C. 90 degrees",
                        "D. 45 degrees"
                },
                {
                        "A. Colour",
                        "B. Scale",
                        "C. Symbol",
                        "D. Title"
                },
                {
                        "A. Mantle",
                        "B. Core",
                        "C. Crust",
                        "D. Fault"
                },
                {
                        "A. Pacific Ocean",
                        "B. Indian Ocean",
                        "C. Arctic Ocean",
                        "D. Atlantic Ocean"
                },
                {
                        "A. North and South",
                        "B. East and West",
                        "C. North-East (NE) and South-West (SW)",
                        "D. Up and Down"
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
                btn.setBounds(80 + (j * 200), (i * 60 + 130), 200, 30);
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