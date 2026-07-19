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

        int correctAnswers[] = {
                1,  // Q1: 5 (Planning, Analysis, Design, Implementation, Maintenance)
                2,  // Q2: Development/Implementation
                2,  // Q3: Ambiguity (Algorithm must be unambiguous)
                1,  // Q4: Flowchart
                2,  // Q5: Maintenance
                2,  // Q6: 10 (1×8 + 0×4 + 1×2 + 0×1 = 10)
                2,  // Q7: 1111 (8+4+2+1=15)
                2,  // Q8: 10 (A = 10 in hexadecimal)
                1,  // Q9: NoneType
                1,  // Q10: Memory location equality
                2,  // Q11: Null (Null is not a Python keyword)
                1,  // Q12: 0 to n-1
                2,  // Q13: break
                1,  // Q14: continue
                1,  // Q15: Immutability
                1,  // Q16: len()
                0,  // Q17: Present in a sequence
                0,  // Q18: Key-value pairs
                2,  // Q19: update()
                2   // Q20: .pyth (Python files use .py, .pyc, .pyw)
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