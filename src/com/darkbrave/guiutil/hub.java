package com.darkbrave.guiutil;

import com.darkbrave.guiutil.tools.WebsiteOpener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.AccessDeniedException;

public class hub {
    private JButton calculatorButton;
    private JButton websiteOpenerButton;
    private JButton aboutButton;
    private JButton closeButton;
    private JButton textFormatterButton;
    private JButton sizeConverterButton;
    private JPanel hubPanel;
    private JLabel titleLabel;
    private JLabel stencilA;
    private JLabel stencilB;

    public hub() {

        JFrame jr = new JFrame();
        jr.setTitle("GUI Utilities");
        jr.setVisible(true);
        jr.setSize(512,512);
        jr.setContentPane(this.hubPanel);
        jr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jr.pack();
        jr.setResizable(false);
        jr.setLocationRelativeTo(null);

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jr, "A small program with some tools I made.");
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        websiteOpenerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WebsiteOpener websiteOpener = new WebsiteOpener();
            }
        });
        calculatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
