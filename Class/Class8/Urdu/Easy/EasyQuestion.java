package Class.Class8.Urdu.Easy;

import Class.Class8.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: اسم کی کتنی اقسام ہیں؟",
                "Question 2: جس اسم سے کسی خاص شخص یا جگہ کا پتہ چلے اسے کیا کہتے ہیں؟",
                "Question 3: جس اسم سے کسی عام چیز کا پتہ چلے اسے کیا کہتے ہیں؟",
                "Question 4: وہ لفظ جو کسی کام کے کرنے یا ہونے کو ظاہر کرے کیا کہلاتا ہے؟",
                "Question 5: فعل کے کتنے زمانے ہیں؟",
                "Question 6: جس فعل سے کام کا ہونا یا کرنا حال میں ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 7: جس فعل سے کام کا ہونا یا کرنا گزرے ہوئے وقت میں ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 8: جس فعل سے کام کا ہونا یا کرنا آنے والے وقت میں ظاہر ہو اسے کیا کہتے ہیں؟",
                "Question 9: وہ لفظ جو اسم کی خوبی یا عیب کو ظاہر کرے کیا کہلاتا ہے؟",
                "Question 10: وہ لفظ جو کسی اسم کی جگہ استعمال ہو کیا کہلاتا ہے؟",
                "Question 11: مونث کی جمع بنائیں: \"لڑکیاں\"",
                "Question 12: مذکر کی جمع بنائیں: \"لڑکے\"",
                "Question 13: اسم کی پہچان کریں: \"لاہور\"",
                "Question 14: اسم کی پہچان کریں: \"گھر\"",
                "Question 15: وہ لفظ جو دو الفاظ کو آپس میں ملاتا ہے کیا کہلاتا ہے؟",
                "Question 16: \"میں\" کس ضمیر کی مثال ہے؟",
                "Question 17: \"تم\" کس ضمیر کی مثال ہے؟",
                "Question 18: \"وہ\" کس ضمیر کی مثال ہے؟",
                "Question 19: مذکر کو مونث میں تبدیل کریں: \"بھائی\"",
                "Question 20: مذکر کو مونث میں تبدیل کریں: \"شیر\""
        };

        String options[][] = {
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. اسم نکرہ", "B. اسم معرفہ", "C. اسم جامد", "D. اسم مشتق"},
                {"A. اسم معرفہ", "B. اسم نکرہ", "C. اسم مشتق", "D. اسم جامد"},
                {"A. اسم", "B. فعل", "C. حرف", "D. صفت"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. اسم", "B. فعل", "C. صفت", "D. حرف"},
                {"A. اسم", "B. صفت", "C. ضمیر", "D. فعل"},
                {"A. لڑکا", "B. لڑکے", "C. لڑکیوں", "D. لڑکی"},
                {"A. لڑکا", "B. لڑکی", "C. لڑکیاں", "D. لڑکا"},
                {"A. اسم نکرہ", "B. اسم معرفہ", "C. فعل", "D. حرف"},
                {"A. اسم نکرہ", "B. اسم معرفہ", "C. ضمیر", "D. صفت"},
                {"A. اسم", "B. فعل", "C. حرف عطف", "D. صفت"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. واحد"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. جمع"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. واحد"},
                {"A. بہن", "B. بھائی", "C. بھتیجا", "D. بھانجا"},
                {"A. شیرنی", "B. شیر", "C. ببر", "D. گھاس"}
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