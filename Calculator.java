import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Calculator {
    JFrame frame;
    public void add() {
        frame = new JFrame("Portfolio");                 
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
        frame.setSize(new Dimension(700,400));
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter numbers to add");
        JTextField field = new JTextField(15);
        KeyListener keyListener = new KeyListener();
        keyListener.DigitOnly(field);
        
             
        JButton enter = new JButton("Enter");
        JButton equals = new JButton("Equals");
        JButton New = new JButton("New");
        
        JTextArea area = new JTextArea();
        area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        area.setEditable(false);
        
        ArrayList<Integer> numList = new ArrayList<>();
        enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String fieldnumber = field.getText();
                field.setText("");
                int num = Integer.parseInt(fieldnumber);
                numList.add(num);
                area.append(num + " " + "+" + " ");
            }                    
        });
         
        equals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int sum = 0;
                for (int i : numList){
                    sum = sum + i;
                }
                String StrSum = Integer.toString(sum);
                String result = area.getText().substring(0,area.getText().length() - 2);
                area.setText(result);
                area.append(" = " + StrSum);
                field.setEditable(false);
            }
        });
        
        New.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                numList.clear();
                area.setText("");
                field.setEditable(true);
                field.setText("");
            }
        });
        panel.add(label);
        panel.add(field);
        panel.add(enter);
        panel.add(equals);
        panel.add(New);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.add(area);
        frame.setVisible(true);
    }
    
    public void subtract() {
        frame = new JFrame("Portfolio");                 
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
        frame.setSize(new Dimension(700,400));
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter numbers to subtract");
        JTextField field = new JTextField(15);
        KeyListener keyListener = new KeyListener();
        keyListener.DigitOnly(field);
        
             
        JButton enter = new JButton("Enter");
        JButton equals = new JButton("Equals");
        JButton New = new JButton("New");
        
        JTextArea area = new JTextArea();
        area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        area.setEditable(false);
        
        ArrayList<Integer> numList = new ArrayList<>();
        enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String fieldnumber = field.getText();
                field.setText("");
                int num = Integer.parseInt(fieldnumber);
                numList.add(num);
                area.append(num + " " + "-" + " ");
            }                    
        });
         
        equals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int sum = 2 * numList.get(0);
                for (int i : numList){
                    sum = sum - i;
                }
                String StrSum = Integer.toString(sum);
                String result = area.getText().substring(0,area.getText().length() - 2);
                area.setText(result);
                area.append(" = " + StrSum);
                field.setEditable(false);
            }
        });
        
        New.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                numList.clear();
                area.setText("");
                field.setEditable(true);
                field.setText("");
            }
        });
        panel.add(label);
        panel.add(field);
        panel.add(enter);
        panel.add(equals);
        panel.add(New);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.add(area);
        frame.setVisible(true);
    }
}