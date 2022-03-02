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
		setBounds(100, 100, 1184, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 35, 1126, 339);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		List<StudentDetail> students = LoginData.getStudents(configContext);
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		//int columns=5;
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
