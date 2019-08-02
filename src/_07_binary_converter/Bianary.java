package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bianary implements ActionListener {
public void bianary() {
	JFrame frame = new JFrame("Bianary Converter");
JPanel panel = new JPanel();
frame.add(panel);
JButton button = new JButton("Convert");
panel.add(button);
button.addActionListener(this);
JTextField answer = new JTextField(20);
frame.setVisible(true);
panel.setVisible(true);
panel.add(answer);

}


public void actionPerformed(ActionEvent e) {
	
	
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}



}
