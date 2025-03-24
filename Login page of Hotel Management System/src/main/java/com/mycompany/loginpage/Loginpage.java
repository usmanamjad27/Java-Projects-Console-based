/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginpage;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class Loginpage {
public static void main(String[] args) {
      
        // Create the main frame
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocation(260,140);
        
        frame.setLayout(null);
         
//        ImageIcon imageIcon = new ImageIcon(login.class.getResource("/images/hotel.jpeg"));
//
////        Image i1= imageIcon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
////        JLabel label=new JLabel(imageIcon);
////        label.setBounds(35,30,150,150);
//        label.add(label);

        // Gradient background panel
        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                Color color1 = new Color(238, 77, 93); // Pinkish color
                Color color2 = new Color(87, 117, 144); // Blueish color
                GradientPaint gp = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        gradientPanel.setBounds(0, 0, 800, 500);
        
        gradientPanel.setLayout(null);

        // Left Panel: Member Login
        JPanel loginPanel = new JPanel();
        loginPanel.setBounds(50, 100, 300, 300);
        loginPanel.setBackground(new Color(0, 0, 0, 150));
        loginPanel.setLayout(null);

        JLabel loginLabel = new JLabel("Member Login");
        loginLabel.setForeground(Color.WHITE);
        loginLabel.setFont(new Font("Arial", Font.BOLD, 20));
        loginLabel.setBounds(85, 20, 200, 30);
        loginPanel.add(loginLabel);

        JTextField usernameField = new JTextField("Username");
        usernameField.setBounds(50, 80, 200, 30);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 14));
        usernameField.setForeground(Color.GRAY);
        loginPanel.add(usernameField);

        JPasswordField passwordField = new JPasswordField("Password");
        passwordField.setBounds(50, 130, 200, 30);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setForeground(Color.GRAY);
        loginPanel.add(passwordField);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(50, 200, 200, 40);
        loginButton.setBackground(new Color(238, 77, 93));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setFocusPainted(false);
        loginButton.setBorderPainted(false);
        loginPanel.add(loginButton);

        JLabel forgotPasswordLabel = new JLabel("Forgot Password?");
        forgotPasswordLabel.setForeground(Color.LIGHT_GRAY);
        forgotPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        forgotPasswordLabel.setBounds(100, 250, 150, 20);
        loginPanel.add(forgotPasswordLabel);

        gradientPanel.add(loginPanel);

        // Right Panel: Sign Up
        JPanel signupPanel = new JPanel();
        signupPanel.setBounds(450, 100, 300, 300);
        signupPanel.setBackground(new Color(0, 0, 0, 150));
        signupPanel.setLayout(null);

        JLabel signupLabel = new JLabel("Sign Up");
        signupLabel.setForeground(Color.WHITE);
        signupLabel.setFont(new Font("Arial", Font.BOLD, 20));
        signupLabel.setBounds(110, 20, 200, 30);
        signupPanel.add(signupLabel);

        JLabel signupInfoLabel = new JLabel("Using your social media account");
        signupInfoLabel.setForeground(Color.LIGHT_GRAY);
        signupInfoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        signupInfoLabel.setBounds(60, 60, 200, 20);
        signupPanel.add(signupInfoLabel);

        JButton gmailButton = new JButton("Gmail");
        gmailButton.setBounds(50, 100, 200, 40);
        gmailButton.setBackground(new Color(234, 67, 53));
        gmailButton.setForeground(Color.WHITE);
        gmailButton.setFont(new Font("Arial", Font.BOLD, 14));
        gmailButton.setFocusPainted(false);
        signupPanel.add(gmailButton);

        JButton facebookButton = new JButton("Facebook");
        facebookButton.setBounds(50, 160, 200, 40);
        facebookButton.setBackground(new Color(59, 89, 152));
        facebookButton.setForeground(Color.WHITE);
        facebookButton.setFont(new Font("Arial", Font.BOLD, 14));
        facebookButton.setFocusPainted(false);
        signupPanel.add(facebookButton);

        JButton twitterButton = new JButton("Twitter");
        twitterButton.setBounds(50, 220, 200, 40);
        twitterButton.setBackground(new Color(29, 161, 242));
        twitterButton.setForeground(Color.WHITE);
        twitterButton.setFont(new Font("Arial", Font.BOLD, 14));
        twitterButton.setFocusPainted(false);
        signupPanel.add(twitterButton);

        gradientPanel.add(signupPanel);

        // Add gradient panel to the frame
        frame.add(gradientPanel);
        frame.setVisible(true);
       

/**
 *
 * @author Dell
 */
 
    
        String url = "jdbc:mysql://127.0.0.1:3306/user_management";
        String user = "root"; // Replace with your MySQL username
        String password = "Usman27@"; // Replace with your MySQL password

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");
            
            // Example query
            String query = "SELECT * FROM users";
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }
}




  
