package Class.Class12.Urdu.Hard;

import Class.Class12.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: مولوی نذیر احمد کے ناولوں کا بنیادی مقصد کیا تھا؟",
                "Question 2: \"اکبری کی حماقتیں\" کے مصنف کون ہیں؟",
                "Question 3: \"دستک\" کے مصنف کون ہیں؟",
                "Question 4: اسلامی مساوات کس شاعر کی نظم ہے؟",
                "Question 5: سراغ راہرو کے شاعر کون ہیں؟",
                "Question 6: قطعات کس شاعر کی نظم ہے؟",
                "Question 7: درج ذیل میں سے کون سی غزل میر تقی میر کی ہے؟",
                "Question 8: \"نہ گیا کوئی عدم کو دل شاداں لے کر\" کس شاعر کی غزل ہے؟",
                "Question 9: فعل ماضی بعید کی پہچان کریں:",
                "Question 10: فعل حال جاری کی پہچان کریں:",
                "Question 11: \"بہت اچھا\" میں کون سی صفت ہے؟",
                "Question 12: فعل امر کی پہچان کریں:",
                "Question 13: \"ہم\" کس ضمیر کی جمع ہے؟",
                "Question 14: \"تم\" کس ضمیر کی جمع ہے؟",
                "Question 15: وہ حرف جو کسی اسم کی تعریف یا توصیف کرے کیا کہلاتا ہے؟",
                "Question 16: \"اللہ\" کس اسم کی مثال ہے؟",
                "Question 17: وہ ضمیر جو اپنے سے پہلے والے اسم کی طرف اشارہ کرے کیا کہلاتی ہے؟",
                "Question 18: جس فعل سے کسی کام کا شروع ہونا ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 19: جملہ فعلیہ کی پہچان کریں:",
                "Question 20: وہ اسم جو کسی جگہ کے نام کو ظاہر کرے کیا کہلاتا ہے؟"
        };

        String options[][] = {
                {"A. عشق و محبت کی کہانیاں بیان کرنا", "B. اصلاحِ معاشرہ اور اخلاقی اقدار کی ترویج", "C. تاریخی واقعات کا بیان", "D. تفریح فراہم کرنا"},
                {"A. مولوی نذیر احمد", "B. سر سید احمد خان", "C. پنڈت رتن ناتھ سرشار", "D. ڈپٹی نذیر احمد"},
                {"A. راجندر سنگھ بیدی", "B. انتظار حسین", "C. اشفاق احمد", "D. غلام عباس"},
                {"A. علامہ اقبال", "B. حفیظ جالندھری", "C. فیض احمد فیض", "D. مجید امجد"},
                {"A. علامہ اقبال", "B. احمد ندیم قاسمی", "C. فیض احمد فیض", "D. میر تقی میر"},
                {"A. علامہ اقبال", "B. فیض احمد فیض", "C. حفیظ جالندھری", "D. میرزا اسد اللہ خان غالب"},
                {"A. کام مردوں کے جو ہیں، سو وہی کر جاتے ہیں", "B. کیا فرق داغ و گل میں، اگر گل میں ہو نہ ہو", "C. بکہ دشوار ہے ہر کام کا آساں ہونا", "D. جب عشق سکھاتا ہے آداب خود آگاہی"},
                {"A. غالب", "B. میر", "C. داغ", "D. فیض"},
                {"A. میں نے دیکھا", "B. میں نے دیکھا تھا", "C. میں دیکھتا ہوں", "D. میں دیکھوں گا"},
                {"A. میں پڑھتا ہوں", "B. میں پڑھ رہا ہوں", "C. میں نے پڑھا", "D. میں پڑھوں گا"},
                {"A. صفت ذاتی", "B. صفت نسبتی", "C. صفت مقداری", "D. صفت عددی"},
                {"A. جا", "B. جا رہا ہے", "C. گیا", "D. جائے گا"},
                {"A. میں", "B. تو", "C. وہ", "D. آپ"},
                {"A. میں", "B. تو", "C. وہ", "D. آپ"},
                {"A. حرف عطف", "B. حرف صفت", "C. حرف ندا", "D. حرف جار"},
                {"A. اسم نکرہ", "B. اسم معرفہ", "C. اسم جامد", "D. اسم مصدر"},
                {"A. ضمیر متکلم", "B. ضمیر حاضر", "C. ضمیر غائب", "D. ضمیر مبہم"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل شرط"},
                {"A. علی اچھا طالب علم ہے", "B. میں نے کتاب پڑھی", "C. یہ ایک خوبصورت کتاب ہے", "D. وہ بہت ذہین ہے"},
                {"A. اسم ذات", "B. اسم صفت", "C. اسم مصدر", "D. اسم فعل"}
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
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
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