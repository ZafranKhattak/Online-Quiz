package MainDashboard;

import Class.Class10.Class10Dashboard.Class10Dashboard;
import Class.Class11.Class11Dashboard.Class11Dashboard;
import Class.Class12.Class12Dashboard.Class12Dashboard;
import Class.Class6.Class6Dashboard.*;
import Class.Class6.Class6Dashboard.Class6Dashboard;
import Class.Class7.Class7Dashboard.Class7Dashboard;
import Class.Class9.Class9Dashboard.Class9Dashboard;
import Auth.SignIn;
import javax.swing.*;
import java.awt.*;



public class MainDashboard {
    
    public MainDashboard()
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
        button6.addActionListener(e->{
                new Class6Dashboard();
                frame.dispose();
        });

        JButton button7 = buttonField("Class 7th", 120);
        button7.addActionListener(e->{

            new Class7Dashboard();
            frame.dispose();
        });

        JButton button8 = buttonField("Class 8th", 160);
        button8.addActionListener(e->{
            new Class7Dashboard();
            frame.dispose();
        });

        JButton button9 = buttonField("Class 9th", 200);
        button9.addActionListener(e->{
            new Class9Dashboard();
            frame.dispose();
        });

        JButton button10 = buttonField("Class 10th", 240);
        button10.addActionListener(e->{
            frame.dispose();
            new Class10Dashboard();
        });

        JButton button11 = buttonField("Class 11th", 280);
        button11.addActionListener(e->{
            new Class11Dashboard();
            frame.dispose();
        });

        JButton button12 = buttonField("Class 12th", 320);
        button12.addActionListener(e->{
            new Class12Dashboard();
            frame.dispose();
        });
        JButton backButton = buttonField("Back", 380);
        backButton.setBackground(Color.RED);
        backButton.addActionListener(e->{
            new SignIn();
            frame.dispose();
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


