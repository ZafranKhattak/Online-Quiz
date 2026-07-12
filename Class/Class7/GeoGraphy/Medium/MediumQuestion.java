package Class.Class7.GeoGraphy.Medium;


import Class.Class7.GeoGraphy.GeoGraphyDashboard.GeoGraphyDashboard;
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
                "Question 1: Which of the following is a change caused by internal forces of the Earth?",
                "Question 2: The idea that the Earth's surface is made up of several large plates is called:",
                "Question 3: When tectonic plates move towards each other, this is called:",
                "Question 4: Fold mountains are formed as a result of:",
                "Question 5: Which mountain range is an example of fold mountains?",
                "Question 6: When tectonic plates slide past each other, this movement is called:",
                "Question 7: The highest temperature in the atmosphere is found in the:",
                "Question 8: Which is the most important gas in the atmosphere for human survival?",
                "Question 9: The part of the atmosphere with the highest concentration of ozone is the:",
                "Question 10: Water covers approximately what percentage of the Earth's surface?",
                "Question 11: The movement of ocean water caused by the gravitational pull of the Moon and Sun is called:",
                "Question 12: A sudden and powerful ocean wave caused by an underwater earthquake is called:",
                "Question 13: Which type of forest is found in regions near the equator?",
                "Question 14: The natural vegetation of an area depends on:",
                "Question 15: What is the main advantage of road transport?",
                "Question 16: Which is the longest railway in the world?",
                "Question 17: The term \"Global Village\" refers to:",
                "Question 18: Which of the following is the quickest means of transport?",
                "Question 19: The Suez Canal connects:",
                "Question 20: What causes the movement of tectonic plates?"
        };

        String options[][] = {
                {"A. Weathering", "B. Erosion", "C. Earthquake", "D. Deposition"},
                {"A. Continental drift", "B. Plate tectonics", "C. Faulting", "D. Folding"},
                {"A. Divergent movement", "B. Convergent movement", "C. Transform movement", "D. Faulting"},
                {"A. Volcanic eruptions", "B. Faulting", "C. Convergent plate movement", "D. Erosion"},
                {"A. Sierra Nevada", "B. Harz Mountains", "C. Himalayas", "D. Baikal Rift"},
                {"A. Convergent", "B. Divergent", "C. Transform", "D. Subduction"},
                {"A. Troposphere", "B. Stratosphere", "C. Mesosphere", "D. Thermosphere"},
                {"A. Nitrogen", "B. Oxygen", "C. Carbon dioxide", "D. Argon"},
                {"A. Troposphere", "B. Stratosphere", "C. Mesosphere", "D. Exosphere"},
                {"A. 29%", "B. 50%", "C. 71%", "D. 90%"},
                {"A. Waves", "B. Currents", "C. Tides", "D. Tsunami"},
                {"A. Wave", "B. Tide", "C. Tsunami", "D. Current"},
                {"A. Coniferous forest", "B. Tropical rainforest", "C. Deciduous forest", "D. Tundra vegetation"},
                {"A. Climate", "B. Soil", "C. Relief", "D. All of the above"},
                {"A. Cheapest for long distances", "B. Door-to-door service", "C. Fastest means of transport", "D. Only for passengers"},
                {"A. Trans-Siberian Railway", "B. Orient Express", "C. Indian Railways", "D. Eurostar"},
                {"A. A village in all continents", "B. The world becoming a small place", "C. Villages connected by roads", "D. A type of settlement"},
                {"A. Road transport", "B. Railways", "C. Water transport", "D. Air transport"},
                {"A. Atlantic Ocean with Pacific Ocean", "B. Mediterranean Sea with Red Sea", "C. Red Sea with Arabian Sea", "D. Mediterranean Sea with Black Sea"},
                {"A. Wind and water", "B. Heat from the Earth's interior", "C. Gravity from the Moon", "D. Rotation of the Earth"}
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
            new GeoGraphyDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}
