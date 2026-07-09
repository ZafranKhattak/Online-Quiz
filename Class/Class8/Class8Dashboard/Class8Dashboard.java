package Class.Class8.Class8Dashboard;

import javax.swing.*;

import Class.Class8.Biology.BiologyDashboard.BiologyDashboard;
import Class.Class8.Urdu.UrduDashboard.UrduDashboard;
import Class.Class8.Math.MathDashboard.MathDashboard;
import Class.Class8.Physics.PhysicsDashboard.PhysicsDashboard;
import Class.Class8.Chemistry.ChemistryDashboard.ChemistryDashboard;
import MainDashboard.MainDashboard;

import java.awt.*;

public class Class8Dashboard {

    public Class8Dashboard() {

        // ==================== JFRAME ====================
        JFrame frame = new JFrame("Dashboard");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // =================== IMAGE ICON BACGROUND ===========
        ImageIcon icon = new ImageIcon("Class/Dashboard/images.jpeg");
        Image img = icon.getImage().getScaledInstance(
                1280, 700, Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(img));
        background.setBounds(0, 0, 1280, 700);
        background.setLayout(null);
        frame.add(background);

        // =================== JPANEL() ==================== //

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(450, 80, 400, 550);
        panel.setBackground(Color.BLACK);
        background.add(panel);

        // ================== WELCOME NOTE ================== //

        JLabel welcomeLabel = new JLabel();
        welcomeLabel.setText("<html><u>Welcome To 8th</u></html>");
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("ARIAL", Font.BOLD, 18));
        welcomeLabel.setLayout(null);
        welcomeLabel.setBounds(120, 25, 190, 30);
        panel.add(welcomeLabel);

        // ===================== BUTTON ==================== //
        JButton button6 = buttonField("Physics", 80);
        button6.addActionListener(e->{
            new PhysicsDashboard();
            frame.dispose();;
        });
        JButton button7 = buttonField("Chemistry", 120);
        button7.addActionListener(e->{
            new ChemistryDashboard();
            frame.dispose();;
        });
        JButton button8 = buttonField("Biology", 160);
        button8.addActionListener(e->{
            new BiologyDashboard();
            frame.dispose();;
        });
        JButton button9 = buttonField("Math", 200);
        button9.addActionListener(e->{
            new MathDashboard();
            frame.dispose();;
        });
        JButton button10 = buttonField("Urdu", 240);
        button10.addActionListener(e->{
            new UrduDashboard();
            frame.dispose();;
        });
        JButton backButton = buttonField("Back", 380);
        backButton.setBackground(Color.RED);
        backButton.addActionListener(e -> {
            new MainDashboard();
            frame.dispose();
        });
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(backButton);

    }

    public JButton buttonField(String buttonName, int y) {
        JButton btnField = new JButton();

        btnField.setBounds(100, y, 220, 30);
        btnField.setLayout(null);
        btnField.setBackground(Color.BLUE);
        btnField.setText(buttonName);
        btnField.setFont(new Font("Arial", Font.BOLD, 20));
        
        return btnField;
    }
}
