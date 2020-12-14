
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class DataEntry {
	private JTable table;
	{
		File fileName = new File(System.getProperty("user.dir") + "\\AsianCuisineRecord.csv"); //DIRECT to system directory file.
	}
	 
	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataEntry window = new DataEntry();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	 // Create the application.
	public DataEntry() {
		initialize();
	}
	
	//Initialize Contents of the frame.
	private void initialize() {
		JFrame frame = new JFrame(); // JFrame decoration
		
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 897, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel contentBkg = new JPanel(); // JPanel Content background decoration.
		contentBkg.setBackground(Color.DARK_GRAY);
		contentBkg.setBounds(0, 0, 530, 605);
		frame.getContentPane().add(contentBkg);
		contentBkg.setLayout(null);

		JLabel textID = new JLabel("Order#");
		textID.setBounds(22, 85, 74, 14);
		textID.setFont(new Font("Tahoma", Font.BOLD, 14));
		textID.setForeground(new Color(255, 255, 255));
		contentBkg.add(textID);

		JLabel textName = new JLabel("Name");
		textName.setBounds(22, 134, 74, 14);
		textName.setFont(new Font("Tahoma", Font.BOLD, 14));
		textName.setForeground(new Color(255, 255, 255));
		contentBkg.add(textName);

		JLabel textContact = new JLabel("Phone");
		textContact.setBounds(22, 175, 74, 14);
		textContact.setFont(new Font("Tahoma", Font.BOLD, 14));
		textContact.setForeground(new Color(255, 255, 255));
		contentBkg.add(textContact);

		JLabel textCourse = new JLabel("Email");
		textCourse.setBounds(22, 225, 74, 14);
		textCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
		textCourse.setForeground(new Color(255, 255, 255));
		contentBkg.add(textCourse);

		JLabel storeName = new JLabel("Takeout Cuisine");
		storeName.setBounds(22, 11, 485, 57);
		storeName.setHorizontalAlignment(SwingConstants.CENTER);
		storeName.setFont(new Font("Berlin Sans FB", Font.BOLD, 60));
		storeName.setForeground(new Color(255, 255, 255));
		contentBkg.add(storeName);

		JTextField orderNumber = new JTextField();
		orderNumber.setBounds(80, 79, 427, 36);
		contentBkg.add(orderNumber);
		orderNumber.setColumns(10);

		JTextField name = new JTextField();
		name.setBounds(80, 126, 427, 36);
		name.setColumns(10);
		contentBkg.add(name);

		JTextField phone = new JTextField();
		phone.setBounds(80, 173, 427, 36);
		phone.setColumns(10);
		contentBkg.add(phone);

		JTextField email = new JTextField();
		email.setBounds(80, 220, 427, 36);
		email.setColumns(10);
		contentBkg.add(email);
		
		JTextArea commentingArea = new JTextArea();
		commentingArea.setBounds(80, 440, 427, 44);
		contentBkg.add(commentingArea);
		
		JLabel foodImages = new JLabel("");
		foodImages.setIcon(new ImageIcon("images\\pho.png"));
		foodImages.setBounds(564, 43, 487, 326);
		//entireContentBkg.add(foodImages);
		
		JComboBox foodKind = new JComboBox();
		foodKind.setBounds(80, 375, 166, 36);
		foodKind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (foodKind.getSelectedItem() == "Select Here")
				{
					
					foodImages.setIcon(null);
				}
				else if (foodKind.getSelectedItem() == "Pho")
				{
					ImageIcon picture = new ImageIcon("iamges/pho.png");
					foodImages.setIcon(picture);
				}
				
				else if (foodKind.getSelectedItem() == "Fried rice")
				{
					ImageIcon picture1 = new ImageIcon("iamges/friedrice.png");
					foodImages.setIcon(picture1);
				}
				
			}
		});
		
		foodKind.setFont(new Font("Tahoma", Font.BOLD, 14));
		foodKind.setModel(new DefaultComboBoxModel(new String[] {"Pho", "Fried rice"}));
		contentBkg.add(foodKind);

		JLabel textFood = new JLabel("Food");
		textFood.setBounds(80, 350, 114, 14);
		textFood.setForeground(Color.WHITE);
		textFood.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentBkg.add(textFood);

		JComboBox beverageKind = new JComboBox();
		beverageKind.setBounds(347, 375, 160, 36);
		beverageKind.setFont(new Font("Tahoma", Font.BOLD, 14));
		beverageKind.setModel(new DefaultComboBoxModel(new String[] {"Coffee", "Green tea"}));
		contentBkg.add(beverageKind);

		JLabel textBeverage = new JLabel("Beverage");
		textBeverage.setBounds(347, 347, 114, 20);
		textBeverage.setForeground(Color.WHITE);
		textBeverage.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentBkg.add(textBeverage);

		JPanel entireContentBkg = new JPanel();
		entireContentBkg.setBorder(null);
		entireContentBkg.setBackground(new Color(105, 105, 105));
		entireContentBkg.setBounds(0, 0, 881, 605);
		frame.getContentPane().add(entireContentBkg);
		entireContentBkg.setLayout(null);
		
		
		JLabel drinkDisplayed = new JLabel("");
		drinkDisplayed.setBounds(585, 378, 245, 175);
		entireContentBkg.add(drinkDisplayed);
		drinkDisplayed.setIcon(null);
		
		JLabel foodDisplayed = new JLabel("");
		foodDisplayed.setIcon(null);
		foodDisplayed.setBounds(585, 135, 245, 175);
		entireContentBkg.add(foodDisplayed);
		
		
		//JButton to clear out the input from the form.
		// Perform event action to the clear button.
		JButton clear = new JButton("Clear");
		clear.setBounds(347, 307, 160, 29);
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderNumber.setText("");
				name.setText("");
				phone.setText("");
				email.setText("");
				foodKind.setSelectedIndex(-1);
				beverageKind.setSelectedIndex(-1);
				commentingArea.setText("");
			}
		});
		contentBkg.add(clear);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setBounds(82, 422, 74, 14);
		lblNote.setForeground(Color.WHITE);
		lblNote.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentBkg.add(lblNote);
		DefaultTableModel model = new DefaultTableModel();
		Object[] column = { "Order", "Name", "Phone", "Email", "Food", "Beverage", "Note"  };
		
		//State row number count
		final Object[] row = new Object[7];
		model.setColumnIdentifiers(column);

		JButton Add = new JButton("Add");
		Add.setBounds(80, 267, 166, 29);
		Add.setFont(new Font("Tahoma", Font.BOLD, 14));
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(foodKind.getSelectedObjects().toString());
				if (orderNumber.getText().equals("") || name.getText().equals("") || phone.getText().equals("")
						|| email.getText().equals("") || foodKind.getSelectedIndex() == -1 || beverageKind.getSelectedIndex() == -1 || commentingArea.getText().equals(""))
				
				{
					JOptionPane.showMessageDialog(null, "Please fill complete information first to add.");
				} 
				
				else {

					row[0] = orderNumber.getText();
					row[1] = name.getText();
					row[2] = phone.getText();
					row[3] = email.getText();
					row[4] = foodKind.getSelectedItem();
					row[5] = beverageKind.getSelectedItem();
					row[6] = commentingArea.getText();
					model.addRow(row);

					orderNumber.setText("");
					name.setText("");
					phone.setText("");
					email.setText("");
					foodKind.setSelectedItem("");
					beverageKind.setSelectedItem("");
					commentingArea.setText("");
					
					JOptionPane.showMessageDialog(null, "Saved Successfully!");
				}

			}
		});
		contentBkg.add(Add);
		
		//Method to Update the Existing.
		JButton update = new JButton("Update");
		update.setBounds(347, 267, 160, 29);
		update.setFont(new Font("Tahoma", Font.BOLD, 14));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int willBeDeleted = table.getSelectedRow();
				
				if (willBeDeleted >= 0) 
				{
					model.setValueAt(orderNumber.getText(), willBeDeleted, 0);
					model.setValueAt(name.getText(), willBeDeleted, 1);
					model.setValueAt(phone.getText(), willBeDeleted, 2);
					model.setValueAt(email.getText(), willBeDeleted, 3);
					model.setValueAt(foodKind.getSelectedItem(), willBeDeleted, 4);
					model.setValueAt(beverageKind.getSelectedItem(), willBeDeleted, 5);
					model.setValueAt(commentingArea.getText(), willBeDeleted, 6);

					JOptionPane.showMessageDialog(null, "Updated Successfully!");
				} 
				
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first to update.");
				}
			}
		});
		contentBkg.add(update);
		
		//Delete the input order column and row
		JButton delete = new JButton("Delete");
		delete.setBounds(80, 307, 166, 29);
		delete.setFont(new Font("Tahoma", Font.BOLD, 14));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int willBeDeleted = table.getSelectedRow();
				if (willBeDeleted >= 0) {
					model.removeRow(willBeDeleted);
					JOptionPane.showMessageDialog(null, "Deleted Successfully!");
				} else {
					JOptionPane.showMessageDialog(null, "Please select a row first to delete.");
				}

			}
		});
		contentBkg.add(delete);
		
		JLabel lblRecord = new JLabel("Record");
		lblRecord.setBounds(80, 495, 74, 14);
		lblRecord.setForeground(Color.WHITE);
		lblRecord.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentBkg.add(lblRecord);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(80, 520, 427, 74);
		contentBkg.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
