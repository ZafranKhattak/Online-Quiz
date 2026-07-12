package Class.Class8.Physics.Easy;

import Class.Class8.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: A push or pull acting on an object is called:",
                "Question 2: The SI unit of force is the:",
                "Question 3: The force that opposes motion between two surfaces in contact is called:",
                "Question 4: The instrument used to measure temperature is called a:",
                "Question 5: The transfer of heat through direct contact is called:",
                "Question 6: A lens that is thicker in the middle than at the edges is called a:",
                "Question 7: The device used to measure electric current is called:",
                "Question 8: Sound is produced by:",
                "Question 9: The law that states the angle of incidence equals the angle of reflection is called the:",
                "Question 10: The bending of light when it passes from one medium to another is called:",
                "Question 11: The standard unit for measuring length is the:",
                "Question 12: The force exerted by a liquid on a surface is called:",
                "Question 13: The unit of electrical resistance is the:",
                "Question 14: A freely suspended bar magnet always aligns itself in which direction?",
                "Question 15: When two magnets are brought closer, their like poles will:",
                "Question 16: The speed of light in air is approximately:",
                "Question 17: The movement of a pendulum is an example of:",
                "Question 18: Heat energy travels from:",
                "Question 19: A material that allows light to pass through it clearly is called:",
                "Question 20: The unit of pressure is the:"
        };

        String options[][] = {
                {"A. Pressure", "B. Force", "C. Friction", "D. Motion"},
                {"A. Joule", "B. Watt", "C. Newton", "D. Pascal"},
                {"A. Gravitational force", "B. Magnetic force", "C. Friction", "D. Muscular force"},
                {"A. Barometer", "B. Thermometer", "C. Speedometer", "D. Ammeter"},
                {"A. Convection", "B. Radiation", "C. Conduction", "D. Evaporation"},
                {"A. Concave lens", "B. Convex lens", "C. Plano lens", "D. Cylindrical lens"},
                {"A. Voltmeter", "B. Ammeter", "C. Galvanometer", "D. Ohmmeter"},
                {"A. Light", "B. Vibrations", "C. Heat", "D. Electricity"},
                {"A. Law of refraction", "B. Law of reflection", "C. Snell's law", "D. Hooke's law"},
                {"A. Reflection", "B. Refraction", "C. Dispersion", "D. Diffraction"},
                {"A. Handspan", "B. Cubit", "C. Metre", "D. Pace"},
                {"A. Tension", "B. Thrust", "C. Pressure", "D. Friction"},
                {"A. Ampere", "B. Volt", "C. Ohm", "D. Watt"},
                {"A. East-West", "B. North-South", "C. North-East", "D. South-West"},
                {"A. Attract each other", "B. Repel each other", "C. Stick together", "D. Cancel each other"},
                {"A. 3 × 10⁶ m/s", "B. 3 × 10⁸ m/s", "C. 3 × 10¹⁰ m/s", "D. 3 × 10⁴ m/s"},
                {"A. Linear motion", "B. Circular motion", "C. Oscillatory motion", "D. Random motion"},
                {"A. Cold to hot body", "B. Hot to cold body", "C. Both directions", "D. Neither direction"},
                {"A. Transparent", "B. Translucent", "C. Opaque", "D. Reflective"},
                {"A. Newton", "B. Pascal", "C. Joule", "D. Watt"}
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
            new PhysicsDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}