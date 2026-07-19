package Class.Class12.ICS.Medium;

import Class.Class12.ICS.ICSDashboard.ICSDashboard;
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
                "Question 1: The relational database model was proposed by:",
                "Question 2: A field in a database table is also called:",
                "Question 3: A record in a database table is also called:",
                "Question 4: A foreign key is used to:",
                "Question 5: Which of the following is NOT a DDL command?",
                "Question 6: Which of the following is a DML command?",
                "Question 7: The default return type of the main function in C is:",
                "Question 8: Which of the following is a valid C keyword?",
                "Question 9: The format specifier for an integer in C is:",
                "Question 10: The format specifier for a float in C is:",
                "Question 11: The format specifier for a character in C is:",
                "Question 12: An array in C stores:",
                "Question 13: The index of the first element of an array in C is:",
                "Question 14: The size of int data type in C is typically:",
                "Question 15: A recursive function in C is a function that:",
                "Question 16: The NULL character in C is represented as:",
                "Question 17: The escape sequence for a new line in C is:",
                "Question 18: A file in C is opened using the function:",
                "Question 19: A file is closed in C using the function:",
                "Question 20: The mode \"w\" in fopen() is used for:"
        };

        String options[][] = {
                {"A. Charles Babbage", "B. E.F. Codd", "C. Alan Turing", "D. Bill Gates"},
                {"A. Record", "B. Attribute", "C. Tuple", "D. Row"},
                {"A. Field", "B. Attribute", "C. Tuple", "D. Column"},
                {"A. Uniquely identify a record", "B. Establish a relationship between tables", "C. Store duplicate values", "D. Delete records"},
                {"A. CREATE", "B. ALTER", "C. DROP", "D. SELECT"},
                {"A. CREATE", "B. ALTER", "C. INSERT", "D. DROP"},
                {"A. void", "B. int", "C. float", "D. char"},
                {"A. integer", "B. float", "C. character", "D. decimal"},
                {"A. %d", "B. %f", "C. %c", "D. %s"},
                {"A. %d", "B. %f", "C. %c", "D. %s"},
                {"A. %d", "B. %f", "C. %c", "D. %s"},
                {"A. Only integers", "B. Only floats", "C. Multiple values of the same data type", "D. Multiple values of different data types"},
                {"A. 1", "B. 0", "C. -1", "D. 2"},
                {"A. 1 byte", "B. 2 bytes", "C. 4 bytes", "D. 8 bytes"},
                {"A. Calls itself", "B. Calls another function", "C. Does not return a value", "D. Has no parameters"},
                {"A. \\0", "B. \\n", "C. \\t", "D. \\b"},
                {"A. \\0", "B. \\n", "C. \\t", "D. \\b"},
                {"A. open()", "B. fopen()", "C. file_open()", "D. fread()"},
                {"A. close()", "B. fclose()", "C. file_close()", "D. fwrite()"},
                {"A. Reading a file", "B. Writing to a file", "C. Appending to a file", "D. Reading and writing"}
        };

        int correctAnswers[] = {
                1,  // Q1: E.F. Codd
                1,  // Q2: Attribute
                2,  // Q3: Tuple
                1,  // Q4: Establish a relationship between tables
                3,  // Q5: SELECT (it's a DML command)
                2,  // Q6: INSERT
                0,  // Q7: void
                0,  // Q8: integer
                0,  // Q9: %d
                1,  // Q10: %f
                2,  // Q11: %c
                2,  // Q12: Multiple values of the same data type
                1,  // Q13: 0
                2,  // Q14: 4 bytes
                0,  // Q15: Calls itself
                0,  // Q16: \0
                1,  // Q17: \n
                1,  // Q18: fopen()
                1,  // Q19: fclose()
                1   // Q20: Writing to a file
        };

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
                if (percentage >= 80) grade = "Excellent!";
                else if (percentage >= 60) grade = "Good!";
                else if (percentage >= 40) grade = "Fair";
                else grade = "Needs Improvement";
                
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
            new ICSDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}