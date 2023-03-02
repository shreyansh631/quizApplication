/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton Proceed, close;
    JTextField ename;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
            JLabel heading = new JLabel("ExamIn Quiz");
        heading.setBounds(122, 60, 300, 45);
        heading.setFont(new Font("Raleway", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel name = new JLabel("Your name :");
        name.setBounds(85, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        name.setForeground(new Color(1, 1, 1));
        add(name);
        
        ename = new JTextField();
        ename.setBounds(75, 200, 300, 25);
        ename.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(ename);
        
        Proceed = new JButton("Proceed");
        Proceed.setBounds(75, 270, 120, 25);
        Proceed.setBackground(new Color(30, 144, 254));
        Proceed.setForeground(Color.WHITE);
        Proceed.addActionListener(this);
        add(Proceed);
        
        close = new JButton("Back");
        close.setBounds(275, 270, 120, 25);
        close.setBackground(new Color(30, 144, 254));
        close.setForeground(Color.WHITE);
        close.addActionListener(this);
        add(close);
        
        setSize(500, 500);
        setLocation(510, 150);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent obj) {
        if (obj.getSource() == Proceed) {
            String name = ename.getText();
            setVisible(false);
            new Rules(name);
        } else if (obj.getSource() == close) {
            setVisible(false);
        }
    }
    public static void main(String args[]){
      new Login();
    }
}
