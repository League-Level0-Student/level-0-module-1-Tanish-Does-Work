package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		
		int score = 0;
		String Q1 = JOptionPane.showInputDialog(null,"What can travel the world while staying in a corner");
if (Q1.equalsIgnoreCase("A stamp")) {
	score += 1;
	JOptionPane.showMessageDialog(null, "Correct!");
}
else {
	JOptionPane.showMessageDialog(null, "Wrong the correct answer was 'A stamp'");
}
JOptionPane.showMessageDialog(null, "Your score was " + score);
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

