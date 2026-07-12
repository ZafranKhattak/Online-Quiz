package Class.Class12.ICS.Easy;

import Class.Class12.ICS.ICSDashboard.ICSDashboard;
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
                "Question 1: A collection of related data is called a:",
                "Question 2: Which of the following is NOT a valid data type in C language?",
                "Question 3: The operator used for assignment in C is:",
                "Question 4: A loop that runs a specified number of times is called:",
                "Question 5: Which function is used to print output in C?",
                "Question 6: Which function is used to take input in C?",
                "Question 7: A variable that stores integer values is declared using:",
                "Question 8: A block of code that performs a specific task is called a:",
                "Question 9: The main function in C is written as:",
                "Question 10: The symbol used for comments in C is:",
                "Question 11: Which of the following is a valid C operator for addition?",
                "Question 12: The data type for storing decimal numbers is:",
                "Question 13: The loop that executes at least once is:",
                "Question 14: A conditional operator in C is:",
                "Question 15: A table in a database consists of:",
                "Question 16: A primary key is used to:",
                "Question 17: The function used to clear the screen in C is:",
                "Question 18: Which of the following is a logical operator in C?",
                "Question 19: A database management system is abbreviated as:",
                "Question 20: The data type for storing a single character is:"
        };

        String options[][] = {
                {"A. File", "B. Database", "C. Table", "D. Query"},
                {"A. int", "B. float", "C. char", "D. string"},
                {"A. ==", "B. =", "C. :=", "D. equal"},
                {"A. while loop", "B. do-while loop", "C. for loop", "D. forever loop"},
                {"A. scanf()", "B. printf()", "C. cout", "D. display()"},
                {"A. scanf()", "B. printf()", "C. cin", "D. get()"},
                {"A. int", "B. float", "C. char", "D. double"},
                {"A. Loop", "B. Function", "C. Variable", "D. Constant"},
                {"A. void main()", "B. int main()", "C. Both A and B", "D. start()"},
                {"A. //", "B. /*", "C. #", "D. --"},
                {"A. +", "B. -", "C. *", "D. /"},
                {"A. int", "B. float", "C. char", "D. bool"},
                {"A. for loop", "B. while loop", "C. do-while loop", "D. forever loop"},
                {"A. ?", "B. ==", "C. !=", "D. &&"},
                {"A. Rows and columns", "B. Only rows", "C. Only columns", "D. Cells"},
                {"A. Uniquely identify a record", "B. Store duplicate values", "C. Sort data", "D. Delete data"},
                {"A. clrscr()", "B. clear()", "C. cls()", "D. clean()"},
                {"A. +", "B. &&", "C. =", "D. %"},
                {"A. DMS", "B. DBMS", "C. DBM", "D. DSM"},
                {"A. int", "B. float", "C. char", "D. double"}
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
            new ICSDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}