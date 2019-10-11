import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main{
    public Main(){
        frame();
    }
    JFrame frame;
    public void frame(){
        frame = new JFrame("Portfolio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600,400));
        frame.setLocationRelativeTo(null);
        
        JMenuItem monkeyJump, pigLatin, palindrome, shorthand;
        JMenu calculator;
        JMenuItem add, subtract, multiply;
        monkeyJump = new JMenuItem("Monkey Jumpers");
        calculator = new JMenu("Calculator");
            add = new JMenuItem("Add");
            add.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    add();
                }
            });
            subtract = new JMenuItem("Subtract");
            multiply = new JMenuItem("Multiply"); 
        pigLatin = new JMenuItem("PigLatinator");
        palindrome = new JMenuItem("Palindrome");
        shorthand = new JMenuItem("Shorthand");
        
        calculator.add(add);
        calculator.add(subtract);
        calculator.add(multiply);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menu.setLayout(new GridLayout(0,1));
        menu.add(monkeyJump);
        menu.add(calculator);
        menu.add(pigLatin);
        menu.add(palindrome);
        menu.add(shorthand);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    
    public void add(){
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
    
    public static void main(String args[])
    {
        new Main();
    }
}