package com.darkbrave.guiutil.tools;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel calculatorPanel;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button4;
    private JLabel stencilA;
    private JLabel calculatorLabel;
    private JButton a6Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton closeButton;
    private JButton goButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public Calculator(){
        JFrame jr = new JFrame();
        jr.setTitle("Calculator");
        jr.setVisible(true);
        jr.setSize(512,512);
        jr.setContentPane(this.calculatorPanel);
        jr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jr.pack();
        jr.setResizable(false);
        jr.setLocationRelativeTo(null);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jr.dispose();
            }
        });
    }
}
