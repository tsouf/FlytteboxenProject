package GUI.Login;

import GUI.SystemFrame;
import Tech.Login;
import Tech.MakeSound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Noah P on 22-05-2017.
 */

public class newLogin_GUI extends JFrame {
    public JTextField usernameTextField;
    JButton loginButton = new JButton("Login");
    public newLogin_GUI(){
        Dimension d = new Dimension(350,200);
        this.setSize(d);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        add(loginButton, BorderLayout.SOUTH);
        loginButtonEvent();

        add(login_create());


        this.setVisible(true);


    }
    public JPanel login_create(){
        JPanel panel1 = new JPanel();
        JLabel user = new JLabel("Employee ID");
        usernameTextField = new JTextField(20);

        panel1.add(user);
        panel1.add(usernameTextField);

        return panel1;
    }
    private void loginUser() {
        Login loginController = new Login();

        String username = usernameTextField.getText();

        boolean found =
                loginController.login(username);

        if(found) {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            this.setVisible(false);
            MakeSound welcome = new MakeSound();
            welcome.playSound("src/welcome.wav");
            JFrame run = new SystemFrame();
            run.setVisible(true);
            run.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(null, "Employee not found.","Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void loginButtonEvent() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }
        });
    }

}
