package Class.Class12.Math.MathDashboard;


import javax.swing.*;
import java.awt.*;
import Class.Class6.Class6Dashboard.Class6Dashboard;

public class MathDashboard {
    public MathDashboard() {
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
        welcomeLabel.setText("<html><u>Welcome To Quiz</u></html>");
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("ARIAL", Font.BOLD, 18));
        welcomeLabel.setLayout(null);
        welcomeLabel.setBounds(120, 25, 190, 30);
        panel.add(welcomeLabel);

        JButton button6 = buttonField("Easy Test", 80);
        button6.addActionListener(e -> {

            frame.dispose();
        });

        JButton button7 = buttonField("Medium Test", 120);
        button7.addActionListener(e -> {

            frame.dispose();
        });

        JButton button8 = buttonField("Difficult Test", 160);
        button8.addActionListener(e -> {

            frame.dispose();
        });

        JButton backButton = buttonField("Back", 380);
        backButton.setBackground(Color.RED);
        backButton.addActionListener(e -> {
            new Class6Dashboard();
            frame.dispose();
        });
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(backButton);
        // ================== CLASS 6TH BUTTON ================== //

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

