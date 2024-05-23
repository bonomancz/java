package gui;

import classes.TimeClass;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class MainForm extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton launchButton;
    private JButton exitButton;
    private JButton clearLogButton;
    private JButton listLogButton;
    TimeClass tm = new TimeClass();

    public MainForm(){
        this.setContentPane(this.panel1);
        this.setTitle("jSockClient ver 1.4");
        this.setMinimumSize(new Dimension(800, 600));
        this.setPreferredSize(new Dimension(800, 600));
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        URL iconUrl = getClass().getResource("gui/tcp_udp.png");
        Image icon = Toolkit.getDefaultToolkit().getImage(iconUrl);
        this.setIconImage(icon);
        panel1.setBorder(new EmptyBorder(8,8,8,8));
        this.textArea1.setEditable(false);
        this.textArea1.requestFocus();
        this.setButtonStyle(launchButton);
        this.setButtonStyle(exitButton);
        this.setButtonStyle(clearLogButton);
        this.setButtonStyle(listLogButton);
        launchButton.addActionListener(this);
        exitButton.addActionListener(this);
        clearLogButton.addActionListener(this);
        listLogButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == launchButton) {
            textArea1.setText(textArea1.getText() + tm.getTimeMilliSec() + "\n");
        }else if(e.getSource() == exitButton){
            System.exit(0);
        }else if(e.getSource() == clearLogButton) {
            textArea1.setText("");
        }else if(e.getSource() == listLogButton){
            textArea1.setText("");
        }
        //System.exit(0);
    }

    private void setButtonStyle(JButton buttonObj){
        buttonObj.setPreferredSize(new Dimension(60,20));
        buttonObj.setBackground(Color.WHITE);
        buttonObj.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        buttonObj.setFont(new Font("Tahoma", Font.PLAIN, 11));
    }
}
