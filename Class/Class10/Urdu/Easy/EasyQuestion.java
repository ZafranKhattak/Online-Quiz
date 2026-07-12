package Class.Class10.Urdu.Easy;

import Class.Class10.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: لفظ کی کتنی اقسام ہیں؟",
                "Question 2: کلمہ کی کتنی اقسام ہیں؟",
                "Question 3: اسم کی کتنی اقسام ہیں؟",
                "Question 4: جس اسم سے کسی خاص شخص، جگہ یا چیز کا پتہ چلے اسے کیا کہتے ہیں؟",
                "Question 5: جس اسم سے کسی عام شخص، جگہ یا چیز کا پتہ چلے اسے کیا کہتے ہیں؟",
                "Question 6: وہ لفظ جو کسی کام کے کرنے یا ہونے کو ظاہر کرے کیا کہلاتا ہے؟",
                "Question 7: فعل کے کتنے زمانے ہیں؟",
                "Question 8: جس فعل سے کام کا ہونا یا کرنا گزرے ہوئے وقت میں ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 9: جس فعل سے کام کا ہونا یا کرنا موجودہ وقت میں ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 10: جس فعل سے کام کا ہونا یا کرنا آنے والے وقت میں ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 11: وہ لفظ جو اسم کی خوبی، عیب، رنگ، شکل یا مقدار کو ظاہر کرے کیا کہلاتا ہے؟",
                "Question 12: وہ لفظ جو کسی اسم کی جگہ استعمال ہو کیا کہلاتا ہے؟",
                "Question 13: \"میں\" کس ضمیر کی مثال ہے؟",
                "Question 14: \"تم\" کس ضمیر کی مثال ہے؟",
                "Question 15: \"وہ\" کس ضمیر کی مثال ہے؟",
                "Question 16: وہ لفظ جو دو الفاظ کو آپس میں ملاتا ہے کیا کہلاتا ہے؟",
                "Question 17: مذکر کو مونث میں تبدیل کریں: \"بھائی\"",
                "Question 18: مذکر کو مونث میں تبدیل کریں: \"شیر\"",
                "Question 19: مونث کی جمع بنائیں: \"لڑکیاں\"",
                "Question 20: مذکر کی جمع بنائیں: \"لڑکے\""
        };

        String options[][] = {
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. اسم نکرہ", "B. اسم معرفہ", "C. اسم جامد", "D. اسم مشتق"},
                {"A. اسم معرفہ", "B. اسم نکرہ", "C. اسم صفت", "D. اسم مصدر"},
                {"A. اسم", "B. فعل", "C. حرف", "D. صفت"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. اسم", "B. فعل", "C. صفت", "D. حرف"},
                {"A. اسم", "B. صفت", "C. ضمیر", "D. فعل"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. واحد"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. جمع"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. واحد"},
                {"A. اسم", "B. فعل", "C. حرف عطف", "D. صفت"},
                {"A. بہن", "B. بھائی", "C. بھتیجا", "D. بھانجا"},
                {"A. شیرنی", "B. شیر", "C. ببر", "D. گھاس"},
                {"A. لڑکا", "B. لڑکے", "C. لڑکیوں", "D. لڑکی"},
                {"A. لڑکا", "B. لڑکی", "C. لڑکیاں", "D. لڑکا"}
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
                btn.setBounds(80 + (j * 200), (i * 60 + 130), 200, 30);
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