package Class.Class7.Arabic.Hard;

import Class.Class7.Arabic.ArabicDashboard.ArabicDashboard;
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
                "Question 1: \"إنَّ\" کے بعد المبتدأ کس حالت میں ہوگا؟",
                "Question 2: \"كان\" کے بعد الخبر کس حالت میں ہوگا؟",
                "Question 3: معتل فعل سے معلوم اور مجہول بنانے کا اصول کیا ہے؟",
                "Question 4: \"ظرف المكان\" بنانے کا وزن ہے:",
                "Question 5: \"هذان\" کس کے لیے ہے؟",
                "Question 6: \"اللذان\" کس کے لیے استعمال ہوتا ہے؟",
                "Question 7: فعل معتل کی پہچان ہے:",
                "Question 8: \"لم يكتب\" میں \"لم\" کا اثر ہے:",
                "Question 9: \"أخوات كان\" میں کون شامل ہے؟",
                "Question 10: \"أخوات إنَّ\" میں کون شامل نہیں؟",
                "Question 11: جمع مؤنث سالم کی علامت ہے:",
                "Question 12: اسم التفضیل کا وزن ہے:",
                "Question 13: \"كاد\" اور \"عسى\" کیا ہیں؟",
                "Question 14: \"ما\" حجازیہ کا کیا اثر ہے؟",
                "Question 15: فعل مجہول کی پہچان ہے؟",
                "Question 16: \"المثنى\" کی علامت ہے؟",
                "Question 17: \"كم\" استفہامیہ کے بعد کیا آتا ہے؟",
                "Question 18: جمع مکسر کی پہچان ہے:",
                "Question 19: \"عند\" اور \"لدى\" ہیں:",
                "Question 20: \"أفعل التفضیل\" کا استعمال کس کے لیے ہے؟"
        };

        String options[][] = {
                {"A. مرفوع", "B. منصوب", "C. مجرور", "D. جزوم"},
                {"A. مرفوع", "B. منصوب", "C. مجرور", "D. جزوم"},
                {"A. حرف صحیح بدلنا", "B. حرف علت بدلنا", "C. وزن تبدیل کرنا", "D. فعل مضارع لانا"},
                {"A. مَفْعَل", "B. مَفْعِل", "C. فَعْل", "D. فِعْل"},
                {"A. دو عورتیں", "B. دو مرد", "C. جمع مرد", "D. واحد"},
                {"A. دو مرد", "B. دو عورتیں", "C. جمع", "D. واحد مرد"},
                {"A. حروف صحیحہ", "B. حروف علت", "C. حروف شمسیہ", "D. حروف قمریہ"},
                {"A. مضارع منصوب", "B. مضارع مجزوم", "C. مضارع مرفوع", "D. ماضی مبنی"},
                {"A. إنَّ", "B. أصبح", "C. أنَّ", "D. ليت"},
                {"A. إنَّ", "B. أنَّ", "C. كان", "D. ليت"},
                {"A. ون", "B. ين", "C. ات", "D. ان"},
                {"A. فَعَل", "B. أفْعَل", "C. فِعْل", "D. مَفْعَل"},
                {"A. حروف مشبہہ", "B. أفعال مقاربہ", "C. أخوات إنَّ", "D. أخوات كان"},
                {"A. مبتدا رفع", "B. مبتدا نصب", "C. خبر نصب", "D. کوئی اثر نہیں"},
                {"A. فاعل معلوم", "B. مفعول مقدم", "C. ضمیر مستتر", "D. نائب فاعل"},
                {"A. ون", "B. ين", "C. ان", "D. ات"},
                {"A. مفرد", "B. جمع", "C. مثنی", "D. تمییز"},
                {"A. وزن بدلنا", "B. علامت لگانا", "C. حذف کرنا", "D. اضافہ کرنا"},
                {"A. حروف جر", "B. ظروف مکان", "C. ظروف زمان", "D. أفعال"},
                {"A. مساوات", "B. تفضیل", "C. تقلیل", "D. تکثیر"}
        };

        int correctAnswers[] = {
                1,  // Q1: "إنَّ" کے بعد المبتدأ کس حالت میں ہوگا؟ B. منصوب
                1,  // Q2: "كان" کے بعد الخبر کس حالت میں ہوگا؟ B. منصوب
                1,  // Q3: معتل فعل سے معلوم اور مجہول بنانے کا اصول کیا ہے؟ B. حرف علت بدلنا
                0,  // Q4: "ظرف المكان" بنانے کا وزن ہے: A. مَفْعَل
                1,  // Q5: "هذان" کس کے لیے ہے؟ B. دو مرد
                0,  // Q6: "اللذان" کس کے لیے استعمال ہوتا ہے؟ A. دو مرد
                1,  // Q7: فعل معتل کی پہچان ہے: B. حروف علت
                1,  // Q8: "لم يكتب" میں "لم" کا اثر ہے: B. مضارع مجزوم
                1,  // Q9: "أخوات كان" میں کون شامل ہے؟ B. أصبح
                2,  // Q10: "أخوات إنَّ" میں کون شامل نہیں؟ C. كان
                2,  // Q11: جمع مؤنث سالم کی علامت ہے: C. ات
                1,  // Q12: اسم التفضیل کا وزن ہے: B. أفْعَل
                1,  // Q13: "كاد" اور "عسى" کیا ہیں؟ B. أفعال مقاربہ
                1,  // Q14: "ما" حجازیہ کا کیا اثر ہے؟ B. مبتدا نصب
                3,  // Q15: فعل مجہول کی پہچان ہے؟ D. نائب فاعل
                2,  // Q16: "المثنى" کی علامت ہے؟ C. ان
                3,  // Q17: "كم" استفہامیہ کے بعد کیا آتا ہے؟ D. تمییز
                0,  // Q18: جمع مکسر کی پہچان ہے: A. وزن بدلنا
                1,  // Q19: "عند" اور "لدى" ہیں: B. ظروف مکان
                1   // Q20: "أفعل التفضیل" کا استعمال کس کے لیے ہے؟ B. تفضیل
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