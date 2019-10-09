import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{
    public Main(){
        frame();
    }
    JFrame frame;
    public void frame(){
        frame = new JFrame("Portfolio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400,400));
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
        JButton enter = new JButton("Enter");
        enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String numbers = field.getText();
            }
        });
        
        panel.add(label);
        panel.add(field);
        panel.add(enter);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);
    }
    
    public static void main(String args[])
    {
        new Main();
    }
}