package Class.Class6.Arabic.Hard;

import Class.Class6.Arabic.ArabicDashboard.ArabicDashboard;
import javax.swing.*;
import java.awt.*;

public class DifficultQuestion {

    public DifficultQuestion() {

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
                "Question 1: Feminine of \"طَالِب\" is:",
                "Question 2: Dual of \"قَلَم\" is:",
                "Question 3: Plural of \"أَمْر\" is:",
                "Question 4: \"هَذَانِ\" refers to:",
                "Question 5: The verb \"يَكْتُبُ\" means:",
                "Question 6: Root of \"مَكْتَبَة\" is:",
                "Question 7: \"كَمْ سِعْرُ هَذَا؟\" asks about:",
                "Question 8: Past tense of \"يَذْهَبُ\" is:",
                "Question 9: \"الَّذِي\" is used for:",
                "Question 10: \"إِلَى الْمَدْرَسَةِ\" indicates:",
                "Question 11: Opposite of \"قَرِيب\" is:",
                "Question 12: Imperative of \"يَقْرَأُ\" is:",
                "Question 13: \"مَتَى\" is used for:",
                "Question 14: Broken plural of \"كِتَاب\" is:",
                "Question 15: \"فِي\" is a:",
                "Question 16: \"لَا تَكْتُبْ\" is a:",
                "Question 17: \"عَلِمَ\" is the past form of:",
                "Question 18: \"أَيْنَ\" is used for:",
                "Question 19: Singular of \"أَوْلَاد\" is:",
                "Question 20: \"كَانَ يَكْتُبُ\" indicates:"
        };

        String options[][] = {
                {
                        "A. طالبة",
                        "B. طلاب",
                        "C. طالبون",
                        "D. دراسة"
                },
                {
                        "A. أقلام",
                        "B. قلمان",
                        "C. قلمين",
                        "D. قلامة"
                },
                {
                        "A. أمور",
                        "B. أوامر",
                        "C. أمران",
                        "D. مأمور"
                },
                {
                        "A. These (male)",
                        "B. These (female)",
                        "C. Those (male)",
                        "D. That (female)"
                },
                {
                        "A. He wrote",
                        "B. He writes",
                        "C. He will write",
                        "D. Write (command)"
                },
                {
                        "A. ك-ت-ب",
                        "B. م-ك-ت",
                        "C. ك-ت-ة",
                        "D. ب-ت-ك"
                },
                {
                        "A. Quality",
                        "B. Price",
                        "C. Time",
                        "D. Place"
                },
                {
                        "A. ذهب",
                        "B. يذهب",
                        "C. اذهب",
                        "D. ذاهب"
                },
                {
                        "A. Who (female)",
                        "B. Who (male)",
                        "C. Which (plural)",
                        "D. That (female)"
                },
                {
                        "A. From school",
                        "B. To school",
                        "C. In school",
                        "D. At school"
                },
                {
                        "A. بعيد",
                        "B. كبير",
                        "C. صغير",
                        "D. جديد"
                },
                {
                        "A. قرأ",
                        "B. يقرأ",
                        "C. اقرأ",
                        "D. مقروء"
                },
                {
                        "A. Who",
                        "B. Why",
                        "C. When",
                        "D. How"
                },
                {
                        "A. كتبة",
                        "B. كتب",
                        "C. كتابان",
                        "D. مكتب"
                },
                {
                        "A. Conjunction",
                        "B. Preposition",
                        "C. Verb",
                        "D. Noun"
                },
                {
                        "A. Affirmative",
                        "B. Negative",
                        "C. Question",
                        "D. Exclamation"
                },
                {
                        "A. Knowledge",
                        "B. Writing",
                        "C. Reading",
                        "D. Sitting"
                },
                {
                        "A. Who",
                        "B. Why",
                        "C. Where",
                        "D. How much"
                },
                {
                        "A. ولد",
                        "B. والدة",
                        "C. مولد",
                        "D. توليد"
                },
                {
                        "A. Past continuous",
                        "B. Past simple",
                        "C. Present perfect",
                        "D. Future simple"
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