package hostelapp.gui;

import javax.swing.*;
import java.awt.*;

public class GuestGUI {
	private JFrame jFrame;
	private JPanel jPanel;

	private JLabel jlabelFormTitle;
	private JLabel jLabelFooter;

	private JLabel jLabelName;
	private JTextField jTextFieldName;

	public GuestGUI() {
		jFrame = new JFrame("Create Guest");
		jPanel = new JPanel();

		jlabelFormTitle = new JLabel("Guest Form");
		jLabelFooter = new JLabel("HostelAPP - Sparkling water hostel - 2024 - All rights reserved");

		jLabelName = new JLabel("First name");
		jTextFieldName = new JTextField(40);
    }

	public void buildGUI() {
		jPanel.add(jlabelFormTitle);
		jPanel.add(jLabelName);
		jPanel.add(jTextFieldName);

		jFrame.add(jlabelFormTitle, BorderLayout.NORTH);
		jFrame.add(jLabelFooter, BorderLayout.SOUTH);
		jFrame.add(jPanel, BorderLayout.CENTER);

		jFrame.setSize(600, 400);
		jFrame.setResizable(false);
		jFrame.setVisible(true);
	}
	
	 public static void main(String[] args) {
		 GuestGUI guestGUI = new GuestGUI();
		 guestGUI.buildGUI();
	}
}
