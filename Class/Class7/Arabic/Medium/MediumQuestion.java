package Class.Class7.Arabic.Medium;

import Class.Class7.Arabic.ArabicDashboard.ArabicDashboard;
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
                "Question 1: \"مُعَلِّم\" کی جمع مونث ہے:",
                "Question 2: ضمیر متصل کی مثال ہے:",
                "Question 3: \"المبتدأ والخبر\" میں خبر کیسے ہوتی ہے؟",
                "Question 4: \"أنتِ\" کس کے لیے ہے؟",
                "Question 5: فعل مضارع کی پہچان ہے:",
                "Question 6: \"الَّذِي\" کس کے لیے ہے؟",
                "Question 7: ماضی منفی کا فعل ہے:",
                "Question 8: \"ظرف المكان\" کس کو کہتے ہیں؟",
                "Question 9: \"إنَّ\" کس پر اثر ڈالتی ہے؟",
                "Question 10: \"كان\" کس پر اثر ڈالتی ہے؟",
                "Question 11: جمع مذکر سالم کی علامت ہے:",
                "Question 12: \"هما\" کس کے لیے ہے؟",
                "Question 13: \"في\" اور \"على\" ہیں:",
                "Question 14: \"مکتب\" کا مطلب ہے:",
                "Question 15: ضمیر منفصل کی مثال ہے:",
                "Question 16: فعل أمر کی پہچان ہے:",
                "Question 17: \"الفتاة\" کا مطلب ہے:",
                "Question 18: خبر کی اقسام ہیں:",
                "Question 19: \"أين\" کس کے لیے ہے؟",
                "Question 20: اسم اشارہ کی مثال ہے:"
        };

        String options[][] = {
                {"A. معلمات", "B. معلمون", "C. معلمین", "D. تعلیم"},
                {"A. أنا", "B. هو", "C. ي", "D. نحن"},
                {"A. مرفوع", "B. منصوب", "C. مجرور", "D. جزوم"},
                {"A. تم (مرد)", "B. تم (عورت)", "C. ہم", "D. وہ"},
                {"A. كتب", "B. يكتب", "C. سيكتب", "D. اكتب"},
                {"A. عورت", "B. مرد", "C. جمع", "D. کتاب"},
                {"A. كتب", "B. يكتب", "C. لم يكتب", "D. سيكتب"},
                {"A. وقت کا اسم", "B. جگہ کا اسم", "C. فعل کی قسم", "D. ضمیر کی قسم"},
                {"A. المبتدأ", "B. الخبر", "C. الفعل", "D. الحرف"},
                {"A. المبتدأ", "B. الخبر", "C. الفعل", "D. الضمیر"},
                {"A. ات", "B. ون", "C. ين", "D. ان"},
                {"A. دو مرد", "B. دو عورتیں", "C. جمع مرد", "D. واحد"},
                {"A. اسم", "B. فعل", "C. حروف جر", "D. ضمائر"},
                {"A. کتاب", "B. لکھنا", "C. دفتر/آفس", "D. اسکول"},
                {"A. ي", "B. ك", "C. أنا", "D. ها"},
                {"A. اكتب", "B. يكتب", "C. كتب", "D. سيكتب"},
                {"A. لڑکا", "B. لڑکی", "C. عورت", "D. مرد"},
                {"A. مفرد، جملہ", "B. فعل، اسم", "C. ماضی، مضارع", "D. واحد، جمع"},
                {"A. کون", "B. کب", "C. کہاں", "D. کیوں"},
                {"A. كتاب", "B. هذا", "C. هو", "D. أنا"}
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
            new ArabicDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}