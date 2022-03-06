package com.kush.coaching.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.context.ConfigurableApplicationContext;

import com.kush.coaching.entity.StudentDetail;
import com.kush.coaching.service.LoginData;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class NewFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private static ConfigurableApplicationContext configContext;

	public static void register(ConfigurableApplicationContext context) {
		configContext=context;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewFrame frame = new NewFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public NewFrame() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 28, 61, 18);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Father's name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 58, 127, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(126, 30, 204, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 57, 204, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contact no.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 87, 99, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 86, 204, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Joining dt.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 110, 89, 27);
		contentPane.add(lblNewLabel_3);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(126, 118, 108, 19);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_4 = new JLabel("Starting dt.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 134, 99, 27);
		contentPane.add(lblNewLabel_4);

		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(126, 142, 108, 19);
		contentPane.add(dateChooser_1);
		
		JLabel lblNewLabel_5 = new JLabel("Course");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 168, 61, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(126, 167, 193, 18);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Batch");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 191, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(126, 195, 193, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDetail studentDetail = new StudentDetail();
				
				studentDetail.setStudentName(textField.getText());
				studentDetail.setFatherName(textField_1.getText());
				studentDetail.setJoiningDate(new SimpleDateFormat("dd-MM-yyyy").format(dateChooser.getDate()));
				studentDetail.setStartingDate(new SimpleDateFormat("dd-MM-yyyy").format(dateChooser_1.getDate()));
				studentDetail.setContactNumber(textField_2.getText());
				studentDetail.setCourse(textField_3.getText());
				studentDetail.setBatch(textField_4.getText());
				studentDetail.setStatus("continue");
				
				System.out.println(studentDetail);
				LoginData.saveStudent(studentDetail, configContext);
				
				JOptionPane.showMessageDialog(null, "Student registered successfully!!!");				
				
				setVisible(false);
				HomeFrame.studListFrame(configContext);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(42, 266, 95, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HomeFrame.studListFrame(configContext);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(190, 266, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
