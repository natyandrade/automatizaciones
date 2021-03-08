package com.devco.qa.travelocity.manual.lib;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.junit.Assert;


public class ManualTest {

	public ManualTest() {

	}
	
	public static void validate(String step, String nameScenario) {
		
		int YES = 1;
		String reason = "";
		String[] options = new String[] {"No", "Yes"};
		int value = 0;
		int optionSelected = JOptionPane.showOptionDialog(new JFrame(), "The step \"" + step + "\" was executed correctaly?", nameScenario, -1, 1, (Icon)null, options, options[0]);
		if(optionSelected == 1) {
			value = 1;
		}else if(optionSelected == 0){
			value = 0;
		}
		if (optionSelected ==0) {
			reason = JOptionPane.showInputDialog("Enter the reason why the test did not run correctly");
		}
			Assert.assertEquals(reason, YES, value);
	}

}
