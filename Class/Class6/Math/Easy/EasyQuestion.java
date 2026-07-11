package Class.Class6.Math.Easy;

import Class.Class6.Math.MathDashboard.MathDashboard;
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
                "Question 1: How many digits are used in our number system?",
                "Question 2: What is the smallest whole number?",
                "Question 3: Which number is a factor of every number?",
                "Question 4: What is the smallest prime number?",
                "Question 5: The face value of digit 4 in 23468 is:",
                "Question 6: A triangle has how many sides?",
                "Question 7: Which of the following is an odd number?",
                "Question 8: What is the place value of digit 2 in 4123?",
                "Question 9: Which number is neither prime nor composite?",
                "Question 10: All radii of a circle are of _____ length.",
                "Question 11: The diameter of a circle passes through the:",
                "Question 12: The symbol for 10 in Roman numerals is:",
                "Question 13: Which of the following is an even number?",
                "Question 14: The perimeter of a square with side 5 cm is:",
                "Question 15: 1 Crore = _____ million.",
                "Question 16: The number of prime numbers up to 25 is:",
                "Question 17: Which of the following is a prime number?",
                "Question 18: The smallest composite number is:",
                "Question 19: A quadrilateral has how many sides?",
                "Question 20: Which of the following is a multiple of 7?"
        };

        String options[][] = {
                {"A. 9", "B. 10", "C. 8", "D. 7"},
                {"A. 1", "B. 2", "C. 0", "D. 10"},
                {"A. 0", "B. 2", "C. 1", "D. 10"},
                {"A. 1", "B. 2", "C. 3", "D. 0"},
                {"A. 400", "B. 40", "C. 4", "D. 468"},
                {"A. 4", "B. 3", "C. 5", "D. 6"},
                {"A. 12", "B. 14", "C. 13", "D. 20"},
                {"A. 23", "B. 200", "C. 20", "D. 2"},
                {"A. 0", "B. 2", "C. 3", "D. 1"},
                {"A. different", "B. equal", "C. twice", "D. half"},
                {"A. circumference", "B. chord", "C. centre", "D. arc"},
                {"A. V", "B. L", "C. C", "D. X"},
                {"A. 13", "B. 15", "C. 16", "D. 19"},
                {"A. 25 cm", "B. 20 cm", "C. 10 cm", "D. 30 cm"},
                {"A. 1", "B. 10", "C. 100", "D. 1000"},
                {"A. 9", "B. 10", "C. 8", "D. 12"},
                {"A. 32", "B. 30", "C. 31", "D. 33"},
                {"A. 1", "B. 2", "C. 3", "D. 4"},
                {"A. 5", "B. 3", "C. 6", "D. 4"},
                {"A. 35", "B. 48", "C. 50", "D. 55"}
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 850, 30);
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
            new MathDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}