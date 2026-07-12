package Class.Class11.ICS.Medium;

import Class.Class11.ICS.ICSDashboard.ICSDashboard;
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
                "Question 1: The SDLC (Software Development Life Cycle) consists of how many main phases?",
                "Question 2: The phase in SDLC where the actual coding takes place is called:",
                "Question 3: Which of the following is NOT a characteristic of an algorithm?",
                "Question 4: A visual representation of an algorithm using shapes and arrows is called:",
                "Question 5: The last phase of SDLC is:",
                "Question 6: The decimal equivalent of binary number 1010 is:",
                "Question 7: The binary equivalent of decimal number 15 is:",
                "Question 8: The decimal equivalent of hexadecimal 'A' is:",
                "Question 9: In Python, a variable declared with 'None' is of which type?",
                "Question 10: The identity operator 'is' in Python checks for:",
                "Question 11: Which of the following is NOT a valid Python keyword?",
                "Question 12: The range function in Python with one argument returns numbers from:",
                "Question 13: Which statement is used to exit a loop prematurely in Python?",
                "Question 14: Which statement is used to skip the current iteration and continue to the next in Python?",
                "Question 15: A tuple in Python is characterized by:",
                "Question 16: Which function is used to get the length of a string in Python?",
                "Question 17: The membership operator 'in' in Python checks if an element is:",
                "Question 18: A dictionary in Python stores data in:",
                "Question 19: The method used to add a new key-value pair to a dictionary is:",
                "Question 20: Which of the following is NOT a valid file extension for Python?"
        };

        String options[][] = {
                {"A. 4", "B. 5", "C. 6", "D. 7"},
                {"A. Planning", "B. Design", "C. Development/Implementation", "D. Maintenance"},
                {"A. Definiteness", "B. Finiteness", "C. Ambiguity", "D. Effectiveness"},
                {"A. Pseudocode", "B. Flowchart", "C. Structure chart", "D. Data flow diagram"},
                {"A. Testing", "B. Deployment", "C. Maintenance", "D. Design"},
                {"A. 8", "B. 9", "C. 10", "D. 11"},
                {"A. 1010", "B. 1100", "C. 1111", "D. 1001"},
                {"A. 8", "B. 9", "C. 10", "D. 11"},
                {"A. String", "B. NoneType", "C. Integer", "D. Boolean"},
                {"A. Value equality", "B. Memory location equality", "C. Type equality", "D. Size equality"},
                {"A. True", "B. False", "C. Null", "D. None"},
                {"A. 1 to n", "B. 0 to n-1", "C. 0 to n", "D. 1 to n-1"},
                {"A. exit", "B. stop", "C. break", "D. return"},
                {"A. skip", "B. continue", "C. pass", "D. next"},
                {"A. Mutability", "B. Immutability", "C. Variable length", "D. Dynamic typing"},
                {"A. length()", "B. len()", "C. count()", "D. size()"},
                {"A. Present in a sequence", "B. Absent in a sequence", "C. Equal to a value", "D. Greater than a value"},
                {"A. Key-value pairs", "B. Index-value pairs", "C. Only keys", "D. Only values"},
                {"A. add()", "B. insert()", "C. update()", "D. append()"},
                {"A. .py", "B. .pyc", "C. .pyth", "D. .pyw"}
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
            new ICSDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}