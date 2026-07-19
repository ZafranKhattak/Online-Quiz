package Class.Class11.ICS.Easy;

import Class.Class11.ICS.ICSDashboard.ICSDashboard;
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
                "Question 1: What is the basic purpose of software?",
                "Question 2: Which of the following is NOT an input device?",
                "Question 3: The brain of a computer is called the:",
                "Question 4: Which of the following is an example of system software?",
                "Question 5: The smallest unit of memory is called:",
                "Question 6: Which number system uses only 0 and 1?",
                "Question 7: A set of step-by-step instructions to solve a problem is called:",
                "Question 8: The process of finding and removing errors in a program is called:",
                "Question 9: Which of the following is a high-level programming language?",
                "Question 10: A translator that converts high-level language to machine language in one go is called:",
                "Question 11: The operator '==' is used for:",
                "Question 12: A variable that stores integer values is called:",
                "Question 13: Which of the following is NOT a valid data type in Python?",
                "Question 14: The Python function used to display output on the screen is:",
                "Question 15: Which symbol is used to write comments in Python?",
                "Question 16: A condition in an if statement must evaluate to:",
                "Question 17: A loop that runs a specified number of times is called:",
                "Question 18: A sequence of characters enclosed in quotes is called:",
                "Question 19: Which of the following is NOT a valid Python operator?",
                "Question 20: The term \"ICT\" stands for:"
        };

        String options[][] = {
                {"A. To create hardware", "B. To instruct the computer what to do", "C. To replace hardware", "D. To connect to the internet"},
                {"A. Keyboard", "B. Mouse", "C. Monitor", "D. Scanner"},
                {"A. Monitor", "B. Keyboard", "C. CPU", "D. Hard drive"},
                {"A. Microsoft Word", "B. Adobe Photoshop", "C. Windows Operating System", "D. Chrome Browser"},
                {"A. Byte", "B. Kilobyte", "C. Bit", "D. Megabyte"},
                {"A. Decimal number system", "B. Octal number system", "C. Binary number system", "D. Hexadecimal number system"},
                {"A. Algorithm", "B. Program", "C. Software", "D. Code"},
                {"A. Testing", "B. Debugging", "C. Compiling", "D. Interpreting"},
                {"A. Machine language", "B. Assembly language", "C. Python", "D. Binary language"},
                {"A. Interpreter", "B. Assembler", "C. Compiler", "D. Linker"},
                {"A. Assignment", "B. Comparison", "C. Addition", "D. Multiplication"},
                {"A. String", "B. Boolean", "C. Integer", "D. Float"},
                {"A. int", "B. float", "C. char", "D. bool"},
                {"A. input()", "B. output()", "C. print()", "D. display()"},
                {"A. //", "B. /*", "C. #", "D. --"},
                {"A. Integer", "B. Boolean (True or False)", "C. String", "D. Float"},
                {"A. while loop", "B. do-while loop", "C. for loop", "D. forever loop"},
                {"A. Integer", "B. Float", "C. String", "D. Boolean"},
                {"A. +", "B. -", "C. ×", "D. /"},
                {"A. Information and Communication Technology", "B. Internet and Computer Technology", "C. International Computer Training", "D. Integrated Circuit Technology"}
        };

        int correctAnswers[] = {
                1,  // Q1: To instruct the computer what to do
                2,  // Q2: Monitor
                2,  // Q3: CPU
                2,  // Q4: Windows Operating System
                2,  // Q5: Bit
                2,  // Q6: Binary number system
                0,  // Q7: Algorithm
                1,  // Q8: Debugging
                2,  // Q9: Python
                2,  // Q10: Compiler
                1,  // Q11: Comparison
                2,  // Q12: Integer
                2,  // Q13: char (Python doesn't have char, only str)
                2,  // Q14: print()
                2,  // Q15: #
                1,  // Q16: Boolean (True or False)
                2,  // Q17: for loop
                2,  // Q18: String
                2,  // Q19: × (Python uses * for multiplication)
                0   // Q20: Information and Communication Technology
        };

        // Create radio buttons and store them in a 2D array
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
            
            // Check each question
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
                if (percentage >= 80) {
                    grade = "Excellent!";
                } else if (percentage >= 60) {
                    grade = "Good!";
                } else if (percentage >= 40) {
                    grade = "Fair";
                } else {
                    grade = "Needs Improvement";
                }
                
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