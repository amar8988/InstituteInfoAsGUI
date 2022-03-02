package com.kush.coaching.gui;

import java.awt.EventQueue;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.springframework.context.ConfigurableApplicationContext;

import com.kush.coaching.entity.StudentDetail;
import com.kush.coaching.service.LoginData;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;

public class HomeFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private static ConfigurableApplicationContext configContext;

	public static void studListFrame(ConfigurableApplicationContext context) {
		configContext=context;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1184, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 35, 1126, 339);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(187, 432, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Detail");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(360, 432, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Leave");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(530, 432, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Left");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(728, 432, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Payments");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBounds(903, 432, 112, 21);
		contentPane.add(btnNewButton_4);
		
		List<StudentDetail> students = LoginData.getStudents(configContext);
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		Vector<String> colNames = new Vector<>();
		colNames.add("Name");
		colNames.add("Joining_date");
		colNames.add("Starting_date");
		colNames.add("Course");
		colNames.add("Batch");
		
		model.setColumnIdentifiers(colNames);
		
		for(StudentDetail student : students) {
			String[] row = {student.getStudentName(),student.getJoiningDate().toString(),student.getStartingDate().toString(),
							student.getCourse(),student.getBatch()};
			model.addRow(row);
		}
	}
}
