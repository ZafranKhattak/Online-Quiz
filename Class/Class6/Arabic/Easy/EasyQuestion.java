package Class.Class6.Arabic.Easy;

import Class.Class6.Arabic.ArabicDashboard.ArabicDashboard;
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
                "Question 1: \"مَدْرَسَة\" (Madrasah) means:",
                "Question 2: What is the Arabic word for \"book\"?",
                "Question 3: \"شُكْراً\" (Shukran) means:",
                "Question 4: What is the Arabic word for \"sea\"?",
                "Question 5: \"أَنْتَ\" (Anta) is used for:",
                "Question 6: The Arabic word for \"Moon\" is:",
                "Question 7: \"نَعَمْ\" (Na'am) means:",
                "Question 8: The Arabic word for \"teacher\" is:",
                "Question 9: \"الوَقْت\" (Al-Waqt) means:",
                "Question 10: The root word of \"كِتَاب\" (Kitab - book) is:",
                "Question 11: What is the Arabic word for \"house\"?",
                "Question 12: \"صَبَاحُ الخَيْر\" (Sabahul Khair) means:",
                "Question 13: The Arabic word for \"student\" is:",
                "Question 14: \"لا\" (La) means:",
                "Question 15: The Arabic word for \"garden\" is:",
                "Question 16: \"مَسَاءُ الخَيْر\" (Masa-ul Khair) means:",
                "Question 17: The Arabic word for \"pen\" is:",
                "Question 18: \"مِنْ فَضْلِكَ\" (Min Fadlika) means:",
                "Question 19: The Arabic word for \"door\" is:",
                "Question 20: The root word of \"مُعَلِّم\" (Mu'allim - teacher) is:"
        };

        String options[][] = {
                {
                        "A. Student",
                        "B. Teacher",
                        "C. School",
                        "D. Book"
                },
                {
                        "A. قلم",
                        "B. كتاب",
                        "C. دفتر",
                        "D. بيت"
                },
                {
                        "A. Please",
                        "B. Thank you",
                        "C. Sorry",
                        "D. Goodbye"
                },
                {
                        "A. نهر",
                        "B. بحر",
                        "C. جبل",
                        "D. خليج"
                },
                {
                        "A. I",
                        "B. You (male)",
                        "C. You (female)",
                        "D. He"
                },
                {
                        "A. نجم",
                        "B. قمر",
                        "C. شمس",
                        "D. أرض"
                },
                {
                        "A. No",
                        "B. Why",
                        "C. Yes",
                        "D. How"
                },
                {
                        "A. طالب",
                        "B. كتاب",
                        "C. معلم",
                        "D. طبيب"
                },
                {
                        "A. Place",
                        "B. Time",
                        "C. Work",
                        "D. Food"
                },
                {
                        "A. كتب",
                        "B. مكتب",
                        "C. كاتب",
                        "D. كتابة"
                },
                {
                        "A. مسجد",
                        "B. مدرسة",
                        "C. بيت",
                        "D. باب"
                },
                {
                        "A. Good evening",
                        "B. Good night",
                        "C. Good morning",
                        "D. Goodbye"
                },
                {
                        "A. معلم",
                        "B. طالب",
                        "C. مهندس",
                        "D. طبيب"
                },
                {
                        "A. Yes",
                        "B. No",
                        "C. Maybe",
                        "D. Never"
                },
                {
                        "A. حديقة",
                        "B. مدرسة",
                        "C. مسجد",
                        "D. سوق"
                },
                {
                        "A. Good morning",
                        "B. Good evening",
                        "C. Good night",
                        "D. Goodbye"
                },
                {
                        "A. كتاب",
                        "B. قلم",
                        "C. دفتر",
                        "D. حقيبة"
                },
                {
                        "A. Thank you",
                        "B. Please",
                        "C. Sorry",
                        "D. Welcome"
                },
                {
                        "A. جدار",
                        "B. نافذة",
                        "C. باب",
                        "D. سقف"
                },
                {
                        "A. علم",
                        "B. عمل",
                        "C. كتب",
                        "D. طلب"
                }
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

        // ========================= BUTTON FOR SUBMIT ==================== //

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

        // =========================== BACK BUTTON FOR DASHBOARD OF LEVEL
        // ================ //
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