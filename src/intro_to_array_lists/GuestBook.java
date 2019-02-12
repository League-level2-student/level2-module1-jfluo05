package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addGuestButton = new JButton();
	JButton viewGuestButton = new JButton();
	String guest1;
	String guest2;
	String guest3;
	String guest4;
	ArrayList<String> guestBook = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.createUI();
	}

	void createUI() {
		// Create a GUI with two buttons. One button reads "Add Name" and the other
		// button reads "View Names".
		frame.setVisible(true);

		panel.add(addGuestButton);
		panel.add(viewGuestButton);
		frame.add(panel);

		addGuestButton.setText("Add Name");
		viewGuestButton.setText("View Names");

		addGuestButton.addActionListener(this);
		viewGuestButton.addActionListener(this);

		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		// When the add name button is clicked, display an input dialog that asks the
		// user to enter a name. Add
		// that name to an ArrayList.
		if (e.getSource() == addGuestButton) {
			addGuests();
		}

		// When the "View Names" button is clicked, display a message dialog that
		// displays
		if (e.getSource() == viewGuestButton) {
			viewGuests();
		}
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}

	void addGuests() {
		guest1 = JOptionPane.showInputDialog("Enter the name of your first guest...");
		guestBook.add(guest1);
	}

	void viewGuests() {
		String message = "";
		for (int i = 0; i < guestBook.size(); i++) {
			String s = guestBook.get(i);
			message += "Guest #" + (i + 1) + ": " + s + "\n";
		}
		JOptionPane.showMessageDialog(null, message);
	}
}
