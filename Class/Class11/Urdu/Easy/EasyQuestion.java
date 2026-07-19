package Class.Class11.Urdu.Easy;

import Class.Class11.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: ملی نغمہ کے شاعر کا نام کیا ہے؟",
                "Question 2: \"نعت\" کن کی تعریف میں کہی جاتی ہے؟",
                "Question 3: اُردو زبان میں کل کتنے حروف ہیں؟",
                "Question 4: جس اسم سے کسی خاص شخص، جگہ یا چیز کا پتہ چلے اسے کیا کہتے ہیں؟",
                "Question 5: فعل کے کتنے زمانے ہیں؟",
                "Question 6: جس فعل سے کام کا ہونا یا کرنا گزرے ہوئے وقت میں ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 7: وہ لفظ جو کسی اسم کی جگہ استعمال ہو کیا کہلاتا ہے؟",
                "Question 8: \"میں\" کس ضمیر کی مثال ہے؟",
                "Question 9: وہ لفظ جو دو الفاظ کو آپس میں ملاتا ہے کیا کہلاتا ہے؟",
                "Question 10: شاعری کی وہ صنف جس میں کسی کی تعریف کی جائے کیا کہلاتی ہے؟",
                "Question 11: \"تم\" کس ضمیر کی مثال ہے؟",
                "Question 12: وہ لفظ جو کسی اسم کی خوبی، عیب، رنگ، شکل یا مقدار کو ظاہر کرے کیا کہلاتا ہے؟",
                "Question 13: مذکر کو مونث میں تبدیل کریں: \"بھائی\"",
                "Question 14: \"وہ\" کس ضمیر کی مثال ہے؟",
                "Question 15: مونث کی جمع بنائیں: \"لڑکیاں\"",
                "Question 16: اُردو کے مشہور شاعر جنہیں \"شاعرِ مشرق\" کہا جاتا ہے؟",
                "Question 17: محاورہ \"آسمان سے باتیں کرنا\" کا کیا مطلب ہے؟",
                "Question 18: جس جملے میں سوال پوچھا جائے اسے کیا کہتے ہیں؟",
                "Question 19: مذکر کو مونث میں تبدیل کریں: \"شیر\"",
                "Question 20: وہ حرف جو کسی اسم سے پہلے آکر اس کا تعلق دوسرے الفاظ سے ظاہر کرے کیا کہلاتا ہے؟"
        };

        String options[][] = {
                {"A. علامہ اقبال", "B. احمد ندیم قاسمی", "C. میر تقی میر", "D. فیض احمد فیض"},
                {"A. حضرت محمد ﷺ", "B. اللہ تعالیٰ", "C. اولیاء کرام", "D. شہداء"},
                {"A. 36", "B. 37", "C. 38", "D. 39"},
                {"A. اسم نکرہ", "B. اسم معرفہ", "C. اسم جامد", "D. اسم مشتق"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. اسم", "B. صفت", "C. ضمیر", "D. فعل"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. واحد"},
                {"A. اسم", "B. فعل", "C. حرف عطف", "D. صفت"},
                {"A. مرثیہ", "B. قصیدہ", "C. غزل", "D. مثنوی"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. جمع"},
                {"A. اسم", "B. فعل", "C. صفت", "D. حرف"},
                {"A. بہن", "B. بھائی", "C. بھتیجا", "D. بھانجا"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. واحد"},
                {"A. لڑکا", "B. لڑکے", "C. لڑکیوں", "D. لڑکی"},
                {"A. فیض احمد فیض", "B. علامہ اقبال", "C. میر تقی میر", "D. غالب"},
                {"A. اونچی آواز میں بولنا", "B. بہت زیادہ بولنا", "C. ناقابلِ حصول خواہش کرنا", "D. خاموش رہنا"},
                {"A. جملہ خبریہ", "B. جملہ استفہامیہ", "C. جملہ امریہ", "D. جملہ تعجبیہ"},
                {"A. شیرنی", "B. شیر", "C. ببر", "D. گھاس"},
                {"A. حرف عطف", "B. حرف ربط", "C. حرف جار", "D. حرف ندا"}
        };

        int correctAnswers[] = {
                0,  // Q1: علامہ اقبال
                0,  // Q2: حضرت محمد ﷺ
                2,  // Q3: 38
                1,  // Q4: اسم معرفہ
                1,  // Q5: تین
                0,  // Q6: فعل ماضی
                2,  // Q7: ضمیر
                2,  // Q8: متکلم
                2,  // Q9: حرف عطف
                1,  // Q10: قصیدہ
                1,  // Q11: حاضر
                2,  // Q12: صفت
                0,  // Q13: بہن
                0,  // Q14: غائب
                2,  // Q15: لڑکیوں
                1,  // Q16: علامہ اقبال
                2,  // Q17: ناقابلِ حصول خواہش کرنا
                1,  // Q18: جملہ استفہامیہ
                0,  // Q19: شیرنی
                2   // Q20: حرف جار
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
            new UrduDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}