package hostelapp.gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GuestGUI {

	private JFrame jFrame;
	private JPanel jPanel;


	private JLabel jlabelFormTitle;
	private JLabel jLabelFooter;

	private JLabel jLabelTitle;
	private JComboBox jComboBoxTitle;

	private JLabel jLabelName;
	private JTextField jTextFieldName;

	private JLabel jLabelLastName;
	private JTextField jTextFieldLastName;

	private JLabel jLabelEmail;
	private JTextField jTextFieldEmail;

	private JLabel jLabelDateOfBirthday;
	private JTextField jTextFieldDateOfBirthday;

	private JLabel jLabelAddress;
	private JTextArea jTextAreaAddress;


	private JLabel jLabelCity;
	private JTextField jTextFieldCity;

	private JLabel jLabelState;
	private JTextField jTextFieldState;

	private JLabel jLabelZipCode;
	private JTextField jTextFieldZipCode;

	private JButton jButtonSave;

	private JLabel invisibleJLabel;


	public GuestGUI() {
		jFrame = new JFrame("Create customer");
		jPanel = new JPanel();

		jlabelFormTitle = new JLabel("Customer Form");
		jlabelFormTitle.setFont(new Font("Helvetica", Font.PLAIN, 18));
		jlabelFormTitle.setHorizontalAlignment(SwingConstants.CENTER);

		jLabelFooter = new JLabel("HostelAPP - Sparkling water hostel - 2020 - All rights reserved");

		jLabelTitle = new JLabel("Title");
		jComboBoxTitle = new JComboBox();
		jComboBoxTitle.addItem("MR.");
		jComboBoxTitle.addItem("MRS.");
		jComboBoxTitle.addItem("MISS.");
		jComboBoxTitle.addItem("MS.");
		jComboBoxTitle.addItem("DR.");

		invisibleJLabel = new JLabel("                                                                                                    ");

		jLabelName = new JLabel("First name");
		jTextFieldName = new JTextField(40);

		jLabelLastName = new JLabel("Last name");
		jTextFieldLastName = new JTextField(40);


		jLabelEmail = new JLabel("Email");
		jTextFieldEmail = new JTextField(40);

		jLabelDateOfBirthday = new JLabel("Date of birthday");
		jTextFieldDateOfBirthday = new JTextField(38);

		jLabelAddress = new JLabel("Address");
		jTextAreaAddress = new JTextArea(3, 44);

		jLabelCity = new JLabel("City");
		jTextFieldCity = new JTextField(40);

		jLabelState = new JLabel("Sate");
		jTextFieldState = new JTextField(2);

		jLabelZipCode = new JLabel("Zip code");
		jTextFieldZipCode = new JTextField(9);


		jButtonSave = new JButton("Save");


	}

	public void buildGUI() {

		jPanel.add(jLabelTitle);
		jPanel.add(jComboBoxTitle);

		jPanel.add(invisibleJLabel);


		jPanel.add(jLabelName);
		jPanel.add(jTextFieldName);

		jPanel.add(jLabelLastName);
		jPanel.add(jTextFieldLastName);

		jPanel.add(jLabelEmail);
		jPanel.add(jTextFieldEmail);

		jPanel.add(jLabelDateOfBirthday);
		jPanel.add(jTextFieldDateOfBirthday);

		jPanel.add(jLabelAddress);
		jPanel.add(jTextAreaAddress);

		jPanel.add(jLabelCity);
		jPanel.add(jTextFieldCity);

		jPanel.add(jLabelState);
		jPanel.add(jTextFieldState);

		jPanel.add(jLabelZipCode);
		jPanel.add(jTextFieldZipCode);

		jPanel.add(jButtonSave);

		jFrame.add(jlabelFormTitle, BorderLayout.NORTH);
		jFrame.add(jPanel, BorderLayout.CENTER );
		jFrame.add(jLabelFooter, BorderLayout.SOUTH);
		jFrame.setSize(600, 400);
		jFrame.setResizable(false);
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		GuestGUI guestGUI = new GuestGUI();
		guestGUI.buildGUI();
	}

}
