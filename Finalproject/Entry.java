
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
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.table.TableModel;

public class Entry {
	 // Create the application.
	public Entry() {
		initialize();
	}
	
	//Initialize Contents of the frame.
	private void initialize() {
		
		// JFrame decoration
		JFrame frame = new JFrame(); 
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		 // JPanel Content background decoration.
		JPanel contentBkg = new JPanel();
		contentBkg.setBackground(new Color(102, 102, 102));
		contentBkg.setBounds(0, 0, 245, 444);
		frame.getContentPane().add(contentBkg);
		contentBkg.setLayout(null);
		
		// JLabel for Order number decoration
		JLabel textID = new JLabel("Order#"); 
		textID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textID.setForeground(new Color(255, 255, 255));
		textID.setBounds(10, 49, 48, 14);
		contentBkg.add(textID);
		
		// JLabel for name decoration
		JLabel textName = new JLabel("Name"); 
		textName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textName.setForeground(new Color(255, 255, 255));
		textName.setBounds(10, 98, 48, 14);
		contentBkg.add(textName);
		
		// JLabel for Phone number decoration
		JLabel textContact = new JLabel("Phone"); 
		textContact.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textContact.setForeground(new Color(255, 255, 255));
		textContact.setBounds(10, 139, 48, 14);
		contentBkg.add(textContact);
		
		// JLabel for Email decoration
		JLabel textCourse = new JLabel("Email"); 
		textCourse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textCourse.setForeground(new Color(255, 255, 255));
		textCourse.setBounds(10, 189, 48, 14);
		contentBkg.add(textCourse);
		
		// JLabel for store name decoration
		JLabel storeName = new JLabel("Asian Cuisine"); 
		storeName.setHorizontalAlignment(SwingConstants.CENTER);
		storeName.setFont(new Font("Berlin Sans FB", Font.BOLD, 25));
		storeName.setForeground(new Color(255, 255, 255));
		storeName.setBounds(39, 8, 190, 36);
		contentBkg.add(storeName);
		
		// JTextField for order number decoration
		JTextField orderNumber = new JTextField(); 
		orderNumber.setBounds(56, 49, 171, 30);
		contentBkg.add(orderNumber);
		orderNumber.setColumns(10);
		
		// JTextField for name decoration
		JTextField name = new JTextField();
		name.setColumns(10);
		name.setBounds(56, 90, 171, 30);
		contentBkg.add(name);
		
		// JTextField for phone number decoration
		JTextField phone = new JTextField();
		phone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner phoneFormat = new Scanner (System.in);
				long phoneNumber;
				long areaCode;
				long preFix;
				long lineNumber;
				
				phoneNumber = phoneFormat.nextLong();
				
				areaCode = phoneNumber / 10000000;
				preFix = (phoneNumber / 10000) % 1000;
				lineNumber = phoneNumber % 10000;
				
				System.out.println("(" + areaCode + ")" + " " + preFix + "-" +lineNumber);
				
			}
		});
		phone.setColumns(10);
		phone.setBounds(56, 137, 171, 30);
		contentBkg.add(phone);
		
		// JTextField for email decoration
		JTextField email = new JTextField();
		email.setColumns(10);
		email.setBounds(56, 184, 171, 30);
		contentBkg.add(email);
		
		// JTextField for Note decoration
		JTextArea commentingArea = new JTextArea();
		commentingArea.setBounds(56, 375, 171, 55);
		contentBkg.add(commentingArea);
		
		//JPanel for entirely content background decoration.
		JPanel entireContentBkg = new JPanel();
		entireContentBkg.setBorder(null);
		entireContentBkg.setBackground(new Color(51, 51, 51));
		entireContentBkg.setBounds(0, 0, 784, 471);
		frame.getContentPane().add(entireContentBkg);
		entireContentBkg.setLayout(null);
		

		JPanel panel = new JPanel();
		panel.setBounds(0, 445, 784, 27);
		entireContentBkg.add(panel);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		// JLabel for Software version 1.0
		JLabel softwareVersion = new JLabel("Version: 1.0"); 
		softwareVersion.setBounds(59, 5, 81, 14);
		panel.add(softwareVersion);
		softwareVersion.setBackground(new Color(105, 105, 105));
		softwareVersion.setForeground(new Color(105, 105, 105));
		
		//JScrollPanel for spreadsheet.
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(255, 11, 516, 178);
		entireContentBkg.add(scrollPane);
		
		//JLabel for record table decoration.
		JTable table = new JTable();
		table.setBorder(null);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		DefaultTableModel model = new DefaultTableModel();
		Object[] column = { "Order", "Name", "Phone", "Email", "Food", "Beverage", "Note"  };

		String imagesDirectory = System.getProperty("user.dir") + "\\FinalProject\\images\\";
		JLabel lblFoodLabel = new JLabel("");
		lblFoodLabel.setBounds(284, 252, 218, 159);
		entireContentBkg.add(lblFoodLabel);

		JLabel lblBeverageLabel = new JLabel("");
		lblBeverageLabel.setBounds(535, 252, 218, 159);
		entireContentBkg.add(lblBeverageLabel);

		// JComboBox for Food drop down menu.
		JComboBox food = new JComboBox();

		food.setFont(new Font("Tahoma", Font.BOLD, 14));
		food.setModel(new DefaultComboBoxModel(new String[]
				{	"Pho", "Fried rice"
				}));
		food.setSelectedIndex(-1);
		food.setBounds(56, 319, 74, 30);
		food.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (food.getSelectedItem().equals("Select Here"))
				{
					lblFoodLabel.setIcon(null);
				}
				else if (food.getSelectedItem().equals("Pho"))
				{
					ImageIcon picture = new ImageIcon(imagesDirectory + "pho.png");
					lblFoodLabel.setIcon(picture);
				}

				else if (food.getSelectedItem().equals("Fried rice"))
				{
					ImageIcon picture1 = new ImageIcon(imagesDirectory + "friedrice.png");
					lblFoodLabel.setIcon(picture1);
				}
			}
		});
		contentBkg.add(food);

		// JLabel for food decoration
		JLabel textFood = new JLabel("Food");
		textFood.setForeground(Color.WHITE);
		textFood.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFood.setBounds(56, 302, 47, 14);
		contentBkg.add(textFood);

		//JComboBox for Beverage drop down menu.
		JComboBox beverage = new JComboBox();
		beverage.setFont(new Font("Tahoma", Font.BOLD, 14));
		beverage.setModel(new DefaultComboBoxModel(new String[]
				{
						"Coffee", "Green tea"
				}));
		beverage.setSelectedIndex(-1);
		beverage.setBounds(153, 319, 74, 30);
		beverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (beverage.getSelectedItem().equals("Select Here"))
				{
					lblBeverageLabel.setIcon(null);
				}
				else if (beverage.getSelectedItem().equals("Green tea"))
				{
					ImageIcon picture = new ImageIcon(imagesDirectory + "teapot.png");
					lblBeverageLabel.setIcon(picture);
				}

				else if (beverage.getSelectedItem().equals("Coffee"))
				{
					ImageIcon picture1 = new ImageIcon(imagesDirectory + "coffeecup.png");
					lblBeverageLabel.setIcon(picture1);
				}
			}
		});
		contentBkg.add(beverage);

		//JLable for Beverage decoration.
		JLabel textBeverage = new JLabel("Beverage");
		textBeverage.setForeground(Color.WHITE);
		textBeverage.setFont(new Font("Tahoma", Font.BOLD, 12));
		textBeverage.setBounds(153, 300, 74, 19);
		contentBkg.add(textBeverage);

		// Stated row number count
		final Object[] row = new Object[7];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

		table.addMouseListener(new MouseAdapter() {
			// Methods to select items to deleted Selected Table Items.
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = table.getSelectedRow();
				if (selectedRow >= 0) {
					String order = model.getValueAt(selectedRow, 0).toString();
					orderNumber.setText(order);
					name.setText(model.getValueAt(selectedRow, 1).toString());
					phone.setText(model.getValueAt(selectedRow, 2).toString());
					email.setText(model.getValueAt(selectedRow, 3).toString());
					food.setSelectedItem(model.getValueAt(selectedRow, 4).toString());
					beverage.setSelectedItem(model.getValueAt(selectedRow, 5).toString());
					commentingArea.setText(model.getValueAt(selectedRow, 6).toString());
				}
			}
		});
		
		JLabel textFood_1 = new JLabel("Food");
		textFood_1.setForeground(Color.WHITE);
		textFood_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFood_1.setBounds(387, 409, 47, 14);
		entireContentBkg.add(textFood_1);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setForeground(Color.WHITE);
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrink.setBounds(645, 409, 47, 14);
		entireContentBkg.add(lblDrink);
		
		
		// JButton to clear out the input from the form.
		// Also Perform event action to the clear button.
		JButton clear = new JButton("Clear");
		clear.setFont(new Font("Tahoma", Font.BOLD, 10));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderNumber.setText("");
				name.setText("");
				phone.setText("");
				email.setText("");
				food.setSelectedIndex(-1);
				beverage.setSelectedIndex(-1);
				commentingArea.setText("");
			}
		});
		clear.setBounds(153, 225, 74, 29);
		contentBkg.add(clear);
		
		//JLabel for Note decoration.
		JLabel lblNote = new JLabel("Note");
		lblNote.setForeground(Color.WHITE);
		lblNote.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNote.setBounds(56, 356, 56, 14);
		contentBkg.add(lblNote);

		JButton btnLoadRecord = new JButton("Load Record");
		btnLoadRecord.setBounds(255, 200, 102, 27);
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// open the file
				File fileName = null;
				try {
					fileName = new File(System.getProperty("user.dir") + "\\FinalProject\\RecordData.csv");
					if (fileName.exists()) {
						BufferedReader br = null;
						String line = "";
						String csvSplitBy = ",";

						br = new BufferedReader(new FileReader(fileName));
						while ((line = br.readLine()) != null) {
							if (line.startsWith("#")) { // comment starts with #
								continue;
							}
							String[] orderRecord = line.split(csvSplitBy);
							if (orderRecord.length == 7) {
								row[0] = orderRecord[0];
								row[1] = orderRecord[1];
								row[2] = orderRecord[2];
								row[3] = orderRecord[3];
								row[4] = orderRecord[4];
								row[5] = orderRecord[5];
								row[6] = orderRecord[6];
								model.addRow(row);
							}
						}
						br.close();
						fileName = null;
					}
				} catch(FileNotFoundException notFoundException) {
					JOptionPane.showMessageDialog(null, "The file " + fileName.getName() + " was not found");
				} catch (IOException ioException) {
					JOptionPane.showMessageDialog(null, ioException.getMessage());
				}
			}
		});
		btnLoadRecord.setFont(new Font("Tahoma", Font.BOLD, 10));
		entireContentBkg.add(btnLoadRecord);
		
		// JButton for Add decoration and Action perform to it.
		JButton Add = new JButton("Add");
		Add.setFont(new Font("Tahoma", Font.BOLD, 10));
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (orderNumber.getText().equals("") || name.getText().equals("") 
						|| phone.getText().equals("") || email.getText().equals("") 
						|| food.getSelectedIndex() == -1 || beverage.getSelectedIndex() == -1 
						|| commentingArea.getText().equals(""))
				
				{
					// Message inform user to put data in completely to be able to add.
					JOptionPane.showMessageDialog(null, "Please fill complete information first to add.");
				} 
				
				// State when user input information, then input them in table row.
				else {
					row[0] = orderNumber.getText();
					row[1] = name.getText();
					row[2] = phone.getText();
					row[3] = email.getText();
					row[4] = food.getSelectedItem();
					row[5] = beverage.getSelectedItem();
					row[6] = commentingArea.getText();
					model.addRow(row);

					orderNumber.setText("");
					name.setText("");
					phone.setText("");
					email.setText("");
					food.setSelectedItem("");
					beverage.setSelectedItem("");
					commentingArea.setText("");
					
					// Inform user the input is completed and saved.
					JOptionPane.showMessageDialog(null, "Saved Successfully!");
				}

			}
		});
		Add.setBounds(56, 225, 74, 29);
		contentBkg.add(Add);
		
		//Method to Update the existing input information.
		JButton update = new JButton("Update");
		update.setFont(new Font("Tahoma", Font.BOLD, 10));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int rowToUpdate = table.getSelectedRow();
				if (rowToUpdate >= 0)
				{
					model.setValueAt(orderNumber.getText(), rowToUpdate, 0);
					model.setValueAt(name.getText(), rowToUpdate, 1);
					model.setValueAt(phone.getText(), rowToUpdate, 2);
					model.setValueAt(email.getText(), rowToUpdate, 3);
					model.setValueAt(food.getSelectedItem(), rowToUpdate, 4);
					model.setValueAt(beverage.getSelectedItem(), rowToUpdate, 5);
					model.setValueAt(commentingArea.getText(), rowToUpdate, 6);
					
					// Inform user the update is successful.
					JOptionPane.showMessageDialog(null, "Updated Successfully!");
				} 
				
				// Inform user to select a table row to be able to update.
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first to update.");
				}
			}
		});
		update.setBounds(56, 265, 74, 29);
		contentBkg.add(update);
		
		//Delete the input from the table.
		JButton delete = new JButton("Delete");
		delete.setFont(new Font("Tahoma", Font.BOLD, 10));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int willBeDeleted = table.getSelectedRow();
				if (willBeDeleted >= 0) {
					model.removeRow(willBeDeleted);
					
					// Inform user the Delete is successful.
					JOptionPane.showMessageDialog(null, "Deleted Successfully!");
					
					// Inform user to select a table row to be able to delete.
				} else {
					JOptionPane.showMessageDialog(null, "Please select a row first to delete.");
				}

			}
		});
		delete.setBounds(153, 265, 74, 29);
		contentBkg.add(delete);

	}
} 
