import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class RecordTable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordTable frame = new RecordTable();
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
	public RecordTable() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\blackteapot.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(0, 0, 630, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel asian = new JLabel("Asian Cuisine");
		asian.setBackground(new Color(255, 255, 255));
		asian.setBounds(10, 11, 189, 28);
		panel.add(asian);
		asian.setForeground(new Color(255, 255, 255));
		asian.setFont(new Font("Berlin Sans FB", Font.BOLD, 25));
		
		JScrollPane EntryHistory = new JScrollPane();
		EntryHistory.setBounds(10, 50, 610, 330);
		panel.add(EntryHistory);
		
		JTable table = new JTable();
		EntryHistory.setViewportView(table);
		
	}
	public void setVisible() {
		this.setVisible(true);
	}
	

}
