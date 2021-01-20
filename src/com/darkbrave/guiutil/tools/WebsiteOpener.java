package com.darkbrave.guiutil.tools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WebsiteOpener {
    private JTextField websiteURLField;
    private JButton cancelButton;
    private JButton openWebsiteButton;
    private JPanel websiteOpenerPanel;
    private JLabel websiteURLLabel;
    private JLabel stencilB;
    private JLabel stencilA;

    public WebsiteOpener() {
        JFrame jr = new JFrame();
        jr.setTitle("Website Opener");
        jr.setVisible(true);
        jr.setSize(512,512);
        jr.setContentPane(this.websiteOpenerPanel);
        jr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jr.pack();
        jr.setResizable(false);
        jr.setLocationRelativeTo(null);

        openWebsiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = websiteURLField.getText();
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(new URI(url));
                    } catch (IOException | URISyntaxException i) {
                        i.printStackTrace();
                    }
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jr.dispose();
            }
        });
    }
}
