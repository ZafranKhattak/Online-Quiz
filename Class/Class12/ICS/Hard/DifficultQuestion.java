package Class.Class12.ICS.Hard;

import Class.Class12.ICS.ICSDashboard.ICSDashboard;
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
                "Question 1: The concept of normalization in databases is used to:",
                "Question 2: In C language, the difference between the pointer and the variable is:",
                "Question 3: The output of printf(\"%d\", 5/2); in C is:",
                "Question 4: The output of printf(\"%f\", 5.0/2); in C is:",
                "Question 5: Which of the following is the correct way to declare a pointer in C?",
                "Question 6: The break statement in C is used to:",
                "Question 7: The continue statement in C is used to:",
                "Question 8: Which of the following is NOT a valid storage class in C?",
                "Question 9: The result of x = 10; y = ++x; in C is:",
                "Question 10: The result of x = 10; y = x++; in C is:",
                "Question 11: The ternary operator in C is represented as:",
                "Question 12: The relational operator for \"not equal to\" in C is:",
                "Question 13: The bitwise operator for AND in C is:",
                "Question 14: The bitwise operator for OR in C is:",
                "Question 15: The bitwise operator for XOR in C is:",
                "Question 16: The sizeof() operator in C returns:",
                "Question 17: The correct syntax to declare a function in C is:",
                "Question 18: In C, a string is terminated by:",
                "Question 19: The function to copy a string in C is:",
                "Question 20: The function to concatenate two strings in C is:"
        };

        String options[][] = {
                {"A. Increase data redundancy", "B. Eliminate data redundancy and dependency", "C. Add more tables", "D. Merge tables"},
                {"A. Pointer stores the value; variable stores the address", "B. Pointer stores the address; variable stores the value", "C. Both store the same thing", "D. Pointer cannot be used"},
                {"A. 2", "B. 2.5", "C. 3", "D. 2.0"},
                {"A. 2", "B. 2.5", "C. 3", "D. 2.0"},
                {"A. int ptr;", "B. int *ptr;", "C. *int ptr;", "D. pointer int ptr;"},
                {"A. Exit a loop or switch", "B. Skip the current iteration", "C. Continue the loop", "D. Return a value"},
                {"A. Exit a loop", "B. Skip the current iteration", "C. Terminate the program", "D. Return a value"},
                {"A. auto", "B. register", "C. static", "D. external"},
                {"A. x = 10, y = 10", "B. x = 11, y = 11", "C. x = 11, y = 10", "D. x = 10, y = 11"},
                {"A. x = 10, y = 10", "B. x = 11, y = 11", "C. x = 11, y = 10", "D. x = 10, y = 11"},
                {"A. ? :", "B. ? ;", "C. : ?", "D. ; ?"},
                {"A. !=", "B. <>", "C. ¬=", "D. /="},
                {"A. &", "B. |", "C. ^", "D. ~"},
                {"A. &", "B. |", "C. ^", "D. ~"},
                {"A. &", "B. |", "C. ^", "D. ~"},
                {"A. The value of the variable", "B. The size of the variable in bytes", "C. The address of the variable", "D. The type of the variable"},
                {"A. return_type function_name(parameters)", "B. function_name(parameters) return_type", "C. return_type function_name(parameters);", "D. function_name(parameters) : return_type"},
                {"A. \\0", "B. \\n", "C. \\t", "D. \\b"},
                {"A. strcpy()", "B. strcopy()", "C. copy()", "D. string_copy()"},
                {"A. strcat()", "B. strconcat()", "C. concat()", "D. string_append()"}
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
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
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