package Class.Class8.GeoGraphy.Hard;

import Class.Class8.GeoGraphy.GeoGraphyDashboard.GeoGraphyDashboard;
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
                "Question 1: Which of the following is NOT a fossil fuel?",
                "Question 2: The International Geographic Conference was held in which year?",
                "Question 3: The study of different atmospheric conditions at different times that includes components of weather is called:",
                "Question 4: Political Geography was started in which year?",
                "Question 5: Which of the following ranges does Punjab NOT share a border with?",
                "Question 6: The average depth of the oceans is approximately:",
                "Question 7: The distance between Aswan and Skandera is approximately:",
                "Question 8: The density of the oceanic crust is:",
                "Question 9: The average annual rainfall in Punjab is:",
                "Question 10: The predominant soil type found in the agricultural fields of Punjab is:",
                "Question 11: What is the name of the famous festival celebrated in Punjab to mark the harvest of the Rabi crop?",
                "Question 12: Which river serves as a major tributary of the Indus River and flows through Punjab, Pakistan?",
                "Question 13: The study of water in streams, lakes, wells, and meltwater from ice sheets is the focus of which branch?",
                "Question 14: What is the name of the famous palace located in the city of Patiala, known for its architectural grandeur?",
                "Question 15: Which city is known as the \"Manchester of India\" due to its thriving textile industry?",
                "Question 16: What is the name of the traditional musical instrument commonly associated with Punjabi folk music?",
                "Question 17: Which of the following is NOT a branch of human geography?",
                "Question 18: The branch of geography that studies the events of the past with relation to their location and geographical factors is:",
                "Question 19: Which river forms the western boundary of Punjab, Pakistan?",
                "Question 20: The famous garden located in the city of Amritsar, known for its historical significance, is:"
        };

        String options[][] = {
                {"A. Coal", "B. Natural gas", "C. Uranium", "D. Petroleum"},
                {"A. 1891", "B. 1930", "C. 1958", "D. 1999"},
                {"A. Climatology", "B. Meteorology", "C. Hydrology", "D. Oceanography"},
                {"A. 1891", "B. 1930", "C. 1958", "D. 1999"},
                {"A. Himalayas", "B. Aravalli", "C. Sulaiman", "D. Vindhya"},
                {"A. 1.1 miles", "B. 2.2 miles", "C. 3.3 miles", "D. 4.4 miles"},
                {"A. 102 km", "B. 540 km", "C. 720 km", "D. 870 km"},
                {"A. 2", "B. 3", "C. 5", "D. 7"},
                {"A. 300-500 mm", "B. 500-800 mm", "C. 800-1000 mm", "D. 1000-1200 mm"},
                {"A. Alluvial soil", "B. Red soil", "C. Laterite soil", "D. Black soil"},
                {"A. Lohri", "B. Baisakhi", "C. Diwali", "D. Holi"},
                {"A. Chenab", "B. Jhelum", "C. Ravi", "D. Beas"},
                {"A. Oceanography", "B. Hydrology", "C. Geomorphology", "D. Climatology"},
                {"A. Sheesh Mahal", "B. Qila Mubarak", "C. Moti Bagh Palace", "D. Baradari Gardens"},
                {"A. Amritsar", "B. Jalandhar", "C. Ludhiana", "D. Patiala"},
                {"A. Sitar", "B. Tabla", "C. Harmonium", "D. Dhol"},
                {"A. Political Geography", "B. Historical Geography", "C. Environmental Geography", "D. Economic Geography"},
                {"A. Political Geography", "B. Economic Geography", "C. Historical Geography", "D. Urban Geography"},
                {"A. Indus", "B. Chenab", "C. Jhelum", "D. Beas"},
                {"A. Sheesh Mahal", "B. Baradari Gardens", "C. Jallianwala Bagh", "D. Shalimar Bagh"}
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
