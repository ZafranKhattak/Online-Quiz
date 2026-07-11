package Class.Class6.GeneralScience.Hard;

import javax.swing.*;
import Class.Class6.GeneralScience.GeneralScienceDashboard.GeneralScienceDashboard;
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
                "Question 1: The image formed by a pinhole camera is:",
                "Question 2: When the Sun is behind an object during the evening, the size of its shadow in comparison to the object would be:",
                "Question 3: A shadow of an opaque object is always black regardless of the object's color because:",
                "Question 4: Which of the following statements about the composition of air is correct?",
                "Question 5: The balance of carbon dioxide and oxygen in the atmosphere is maintained through:",
                "Question 6: Which gas is filled in cylinders carried by mountaineers for breathing at high altitudes?",
                "Question 7: For a shadow to be formed, which three things are required?",
                "Question 8: An electric bulb glows when electric current passes through it because:",
                "Question 9: Which of the following is an example of a periodic motion?",
                "Question 10: A fish maintains its balance in water and changes its direction with the help of:",
                "Question 11: Which of the following joints allows movement of the head backward, forward, left, and right?",
                "Question 12: Why does a lump of cotton wool shrink when dipped in water?",
                "Question 13: In a solar eclipse, what is the correct relative position of the Sun, Moon, and Earth?",
                "Question 14: Which of the following materials is translucent?",
                "Question 15: The motion of the needle of a sewing machine is classified as:",
                "Question 16: Fish do not cast a shadow in water because:",
                "Question 17: What is the function of the rib cage in the human body?",
                "Question 18: Which component of air is essential for the process of photosynthesis in plants?",
                "Question 19: In a completely dark room, you cannot see your reflection in a mirror because:",
                "Question 20: A piece of wood floats on water while an iron nail sinks. This is because:"
        };

        String options[][] = {
                {
                        "A. Erect and enlarged",
                        "B. Inverted and diminished",
                        "C. Erect and diminished",
                        "D. Inverted and enlarged"
                },
                {
                        "A. Smaller",
                        "B. Almost zero",
                        "C. Larger",
                        "D. Equal"
                },
                {
                        "A. Light is completely absorbed by the object",
                        "B. The object reflects all colors of light",
                        "C. The shadow is formed due to the absence of light",
                        "D. The object's color is transferred to the shadow"
                },
                {
                        "A. Air contains equal amounts of oxygen and nitrogen",
                        "B. Nitrogen makes up about 78% of air",
                        "C. Oxygen is the most abundant gas in air",
                        "D. Carbon dioxide is the main component of air"
                },
                {
                        "A. Respiration only",
                        "B. Photosynthesis only",
                        "C. Both photosynthesis and respiration",
                        "D. Burning of fuels"
                },
                {
                        "A. Nitrogen",
                        "B. Carbon dioxide",
                        "C. Oxygen",
                        "D. Hydrogen"
                },
                {
                        "A. A source of light, a transparent object, and a screen",
                        "B. A source of light, an opaque object, and a screen",
                        "C. A luminous object, a translucent object, and a wall",
                        "D. A non-luminous object, a mirror, and a surface"
                },
                {
                        "A. The thick connecting wires get heated first",
                        "B. The filament gets heated up and then starts emitting light",
                        "C. The bulb produces electricity from chemicals",
                        "D. The glass bulb itself becomes hot and glows"
                },
                {
                        "A. Motion of a train on a straight track",
                        "B. Motion of a child on a swing",
                        "C. Motion of a ceiling fan",
                        "D. Motion of a cricket ball"
                },
                {
                        "A. Gills",
                        "B. Body scales",
                        "C. Fins",
                        "D. Tail only"
                },
                {
                        "A. Ball and socket joint",
                        "B. Hinge joint",
                        "C. Pivot joint",
                        "D. Gliding joint"
                },
                {
                        "A. The cotton absorbs water and becomes heavy",
                        "B. The air trapped between cotton fibers is displaced by water",
                        "C. The cotton dissolves in water",
                        "D. The water evaporates from the cotton"
                },
                {
                        "A. Earth - Sun - Moon",
                        "B. Sun - Earth - Moon",
                        "C. Sun - Moon - Earth",
                        "D. Moon - Sun - Earth"
                },
                {
                        "A. A sheet of plane glass",
                        "B. A sheet of tracing paper",
                        "C. A wooden door",
                        "D. A steel plate"
                },
                {
                        "A. Circular motion",
                        "B. Linear motion",
                        "C. Periodic motion",
                        "D. Random motion"
                },
                {
                        "A. Fish are transparent",
                        "B. Water absorbs all light",
                        "C. The screen (river bed) is too far away",
                        "D. Fish produce their own light"
                },
                {
                        "A. To protect the brain",
                        "B. To protect the heart and lungs",
                        "C. To allow movement of the neck",
                        "D. To support the arms"
                },
                {
                        "A. Oxygen",
                        "B. Nitrogen",
                        "C. Carbon dioxide",
                        "D. Water vapor"
                },
                {
                        "A. The mirror is not polished enough",
                        "B. Light is required for reflection to occur",
                        "C. The mirror absorbs all light",
                        "D. Shadows prevent reflection"
                },
                {
                        "A. Wood is lighter than water",
                        "B. The density of iron is greater than water",
                        "C. Wood absorbs water and becomes heavy",
                        "D. Iron is a non-metal"
                }
        };

        for (int i = 0; i < questions.length; i++) {
            JLabel label2 = new JLabel(questions[i]);
            // label2.setText(questions[i]);
            label2.setBounds(0, 1 + (i * 60 + 100), 800, 30);
            label2.setForeground(Color.GREEN);
            label2.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(label2);
        }

        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(j * 410, (i * 60 + 130), 400, 30);
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
        buttonSubmit.setFont(new Font("Arila", Font.BOLD, 15));
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
        buttonBack.setFont(new Font("Arila", Font.BOLD, 15));
        buttonBack.addActionListener(e -> {

            new GeneralScienceDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}