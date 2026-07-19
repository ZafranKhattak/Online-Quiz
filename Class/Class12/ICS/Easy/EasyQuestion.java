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

        int correctAnswers[] = {
                1,  // Q1: Database
                3,  // Q2: string (C does not have a built-in string data type)
                1,  // Q3: =
                2,  // Q4: for loop
                1,  // Q5: printf()
                0,  // Q6: scanf()
                0,  // Q7: int
                1,  // Q8: Function
                2,  // Q9: Both A and B
                0,  // Q10: //
                0,  // Q11: +
                1,  // Q12: float
                2,  // Q13: do-while loop
                0,  // Q14: ?
                0,  // Q15: Rows and columns
                0,  // Q16: Uniquely identify a record
                0,  // Q17: clrscr()
                1,  // Q18: &&
                1,  // Q19: DBMS
                2   // Q20: char
        };

        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
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