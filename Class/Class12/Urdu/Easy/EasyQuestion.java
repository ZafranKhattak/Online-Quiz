package Class.Class12.Urdu.Easy;

import Class.Class12.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: اردو کا پہلا باقاعدہ اخبار کس نے جاری کیا؟",
                "Question 2: مولوی نذیر احمد کا پہلا ناول کون سا ہے؟",
                "Question 3: غزل کا پہلا شعر کیا کہلاتا ہے؟",
                "Question 4: تشبیہ کی کتنی اقسام ہیں؟",
                "Question 5: اسم کی کتنی اقسام ہیں؟",
                "Question 6: جس اسم سے کسی خاص شخص، جگہ یا چیز کا پتہ چلے اسے کیا کہتے ہیں؟",
                "Question 7: جس اسم سے کسی عام شخص، جگہ یا چیز کا پتہ چلے اسے کیا کہتے ہیں؟",
                "Question 8: فعل کے کتنے زمانے ہیں؟",
                "Question 9: جس فعل سے کام کا ہونا یا کرنا گزرے ہوئے وقت میں ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 10: وہ لفظ جو کسی اسم کی جگہ استعمال ہو کیا کہلاتا ہے؟",
                "Question 11: \"میں\" کس ضمیر کی مثال ہے؟",
                "Question 12: \"تم\" کس ضمیر کی مثال ہے؟",
                "Question 13: \"وہ\" کس ضمیر کی مثال ہے؟",
                "Question 14: وہ لفظ جو دو الفاظ کو آپس میں ملاتا ہے کیا کہلاتا ہے؟",
                "Question 15: مذکر کو مونث میں تبدیل کریں: \"بھائی\"",
                "Question 16: مذکر کو مونث میں تبدیل کریں: \"شیر\"",
                "Question 17: مونث کی جمع بنائیں: \"لڑکیاں\"",
                "Question 18: مذکر کی جمع بنائیں: \"لڑکے\"",
                "Question 19: وہ جملہ جس میں سوال پوچھا جائے کیا کہلاتا ہے؟",
                "Question 20: وہ حرف جو کسی اسم سے پہلے آکر اس کا تعلق دوسرے الفاظ سے ظاہر کرے کیا کہلاتا ہے؟"
        };

        String options[][] = {
                {"A. مولوی محمد باقر", "B. سر سید احمد خان", "C. مولوی نذیر احمد", "D. نذیر حسین"},
                {"A. مراۃ العروس", "B. توبتہ النصوح", "C. ابن الوقت", "D. فسانۂ مبتلا"},
                {"A. مقطع", "B. مطلع", "C. ردیف", "D. قافیہ"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. اسم نکرہ", "B. اسم معرفہ", "C. اسم جامد", "D. اسم مشتق"},
                {"A. اسم معرفہ", "B. اسم نکرہ", "C. اسم صفت", "D. اسم مصدر"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. اسم", "B. صفت", "C. ضمیر", "D. فعل"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. واحد"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. جمع"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. واحد"},
                {"A. اسم", "B. فعل", "C. حرف عطف", "D. صفت"},
                {"A. بہن", "B. بھائی", "C. بھتیجا", "D. بھانجا"},
                {"A. شیرنی", "B. شیر", "C. ببر", "D. گھاس"},
                {"A. لڑکا", "B. لڑکے", "C. لڑکیوں", "D. لڑکی"},
                {"A. لڑکا", "B. لڑکی", "C. لڑکیاں", "D. لڑکا"},
                {"A. جملہ خبریہ", "B. جملہ استفہامیہ", "C. جملہ امریہ", "D. جملہ تعجبیہ"},
                {"A. حرف عطف", "B. حرف ربط", "C. حرف جار", "D. حرف ندا"}
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
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
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