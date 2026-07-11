package Class.Class6.Arabic.Medium;

import Class.Class6.Arabic.ArabicDashboard.ArabicDashboard;
import javax.swing.*;
import java.awt.*;

public class MediumQuestion {

    public MediumQuestion() {

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
                "Question 1: \"أَنْتِ\" (Anti) is used for:",
                "Question 2: The feminine form of \"مُعَلِّم\" (teacher) is:",
                "Question 3: \"مَعَ السَّلَامَة\" (Ma'as Salama) means:",
                "Question 4: The correct response to \"شُكْراً\" (Shukran) is:",
                "Question 5: \"أَهْلاً وَسَهْلاً\" (Ahlan wa Sahlan) means:",
                "Question 6: The Arabic word for \"foreign currency\" is:",
                "Question 7: \"الشَّرْق\" (Ash-Sharq) means:",
                "Question 8: The dual form of \"كِتَاب\" (book) is:",
                "Question 9: \"الْأَمْن وَالسَّلَام\" (Al-amn wa-s-salam) means:",
                "Question 10: The demonstrative pronoun \"هَذِهِ\" (hadhihi) is used for:",
                "Question 11: \"صَبَاحُ الْخَيْر\" (Sabahul Khair) is a:",
                "Question 12: The plural of \"طَالِب\" (student) is:",
                "Question 13: \"اللُّغَةُ الْعَرَبِيَّةُ جَمِيلَةٌ\" means:",
                "Question 14: \"مِنْ فَضْلِكَ\" (Min Fadlika) means:",
                "Question 15: The personal pronoun \"هُوَ\" (Huwa) refers to:",
                "Question 16: \"كَيْفَ حَالُكَ؟\" (Kayfa haluka?) means:",
                "Question 17: The singular of \"أَبْوَاب\" (doors) is:",
                "Question 18: \"مَرْحَباً\" (Marhaban) is used to express:",
                "Question 19: The correct preposition for \"I am fond _____ music\" in Arabic (أنا مولع _____ الموسيقى) is:",
                "Question 20: \"الْوَقْتُ\" (Al-Waqt) with the definite article \"ال\" means:"
        };

        String options[][] = {
                {
                        "A. I",
                        "B. You (male)",
                        "C. You (female)",
                        "D. He"
                },
                {
                        "A. معلمون",
                        "B. معلمة",
                        "C. معلمين",
                        "D. تعليم"
                },
                {
                        "A. Welcome",
                        "B. Goodbye",
                        "C. Good morning",
                        "D. Thank you"
                },
                {
                        "A. عفواً",
                        "B. مرحباً",
                        "C. أهلاً",
                        "D. نعم"
                },
                {
                        "A. Goodbye",
                        "B. Welcome",
                        "C. Please",
                        "D. Sorry"
                },
                {
                        "A. العملة المحلية",
                        "B. العملة الأجنبية",
                        "C. العملة الهندية",
                        "D. الدرهم"
                },
                {
                        "A. The west",
                        "B. The north",
                        "C. The east",
                        "D. The south"
                },
                {
                        "A. كتب",
                        "B. كتابان",
                        "C. كتابين",
                        "D. مكتبة"
                },
                {
                        "A. Peace and security",
                        "B. Peace and stability",
                        "C. Peaceful coexistence",
                        "D. War and peace"
                },
                {
                        "A. This (masculine)",
                        "B. This (feminine)",
                        "C. That (masculine)",
                        "D. That (feminine)"
                },
                {
                        "A. Question",
                        "B. Greeting",
                        "C. Command",
                        "D. Farewell"
                },
                {
                        "A. طلاب",
                        "B. طالبة",
                        "C. طالبون",
                        "D. دراسة"
                },
                {
                        "A. Arabic dictionary is good",
                        "B. Arabic dialect is popular",
                        "C. Arabic language is beautiful",
                        "D. Arabic grammar is easy"
                },
                {
                        "A. Thank you",
                        "B. Please (to a male)",
                        "C. Please (to a female)",
                        "D. Welcome"
                },
                {
                        "A. I",
                        "B. You (male)",
                        "C. He",
                        "D. She"
                },
                {
                        "A. What is your name?",
                        "B. Where are you from?",
                        "C. How are you? (to a male)",
                        "D. How are you? (to a female)"
                },
                {
                        "A. باب",
                        "B. بابان",
                        "C. بيوت",
                        "D. كتاب"
                },
                {
                        "A. Goodbye",
                        "B. Welcome/Hello",
                        "C. Sorry",
                        "D. Goodnight"
                },
                {
                        "A. في",
                        "B. على",
                        "C. بـ",
                        "D. من"
                },
                {
                        "A. A time",
                        "B. The time",
                        "C. Times",
                        "D. Timely"
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