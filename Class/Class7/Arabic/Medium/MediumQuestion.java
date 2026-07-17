package Class.Class7.Arabic.Medium;

import Class.Class7.Arabic.ArabicDashboard.ArabicDashboard;
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
                "Question 1: \"مُعَلِّم\" کی جمع مونث ہے:",
                "Question 2: ضمیر متصل کی مثال ہے:",
                "Question 3: \"المبتدأ والخبر\" میں خبر کیسے ہوتی ہے؟",
                "Question 4: \"أنتِ\" کس کے لیے ہے؟",
                "Question 5: فعل مضارع کی پہچان ہے:",
                "Question 6: \"الَّذِي\" کس کے لیے ہے؟",
                "Question 7: ماضی منفی کا فعل ہے:",
                "Question 8: \"ظرف المكان\" کس کو کہتے ہیں؟",
                "Question 9: \"إنَّ\" کس پر اثر ڈالتی ہے؟",
                "Question 10: \"كان\" کس پر اثر ڈالتی ہے؟",
                "Question 11: جمع مذکر سالم کی علامت ہے:",
                "Question 12: \"هما\" کس کے لیے ہے؟",
                "Question 13: \"في\" اور \"على\" ہیں:",
                "Question 14: \"مکتب\" کا مطلب ہے:",
                "Question 15: ضمیر منفصل کی مثال ہے:",
                "Question 16: فعل أمر کی پہچان ہے:",
                "Question 17: \"الفتاة\" کا مطلب ہے:",
                "Question 18: خبر کی اقسام ہیں:",
                "Question 19: \"أين\" کس کے لیے ہے؟",
                "Question 20: اسم اشارہ کی مثال ہے:"
        };

        String options[][] = {
                {"A. معلمات", "B. معلمون", "C. معلمین", "D. تعلیم"},
                {"A. أنا", "B. هو", "C. ي", "D. نحن"},
                {"A. مرفوع", "B. منصوب", "C. مجرور", "D. جزوم"},
                {"A. تم (مرد)", "B. تم (عورت)", "C. ہم", "D. وہ"},
                {"A. كتب", "B. يكتب", "C. سيكتب", "D. اكتب"},
                {"A. عورت", "B. مرد", "C. جمع", "D. کتاب"},
                {"A. كتب", "B. يكتب", "C. لم يكتب", "D. سيكتب"},
                {"A. وقت کا اسم", "B. جگہ کا اسم", "C. فعل کی قسم", "D. ضمیر کی قسم"},
                {"A. المبتدأ", "B. الخبر", "C. الفعل", "D. الحرف"},
                {"A. المبتدأ", "B. الخبر", "C. الفعل", "D. الضمیر"},
                {"A. ات", "B. ون", "C. ين", "D. ان"},
                {"A. دو مرد", "B. دو عورتیں", "C. جمع مرد", "D. واحد"},
                {"A. اسم", "B. فعل", "C. حروف جر", "D. ضمائر"},
                {"A. کتاب", "B. لکھنا", "C. دفتر/آفس", "D. اسکول"},
                {"A. ي", "B. ك", "C. أنا", "D. ها"},
                {"A. اكتب", "B. يكتب", "C. كتب", "D. سيكتب"},
                {"A. لڑکا", "B. لڑکی", "C. عورت", "D. مرد"},
                {"A. مفرد، جملہ", "B. فعل، اسم", "C. ماضی، مضارع", "D. واحد، جمع"},
                {"A. کون", "B. کب", "C. کہاں", "D. کیوں"},
                {"A. كتاب", "B. هذا", "C. هو", "D. أنا"}
        };

        int correctAnswers[] = {
                0,  // Q1: "مُعَلِّم" کی جمع مونث ہے: A. معلمات
                2,  // Q2: ضمیر متصل کی مثال ہے: C. ي
                0,  // Q3: "المبتدأ والخبر" میں خبر کیسے ہوتی ہے؟ A. مرفوع
                1,  // Q4: "أنتِ" کس کے لیے ہے؟ B. تم (عورت)
                1,  // Q5: فعل مضارع کی پہچان ہے: B. يكتب
                1,  // Q6: "الَّذِي" کس کے لیے ہے؟ B. مرد
                2,  // Q7: ماضی منفی کا فعل ہے: C. لم يكتب
                1,  // Q8: "ظرف المكان" کس کو کہتے ہیں؟ B. جگہ کا اسم
                0,  // Q9: "إنَّ" کس پر اثر ڈالتی ہے؟ A. المبتدأ
                1,  // Q10: "كان" کس پر اثر ڈالتی ہے؟ B. الخبر
                1,  // Q11: جمع مذکر سالم کی علامت ہے: B. ون
                0,  // Q12: "هما" کس کے لیے ہے؟ A. دو مرد
                2,  // Q13: "في" اور "على" ہیں: C. حروف جر
                2,  // Q14: "مکتب" کا مطلب ہے: C. دفتر/آفس
                2,  // Q15: ضمیر منفصل کی مثال ہے: C. أنا
                0,  // Q16: فعل أمر کی پہچان ہے: A. اكتب
                1,  // Q17: "الفتاة" کا مطلب ہے: B. لڑکی
                0,  // Q18: خبر کی اقسام ہیں: A. مفرد، جملہ
                2,  // Q19: "أين" کس کے لیے ہے؟ C. کہاں
                1   // Q20: اسم اشارہ کی مثال ہے: B. هذا
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 220), (i * 60 + 130), 220, 30);
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