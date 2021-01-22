package com.darkbrave.guiutil.tools;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFormatter {
    private JPanel textFormatterPanel;
    private JTextField inputField;
    private JButton removeSpacingButton;
    private JButton closeButton;
    private JLabel titleLabel;
    private JLabel stencilA;
    private JLabel stencilB;

    public TextFormatter() {
        JFrame jr = new JFrame();
        jr.setTitle("GUI Utilities");
        jr.setVisible(true);
        jr.setSize(512,512);
        jr.setContentPane(this.textFormatterPanel);
        jr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jr.pack();
        jr.setResizable(false);
        jr.setLocationRelativeTo(null);

        removeSpacingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                if (input == "Put text here") {
                    JOptionPane.showMessageDialog(jr, "Please edit the text.");
                } else {
                    JOptionPane.showMessageDialog(jr, input);
                }
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jr.dispose();
            }
        });
    }
}
