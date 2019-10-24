import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GUI { 
    
    public GUI() {
        frame();   
    }
    
    JFrame frame;
    public void frame() {
        frame = new JFrame("Portfolio");                 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setSize(new Dimension(800,500));
        frame.setLocationRelativeTo(null);
        
        JMenuItem monkeyJump, pigLatin, shorthand;
        JMenu calculator;
        JMenu palindrome;
        JMenuItem palindromeRev, palindromeRec, palindromeIJ;
        JMenuItem add, subtract, multiply;
        monkeyJump = new JMenuItem("Monkey Jumpers");
        calculator = new JMenu("Calculator");
            add = new JMenuItem("Add");
            add.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Calculator calculator = new Calculator();
                    calculator.add();
                }
            });
            
            subtract = new JMenuItem("Subtract");
            subtract.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Calculator calculator = new Calculator();
                    calculator.subtract();
                }
            });
            multiply = new JMenuItem("Multiply"); 
        pigLatin = new JMenuItem("PigLatinator");
        pigLatin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                PigLatin pigLatin = new PigLatin();
                pigLatin.run();
            }
        });
        palindrome = new JMenu("Palindrome");
        palindromeRev = new JMenuItem("Reverse String");
        palindromeRev.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                PalindromeRev palindromeRev = new PalindromeRev();
                palindromeRev.check();
            }
        });
        
        palindromeRec = new JMenuItem("Recursion");
        palindromeRec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PalindromeRec palindromeRec = new PalindromeRec();
                palindromeRec.check();
            }
        });
        
        palindromeIJ = new JMenuItem("IJ");
        palindromeIJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PalindromeIJ palindromeIJ = new PalindromeIJ();
                palindromeIJ.check();
            }
        });
        shorthand = new JMenuItem("Shorthand");
        
        calculator.add(add);
        calculator.add(subtract);
        calculator.add(multiply);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menu.setLayout(new GridLayout(0,1));
        palindrome.add(palindromeRev);
        palindrome.add(palindromeRec);
        palindrome.add(palindromeIJ);
        menu.add(monkeyJump);
        menu.add(calculator);
        menu.add(pigLatin);
        menu.add(palindrome);
        menu.add(shorthand);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    
    public static void Main(String[] args) {
        new GUI(); 
    }
}


