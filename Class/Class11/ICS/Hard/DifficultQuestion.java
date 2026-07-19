package Class.Class11.ICS.Hard;

import Class.Class11.ICS.ICSDashboard.ICSDashboard;
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
                "Question 1: The function of an operating system includes:",
                "Question 2: The concept of \"thinking outside the box\" in problem-solving refers to:",
                "Question 3: The process of repeating a process for improvement based on feedback is called:",
                "Question 4: Which of the following is an emerging technology?",
                "Question 5: The legal protection of inventions, designs, and original works is called:",
                "Question 6: Unauthorized reproduction or distribution of copyrighted software is called:",
                "Question 7: Malware is a combination of:",
                "Question 8: A virus that infects the boot sector of a disk is called:",
                "Question 9: A virus that is activated on a specific date or time is called:",
                "Question 10: Which of the following is NOT a valid anti-virus program?",
                "Question 11: The IT Act in Pakistan was enacted in which year?",
                "Question 12: Proper disposal of used electronic devices is known as:",
                "Question 13: In Python, the math module is imported using:",
                "Question 14: The 'random' module in Python provides the function:",
                "Question 15: A method of identifying a person through biological traits is called:",
                "Question 16: An iterative statement in Python that executes as long as a condition is True is called:",
                "Question 17: In Python, the power function from the math module is:",
                "Question 18: De Morgan's laws are related to:",
                "Question 19: The truth table of NAND gate is the inverse of:",
                "Question 20: The concept of 'digital footprints' refers to:"
        };

        String options[][] = {
                {"A. Process management", "B. Memory management", "C. File system management", "D. All of the above"},
                {"A. Using traditional methods", "B. Finding new and creative perspectives", "C. Ignoring all ideas", "D. Following standard practices"},
                {"A. Evolution", "B. Innovation", "C. Iteration", "D. Revolution"},
                {"A. Floppy disks", "B. Artificial Intelligence", "C. CRT monitors", "D. Dial-up modems"},
                {"A. Copyright", "B. Trademark", "C. Intellectual Property Rights (IPR)", "D. Patent"},
                {"A. Open source", "B. Freeware", "C. Software piracy", "D. Shareware"},
                {"A. Malicious and Hardware", "B. Malicious and Software", "C. Memory and Software", "D. Main and Software"},
                {"A. Trojan horse", "B. Logic bomb", "C. Boot sector virus", "D. Worm"},
                {"A. Boot sector virus", "B. Logic bomb", "C. Trojan horse", "D. Worm"},
                {"A. Norton", "B. McAfee", "C. FormatC", "D. AVG"},
                {"A. 1999", "B. 2002", "C. 2005", "D. 2008"},
                {"A. Recycling", "B. E-waste management", "C. Landfill management", "D. Waste disposal"},
                {"A. import math", "B. include math", "C. require math", "D. using math"},
                {"A. randint()", "B. randomint()", "C. intrandom()", "D. rand_int()"},
                {"A. Password protection", "B. Encryption", "C. Biometrics", "D. Firewall"},
                {"A. for loop", "B. while loop", "C. do-while loop", "D. repeat loop"},
                {"A. power()", "B. pow()", "C. exponent()", "D. exp()"},
                {"A. Arithmetic operations", "B. Boolean logic", "C. String operations", "D. File operations"},
                {"A. AND gate", "B. OR gate", "C. NOT gate", "D. NOR gate"},
                {"A. The trail of data left by a user online", "B. Physical marks on devices", "C. Digital signatures", "D. Encryption keys"}
        };

        int correctAnswers[] = {
                3,  // Q1: All of the above
                1,  // Q2: Finding new and creative perspectives
                2,  // Q3: Iteration
                1,  // Q4: Artificial Intelligence
                2,  // Q5: Intellectual Property Rights (IPR)
                2,  // Q6: Software piracy
                1,  // Q7: Malicious and Software
                2,  // Q8: Boot sector virus
                1,  // Q9: Logic bomb
                2,  // Q10: FormatC
                1,  // Q11: 2002
                1,  // Q12: E-waste management
                0,  // Q13: import math
                0,  // Q14: randint()
                2,  // Q15: Biometrics
                1,  // Q16: while loop
                1,  // Q17: pow()
                1,  // Q18: Boolean logic
                0,  // Q19: AND gate
                0   // Q20: The trail of data left by a user online
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 260), (i * 60 + 130), 260, 30);
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