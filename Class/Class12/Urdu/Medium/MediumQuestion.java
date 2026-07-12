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
                btn.setBounds(80 + (j * 240), (i * 60 + 130), 240, 30);
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