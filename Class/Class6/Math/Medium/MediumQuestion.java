package Class.Class6.Math.Medium;

import Class.Class6.Math.MathDashboard.MathDashboard;
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
                "Question 1: The difference between place value and face value of 5 in 76542 is:",
                "Question 2: Which of the following are in ascending order?",
                "Question 3: The L.C.M. of two co-prime numbers is 143. If one number is 11, the other number is:",
                "Question 4: XCIX + XLVI = _____.",
                "Question 5: H.C.F. of 25 and 45 is:",
                "Question 6: Which of the following number is divisible by 4?",
                "Question 7: The diameter of a circle is 12 cm. The radius is:",
                "Question 8: If radius of a circle is 5 cm, the diameter is:",
                "Question 9: Which of the following pair is co-prime?",
                "Question 10: The greatest 4-digit number using 1, 5, 2, 9 once is:",
                "Question 11: CLXVI = _____.",
                "Question 12: Prime factorisation of 84 is:",
                "Question 13: 5 × 10000 + 3 × 100 + 2 × 10 + 2 = _____.",
                "Question 14: Which number is divisible by 8?",
                "Question 15: Which is the smallest 4-digit number using 2, 0, 3, 7 once?",
                "Question 16: How many four-digit numbers are there?",
                "Question 17: The successor of a whole number is:",
                "Question 18: A number which has more than two factors is called:",
                "Question 19: Rounded off 7213 to nearest thousands is:",
                "Question 20: The longest chord of a circle is:"
        };

        String options[][] = {
                {"A. 537", "B. 45", "C. 0", "D. 495"},
                {"A. 217, 271, 127, 721", "B. 127, 217, 271, 721", "C. 721, 271, 217, 127", "D. 217, 127, 721, 271"},
                {"A. 132", "B. 154", "C. 18", "D. 13"},
                {"A. CVL", "B. CLV", "C. CXLV", "D. CXLIV"},
                {"A. 15", "B. 5", "C. 225", "D. 135"},
                {"A. 52369", "B. 25746", "C. 21564", "D. 83426"},
                {"A. 24 cm", "B. 6 cm", "C. 3 cm", "D. 12 cm"},
                {"A. 15 cm", "B. 5 cm", "C. 25 cm", "D. 10 cm"},
                {"A. (12, 25)", "B. (18, 27)", "C. (25, 35)", "D. (21, 56)"},
                {"A. 9215", "B. 9512", "C. 5912", "D. 9521"},
                {"A. 164", "B. 144", "C. 176", "D. 166"},
                {"A. 2×2×3×2×7", "B. 7×2×3×3", "C. 2×3×7×2", "D. 3×2×3×2×7"},
                {"A. 5322", "B. 53022", "C. 50322", "D. 53202"},
                {"A. 123568", "B. 412580", "C. 258124", "D. 453230"},
                {"A. 0237", "B. 2037", "C. 7320", "D. 7023"},
                {"A. 9999", "B. 9900", "C. 9000", "D. 9990"},
                {"A. 2 more", "B. 1 less", "C. 1 more", "D. same"},
                {"A. prime", "B. composite", "C. odd", "D. even"},
                {"A. 7200", "B. 7000", "C. 7210", "D. 7213"},
                {"A. radius", "B. diameter", "C. arc", "D. segment"}
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
            new MathDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}