package Class.Class10.English.Medium;

import Class.Class10.English.EnglishDashboard.EnglishDashboard;
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
                "Question 1: The poet says, \"If we strive, 'tis no disgrace.\" This means:",
                "Question 2: According to \"Try Again,\" what should one do if one's task is hard?",
                "Question 3: The phrase \"Time will bring you your reward\" means:",
                "Question 4: In \"The Happy Prince,\" why did the prince weep?",
                "Question 5: The lesson \"Where is Science Taking Us?\" discusses:",
                "Question 6: The central idea of the poem \"Where the Mind is Without Fear\" is about:",
                "Question 7: The word \"persevere\" in the poem \"Try Again\" means:",
                "Question 8: In \"A Gift for Christmas,\" what was Jim's proud possession?",
                "Question 9: The phrase \"If you would at last prevail\" means:",
                "Question 10: The lesson \"The Secret of Happiness\" teaches:",
                "Question 11: The word \"patience\" in the poem \"Try Again\" means:",
                "Question 12: The future indefinite tense in \"We shall visit our uncle\" indicates:",
                "Question 13: In \"The Home-Coming,\" Phatik Chakravarti was:",
                "Question 14: The phrase \"All that other folk can do\" refers to:",
                "Question 15: The poem \"The Making of the Earth\" is about:",
                "Question 16: A superlative degree of adjective is used in:",
                "Question 17: In \"The Rule of the Road,\" the author discusses:",
                "Question 18: A possessive pronoun is:",
                "Question 19: The word \"prevail\" as used in \"Try Again\" means:",
                "Question 20: The lesson \"Some Glimpses of Ancient Indian Thought and Practices\" mentions:"
        };

        String options[][] = {
                {"A. Trying is shameful", "B. There is no shame in trying hard", "C. Only success matters", "D. Failure is a disgrace"},
                {"A. Give up immediately", "B. Blame others", "C. Keep trying with patience", "D. Change the task"},
                {"A. Success will come with time and effort", "B. Time is not important", "C. Success comes instantly", "D. Reward is not necessary"},
                {"A. He was sad about his statue", "B. He saw the suffering of the poor people", "C. He missed his palace", "D. He was angry at the swallow"},
                {"A. The benefits of science only", "B. The harms of science only", "C. Both the benefits and potential dangers of science", "D. The history of science"},
                {"A. Fear and danger", "B. Freedom and courage", "C. Wealth and power", "D. Nature and beauty"},
                {"A. To give up easily", "B. To continue despite difficulties", "C. To fear failure", "D. To avoid work"},
                {"A. His coat", "B. His gold watch", "C. His car", "D. His house"},
                {"A. If you want to fail", "B. If you want to win in the end", "C. If you want to give up", "D. If you want to rest"},
                {"A. Happiness comes from wealth", "B. Fear is a common enemy", "C. Success is everything", "D. Power leads to happiness"},
                {"A. Anger", "B. Tolerance and perseverance", "C. Laziness", "D. Indifference"},
                {"A. Past action", "B. Present action", "C. Future action", "D. Completed action"},
                {"A. A quiet and obedient boy", "B. The ring-leader among the village boys", "C. A rich businessman", "D. A school teacher"},
                {"A. Only family members", "B. Only children", "C. All people in general", "D. Only rich people"},
                {"A. The creation of life", "B. The formation of the earth and solar system", "C. The history of mankind", "D. The evolution of animals"},
                {"A. \"He is taller than me\"", "B. \"She is the prettiest girl\"", "C. \"The car is fast\"", "D. \"He runs quickly\""},
                {"A. Traffic rules", "B. Personal liberty and social responsibility", "C. Driving safety", "D. Public transport"},
                {"A. I, we, they", "B. Me, him, us", "C. Mine, his, hers", "D. Who, which, that"},
                {"A. To lose", "B. To win or prove more powerful", "C. To give up", "D. To fear"},
                {"A. Modern technology", "B. Values like sharing and unity of life", "C. Western philosophy", "D. Political systems"}
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
                btn.setBounds(80 + (j * 250), (i * 60 + 130), 250, 30);
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
            new EnglishDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}