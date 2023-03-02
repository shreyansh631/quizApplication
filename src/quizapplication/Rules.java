
package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Hey " + name + ", Are YOU ready ?");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Raleway", Font.BOLD, 28));
        heading.setForeground(new Color(1, 1, 1));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Raleway", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. You will have to answer the questions in a given time interval as indicated by the timer" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. All the questions given are compulsory" + "<br><br>" +
                "4. Maintain silence while answering the questions." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, he/she might be guessing" + "<br><br>" +
                "Good Luck !" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(755, 660);
        setLocation(380, 75);
        setVisible(true);
    }

      public void actionPerformed(ActionEvent obj) {
        if (obj.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
      }
      public static void main(String args[]){
       new Rules("User");
      }
}
