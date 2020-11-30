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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DataEntry {

	private JFrame frame;
	private JTextField orderNumber;
	private JTable table;
	DefaultTableModel model;
	private JTextField name;
	private JTextField phone;
	private JTextField email;
	//private JTextField food;
	//private JTextField beverage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataEntry window = new DataEntry();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DataEntry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1092, 799);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel lightGreenbkg = new JPanel();
		lightGreenbkg.setBackground(new Color(128, 128, 0));
		lightGreenbkg.setBounds(0, 0, 602, 725);
		frame.getContentPane().add(lightGreenbkg);
		lightGreenbkg.setLayout(null);

		JLabel textID = new JLabel("Order#:");
		textID.setFont(new Font("Tahoma", Font.BOLD, 14));
		textID.setForeground(new Color(255, 255, 255));
		textID.setBounds(64, 112, 74, 14);
		lightGreenbkg.add(textID);

		JLabel textName = new JLabel("Name:");
		textName.setFont(new Font("Tahoma", Font.BOLD, 14));
		textName.setForeground(new Color(255, 255, 255));
		textName.setBounds(64, 161, 74, 14);
		lightGreenbkg.add(textName);

		JLabel textContact = new JLabel("Phone");
		textContact.setFont(new Font("Tahoma", Font.BOLD, 14));
		textContact.setForeground(new Color(255, 255, 255));
		textContact.setBounds(64, 202, 74, 14);
		lightGreenbkg.add(textContact);

		JLabel textCourse = new JLabel("Email:");
		textCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
		textCourse.setForeground(new Color(255, 255, 255));
		textCourse.setBounds(64, 252, 74, 14);
		lightGreenbkg.add(textCourse);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 585, 582, 140);
		lightGreenbkg.add(scrollPane);

		table = new JTable();
		table.setBorder(null);
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int willBeDeleted = table.getSelectedRow();
				orderNumber.setText(model.getValueAt(willBeDeleted, 0).toString());
				name.setText(model.getValueAt(willBeDeleted, 1).toString());
				phone.setText(model.getValueAt(willBeDeleted, 2).toString());
				email.setText(model.getValueAt(willBeDeleted, 3).toString());
				//food.setText(model.getValueAt(willBeDeleted, 4).toString());
				//beverage.setText(model.getValueAt(willBeDeleted, 5).toString());
			}
		});
		table.setBackground(new Color(169, 169, 169));
		model = new DefaultTableModel();
		Object[] column = { "Order #", "Name", "Phone", "Email", "Food type", "Beverage type"  };
		final Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

		JButton Add = new JButton("Add");
		Add.setFont(new Font("Tahoma", Font.BOLD, 14));
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (orderNumber.getText().equals("") || name.getText().equals("") || phone.getText().equals("")
						|| email.getText().equals("")) //|| food.getText().equals("") || beverage.getText().equals("")) 
				
				{
					JOptionPane.showMessageDialog(null, "Please fill complete information first to add.");
				} 
				
				else {

					row[0] = orderNumber.getText();
					row[1] = name.getText();
					row[2] = phone.getText();
					row[3] = email.getText();
					//row[4] = food.getText();
					//row[5] = beverage.getText();
					model.addRow(row);

					orderNumber.setText("");
					name.setText("");
					phone.setText("");
					email.setText("");
					//food.setText("");
					//beverage.setText("");
					
					JOptionPane.showMessageDialog(null, "Saved Successfully!");
				}

			}
		});
		Add.setBounds(149, 301, 135, 29);
		lightGreenbkg.add(Add);

		JButton update = new JButton("Update");
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
					//model.setValueAt(food.getText(), willBeDeleted, 4);
					//model.setValueAt(beverage.getText(), willBeDeleted, 5);

					JOptionPane.showMessageDialog(null, "Updated Successfully!");
				} 
				
				else {
					JOptionPane.showMessageDialog(null, "Please select a row first to update.");
				}
			}
		});
		update.setBounds(385, 301, 135, 29);
		lightGreenbkg.add(update);

		JButton delete = new JButton("Delete");
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
		delete.setBounds(149, 341, 135, 29);
		lightGreenbkg.add(delete);

		JButton clear = new JButton("Clear");
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderNumber.setText("");
				name.setText("");
				phone.setText("");
				email.setText("");
				//food.setText("");
				//beverage.setText("");

			}
		});
		clear.setBounds(385, 341, 135, 29);
		lightGreenbkg.add(clear);

		JLabel storeName = new JLabel("Asian Cuisine");
		storeName.setHorizontalAlignment(SwingConstants.CENTER);
		storeName.setFont(new Font("Berlin Sans FB", Font.BOLD, 60));
		storeName.setForeground(new Color(255, 255, 255));
		storeName.setBounds(117, 11, 403, 74);
		lightGreenbkg.add(storeName);

		orderNumber = new JTextField();
		orderNumber.setBounds(149, 104, 371, 36);
		lightGreenbkg.add(orderNumber);
		orderNumber.setColumns(10);

		name = new JTextField();
		name.setColumns(10);
		name.setBounds(149, 151, 371, 36);
		lightGreenbkg.add(name);

		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(149, 198, 371, 36);
		lightGreenbkg.add(phone);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(149, 245, 371, 36);
		lightGreenbkg.add(email);

		JComboBox food = new JComboBox();
		food.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				orderNumber.setText("");
				name.setText("");
				phone.setText("");
				email.setText("");
				//food.setSelectedItem("Select food");
				//beverage.setSelectedItem("Select beverage");
			}
		});
		food.setFont(new Font("Tahoma", Font.BOLD, 14));
		food.setModel(new DefaultComboBoxModel(new String[] { "", "Pho", "Egg roll", "Fried rice", "Fried shrimps",
				"Fried chickens", "Beff Jerky (Asian Style)", "Sweet rice", "Papaya Salad",
				"Sweet and sour soup (Seafood, Chicken meat)" }));
		food.setBounds(149, 421, 184, 36);
		lightGreenbkg.add(food);

		JLabel textFood = new JLabel("Food");
		textFood.setForeground(Color.WHITE);
		textFood.setFont(new Font("Tahoma", Font.BOLD, 16));
		textFood.setBounds(149, 396, 114, 14);
		lightGreenbkg.add(textFood);

		JComboBox beverage = new JComboBox();
		beverage.setFont(new Font("Tahoma", Font.BOLD, 14));
		beverage.setModel(new DefaultComboBoxModel(new String[] { "", "Water", "Thai Tea", "Tea", "Pepsi", "Boba" }));
		beverage.setBounds(344, 421, 176, 36);
		lightGreenbkg.add(beverage);

		JLabel textBeverage = new JLabel("Beverage");
		textBeverage.setForeground(Color.WHITE);
		textBeverage.setFont(new Font("Tahoma", Font.BOLD, 16));
		textBeverage.setBounds(344, 396, 114, 14);
		lightGreenbkg.add(textBeverage);

		JPanel greyBackground = new JPanel();
		greyBackground.setBackground(new Color(105, 105, 105));
		greyBackground.setBounds(0, 0, 1086, 725);
		frame.getContentPane().add(greyBackground);
		greyBackground.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chane\\eclipse-workspace\\FinalProject\\images\\pho.png"));
		lblNewLabel.setBounds(277, 105, 529, 383);
		greyBackground.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 0));
		panel.setBounds(0, 725, 1086, 45);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Version: 1.0");
		lblNewLabel_2.setBounds(23, 11, 81, 14);
		lblNewLabel_2.setBackground(new Color(105, 105, 105));
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
	}
}
