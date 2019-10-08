import javax.swing.*;
import java.awt.*;

class Main{
    public static void main(String args[]){
       JFrame frame = new JFrame("Portfolio");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,400);
       
       //set layout
       frame.setLayout(new GridLayout(3,2));
       frame.add(new JButton("MonkeyJumpers"));
       frame.add(new JButton("Calculator"));
       frame.add(new JButton("PigLatinator"));
       frame.add(new JButton("Palindrome"));
       frame.add(new JButton("Shorthand"));
       frame.setVisible(true);
    }
}