package Class.Class11.Physics.Hard;

import Class.Class11.Physics.PhysicsDashboard.PhysicsDashboard;
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
                "Question 1: The maximum number of significant figures in a measurement of length using a vernier callipers is determined by:",
                "Question 2: If a quantity is expressed as x = a²b³/c^½, the percentage error in x is given by:",
                "Question 3: The relative velocity of two objects moving in opposite directions is:",
                "Question 4: A projectile fired at an angle θ with the horizontal has maximum range when θ is:",
                "Question 5: The maximum height of a projectile is given by:",
                "Question 6: The frictional force between two surfaces is directly proportional to:",
                "Question 7: The coefficient of static friction is generally:",
                "Question 8: The work done by a variable force is equal to:",
                "Question 9: The condition for a body to be in equilibrium is:",
                "Question 10: The radius of gyration of a body is the distance from the axis of rotation to:",
                "Question 11: The acceleration due to gravity at a depth d below the Earth's surface is given by:",
                "Question 12: The time period of a satellite revolving close to the Earth's surface is approximately:",
                "Question 13: The terminal velocity of a sphere falling in a viscous fluid is given by Stokes' law, which states that:",
                "Question 14: The coefficient of viscosity of a fluid is defined as:",
                "Question 15: The work done in an isothermal process is given by:",
                "Question 16: The efficiency of a Carnot engine operating between temperatures T₁ (hot) and T₂ (cold) is:",
                "Question 17: The mean free path of gas molecules is the:",
                "Question 18: The phase difference between displacement and velocity in SHM is:",
                "Question 19: The time period of a simple pendulum is given by:",
                "Question 20: The speed of a wave on a stretched string is given by:"
        };

        String options[][] = {
                {"A. The main scale division", "B. The vernier scale division", "C. The least count of the instrument", "D. The accuracy of the observer"},
                {"A. 2(Δa/a) + 3(Δb/b) + ½(Δc/c)", "B. 2(Δa/a) + 3(Δb/b) - ½(Δc/c)", "C. (Δa/a)² + (Δb/b)³ + (Δc/c)^½", "D. ½(Δa/a) + 3(Δb/b) + 2(Δc/c)"},
                {"A. The sum of their velocities", "B. The difference of their velocities", "C. The product of their velocities", "D. The ratio of their velocities"},
                {"A. 30°", "B. 45°", "C. 60°", "D. 90°"},
                {"A. v² sin²θ / 2g", "B. v² sin θ / g", "C. 2v² sin θ / g", "D. v² sin²θ / g"},
                {"A. The area of contact", "B. The normal reaction", "C. The relative velocity", "D. The time of contact"},
                {"A. Less than the coefficient of kinetic friction", "B. Greater than the coefficient of kinetic friction", "C. Equal to the coefficient of kinetic friction", "D. Zero"},
                {"A. The product of force and displacement", "B. The area under the force-displacement graph", "C. The product of average force and velocity", "D. The impulse of the force"},
                {"A. Net force = 0 and net torque = 0", "B. Net force = 0 only", "C. Net torque = 0 only", "D. Net velocity = 0"},
                {"A. The centre of mass", "B. A point where the total mass is concentrated", "C. The edge of the body", "D. The centre of gravity"},
                {"A. g' = g(1 - d/R)", "B. g' = g(1 + d/R)", "C. g' = g(R/d)", "D. g' = g(d/R)"},
                {"A. 60 minutes", "B. 84 minutes", "C. 120 minutes", "D. 240 minutes"},
                {"A. v = 2r²g(ρ - σ)/9η", "B. v = 9η/2r²g(ρ - σ)", "C. v = 2r²g(ρ + σ)/9η", "D. v = 9η/2r²g(ρ + σ)"},
                {"A. The ratio of shearing stress to shearing strain", "B. The ratio of shearing stress to the velocity gradient", "C. The ratio of volume flow rate to pressure difference", "D. The ratio of density to pressure"},
                {"A. W = nRT ln(V₂/V₁)", "B. W = nRT(V₂ - V₁)", "C. W = nRT ln(P₂/P₁)", "D. W = nRT(P₂ - P₁)"},
                {"A. η = 1 - T₂/T₁", "B. η = 1 - T₁/T₂", "C. η = T₂/T₁", "D. η = T₁/T₂"},
                {"A. Average distance between collisions", "B. Average distance travelled in one second", "C. Average diameter of molecules", "D. Average volume occupied by a molecule"},
                {"A. 0", "B. π/2", "C. π", "D. 3π/2"},
                {"A. T = 2π√(l/g)", "B. T = 2π√(g/l)", "C. T = 2π(l/g)", "D. T = 2π(g/l)"},
                {"A. v = √(T/μ)", "B. v = T/μ", "C. v = √(μ/T)", "D. v = μ/T"}
        };

        int correctAnswers[] = {
                2,  // Q1: The least count of the instrument
                0,  // Q2: 2(Δa/a) + 3(Δb/b) + ½(Δc/c)
                0,  // Q3: The sum of their velocities
                1,  // Q4: 45°
                0,  // Q5: v² sin²θ / 2g
                1,  // Q6: The normal reaction
                1,  // Q7: Greater than the coefficient of kinetic friction
                1,  // Q8: The area under the force-displacement graph
                0,  // Q9: Net force = 0 and net torque = 0
                0,  // Q10: The centre of mass
                0,  // Q11: g' = g(1 - d/R)
                1,  // Q12: 84 minutes
                0,  // Q13: v = 2r²g(ρ - σ)/9η
                1,  // Q14: The ratio of shearing stress to the velocity gradient
                0,  // Q15: W = nRT ln(V₂/V₁)
                0,  // Q16: η = 1 - T₂/T₁
                0,  // Q17: Average distance between collisions
                1,  // Q18: π/2
                0,  // Q19: T = 2π√(l/g)
                0   // Q20: v = √(T/μ)
        };

        JRadioButton[][] radioButtons = new JRadioButton[questions.length][4];
        
        for (int i = 0; i < options.length; i++) {
            ButtonGroup group = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                JRadioButton btn = new JRadioButton(options[i][j]);
                btn.setBounds(80 + (j * 280), (i * 60 + 130), 280, 30);
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