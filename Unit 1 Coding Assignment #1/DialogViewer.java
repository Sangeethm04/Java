    // Sangeeth Menachery
	// Exercise 1.4
	// print “Hello, your name!”

import javax.swing.JOptionPane;
public class DialogViewer {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name +"!");
        String grade = JOptionPane.showInputDialog("What grade are you in?");
        System.out.println(name + " is a " + grade + " at North Hunterdon.");
        System.exit(0);
    }
}
