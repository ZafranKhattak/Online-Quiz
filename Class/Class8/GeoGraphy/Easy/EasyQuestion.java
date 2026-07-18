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
                { "A. A gulf", "B. A bay", "C. An island", "D. A peninsula" },
                { "A. Atlantic Ocean", "B. Pacific Ocean", "C. Indian Ocean", "D. Arctic Ocean" },
                { "A. Earth", "B. Mars", "C. Moon", "D. Sun" },
                { "A. Study", "B. Earth", "C. Water", "D. Air" },
                { "A. 30%", "B. 50%", "C. 62%", "D. 70%" },
                { "A. English", "B. Greek", "C. Persian", "D. Urdu" },
                { "A. Solar energy", "B. Wind energy", "C. Coal", "D. Hydropower" },
                { "A. Jupiter", "B. Earth", "C. Mercury", "D. Venus" },
                { "A. Tropical region", "B. Temperate region", "C. Polar region", "D. Equatorial region" },
                { "A. Cartography", "B. Geology", "C. Climatology", "D. Oceanography" },
                { "A. Wood", "B. Petroleum", "C. Water", "D. Sunlight" },
                { "A. Jupiter", "B. Earth", "C. Mars", "D. Venus" },
                { "A. Geology", "B. Meteorology", "C. Oceanography", "D. Cartography" },
                { "A. Yamuna", "B. Ganges", "C. Beas", "D. Sutlej" },
                { "A. Faisalabad", "B. Lahore", "C. Multan", "D. Rawalpindi" },
                { "A. Fishing", "B. Mining", "C. Agriculture", "D. Manufacturing" },
                { "A. 150 million km", "B. 300 million km", "C. 500 million km", "D. 720 million km" },
                { "A. Geology", "B. Meteorology", "C. Oceanography", "D. Cartography" },
                { "A. Weather", "B. Global warming", "C. Climate", "D. Climate change" },
                { "A. Atmosphere", "B. Hydrosphere", "C. Biosphere", "D. Lithosphere" }
        };

        int correctAnswers[] = {
                2, // Q1: An island
                1, // Q2: Pacific Ocean
                3, // Q3: Sun
                1, // Q4: Earth
                3, // Q5: 70%
                1, // Q6: Greek
                2, // Q7: Coal
                2, // Q8: Mercury
                0, // Q9: Tropical region
                0, // Q10: Cartography
                1, // Q11: Petroleum
                0, // Q12: Jupiter
                1, // Q13: Meteorology
                2, // Q14: Beas
                1, // Q15: Lahore
                2, // Q16: Agriculture
                0, // Q17: 150 million km
                2, // Q18: Oceanography
                1, // Q19: Global warming
                3 // Q20: Lithosphere
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                btn.setActionCommand(String.valueOf(j));
                group.add(btn);
                panel.add(btn);
                radioButtons[i][j] = btn;
            }
        }

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(80, 1280, 500, 30);
        resultLabel.setForeground(Color.YELLOW);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(resultLabel);

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            int score = 0;
            int totalQuestions = questions.length;

            // Check each question
            for (int i = 0; i < totalQuestions; i++) {
                for (int j = 0; j < 4; j++) {
                    if (radioButtons[i][j].isSelected() && j == correctAnswers[i]) {
                        score++;
                        break;
                    }
                }
            }

            int confirm = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to submit?",
                    "Confirm Submission",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                double percentage = (double) score / totalQuestions * 100;
                String grade;
                if (percentage >= 80) {
                    grade = "Excellent!";
                } else if (percentage >= 60) {
                    grade = "Good!";
                } else if (percentage >= 40) {
                    grade = "Fair";
                } else {
                    grade = "Needs Improvement";
                }

                String message = String.format(
                        "<html><body style='text-align: center;'>" +
                                "<h2>Quiz Results</h2>" +
                                "<p>Total Questions: %d</p>" +
                                "<p>Correct Answers: %d</p>" +
                                "<p>Wrong Answers: %d</p>" +
                                "<p>Percentage: %.1f%%</p>" +
                                "<p>Grade: %s</p>" +
                                "</body></html>",
                        totalQuestions, score, totalQuestions - score, percentage, grade);

                JOptionPane.showMessageDialog(null, message, "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
                resultLabel.setText(String.format("Score: %d/%d (%.1f%%)", score, totalQuestions, percentage));
            }
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