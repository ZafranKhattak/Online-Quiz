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

        int correctAnswers[] = {
                1,  // Q1: تین (لفظ کی 3 اقسام: اسم، فعل، حرف)
                1,  // Q2: تین (کلمہ کی 3 اقسام)
                2,  // Q3: چار (اسم کی 4 اقسام)
                1,  // Q4: اسم معرفہ
                1,  // Q5: اسم نکرہ
                1,  // Q6: فعل
                1,  // Q7: تین (فعل کے 3 زمانے)
                0,  // Q8: فعل ماضی
                1,  // Q9: فعل حال
                2,  // Q10: فعل مستقبل
                2,  // Q11: صفت
                2,  // Q12: ضمیر
                2,  // Q13: متکلم
                1,  // Q14: حاضر
                0,  // Q15: غائب
                2,  // Q16: حرف عطف
                0,  // Q17: بہن
                0,  // Q18: شیرنی
                2,  // Q19: لڑکیوں
                0   // Q20: لڑکا
        };

        // Create radio buttons and store them in a 2D array
        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 200), (i * 60 + 130), 200, 30);
                btn.setForeground(Color.WHITE);
                btn.setBackground(Color.BLACK);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                btn.setActionCommand(String.valueOf(j));
                group.add(btn);
                panel.add(btn);
                radioButtons[i][j] = btn;
            }
        }

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(80, 1280, 500, 30);
        resultLabel.setForeground(Color.YELLOW);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(resultLabel);

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setLayout(null);
        buttonSubmit.setBounds(750, 1340, 200, 30);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSubmit.addActionListener(e -> {
            int score = 0;
            int totalQuestions = questions.length;
            
            // Check each question
            for (int i = 0; i < totalQuestions; i++) {
                for (int j = 0; j < 4; j++) {
                    if (radioButtons[i][j].isSelected() && j == correctAnswers[i]) {
                        score++;
                        break;
                    }
                }
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to submit?", 
                "Confirm Submission", 
                JOptionPane.YES_NO_OPTION);
                
            if (confirm == JOptionPane.YES_OPTION) {
                double percentage = (double) score / totalQuestions * 100;
                String grade;
                if (percentage >= 80) {
                    grade = "Excellent!";
                } else if (percentage >= 60) {
                    grade = "Good!";
                } else if (percentage >= 40) {
                    grade = "Fair";
                } else {
                    grade = "Needs Improvement";
                }
                
                String message = String.format(
                    "<html><body style='text-align: center;'>" +
                    "<h2>Quiz Results</h2>" +
                    "<p>Total Questions: %d</p>" +
                    "<p>Correct Answers: %d</p>" +
                    "<p>Wrong Answers: %d</p>" +
                    "<p>Percentage: %.1f%%</p>" +
                    "<p>Grade: %s</p>" +
                    "</body></html>",
                    totalQuestions, score, totalQuestions - score, percentage, grade
                );
                
                JOptionPane.showMessageDialog(null, message, "Quiz Results", JOptionPane.INFORMATION_MESSAGE);
                resultLabel.setText(String.format("Score: %d/%d (%.1f%%)", score, totalQuestions, percentage));
            }
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