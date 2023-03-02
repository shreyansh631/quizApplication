package quizapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(380, 150, 760, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Thank you " + name + " for attempting the ExamIn quiz");
        heading.setBounds(95, 30, 700, 30);
        heading.setFont(new Font("Raleway", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(280, 200, 300, 30);
        lblscore.setFont(new Font("Raleway", Font.BOLD, 26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(310, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
