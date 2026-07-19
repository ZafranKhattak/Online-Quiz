package Class.Class11.Urdu.Hard;

import Class.Class11.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: جس اسم میں زمانے کا پتہ چلے اور جو فعل سے بنا ہو اسے کیا کہتے ہیں؟",
                "Question 2: فعل ماضی بعید کی پہچان کریں:",
                "Question 3: وہ صفت جو کسی اسم کی طرف نسبت ظاہر کرے کیا کہلاتی ہے؟",
                "Question 4: جس ضمیر کا استعمال کسی خاص شخص کے لیے احترام کے طور پر کیا جائے اسے کیا کہتے ہیں؟",
                "Question 5: \"بہت اچھا\" میں کون سی صفت ہے؟",
                "Question 6: فعل امر کی پہچان کریں:",
                "Question 7: \"ہم\" کس ضمیر کی جمع ہے؟",
                "Question 8: وہ حرف جو کسی اسم کی تعریف یا توصیف کرے کیا کہلاتا ہے؟",
                "Question 9: \"اللہ\" کس اسم کی مثال ہے؟",
                "Question 10: وہ ضمیر جو اپنے سے پہلے والے اسم کی طرف اشارہ کرے کیا کہلاتی ہے؟",
                "Question 11: فعل کی اقسام میں سے کون سی قسم کام کی درخواست یا حکم ظاہر کرتی ہے؟",
                "Question 12: \"قرآن پاک\" کس اسم کی مثال ہے؟",
                "Question 13: وہ صفت جو کسی چیز کی تعداد ظاہر کرے کیا کہلاتی ہے؟",
                "Question 14: \"میں نے وہ کتاب پڑھی\" میں ضمیر کی پہچان کریں:",
                "Question 15: جس فعل سے کسی کام کا شروع ہونا ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 16: جملہ فعلیہ کی پہچان کریں:",
                "Question 17: وہ اسم جو کسی جگہ کے نام کو ظاہر کرے کیا کہلاتا ہے؟",
                "Question 18: \"مجازِ مرسل\" کی تعریف کیا ہے؟",
                "Question 19: \"صنعتِ کنایہ\" کیا ہے؟",
                "Question 20: نظم اور غزل میں بنیادی فرق کیا ہے؟"
        };

        String options[][] = {
                {"A. اسم مصدر", "B. اسم فاعل", "C. اسم مفعول", "D. اسم ظرف"},
                {"A. میں نے دیکھا", "B. میں نے دیکھا تھا", "C. میں دیکھتا ہوں", "D. میں دیکھوں گا"},
                {"A. صفت ذاتی", "B. صفت عددی", "C. صفت نسبتی", "D. صفت مقداری"},
                {"A. ضمیر متکلم", "B. ضمیر حاضر", "C. ضمیر تعظیم", "D. ضمیر مبہم"},
                {"A. صفت ذاتی", "B. صفت نسبتی", "C. صفت مقداری", "D. صفت عددی"},
                {"A. جا", "B. جا رہا ہے", "C. گیا", "D. جائے گا"},
                {"A. میں", "B. تو", "C. وہ", "D. آپ"},
                {"A. حرف عطف", "B. حرف صفت", "C. حرف ندا", "D. حرف جار"},
                {"A. اسم نکرہ", "B. اسم معرفہ", "C. اسم جامد", "D. اسم مصدر"},
                {"A. ضمیر متکلم", "B. ضمیر حاضر", "C. ضمیر غائب", "D. ضمیر مبہم"},
                {"A. فعل امر", "B. فعل نہی", "C. فعل استفہام", "D. فعل شرط"},
                {"A. اسم نکرہ", "B. اسم معرفہ", "C. اسم جامد", "D. اسم مصدر"},
                {"A. صفت ذاتی", "B. صفت عددی", "C. صفت نسبتی", "D. صفت مقداری"},
                {"A. متکلم", "B. حاضر", "C. غائب", "D. مبہم"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل شرط"},
                {"A. علی اچھا طالب علم ہے", "B. میں نے کتاب پڑھی", "C. یہ ایک خوبصورت کتاب ہے", "D. وہ بہت ذہین ہے"},
                {"A. اسم ذات", "B. اسم صفت", "C. اسم مصدر", "D. اسم فعل"},
                {"A. کسی چیز کا نام اس کی خاصیت پر رکھنا", "B. کسی چیز کا نام اس کے متعلق پر رکھنا", "C. کسی چیز کا نام اس کے برعکس پر رکھنا", "D. کسی چیز کا نام اس کی جنس پر رکھنا"},
                {"A. کسی بات کو صراحت کے بجائے اشارے میں کہنا", "B. کسی بات کو بڑھا چڑھا کر کہنا", "C. کسی بات کو اس کے برعکس کہنا", "D. کسی بات کو مختصر کرنا"},
                {"A. نظم میں ایک ہی مضمون ہوتا ہے، غزل میں کئی مضامین", "B. نظم میں قافیہ ضروری ہے، غزل میں نہیں", "C. نظم چھوٹی ہوتی ہے، غزل لمبی", "D. نظم صرف حمد و نعت میں ہوتی ہے"}
        };

        int correctAnswers[] = {
                0,  // Q1: اسم مصدر
                1,  // Q2: میں نے دیکھا تھا
                2,  // Q3: صفت نسبتی
                2,  // Q4: ضمیر تعظیم
                2,  // Q5: صفت مقداری
                0,  // Q6: جا
                3,  // Q7: آپ
                1,  // Q8: حرف صفت
                1,  // Q9: اسم معرفہ
                2,  // Q10: ضمیر غائب
                0,  // Q11: فعل امر
                1,  // Q12: اسم معرفہ
                1,  // Q13: صفت عددی
                0,  // Q14: متکلم
                3,  // Q15: فعل شرط
                1,  // Q16: میں نے کتاب پڑھی
                0,  // Q17: اسم ذات
                1,  // Q18: کسی چیز کا نام اس کے متعلق پر رکھنا
                0,  // Q19: کسی بات کو صراحت کے بجائے اشارے میں کہنا
                0   // Q20: نظم میں ایک ہی مضمون ہوتا ہے، غزل میں کئی مضامین
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