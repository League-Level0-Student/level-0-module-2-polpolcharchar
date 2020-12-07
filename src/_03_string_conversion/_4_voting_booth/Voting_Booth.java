package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args) {
	int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
	if(age>=18) {
		JOptionPane.showInputDialog("Who do you think should be president?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
	
	
	
}
}
