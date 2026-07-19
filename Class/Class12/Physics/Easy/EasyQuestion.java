package Class.Class12.Physics.Easy;

import Class.Class12.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The study of electric charges at rest is called:",
                "Question 2: The SI unit of electric charge is:",
                "Question 3: Coulomb's law describes the force between:",
                "Question 4: An electric field line gives the direction of the force on a:",
                "Question 5: Electric field intensity is a:",
                "Question 6: Electric potential is defined as the work done per unit:",
                "Question 7: The electric potential due to a positive point charge is:",
                "Question 8: The capacitance of a capacitor is measured in:",
                "Question 9: When capacitors are connected in series, the total capacitance is:",
                "Question 10: Current is defined as the rate of flow of:",
                "Question 11: Ohm's law states the relationship between:",
                "Question 12: The resistance of a conductor is measured in:",
                "Question 13: Kirchhoff's first law is based on the conservation of:",
                "Question 14: A Wheatstone bridge is used to measure:",
                "Question 15: The magnetic field produced by a current-carrying wire was discovered by:",
                "Question 16: The Biot-Savart law is used to find the magnetic field due to:",
                "Question 17: Ampere's law is analogous to:",
                "Question 18: The force on a moving charge in a magnetic field is given by:",
                "Question 19: A current-carrying loop behaves like a:",
                "Question 20: A moving coil galvanometer is used to measure:"
        };

        String options[][] = {
                {"A. Current electricity", "B. Electrostatics", "C. Electromagnetism", "D. Thermodynamics"},
                {"A. Ampere", "B. Volt", "C. Coulomb", "D. Ohm"},
                {"A. Two magnetic poles", "B. Two electric charges", "C. Two masses", "D. Two currents"},
                {"A. Positive test charge", "B. Negative test charge", "C. Neutral charge", "D. Magnetic pole"},
                {"A. Scalar quantity", "B. Vector quantity", "C. Tensor quantity", "D. Dimensionless quantity"},
                {"A. Charge", "B. Mass", "C. Time", "D. Distance"},
                {"A. Positive", "B. Negative", "C. Zero", "D. Infinite"},
                {"A. Coulomb", "B. Farad", "C. Volt", "D. Henry"},
                {"A. The sum of individual capacitances", "B. Less than the smallest capacitance", "C. Greater than the largest capacitance", "D. The product of individual capacitances"},
                {"A. Charge", "B. Energy", "C. Power", "D. Mass"},
                {"A. Voltage and charge", "B. Voltage and current", "C. Current and power", "D. Resistance and power"},
                {"A. Ampere", "B. Volt", "C. Ohm", "D. Watt"},
                {"A. Charge", "B. Energy", "C. Momentum", "D. Mass"},
                {"A. Voltage", "B. Current", "C. Resistance", "D. Power"},
                {"A. Faraday", "B. Maxwell", "C. Oersted", "D. Ampere"},
                {"A. A current element", "B. A stationary charge", "C. A changing electric field", "D. A magnetic material"},
                {"A. Gauss's law in electrostatics", "B. Faraday's law", "C. Ohm's law", "D. Coulomb's law"},
                {"A. F = qE", "B. F = qvB sin θ", "C. F = qE + qvB", "D. F = ma"},
                {"A. Magnetic dipole", "B. Electric dipole", "C. Magnetic monopole", "D. Electric monopole"},
                {"A. Voltage", "B. Resistance", "C. Current", "D. Power"}
        };

        int correctAnswers[] = {
                1,  // Q1: Electrostatics
                2,  // Q2: Coulomb
                1,  // Q3: Two electric charges
                0,  // Q4: Positive test charge
                1,  // Q5: Vector quantity
                0,  // Q6: Charge
                0,  // Q7: Positive
                1,  // Q8: Farad
                1,  // Q9: Less than the smallest capacitance
                0,  // Q10: Charge
                1,  // Q11: Voltage and current
                2,  // Q12: Ohm
                0,  // Q13: Charge
                2,  // Q14: Resistance
                2,  // Q15: Oersted
                0,  // Q16: A current element
                0,  // Q17: Gauss's law in electrostatics
                1,  // Q18: F = qvB sin θ
                0,  // Q19: Magnetic dipole
                2   // Q20: Current
        };

        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 230), (i * 60 + 130), 230, 30);
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
                if (percentage >= 80) grade = "Excellent!";
                else if (percentage >= 60) grade = "Good!";
                else if (percentage >= 40) grade = "Fair";
                else grade = "Needs Improvement";
                
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
            new PhysicsDashboard();
            frame.dispose();
        });
        panel.add(buttonBack);
    }
}