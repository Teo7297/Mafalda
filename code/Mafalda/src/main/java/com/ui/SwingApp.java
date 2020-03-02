package com.ui;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

@SpringBootApplication
public class SwingApp extends JFrame {

	private static final long serialVersionUID = -6003095918038539714L;

	public SwingApp() {

        initUI();
    }

    private void initUI() {
    	
    	JButton quitButton = new JButton("Quit");
        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });
        
   
        
        //create a panel 
        JPanel panel =new JPanel(); 
          
        //create a new label 
        JLabel label= new JLabel("select the day of the week"); 
        panel.add(label);  
        //String array to store weekdays 
        String[] week= { "Monday","Tuesday","Wednesday", 
                         "Thursday","Friday","Saturday","Sunday"}; 
          
        //create list 
        JList<Object> list= new JList<Object>(week); 
          
        //set a selected index 
        list.setSelectedIndex(0); 
        
          
        //add list to panel 
        panel.add(list); 
       
    

        createLayout(quitButton, panel);

        setTitle("Quit button");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        
        
        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0]).addComponent(arg[1])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0]).addComponent(arg[1])
        );
       
        
        
    }

    public static void main(String[] args) {

        var ctx = new SpringApplicationBuilder(SwingApp.class)
                .headless(false).run(args);

        EventQueue.invokeLater(() -> {

            var ex = ctx.getBean(SwingApp.class);
            ex.setVisible(true);
        });
    }
}