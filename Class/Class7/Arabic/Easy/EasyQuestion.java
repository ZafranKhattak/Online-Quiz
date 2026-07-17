package Class.Class7.Arabic.Easy;

import Class.Class7.Arabic.ArabicDashboard.ArabicDashboard;
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
                "Question 1: \"مُدَرِّس\" کا مؤنث ہے:",
                "Question 2: \"کتاب\" کی جمع ہے:",
                "Question 3: \"أنا\" کس قسم کا ضمیر ہے؟",
                "Question 4: \"هو\" کس کے لیے استعمال ہوتا ہے؟",
                "Question 5: \"بيت\" کا مطلب ہے:",
                "Question 6: \"أنت\" کس کے لیے ہے؟",
                "Question 7: المبتدأ کس حالت میں ہوتا ہے؟",
                "Question 8: \"مسلم\" کی جمع ہے:",
                "Question 9: \"هي\" کس کے لیے استعمال ہوتا ہے؟",
                "Question 10: فعل ماضی کی پہچان ہے:",
                "Question 11: \"قلم\" کا مطلب ہے:",
                "Question 12: \"نعم\" کا مطلب ہے:",
                "Question 13: ضمیر غائب کی مثال ہے:",
                "Question 14: \"شكراً\" کا مطلب ہے:",
                "Question 15: \"كتابان\" ہے:",
                "Question 16: \"في\" کیا ہے؟",
                "Question 17: \"جميل\" کا مطلب ہے:",
                "Question 18: \"نحن\" کس کے لیے ہے؟",
                "Question 19: \"مدرسة\" کا مطلب ہے:",
                "Question 20: \"لا\" کا مطلب ہے:"
        };

        String options[][] = {
                {"A. مدرسہ", "B. مدرسة", "C. معلم", "D. طالبہ"},
                {"A. کتب", "B. کتابیں", "C. کتابان", "D. مکتب"},
                {"A. متکلم", "B. حاضر", "C. غائب", "D. جمع"},
                {"A. عورت", "B. مرد", "C. بچی", "D. کتاب"},
                {"A. دروازہ", "B. گھر", "C. مسجد", "D. کتاب"},
                {"A. میں", "B. تم (مرد)", "C. تم (عورت)", "D. وہ"},
                {"A. منصوب", "B. مجرور", "C. مرفوع", "D. جزوم"},
                {"A. مسلمین", "B. مسلمون", "C. مسلمات", "D. اسلام"},
                {"A. مرد", "B. عورت", "C. جمع", "D. کتاب"},
                {"A. يكتب", "B. كتب", "C. سيكتب", "D. اكتب"},
                {"A. کتاب", "B. قلم", "C. دفتر", "D. حقیبہ"},
                {"A. نہیں", "B. ہاں", "C. کیوں", "D. کب"},
                {"A. أنا", "B. أنت", "C. هو", "D. نحن"},
                {"A. برائے مہربانی", "B. شکریہ", "C. معاف کیجیے", "D. خیر مقدم"},
                {"A. واحد", "B. مثنی", "C. جمع", "D. مفرد"},
                {"A. اسم", "B. فعل", "C. حرف جر", "D. ضمیر"},
                {"A. برا", "B. خوبصورت", "C. بڑا", "D. چھوٹا"},
                {"A. میں", "B. ہم", "C. تم", "D. وہ"},
                {"A. استاد", "B. طالب علم", "C. اسکول", "D. کتاب"},
                {"A. ہاں", "B. نہیں", "C. شاید", "D. کیوں"}
        };

        int correctAnswers[] = {
                1,  // Q1: "مُدَرِّس" کا مؤنث ہے: B. مدرسة
                0,  // Q2: "کتاب" کی جمع ہے: A. کتب
                0,  // Q3: "أنا" کس قسم کا ضمیر ہے؟ A. متکلم
                1,  // Q4: "هو" کس کے لیے استعمال ہوتا ہے؟ B. مرد
                1,  // Q5: "بيت" کا مطلب ہے: B. گھر
                1,  // Q6: "أنت" کس کے لیے ہے؟ B. تم (مرد)
                2,  // Q7: المبتدأ کس حالت میں ہوتا ہے؟ C. مرفوع
                1,  // Q8: "مسلم" کی جمع ہے: B. مسلمون
                1,  // Q9: "هي" کس کے لیے استعمال ہوتا ہے؟ B. عورت
                1,  // Q10: فعل ماضی کی پہچان ہے: B. كتب
                1,  // Q11: "قلم" کا مطلب ہے: B. قلم
                1,  // Q12: "نعم" کا مطلب ہے: B. ہاں
                2,  // Q13: ضمیر غائب کی مثال ہے: C. هو
                1,  // Q14: "شكراً" کا مطلب ہے: B. شکریہ
                1,  // Q15: "كتابان" ہے: B. مثنی
                2,  // Q16: "في" کیا ہے؟ C. حرف جر
                1,  // Q17: "جميل" کا مطلب ہے: B. خوبصورت
                1,  // Q18: "نحن" کس کے لیے ہے؟ B. ہم
                2,  // Q19: "مدرسة" کا مطلب ہے: C. اسکول
                1   // Q20: "لا" کا مطلب ہے: B. نہیں
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 200), (i * 60 + 130), 200, 30);
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
            new ArabicDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}