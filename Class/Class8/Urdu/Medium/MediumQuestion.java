package Class.Class8.Urdu.Medium;

import Class.Class8.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: جس اسم سے کسی شخص، جگہ یا چیز کی حالت، رنگ، شکل یا مقدار کا پتہ چلے اسے کیا کہتے ہیں؟",
                "Question 2: وہ اسم جو کسی کام یا عمل کا نام ہو کیا کہلاتا ہے؟",
                "Question 3: فعل ماضی کی کتنی اقسام ہیں؟",
                "Question 4: جس جملے میں کسی کام کا کرنا یا ہونا پایا جائے اسے کیا کہتے ہیں؟",
                "Question 5: جس جملے کی ابتدا اسم سے ہو اسے کیا کہتے ہیں؟",
                "Question 6: جس جملے کی ابتدا فعل سے ہو اسے کیا کہتے ہیں؟",
                "Question 7: وہ اسم جو بغیر کسی دوسرے لفظ کے مدد کے اپنا مفہوم ظاہر کرے کیا کہلاتا ہے؟",
                "Question 8: وہ اسم جو کسی دوسرے لفظ سے بنا ہو کیا کہلاتا ہے؟",
                "Question 9: \"بہت\" کس صفت کی مثال ہے؟",
                "Question 10: \"پانچ\" کس صفت کی مثال ہے؟",
                "Question 11: ضمیر کی کتنی اقسام ہیں؟",
                "Question 12: وہ ضمیر جو متکلم، حاضر اور غائب کے علاوہ کسی اور کے لیے استعمال ہو کیا کہلاتی ہے؟",
                "Question 13: فعل مستقبل کی پہچان کریں: \"جاؤں گا\"",
                "Question 14: فعل ماضی کی پہچان کریں: \"گیا\"",
                "Question 15: وہ حرف جو کسی اسم سے پہلے آکر اس کا تعلق دوسرے الفاظ سے ظاہر کرے کیا کہلاتا ہے؟",
                "Question 16: \"میں نے\" میں کون سا حرف استعمال ہوا ہے؟",
                "Question 17: اسم معرفہ کی مثال ہے:",
                "Question 18: اسم نکرہ کی مثال ہے:",
                "Question 19: فعل کے کتنے اقسام ہیں؟",
                "Question 20: جمہ اسمیہ کی پہچان کریں:"
        };

        String options[][] = {
                {"A. اسم", "B. صفت", "C. ضمیر", "D. فعل"},
                {"A. اسم معرفہ", "B. اسم نکرہ", "C. اسم مصدر", "D. اسم جامد"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. اسم مشتق", "B. اسم جامد", "C. اسم مصدر", "D. اسم صفت"},
                {"A. اسم جامد", "B. اسم مشتق", "C. اسم مصدر", "D. اسم معرفہ"},
                {"A. صفت ذاتی", "B. صفت عددی", "C. صفت مقداری", "D. صفت نسبتی"},
                {"A. صفت ذاتی", "B. صفت عددی", "C. صفت مقداری", "D. صفت نسبتی"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. ضمیر متکلم", "B. ضمیر حاضر", "C. ضمیر غائب", "D. ضمیر مبہم"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. حرف عطف", "B. حرف ربط", "C. حرف جار", "D. حرف ندا"},
                {"A. حرف عطف", "B. حرف جار", "C. حرف ربط", "D. حرف ندا"},
                {"A. کتاب", "B. یہ کتاب", "C. ایک کتاب", "D. کچھ کتابیں"},
                {"A. علی", "B. لاہور", "C. ایک کتاب", "D. پاکستان"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. میں پڑھتا ہوں", "B. علی طالب علم ہے", "C. وہ آیا", "D. میں نے دیکھا"}
        };

        int correctAnswers[] = {
                1,  // Q1: صفت
                2,  // Q2: اسم مصدر
                1,  // Q3: تین
                1,  // Q4: جملہ فعلیہ
                0,  // Q5: جملہ اسمیہ
                1,  // Q6: جملہ فعلیہ
                1,  // Q7: اسم جامد
                1,  // Q8: اسم مشتق
                2,  // Q9: صفت مقداری
                1,  // Q10: صفت عددی
                1,  // Q11: تین
                3,  // Q12: ضمیر مبہم
                2,  // Q13: فعل مستقبل
                0,  // Q14: فعل ماضی
                2,  // Q15: حرف جار
                1,  // Q16: حرف جار
                1,  // Q17: یہ کتاب
                2,  // Q18: ایک کتاب
                1,  // Q19: تین
                1   // Q20: علی طالب علم ہے
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
            new UrduDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}