package com.O6926_yogi_ta.project.View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DFA-Agent02
 */
public class Wrong extends JFrame {
    JTextPane judul1 = new JTextPane();
    JButton Submit = new JButton();
    JPanel myPane = new JPanel();
    
    public Wrong() {
    judul1.setText("Username or Password is WRONG!!");
        judul1.setForeground(Color.RED);
        judul1.setBounds(10,5,295,30);
        add(judul1);
        
        Submit.setBounds(100, 50, 90, 30);
        add(Submit);
        
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //ControllerVIew cvv = new ControllerVIew();
                //cvv.goToLoginVIew();
                //setVisible(false);
            }
        });
        
        myPane.setBackground(Color.YELLOW);
        myPane.setBounds(0,0,300,100);
        add(myPane);
        setTitle("CAUTIONS..!!!");
        setSize(280,100);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
