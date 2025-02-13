package org.example;

import javax.swing.*;
import java.awt.*;

public class GirişSayfası  {
    JFrame frame;
    JTextField KullanıcıAdı;

    public GirişSayfası(){
        frame = new JFrame();
        KullanıcıAdı = new JTextField();

        KullanıcıAdı.setPreferredSize(new Dimension(200,30));


        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.add(new JLabel("kullanıcı adı"));
        panel.add(KullanıcıAdı);
        frame.add(panel);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }
}
