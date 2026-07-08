package Class.Dashboard;

import javax.swing.*;
import Auth.SignIn;
import java.awt.*;



public class Dashboard {
    
    public Dashboard()
    {

        // ==================== JFRAME ====================
        JFrame frame = new JFrame("Dashboard");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500 , 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // =================== IMAGE ICON BACGROUND ===========
        ImageIcon icon = new ImageIcon("Class/Dashboard/images.jpeg");
        Image img = icon.getImage().getScaledInstance(
                1280, 700, Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(img));
        background.setBounds(0 , 0 , 1280 , 700);
        background.setLayout(null);
        frame.add(background);

        // =================== JPANEL() ==================== //

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(450 , 80 , 400 , 550);
        panel.setBackground(Color.BLACK);
        background.add(panel);

        // ================== WELCOME NOTE ================== //

        JLabel welcomeLabel = new JLabel();
        welcomeLabel.setText("<html><u>Welcome To Quiz</u></html>");
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("ARIAL" , Font.BOLD , 18));
        welcomeLabel.setLayout(null);
        welcomeLabel.setBounds(120 , 25 , 190 , 30);
        panel.add(welcomeLabel);
        

        JButton button6 = buttonField("Class 6th", 80);
        JButton button7 = buttonField("Class 7th", 120);
        JButton button8 = buttonField("Class 8th", 160);
        JButton button9 = buttonField("Class 9th", 200);
        JButton button10 = buttonField("Class 10th", 240);
        JButton button11 = buttonField("Class 11th", 280);
        JButton button12 = buttonField("Class 12th", 320);
        JButton backButton = buttonField("Back", 380);
        backButton.setBackground(Color.RED);
        backButton.addActionListener(e->{
            new SignIn();
        });
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
        panel.add(button11);
        panel.add(button12);
        panel.add(backButton);
        // ================== CLASS 6TH BUTTON ================== //

    }

    public JButton buttonField(String buttonName,int y)
    {
        JButton btnField = new JButton();

        btnField.setBounds(100 , y ,220 , 30 );
        btnField.setLayout(null);
        btnField.setBackground(Color.BLUE);
        btnField.setText(buttonName);
        btnField.setFont(new Font("Arial" , Font.BOLD , 20));
       
        return btnField;
        
    }
}


