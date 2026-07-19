package Class.Class12.Urdu.Medium;

import Class.Class12.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: سبق \"مناقب عمر بن عبد العزیز\" میں خلیفہ کی کس صفت کو نمایاں کیا گیا ہے؟",
                "Question 2: \"تشکیل پاکستان\" کے مصنف کون ہیں؟",
                "Question 3: نواب محسن الملک کس تحریک سے وابستہ تھے؟",
                "Question 4: مولانا ظفر علی خان کی شاعری کا بنیادی موضوع کیا ہے؟",
                "Question 5: غزل میں ردیف اور قافیہ کا کیا کردار ہے؟",
                "Question 6: نظم \"خدا سر سبز رکھے اس چمن کو\" کس شاعر کی نظم ہے؟",
                "Question 7: \"نوجوان سے خطاب\" کے شاعر کون ہیں؟",
                "Question 8: جس جملے کی ابتدا اسم سے ہو اسے کیا کہتے ہیں؟",
                "Question 9: فعل کی اقسام میں سے کون سی قسم کام کی درخواست یا حکم ظاہر کرتی ہے؟",
                "Question 10: وہ صفت جو کسی اسم کی طرف نسبت ظاہر کرے کیا کہلاتی ہے؟",
                "Question 11: ضمیر کی کتنی اقسام ہیں؟",
                "Question 12: وہ ضمیر جو متکلم، حاضر اور غائب کے علاوہ کسی اور کے لیے استعمال ہو کیا کہلاتی ہے؟",
                "Question 13: فعل مستقبل کی پہچان کریں: \"جاؤں گا\"",
                "Question 14: فعل ماضی کی پہچان کریں: \"گیا\"",
                "Question 15: اسم معرفہ کی مثال ہے:",
                "Question 16: اسم نکرہ کی مثال ہے:",
                "Question 17: \"میں نے\" میں کون سا حرف استعمال ہوا ہے؟",
                "Question 18: فعل کے کتنے اقسام ہیں؟",
                "Question 19: جملہ اسمیہ کی پہچان کریں:",
                "Question 20: غزل کے آخر میں شاعر کا نام کس شعر میں آتا ہے؟"
        };

        String options[][] = {
                {"A. سخاوت", "B. عدل و انصاف", "C. بہادری", "D. حسن"},
                {"A. سر سید احمد خان", "B. قائد اعظم", "C. ڈاکٹر سید عبد اللہ", "D. مولوی نذیر احمد"},
                {"A. تحریک خلافت", "B. تحریک پاکستان", "C. تحریک علی گڑھ", "D. تحریک آزادی"},
                {"A. عشق و محبت", "B. حمد و نعت", "C. وطن دوستی", "D. تصوف"},
                {"A. موسیقیت پیدا کرنا", "B. معنی کی وضاحت کرنا", "C. وزن میں اضافہ کرنا", "D. الفاظ کی تعداد بڑھانا"},
                {"A. علامہ اقبال", "B. فیض احمد فیض", "C. حفیظ جالندھری", "D. مجید امجد"},
                {"A. علامہ اقبال", "B. احمد ندیم قاسمی", "C. میر تقی میر", "D. غالب"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. فعل امر", "B. فعل نہی", "C. فعل استفہام", "D. فعل شرط"},
                {"A. صفت ذاتی", "B. صفت عددی", "C. صفت نسبتی", "D. صفت مقداری"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. ضمیر متکلم", "B. ضمیر حاضر", "C. ضمیر غائب", "D. ضمیر مبہم"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. کتاب", "B. یہ کتاب", "C. ایک کتاب", "D. کچھ کتابیں"},
                {"A. علی", "B. لاہور", "C. ایک کتاب", "D. پاکستان"},
                {"A. حرف عطف", "B. حرف جار", "C. حرف ربط", "D. حرف ندا"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. میں پڑھتا ہوں", "B. علی طالب علم ہے", "C. وہ آیا", "D. میں نے دیکھا"},
                {"A. مطلع", "B. مقطع", "C. ردیف", "D. قافیہ"}
        };

        int correctAnswers[] = {
                1,  // Q1: عدل و انصاف
                2,  // Q2: ڈاکٹر سید عبد اللہ
                2,  // Q3: تحریک علی گڑھ
                2,  // Q4: وطن دوستی
                0,  // Q5: موسیقیت پیدا کرنا
                2,  // Q6: حفیظ جالندھری
                0,  // Q7: علامہ اقبال
                0,  // Q8: جملہ اسمیہ
                0,  // Q9: فعل امر
                2,  // Q10: صفت نسبتی
                1,  // Q11: تین
                3,  // Q12: ضمیر مبہم
                2,  // Q13: فعل مستقبل
                0,  // Q14: فعل ماضی
                1,  // Q15: یہ کتاب
                2,  // Q16: ایک کتاب
                1,  // Q17: حرف جار
                1,  // Q18: تین
                1,  // Q19: علی طالب علم ہے
                1   // Q20: مقطع
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