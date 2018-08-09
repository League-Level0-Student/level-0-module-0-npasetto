package strings_and_dialogs;

import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null, "I know all the thingies you did last summer! The world will know what you did, "+ name + ". MWAHAHAHAHA!");
	
}
}
