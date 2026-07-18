package Class.Class8.GeoGraphy.Medium;

import Class.Class8.GeoGraphy.GeoGraphyDashboard.GeoGraphyDashboard;
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
                "Question 1: The process of extracting minerals lying near the surface by simply digging them out is called:",
                "Question 2: Which continent is the highest producer of diamonds and gold?",
                "Question 3: The study of different types of features on the Earth's surface is known as:",
                "Question 4: Geography has how many main branches?",
                "Question 5: The closest star to the Sun is:",
                "Question 6: The actual shape of the Earth is:",
                "Question 7: Which branch of geography studies the political factors influenced by geographical features?",
                "Question 8: The branch that studies urban settlements, their location, and internal structure is:",
                "Question 9: Which of the following is a conventional source of energy?",
                "Question 10: The majority of people in the world live in which type of countries?",
                "Question 11: The branch of geography that deals with the study of population data is called:",
                "Question 12: Which Pakistani seaport handles about 60% of the country's cargo?",
                "Question 13: Which is NOT a characteristic of a base?",
                "Question 14: The process of using living organisms or their products to modify human health is called:",
                "Question 15: The study of resources and development of different countries is the focus of:",
                "Question 16: Which of the following is NOT a branch of physical geography?",
                "Question 17: The diameter of the Earth at the equator is approximately:",
                "Question 18: The farthest planet from the Sun is:",
                "Question 19: Which of the following is NOT a district in Punjab, India?",
                "Question 20: The traditional folk dance of Punjab known for its energetic movements is:"
        };

        String options[][] = {
                {"A. Shaft mining", "B. Open-cast mining", "C. Quarrying", "D. Drilling"},
                {"A. Asia", "B. South America", "C. Australia", "D. Africa"},
                {"A. Geomorphology", "B. Mineralogy", "C. Hydrology", "D. Geology"},
                {"A. 1", "B. 2", "C. 3", "D. 4"},
                {"A. Neptune", "B. Mercury", "C. Mars", "D. Venus"},
                {"A. Round", "B. Geoid", "C. Triangle", "D. Oval"},
                {"A. Economic Geography", "B. Political Geography", "C. Urban Geography", "D. Historical Geography"},
                {"A. Political Geography", "B. Economic Geography", "C. Urban Geography", "D. Historical Geography"},
                {"A. Solar power", "B. Wind energy", "C. Hydropower", "D. Thermal energy"},
                {"A. Developed", "B. Developing", "C. Industrialized", "D. Under-developed"},
                {"A. Demography", "B. Urban Geography", "C. Economic Geography", "D. Political Geography"},
                {"A. Port Qasim", "B. Port Gwadar", "C. Port of Karachi", "D. Port of Pasni"},
                {"A. Turns blue litmus paper red", "B. Turns red litmus paper blue", "C. Has a bitter taste", "D. Is slippery to touch"},
                {"A. Fermentation", "B. Genetic engineering", "C. Biotechnology", "D. Cloning"},
                {"A. Economic Geography", "B. Political Geography", "C. Urban Geography", "D. Historical Geography"},
                {"A. Geology", "B. Climatology", "C. Political Geography", "D. Geomorphology"},
                {"A. 10,746 km", "B. 12,076 km", "C. 12,746 km", "D. 20,076 km"},
                {"A. Jupiter", "B. Saturn", "C. Neptune", "D. Uranus"},
                {"A. Ludhiana", "B. Jhelum", "C. Amritsar", "D. Patiala"},
                {"A. Bhangra", "B. Kathak", "C. Bharatanatyam", "D. Kathakali"}
        };

        int correctAnswers[] = {
                1,  // Q1: Open-cast mining
                3,  // Q2: Africa
                0,  // Q3: Geomorphology
                1,  // Q4: 2
                3,  // Q5: Venus
                1,  // Q6: Geoid
                1,  // Q7: Political Geography
                2,  // Q8: Urban Geography
                3,  // Q9: Thermal energy
                1,  // Q10: Developing
                0,  // Q11: Demography
                2,  // Q12: Port of Karachi
                0,  // Q13: Turns blue litmus paper red
                2,  // Q14: Biotechnology
                0,  // Q15: Economic Geography
                2,  // Q16: Political Geography
                2,  // Q17: 12,746 km
                2,  // Q18: Neptune
                1,  // Q19: Jhelum
                0   // Q20: Bhangra
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
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
                    totalQuestions, score, totalQuestions - score, percentage, grade
                );
                
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