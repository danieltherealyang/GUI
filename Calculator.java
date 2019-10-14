import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Calculator {
    public void add(){
        Main main = new Main();
        main.getFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter numbers to add");
        JTextField field = new JTextField(15);
        field.addKeyListener(new KeyAdapter() //field accept numbers only
            {
                public void keyTyped(KeyEvent ke)
                {
                 char c = ke.getKeyChar();
                    if(!Character.isDigit(c) && (c != '\b'))
                    {
                        ke.consume();
                    }
                }
                public void keyReleased(KeyEvent e){}
                public void keyPressed(KeyEvent e){}
            });
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
        main.getFrame().add(BorderLayout.SOUTH, panel);
        main.getFrame().add(area);
        main.getFrame().setVisible(true);
    }
    
    public void subtract() {
        Main main = new Main();
        main.getFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter numbers to subtract");
        JTextField field = new JTextField(15);
        field.addKeyListener(new KeyAdapter() //field accept numbers only
            {
                public void keyTyped(KeyEvent ke)
                {
                 char c = ke.getKeyChar();
                    if(!Character.isDigit(c) && (c != '\b'))
                    {
                        ke.consume();
                    }
                }
                public void keyReleased(KeyEvent e){}
                public void keyPressed(KeyEvent e){}
            });
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
        main.getFrame().add(BorderLayout.SOUTH, panel);
        main.getFrame().add(area);
        main.getFrame().setVisible(true);
    }
    
}