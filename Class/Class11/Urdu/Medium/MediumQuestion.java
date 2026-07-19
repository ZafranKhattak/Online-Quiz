package Class.Class11.Urdu.Medium;

import Class.Class11.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: وہ اسم جو کسی کام یا عمل کا نام ہو کیا کہلاتا ہے؟",
                "Question 2: فعل ماضی کی کتنی اقسام ہیں؟",
                "Question 3: جس جملے کی ابتدا اسم سے ہو اسے کیا کہتے ہیں؟",
                "Question 4: \"بہت\" کس صفت کی مثال ہے؟",
                "Question 5: ضمیر کی کتنی اقسام ہیں؟",
                "Question 6: فعل مستقبل کی پہچان کریں: \"جاؤں گا\"",
                "Question 7: جس جملے کی ابتدا فعل سے ہو اسے کیا کہتے ہیں؟",
                "Question 8: وہ ضمیر جو متکلم، حاضر اور غائب کے علاوہ کسی اور کے لیے استعمال ہو کیا کہلاتی ہے؟",
                "Question 9: اسم معرفہ کی مثال ہے:",
                "Question 10: جس جملے میں کسی کام کا کرنا یا ہونا پایا جائے اسے کیا کہتے ہیں؟",
                "Question 11: \"پانچ\" کس صفت کی مثال ہے؟",
                "Question 12: وہ اسم جو بغیر کسی دوسرے لفظ کے مدد کے اپنا مفہوم ظاہر کرے کیا کہلاتا ہے؟",
                "Question 13: اسم نکرہ کی مثال ہے:",
                "Question 14: \"میں نے\" میں کون سا حرف استعمال ہوا ہے؟",
                "Question 15: غزل کے آخری شعر کو کیا کہتے ہیں؟",
                "Question 16: تشبیہ کی کتنی اقسام ہیں؟",
                "Question 17: جس جملے میں کسی کام کے کرنے کا حکم دیا جائے اسے کیا کہتے ہیں؟",
                "Question 18: صنعتِ \"تشبیہ\" کی تعریف کیا ہے؟",
                "Question 19: \"استعارہ\" کسے کہتے ہیں؟",
                "Question 20: وہ اسم جو کسی دوسرے لفظ سے بنا ہو کیا کہلاتا ہے؟"
        };

        String options[][] = {
                {"A. اسم معرفہ", "B. اسم نکرہ", "C. اسم مصدر", "D. اسم جامد"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. صفت ذاتی", "B. صفت عددی", "C. صفت مقداری", "D. صفت نسبتی"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. ضمیر متکلم", "B. ضمیر حاضر", "C. ضمیر غائب", "D. ضمیر مبہم"},
                {"A. کتاب", "B. یہ کتاب", "C. ایک کتاب", "D. کچھ کتابیں"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. صفت ذاتی", "B. صفت عددی", "C. صفت مقداری", "D. صفت نسبتی"},
                {"A. اسم مشتق", "B. اسم جامد", "C. اسم مصدر", "D. اسم صفت"},
                {"A. علی", "B. لاہور", "C. ایک کتاب", "D. پاکستان"},
                {"A. حرف عطف", "B. حرف جار", "C. حرف ربط", "D. حرف ندا"},
                {"A. مطلع", "B. ردیف", "C. مقطع", "D. قافیہ"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. جملہ خبریہ", "B. جملہ استفہامیہ", "C. جملہ امریہ", "D. جملہ تعجبیہ"},
                {"A. دو چیزوں کے درمیان مماثلت ظاہر کرنا", "B. کسی چیز کو بڑھا چڑھا کر بیان کرنا", "C. کسی چیز کو اس کے برعکس بیان کرنا", "D. غیر جاندار کو جاندار کی طرح پیش کرنا"},
                {"A. تشبیہ کی مصرعہ", "B. ادعائی تشبیہ", "C. حقیقت سے دوری", "D. الفاظ کا تبادلہ"},
                {"A. اسم جامد", "B. اسم مشتق", "C. اسم مصدر", "D. اسم معرفہ"}
        };

        int correctAnswers[] = {
                2,  // Q1: اسم مصدر
                1,  // Q2: تین
                0,  // Q3: جملہ اسمیہ
                2,  // Q4: صفت مقداری
                1,  // Q5: تین
                2,  // Q6: فعل مستقبل
                1,  // Q7: جملہ فعلیہ
                3,  // Q8: ضمیر مبہم
                1,  // Q9: یہ کتاب
                1,  // Q10: جملہ فعلیہ
                1,  // Q11: صفت عددی
                1,  // Q12: اسم جامد
                2,  // Q13: ایک کتاب
                1,  // Q14: حرف جار
                2,  // Q15: مقطع
                1,  // Q16: تین
                2,  // Q17: جملہ امریہ
                0,  // Q18: دو چیزوں کے درمیان مماثلت ظاہر کرنا
                1,  // Q19: ادعائی تشبیہ
                1   // Q20: اسم مشتق
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
            new UrduDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}