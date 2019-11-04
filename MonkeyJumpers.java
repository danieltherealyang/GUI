import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MonkeyJumpers {
    JFrame frame;
    public void add() {
        frame = new JFrame("Portfolio");                 
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
        frame.setSize(new Dimension(700,400));
        frame.setLocationRelativeTo(null);
        JLabel jumper = new JLabel("Jumper");
        JTextField field1 = new JTextField(15);
        JLabel numJumper = new JLabel("How many jumpers?");
        JTextField field2 = new JTextField(8);
        JPanel panel = new JPanel();
        JButton enter = new JButton("Enter");
        JTextArea area = new JTextArea();
        area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        area.setEditable(false);
        
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Jumpers = field1.getText();
                String numJumpers = field2.getText();
                
                
            }
        });
        
        JButton New = new JButton("New");
        
        
        
        panel.add(jumper);
        panel.add(field1);
        panel.add(numJumper);
        panel.add(field2);
        panel.add(enter);
        panel.add(New);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.add(area);
        frame.setVisible(true);
    }
}