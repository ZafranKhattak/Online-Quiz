package Class.Class8.Maths.Medium;

import Class.Class8.Maths.MathsDashboard.MathsDashboard;
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
                "Question 1: The property that allows you to change the order of numbers in addition is called:",
                "Question 2: The property that allows you to group numbers differently in addition is called:",
                "Question 3: The square root of 144 is:",
                "Question 4: The cube root of 125 is:",
                "Question 5: A number whose square is 169 is:",
                "Question 6: A parallelogram with all sides equal and opposite angles equal is called a:",
                "Question 7: The solution of the equation x + 7 = 12 is:",
                "Question 8: The solution of the equation 2x = 16 is:",
                "Question 9: If a = 3 and b = 4, the value of a² + b² is:",
                "Question 10: The perimeter of a rectangle with length 8 cm and breadth 5 cm is:",
                "Question 11: The area of a triangle with base 10 cm and height 6 cm is:",
                "Question 12: The simple interest on Rs. 1000 at 5% per annum for 2 years is:",
                "Question 13: The sum of two consecutive natural numbers is 21. The numbers are:",
                "Question 14: The value of (2³)² is:",
                "Question 15: The number 0.75 as a percentage is:",
                "Question 16: The diagonal of a square with side 5 cm divides it into:",
                "Question 17: If x/3 = 5, then x is equal to:",
                "Question 18: A quadrilateral with one pair of opposite sides parallel is called:",
                "Question 19: The value of (-2)³ is:",
                "Question 20: The common factor of 12 and 18 is:"
        };

        String options[][] = {
                {"A. Commutative property", "B. Associative property", "C. Distributive property", "D. Identity property"},
                {"A. Commutative property", "B. Associative property", "C. Distributive property", "D. Identity property"},
                {"A. 10", "B. 11", "C. 12", "D. 13"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. 11", "B. 12", "C. 13", "D. 14"},
                {"A. Rectangle", "B. Rhombus", "C. Square", "D. Trapezium"},
                {"A. 3", "B. 4", "C. 5", "D. 6"},
                {"A. 4", "B. 6", "C. 8", "D. 10"},
                {"A. 12", "B. 16", "C. 20", "D. 25"},
                {"A. 13 cm", "B. 20 cm", "C. 26 cm", "D. 40 cm"},
                {"A. 20 cm²", "B. 30 cm²", "C. 40 cm²", "D. 60 cm²"},
                {"A. Rs. 50", "B. Rs. 100", "C. Rs. 150", "D. Rs. 200"},
                {"A. 10 and 11", "B. 9 and 12", "C. 8 and 13", "D. 7 and 14"},
                {"A. 32", "B. 64", "C. 128", "D. 256"},
                {"A. 25%", "B. 50%", "C. 75%", "D. 100%"},
                {"A. Two rectangles", "B. Two triangles", "C. Four triangles", "D. Two squares"},
                {"A. 5", "B. 10", "C. 15", "D. 20"},
                {"A. Parallelogram", "B. Rhombus", "C. Trapezium", "D. Kite"},
                {"A. 8", "B. -8", "C. 6", "D. -6"},
                {"A. 2", "B. 4", "C. 6", "D. 9"}
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