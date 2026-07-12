package Class.Class8.GeoGraphy.Easy;

import Class.Class8.GeoGraphy.GeoGraphyDashboard.GeoGraphyDashboard;
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
                "Question 1: A piece of land surrounded by water on all sides is called:",
                "Question 2: The largest ocean in the world is:",
                "Question 3: The centre of our solar system is:",
                "Question 4: The literal meaning of the word \"Geo\" is:",
                "Question 5: Water covers approximately what percentage of the globe?",
                "Question 6: The term \"Geography\" was derived from which language?",
                "Question 7: Which of the following is a non-renewable source of energy?",
                "Question 8: The smallest planet in the solar system is:",
                "Question 9: A region located between the Tropic of Cancer and the Tropic of Capricorn is known as the:",
                "Question 10: The study of maps is called:",
                "Question 11: Which of the following is a fossil fuel?",
                "Question 12: The largest planet in the solar system is:",
                "Question 13: The branch of geography that studies weather is called:",
                "Question 14: Which river forms the eastern boundary of Punjab, India?",
                "Question 15: The capital of Punjab province in Pakistan is:",
                "Question 16: The predominant occupation of people in rural areas of Punjab is:",
                "Question 17: The distance between the Earth and the Sun is approximately:",
                "Question 18: The branch of geography that deals with the study of oceans is called:",
                "Question 19: A gradual increase in average global temperature is called:",
                "Question 20: The outermost layer of the Earth's surface that is the habitat of humans is called:"
        };

        String options[][] = {
                {"A. A gulf", "B. A bay", "C. An island", "D. A peninsula"},
                {"A. Atlantic Ocean", "B. Pacific Ocean", "C. Indian Ocean", "D. Arctic Ocean"},
                {"A. Earth", "B. Mars", "C. Moon", "D. Sun"},
                {"A. Study", "B. Earth", "C. Water", "D. Air"},
                {"A. 30%", "B. 50%", "C. 62%", "D. 70%"},
                {"A. English", "B. Greek", "C. Persian", "D. Urdu"},
                {"A. Solar energy", "B. Wind energy", "C. Coal", "D. Hydropower"},
                {"A. Jupiter", "B. Earth", "C. Mercury", "D. Venus"},
                {"A. Tropical region", "B. Temperate region", "C. Polar region", "D. Equatorial region"},
                {"A. Cartography", "B. Geology", "C. Climatology", "D. Oceanography"},
                {"A. Wood", "B. Petroleum", "C. Water", "D. Sunlight"},
                {"A. Jupiter", "B. Earth", "C. Mars", "D. Venus"},
                {"A. Geology", "B. Meteorology", "C. Oceanography", "D. Cartography"},
                {"A. Yamuna", "B. Ganges", "C. Beas", "D. Sutlej"},
                {"A. Faisalabad", "B. Lahore", "C. Multan", "D. Rawalpindi"},
                {"A. Fishing", "B. Mining", "C. Agriculture", "D. Manufacturing"},
                {"A. 150 million km", "B. 300 million km", "C. 500 million km", "D. 720 million km"},
                {"A. Geology", "B. Meteorology", "C. Oceanography", "D. Cartography"},
                {"A. Weather", "B. Global warming", "C. Climate", "D. Climate change"},
                {"A. Atmosphere", "B. Hydrosphere", "C. Biosphere", "D. Lithosphere"}
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
            new GeoGraphyDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}