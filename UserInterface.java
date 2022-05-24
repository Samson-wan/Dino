import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.BoxLayout;

public class UserInterface {
  JFrame mainWindow = new JFrame("T-Rex Run");
  JPanel textPanel = new JPanel();
  JButton startButton = new JButton("Start");

  public static int WIDTH = 800;
  public static int HEIGHT = 500;



  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    String text = button.getText();
    if (text.equals("Start")) {
      createAndShowGUI();
    }
  }

  public void createAndShowGUI() {
    textPanel.add(startButton);
    mainWindow.add(textPanel);
    mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container = mainWindow.getContentPane();

    GamePanel gamePanel = new GamePanel();
    gamePanel.addKeyListener(gamePanel);
    gamePanel.setFocusable(true);

    container.setLayout(new BorderLayout());

    container.add(gamePanel, BorderLayout.CENTER);

    mainWindow.setSize(WIDTH, HEIGHT);
    mainWindow.setResizable(false);
    mainWindow.setVisible(true);
  }
  
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new UserInterface().createAndShowGUI();
      }
    });
  }
}