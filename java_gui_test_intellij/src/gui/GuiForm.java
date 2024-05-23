package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import classes.TimeClass;

public class GuiForm extends JFrame implements ActionListener{
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton launchButton;
    private JButton listButton;
    private JButton clearButton;
    private JButton exitButton;
    TimeClass tm = new TimeClass();

    public GuiForm() {

        this.setContentPane(this.panel1);
        this.setTitle("jSockClient ver 1.4");
        this.setMinimumSize(new Dimension(800, 600));
        this.setPreferredSize(new Dimension(800, 600));
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        this.setButtonStyle(launchButton);
        this.setButtonStyle(exitButton);
        this.setButtonStyle(clearButton);
        this.setButtonStyle(listButton);

        launchButton.addActionListener(this);
        exitButton.addActionListener(this);
        clearButton.addActionListener(this);
        listButton.addActionListener(this);

        URL iconUrl = getClass().getResource("tcp_udp.png");
        Image icon = Toolkit.getDefaultToolkit().getImage(iconUrl);
        this.setIconImage(icon);
        panel1.setBorder(new EmptyBorder(8,8,8,8));

                //this.textArea1.setBounds(100, 30, 250, 100);
        //scroll.setBounds(20, 30, 100, 40);
        //this.panel1.add(textArea1);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == launchButton) {
            textArea1.append(tm.getTimeMilliSec() + "\n");
        }else if(e.getSource() == exitButton){
            System.exit(0);
        }else if(e.getSource() == clearButton) {
            textArea1.setText("");
        }else if(e.getSource() == listButton){
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
