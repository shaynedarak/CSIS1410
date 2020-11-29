import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setPreferredSize(new Dimension(3300, 2550));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:Images\\Logo.PNG"));
		setBackground(new Color(160, 82, 45));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1090, 788);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setForeground(new Color(128, 128, 0));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(153, 153, 51));
		panel.setBounds(0, 0, 369, 759);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Food Order");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(24, 11, 321, 72);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(204, 204, 204));
		textField.setBorder(null);
		textField.setBounds(34, 119, 311, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(34, 94, 311, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(211, 211, 211));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(34, 183, 311, 33);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone");
		lblNewLabel_1_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(34, 158, 311, 14);
		panel.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(211, 211, 211));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(34, 252, 311, 33);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setForeground(new Color(230, 230, 250));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(34, 227, 311, 14);
		panel.add(lblNewLabel_1_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(211, 211, 211));
		textPane.setBorder(null);
		textPane.setBounds(34, 638, 311, 72);
		panel.add(textPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(34, 390, 311, 189);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setForeground(new Color(255, 255, 255));
		list.setFont(new Font("Tahoma", Font.BOLD, 14));
		list.setBackground(new Color(153, 153, 51));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JButton btnNewButton_1 = new JButton("Foods");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				DefaultListModel food = new DefaultListModel();
				food.addElement("1. Pho");
				food.addElement("2. Fried rice");
				food.addElement("3. Fried chicken");
				food.addElement("4. Egg roll");
				list.setModel(food);
				
			}
		});
		btnNewButton_1.setBounds(239, 303, 106, 33);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Drink");
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultListModel drink = new DefaultListModel();
				drink.addElement("1. Water");
				drink.addElement("2. Tea");
				drink.addElement("3. Orange juice");
				drink.addElement("4. Pepsi");
				list.setModel(drink);
			}
		});
		btnNewButton_1_1.setBounds(239, 346, 106, 33);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Version 1.0");
		lblNewLabel_2.setBounds(279, 721, 66, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Note");
		lblNewLabel_1_3.setForeground(new Color(230, 230, 250));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(34, 613, 311, 14);
		panel.add(lblNewLabel_1_3);
		
		JButton btnNewButton_1_2 = new JButton("Enter");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBounds(34, 302, 106, 33);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Reset");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_3.setForeground(Color.BLACK);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBounds(34, 346, 106, 33);
		panel.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\chane\\eclipse-workspace\\MyProject\\Images\\pho.png"));
		lblNewLabel_3.setBounds(81, 181, 572, 343);
		contentPane.add(lblNewLabel_3);
	
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
