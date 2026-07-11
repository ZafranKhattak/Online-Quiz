package Class.Class6.Urdu.Hard;

import Class.Class6.Urdu.UrduDashboard.UrduDashboard;
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
                "Question 1: \"استاد نے بچوں کو پڑھایا\" میں فعل کس قسم کا ہے؟",
                "Question 2: \"بچہ رو رہا ہے\" میں \"رہا ہے\" کیا ہے؟",
                "Question 3: \"ان کا گھر بڑا ہے\" میں \"ان کا\" کس قسم کا ضمیر ہے؟",
                "Question 4: \"چلنا\" کو فعل متعدی بنائیں:",
                "Question 5: \"بہت سے لوگ آئے\" میں \"بہت سے\" کیا ہے؟",
                "Question 6: ماضی استمراری اور حال استمراری میں فرق کیا ہے؟",
                "Question 7: \"تم نے کیا کیا؟\" میں ضمیر کس قسم کا ہے؟",
                "Question 8: \"مسجد\" کی جمع ہے:",
                "Question 9: \"وہ آیا\" کو ماضی بعید میں بدلیں:",
                "Question 10: صفت نسبتی کی مثال ہے:",
                "Question 11: \"اس نے کتاب پڑھی\" کو مجہول میں بدلیں:",
                "Question 12: فعل امر کی پہچان ہے:",
                "Question 13: \"ان\" کس ضمیر کی جمع ہے؟",
                "Question 14: \"بچہ کھیل رہا ہے\" میں \"رہا ہے\" کس زمانے کا حصہ ہے؟",
                "Question 15: \"بہت\" کی صفت کی شدت ہے:",
                "Question 16: \"گھر\" کی جمع ہے:",
                "Question 17: \"ہم نے\" کس قسم کا ضمیر ہے؟",
                "Question 18: \"کل وہ آئے گا\" میں فعل کس زمانے کا ہے؟",
                "Question 19: صفت کی اقسام ہیں:",
                "Question 20: \"اس نے سنا\" کو فعل لازم میں بدلیں:"
        };

        String options[][] = {
                {"A. لازم", "B. متعدی", "C. مجہول", "D. امر"},
                {"A. فعل ماضی", "B. فعل حال", "C. فعل مستقبل", "D. فعل امر"},
                {"A. متکلم", "B. حاضر", "C. غائب", "D. وصفی"},
                {"A. چلنا", "B. چلانا", "C. چلو", "D. چلا"},
                {"A. اسم", "B. صفت عددی", "C. صفت مقداری", "D. حرف"},
                {"A. وقت کا", "B. فاعل کا", "C. مفعول کا", "D. جنس کا"},
                {"A. متکلم", "B. حاضر", "C. غائب", "D. استفہامی"},
                {"A. مسجدیں", "B. مسجدات", "C. مساجد", "D. مسجدی"},
                {"A. وہ آیا تھا", "B. وہ آیا ہے", "C. وہ آیا تھے", "D. وہ آیا ہوگا"},
                {"A. بڑا", "B. نیلا", "C. پاکستانی", "D. میٹھا"},
                {"A. اس نے کتاب پڑھی گئی", "B. کتاب پڑھی گئی", "C. کتاب نے پڑھی", "D. کتاب اس نے پڑھی"},
                {"A. کھاؤ", "B. کھایا", "C. کھاتے ہیں", "D. کھائیں گے"},
                {"A. وہ", "B. یہ", "C. اس", "D. تم"},
                {"A. ماضی", "B. حال", "C. مستقبل", "D. امر"},
                {"A. بہت بڑا", "B. بڑا", "C. سب سے بڑا", "D. بڑا سا"},
                {"A. گھریں", "B. گھرے", "C. گھر", "D. گھرانے"},
                {"A. متکلم واحد", "B. متکلم جمع", "C. حاضر جمع", "D. غائب جمع"},
                {"A. مطلق", "B. حال", "C. مستقبل قریب", "D. مستقبل بعید"},
                {"A. ذاتی، نسبتی", "B. ذاتی، عددی", "C. ذاتی، نسبتی، عددی، مقداری", "D. نسبتی، عددی، مقداری"},
                {"A. وہ سنا", "B. اس نے سنایا", "C. وہ سن رہا ہے", "D. اس نے سن لیا"}
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