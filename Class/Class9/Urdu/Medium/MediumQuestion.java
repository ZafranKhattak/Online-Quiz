package Class.Class9.Urdu.Medium;

import Class.Class9.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 3: وہ اسم جو بغیر کسی دوسرے لفظ کے مدد کے اپنا مفہوم ظاہر کرے کیا کہلاتا ہے؟",
                "Question 4: وہ اسم جو کسی دوسرے لفظ سے بنا ہو کیا کہلاتا ہے؟",
                "Question 5: \"بہت\" کس صفت کی مثال ہے؟",
                "Question 6: \"پانچ\" کس صفت کی مثال ہے؟",
                "Question 7: فعل ماضی کی کتنی اقسام ہیں؟",
                "Question 8: جس جملے میں کسی کام کا کرنا یا ہونا پایا جائے اسے کیا کہتے ہیں؟",
                "Question 9: جس جملے کی ابتدا اسم سے ہو اسے کیا کہتے ہیں؟",
                "Question 10: جس جملے کی ابتدا فعل سے ہو اسے کیا کہتے ہیں؟",
                "Question 11: ضمیر کی کتنی اقسام ہیں؟",
                "Question 12: وہ ضمیر جو متکلم، حاضر اور غائب کے علاوہ کسی اور کے لیے استعمال ہو کیا کہلاتی ہے؟",
                "Question 13: وہ حرف جو کسی اسم سے پہلے آکر اس کا تعلق دوسرے الفاظ سے ظاہر کرے کیا کہلاتا ہے؟",
                "Question 14: فعل مستقبل کی پہچان کریں: \"جاؤں گا\"",
                "Question 15: فعل ماضی کی پہچان کریں: \"گیا\"",
                "Question 16: اسم معرفہ کی مثال ہے:",
                "Question 17: اسم نکرہ کی مثال ہے:",
                "Question 18: \"میں نے\" میں کون سا حرف استعمال ہوا ہے؟",
                "Question 19: فعل کے کتنے اقسام ہیں؟",
                "Question 20: جملہ اسمیہ کی پہچان کریں:"
        };

        String options[][] = {
                {"A. اسم", "B. صفت", "C. ضمیر", "D. فعل"},
                {"A. اسم معرفہ", "B. اسم نکرہ", "C. اسم مصدر", "D. اسم جامد"},
                {"A. اسم مشتق", "B. اسم جامد", "C. اسم مصدر", "D. اسم صفت"},
                {"A. اسم جامد", "B. اسم مشتق", "C. اسم مصدر", "D. اسم معرفہ"},
                {"A. صفت ذاتی", "B. صفت عددی", "C. صفت مقداری", "D. صفت نسبتی"},
                {"A. صفت ذاتی", "B. صفت عددی", "C. صفت مقداری", "D. صفت نسبتی"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. جملہ اسمیہ", "B. جملہ فعلیہ", "C. جملہ شرطیہ", "D. جملہ استفہامیہ"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. ضمیر متکلم", "B. ضمیر حاضر", "C. ضمیر غائب", "D. ضمیر مبہم"},
                {"A. حرف عطف", "B. حرف ربط", "C. حرف جار", "D. حرف ندا"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. کتاب", "B. یہ کتاب", "C. ایک کتاب", "D. کچھ کتابیں"},
                {"A. علی", "B. لاہور", "C. ایک کتاب", "D. پاکستان"},
                {"A. حرف عطف", "B. حرف جار", "C. حرف ربط", "D. حرف ندا"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. میں پڑھتا ہوں", "B. علی طالب علم ہے", "C. وہ آیا", "D. میں نے دیکھا"}
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            label2.setBounds(80, 1 + (i * 60 + 100), 950, 30);
            label2.setForeground(Color.GREEN);
            label2.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(label2);
        }

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 220), (i * 60 + 130), 220, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                group.add(btn);
                panel.add(btn);
            }
        }

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            JOptionPane.showConfirmDialog(null, "You want to submit");
            JOptionPane.showMessageDialog(null, "Submitted Successfully");
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