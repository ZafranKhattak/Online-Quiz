package Class.Class6.GeoGraphy.Hard;

import Class.Class6.GeoGraphy.GeaGraphyDashboard.GeaGraphy;
import javax.swing.*;
import java.awt.*;

public class DifficultQuestion {

    public DifficultQuestion() {

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
                "Question 1: If you are standing at the North Pole, in which direction would you travel to reach the equator?",
                "Question 2: If it is 12:00 noon at Greenwich, what is the time in India (IST is +5:30)?",
                "Question 3: Why do longitudes converge at the poles?",
                "Question 4: Distance between two longitudes is maximum at the:",
                "Question 5: On which date do equal days and nights occur worldwide?",
                "Question 6: During summer solstice, the South Pole experiences:",
                "Question 7: Earth's heat zones are caused by:",
                "Question 8: Moving from equator to poles, distance between meridians:",
                "Question 9: Earth's axis is tilted at:",
                "Question 10: Large-scale maps show:",
                "Question 11: Sun appears to rise in the east due to Earth's:",
                "Question 12: Equator has equal day and night all year because:",
                "Question 13: Vertical rays fall on Tropic of Cancer on:",
                "Question 14: Longitudes help in determining:",
                "Question 15: If scale is 1 cm = 10 km, distance of 7 cm on map equals:",
                "Question 16: Torrid Zone receives maximum heat because:",
                "Question 17: Political maps show:",
                "Question 18: If Earth stops rotating, one side would have:",
                "Question 19: Correct order of Earth's layers (outer to inner):",
                "Question 20: Time difference for 60° East longitude from Greenwich is:"
        };

        String options[][] = {
                {
                        "A. North",
                        "B. South",
                        "C. East",
                        "D. West"
                },
                {
                        "A. 6:30 AM",
                        "B. 6:30 PM",
                        "C. 5:30 PM",
                        "D. 7:30 AM"
                },
                {
                        "A. They are semicircles",
                        "B. They are parallel lines",
                        "C. They are circles",
                        "D. They are straight lines"
                },
                {
                        "A. Poles",
                        "B. Equator",
                        "C. Tropic of Cancer",
                        "D. Prime Meridian"
                },
                {
                        "A. June 21",
                        "B. March 21",
                        "C. December 22",
                        "D. July 1"
                },
                {
                        "A. 24 hours day",
                        "B. 24 hours night",
                        "C. Equal day and night",
                        "D. 12 hours day"
                },
                {
                        "A. Rainfall patterns",
                        "B. Sun's rays intensity",
                        "C. Ocean currents",
                        "D. Wind direction"
                },
                {
                        "A. Increases",
                        "B. Decreases",
                        "C. Remains same",
                        "D. Doubles"
                },
                {
                        "A. 23½°",
                        "B. 45°",
                        "C. 66½°",
                        "D. 90°"
                },
                {
                        "A. Large area, less detail",
                        "B. Small area, more detail",
                        "C. Whole world, less detail",
                        "D. Continents only"
                },
                {
                        "A. Revolution",
                        "B. Rotation",
                        "C. Tilt",
                        "D. Orbit"
                },
                {
                        "A. It is the largest circle",
                        "B. Sun rays fall vertically",
                        "C. It is midway between poles",
                        "D. It receives maximum heat"
                },
                {
                        "A. March 21",
                        "B. June 21",
                        "C. September 23",
                        "D. December 22"
                },
                {
                        "A. Climate zones",
                        "B. Local time",
                        "C. Population density",
                        "D. Soil types"
                },
                {
                        "A. 7 km",
                        "B. 10 km",
                        "C. 70 km",
                        "D. 700 km"
                },
                {
                        "A. Vertical sun rays",
                        "B. More land area",
                        "C. Near oceans",
                        "D. High mountains"
                },
                {
                        "A. Mountains and rivers",
                        "B. Boundaries and capitals",
                        "C. Climate zones",
                        "D. Population density"
                },
                {
                        "A. Equal day and night",
                        "B. Continuous day",
                        "C. No seasons",
                        "D. 12-hour cycle"
                },
                {
                        "A. Core, Mantle, Crust",
                        "B. Crust, Core, Mantle",
                        "C. Crust, Mantle, Core",
                        "D. Mantle, Core, Crust"
                },
                {
                        "A. 2 hours",
                        "B. 4 hours",
                        "C. 6 hours",
                        "D. 8 hours"
                }
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
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
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
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
        buttonBack.setFont(new Font("Arial", Font.BOLD, 15));
        buttonBack.addActionListener(e -> {

            new GeaGraphy();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}