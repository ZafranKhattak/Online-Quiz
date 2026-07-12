package Class.Class8.Maths.Hard;

import Class.Class8.Maths.MathDashboard.MathsDashboard;
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
                "Question 1: The rational number that is neither positive nor negative is:",
                "Question 2: The reciprocal of -3/5 is:",
                "Question 3: The product of two rational numbers is 1 if they are:",
                "Question 4: The solution of the equation 3x + 5 = 20 is:",
                "Question 5: The solution of the equation x/4 - 2 = 3 is:",
                "Question 6: A polygon with 8 sides is called an:",
                "Question 7: The number of diagonals in a quadrilateral is:",
                "Question 8: If x varies directly as y and x = 10 when y = 5, the value of x when y = 8 is:",
                "Question 9: The compound interest on Rs. 2000 at 10% per annum for 2 years is:",
                "Question 10: The factorization of x² - 9 is:",
                "Question 11: The factorization of x² + 5x + 6 is:",
                "Question 12: The area of a trapezium with parallel sides 10 cm and 6 cm and height 5 cm is:",
                "Question 13: The surface area of a cube with side 4 cm is:",
                "Question 14: The volume of a cube with side 3 cm is:",
                "Question 15: If two quantities are in inverse proportion, then their product is always:",
                "Question 16: The square root of a number that is not a perfect square is:",
                "Question 17: The value of (a + b)² is:",
                "Question 18: The value of (a - b)² is:",
                "Question 19: If the volume of a cube is 216 cm³, the length of its edge is:",
                "Question 20: The median of the data 3, 7, 9, 12, 15 is:"
        };

        String options[][] = {
                {"A. 0", "B. 1", "C. -1", "D. 1/2"},
                {"A. -3/5", "B. 3/5", "C. -5/3", "D. 5/3"},
                {"A. Equal", "B. Reciprocals", "C. Opposite", "D. Identical"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. 10", "B. 15", "C. 20", "D. 25"},
                {"A. Hexagon", "B. Heptagon", "C. Octagon", "D. Nonagon"},
                {"A. 1", "B. 2", "C. 3", "D. 4"},
                {"A. 12", "B. 14", "C. 16", "D. 18"},
                {"A. Rs. 400", "B. Rs. 420", "C. Rs. 440", "D. Rs. 460"},
                {"A. (x - 3)(x - 3)", "B. (x + 3)(x + 3)", "C. (x - 3)(x + 3)", "D. (x - 9)(x + 1)"},
                {"A. (x + 2)(x + 3)", "B. (x + 2)(x + 4)", "C. (x + 3)(x + 3)", "D. (x + 1)(x + 6)"},
                {"A. 30 cm²", "B. 40 cm²", "C. 50 cm²", "D. 60 cm²"},
                {"A. 64 cm²", "B. 72 cm²", "C. 80 cm²", "D. 96 cm²"},
                {"A. 9 cm³", "B. 18 cm³", "C. 27 cm³", "D. 36 cm³"},
                {"A. Zero", "B. One", "C. Constant", "D. Variable"},
                {"A. A rational number", "B. An irrational number", "C. A natural number", "D. A whole number"},
                {"A. a² + b²", "B. a² + 2ab + b²", "C. a² - 2ab + b²", "D. a² + 2a + b²"},
                {"A. a² + b²", "B. a² + 2ab + b²", "C. a² - 2ab + b²", "D. a² - 2a + b²"},
                {"A. 4 cm", "B. 5 cm", "C. 6 cm", "D. 7 cm"},
                {"A. 7", "B. 9", "C. 10", "D. 12"}
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
            new MathsDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}