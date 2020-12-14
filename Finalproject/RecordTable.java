import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;

public class RecordTable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public RecordTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 630, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel asian = new JLabel("Asian Cuisine");
		asian.setBounds(20, 15, 148, 37);
		panel.add(asian);
		asian.setForeground(UIManager.getColor("Button.background"));
		asian.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 63, 588, 303);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
