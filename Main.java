import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main extends JFrame{
    public Main(){
        frame();
    }
    
    JFrame frame;
    public void frame(){
        
        frame = new JFrame("Portfolio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(700,400));
        frame.setLocationRelativeTo(null);
        
        JMenuItem monkeyJump, pigLatin, palindrome, shorthand;
        JMenu calculator;
        JMenuItem add, subtract, multiply;
        monkeyJump = new JMenuItem("Monkey Jumpers");
        calculator = new JMenu("Calculator");
            add = new JMenuItem("Add");
            add.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Calculator calculator = new Calculator();
                    calculator.add();
                }
            });
            subtract = new JMenuItem("Subtract");
            subtract.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Calculator calculator = new Calculator();
                    calculator.subtract();
                }
            });
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
    
    public Frame getFrame() {
        return frame;
    }
    
    public static void main(String args[])
    {
        new Main();
    }
}
