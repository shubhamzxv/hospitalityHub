package main.java.gui;

import main.java.entity.*;
import main.java.dao.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hospitality Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton addButton = new JButton("Add Hotel");
        addButton.setBounds(10, 20, 160, 25);
        panel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter Hotel Name:");
                String location = JOptionPane.showInputDialog("Enter Hotel Location:");
                String amenities = JOptionPane.showInputDialog("Enter Hotel Amenities:");
                Hotel hotel = new Hotel(name, location, amenities);
                new HotelDAO().addHotel(hotel);
                JOptionPane.showMessageDialog(null, "Hotel Added Successfully");
            }
        });

        // Add more buttons and components as needed
    }
}

