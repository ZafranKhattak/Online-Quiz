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

        int correctAnswers[] = {
                1,  // Q1: Eliminate data redundancy and dependency
                1,  // Q2: Pointer stores the address; variable stores the value
                0,  // Q3: 2 (integer division)
                1,  // Q4: 2.5 (float division)
                1,  // Q5: int *ptr;
                0,  // Q6: Exit a loop or switch
                1,  // Q7: Skip the current iteration
                3,  // Q8: external (should be extern)
                1,  // Q9: x = 11, y = 11 (pre-increment)
                3,  // Q10: x = 11, y = 10 (post-increment)
                0,  // Q11: ? :
                0,  // Q12: !=
                0,  // Q13: &
                1,  // Q14: |
                2,  // Q15: ^
                1,  // Q16: The size of the variable in bytes
                2,  // Q17: return_type function_name(parameters);
                0,  // Q18: \0
                0,  // Q19: strcpy()
                0   // Q20: strcat()
        };

        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
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