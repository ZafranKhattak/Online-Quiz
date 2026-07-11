package Class.Class6.Urdu.Medium;

import Class.Class6.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: \"اسلام آباد\" کس قسم کا اسم ہے؟",
                "Question 2: جمع مونث کی مثال ہے:",
                "Question 3: فعل متعدی کی پہچان ہے:",
                "Question 4: \"بہت خوبصورت\" میں \"بہت\" کیا ہے؟",
                "Question 5: ضمیر واحد غائب کی مثال ہے:",
                "Question 6: مستقبل قریب کا فعل ہے:",
                "Question 7: حرف عطف کی مثال ہے:",
                "Question 8: \"پاکستان\" کس قسم کا اسم ہے؟",
                "Question 9: جمع مکسر کی مثال ہے:",
                "Question 10: فعل لازم کی پہچان ہے:",
                "Question 11: \"سے\" کیا ہے؟",
                "Question 12: ماضی استمراری کا فعل ہے:",
                "Question 13: صفت عددی کی مثال ہے:",
                "Question 14: \"انہوں نے\" کس قسم کا ضمیر ہے؟",
                "Question 15: حال مستقبل کا فعل ہے:",
                "Question 16: \"اس\" کیا ہے؟",
                "Question 17: ماضی بعید کا فعل ہے:",
                "Question 18: صفت ذاتی کی مثال ہے:",
                "Question 19: فعل مجہول کی پہچان ہے:",
                "Question 20: \"میں نے\" کس قسم کا ضمیر ہے؟"
        };

        String options[][] = {
                {"A. ذات", "B. صفت", "C. معرفہ", "D. نکرہ"},
                {"A. مسلمان", "B. مسلمانیں", "C. معلمین", "D. کتب"},
                {"A. پھلنا", "B. چلنا", "C. مارنا", "D. سونا"},
                {"A. اسم", "B. صفت", "C. صفت کی شدت", "D. فعل"},
                {"A. میں", "B. تو", "C. وہ", "D. تم"},
                {"A. جائے گا", "B. جائے گا تھا", "C. جا چکا", "D. جا رہا ہے"},
                {"A. پر", "B. اور", "C. میں", "D. سے"},
                {"A. نکرہ", "B. معرفہ", "C. صفت", "D. فعل"},
                {"A. مسلمان", "B. کتابیں", "C. لڑکے", "D. درخت"},
                {"A. اثر قبول کرے", "B. اثر نہ کرے", "C. مفعول لے", "D. متعدی ہو"},
                {"A. اسم", "B. فعل", "C. حرف جر", "D. صفت"},
                {"A. کھاتا ہے", "B. کھاتا تھا", "C. کھایا", "D. کھائے گا"},
                {"A. پانچ", "B. بڑا", "C. نیلا", "D. میٹھا"},
                {"A. واحد متکلم", "B. جمع حاضر", "C. جمع غائب", "D. واحد حاضر"},
                {"A. جائے گا", "B. جا رہا ہے", "C. جاتا ہے", "D. گیا"},
                {"A. ضمیر", "B. اسم", "C. صفت", "D. حرف"},
                {"A. کھایا", "B. کھایا تھا", "C. کھایا ہے", "D. کھائے گا"},
                {"A. بڑا", "B. پاکستانی", "C. پانچ", "D. نیلا"},
                {"A. فاعل معلوم", "B. مفعول مجہول", "C. فعل متعدی", "D. فعل لازم"},
                {"A. متکلم واحد", "B. حاضر واحد", "C. غائب واحد", "D. متکلم جمع"}
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