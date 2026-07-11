package Class.Class6.Urdu.Easy;

import Class.Class6.Urdu.UrduDashboard.UrduDashboard;
import javax.swing.*;
import java.awt.*;

public class EasyQuestion {

    public EasyQuestion() {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ================= JPANEL ======================//
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1300, 700);
        panel.setPreferredSize(new Dimension(1750, 1500));
        panel.setBackground(Color.BLACK);

        // ================= NOTES FOR QUIZ ================== //
        JLabel label = new JLabel();
        label.setLayout(null);
        label.setText("<html>There are four options.Select the correct one<br>Take your time.Best of Luck.</br></html");
        label.setBounds(450, 40, 550, 60);
        label.setForeground(Color.RED);
        label.setFont(new Font("Arial", Font.ITALIC, 18));
        panel.add(label);

        // ================== JScrollPane =================== //

        JScrollPane scroll = new JScrollPane(panel);
        scroll.setBounds(0, 0, 1300, 700);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        frame.add(scroll);
        // ================== QUESTIONS LOGIC ==================;

        String questions[] = {
                "Question 1: \"کتاب\" کی جمع ہے:",
                "Question 2: اسم کی کتنی اقسام ہیں؟",
                "Question 3: \"میں\" کس قسم کا ضمیر ہے؟",
                "Question 4: فعل ماضی کی پہچان ہے:",
                "Question 5: \"بہت\" کیا ہے؟",
                "Question 6: جمع سالم کی مثال ہے:",
                "Question 7: \"علی\" کس قسم کا اسم ہے؟",
                "Question 8: \"وہ\" کس قسم کا ضمیر ہے؟",
                "Question 9: ماضی مطلق کا فعل ہے:",
                "Question 10: \"پر\" کیا ہے؟",
                "Question 11: اسم نکرہ کی پہچان ہے:",
                "Question 12: \"عورت\" کی جمع ہے:",
                "Question 13: فعل مستقبل کی پہچان ہے:",
                "Question 14: \"بڑا\" کیا ہے؟",
                "Question 15: ضمیر حاضر کی مثال ہے:",
                "Question 16: \"لڑکا\" کی جمع ہے:",
                "Question 17: فعل حال کی پہچان ہے:",
                "Question 18: \"تم\" کس قسم کا ضمیر ہے؟",
                "Question 19: اسم صفت کی مثال ہے:",
                "Question 20: ماضی قریب کا فعل ہے:"
        };

        String options[][] = {
                {"A. کتب", "B. کتابیں", "C. کتابات", "D. مکتب"},
                {"A. دو", "B. تین", "C. چار", "D. پانچ"},
                {"A. غائب", "B. حاضر", "C. متکلم", "D. واحد"},
                {"A. تا ہے", "B. تھا", "C. گا", "D. رہا ہے"},
                {"A. اسم", "B. فعل", "C. صفت", "D. حرف"},
                {"A. کتب", "B. مسلمان", "C. معلمین", "D. اولاد"},
                {"A. ذات", "B. صفت", "C. نکرہ", "D. معرفہ"},
                {"A. متکلم", "B. حاضر", "C. غائب", "D. واحد"},
                {"A. کھاتا ہے", "B. کھائے گا", "C. کھایا", "D. کھا رہا ہے"},
                {"A. اسم", "B. فعل", "C. حرف جر", "D. صفت"},
                {"A. مناسب نام", "B. عام نام", "C. ہمیشہ", "D. کبھی نہیں"},
                {"A. عورتیں", "B. عورتاں", "C. عورات", "D. عورتین"},
                {"A. تھا", "B. ہے", "C. گا", "D. رہا ہے"},
                {"A. اسم", "B. فعل", "C. صفت", "D. حرف"},
                {"A. میں", "B. تو", "C. وہ", "D. ہم"},
                {"A. لڑکے", "B. لڑکیاں", "C. لڑکا", "D. لڑکوئی"},
                {"A. تھا", "B. ہے", "C. گا", "D. چکا"},
                {"A. متکلم", "B. حاضر", "C. غائب", "D. جمع"},
                {"A. کتا", "B. نیلا", "C. پانی", "D. باغ"},
                {"A. کھایا", "B. کھایا تھا", "C. کھایا ہے", "D. کھائے گا"}
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