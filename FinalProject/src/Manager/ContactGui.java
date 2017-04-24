package Manager;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;

public class ContactGui extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldFirstName;
	private JTextField txtFieldLastName;
	private JTextField textFieldAddress;
	private JTextField textFieldCity;
	private JTextField textFieldST;
	private JTextField textFieldZipCode;
	private JTextField textFieldHomePhone;
	private JTextField textFieldMobile;
	private JTextField textFieldBirthday;
	private JTextField textField;
	private JTextField textFieldWorkPhone;
	private JTextField textFieldCompany;
	private JTextField textFieldEmail;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					ContactGui frame = new ContactGui();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ContactGui()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 359);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);

		JSeparator separator = new JSeparator();
		mnFile.add(separator);

		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);

		JMenuItem mntmSaveAs = new JMenuItem("Save as");
		mnFile.add(mntmSaveAs);

		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);

		JMenu mnLookAndFeel = new JMenu("Look and Feel");
		mnSettings.add(mnLookAndFeel);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmJavadoc = new JMenuItem("JavaDoc");
		mnHelp.add(mntmJavadoc);

		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtFieldFirstName = new JTextField();
		txtFieldFirstName.setBounds(200, 28, 86, 20);
		contentPane.add(txtFieldFirstName);
		txtFieldFirstName.setColumns(10);

		txtFieldLastName = new JTextField();
		txtFieldLastName.setBounds(297, 28, 128, 20);
		txtFieldLastName.setColumns(10);
		contentPane.add(txtFieldLastName);

		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(200, 77, 225, 20);
		textFieldAddress.setColumns(10);
		contentPane.add(textFieldAddress);

		textFieldCity = new JTextField();
		textFieldCity.setBounds(199, 118, 111, 20);
		textFieldCity.setColumns(10);
		contentPane.add(textFieldCity);

		textFieldST = new JTextField();
		textFieldST.setBounds(320, 118, 26, 20);
		textFieldST.setColumns(10);
		contentPane.add(textFieldST);

		textFieldZipCode = new JTextField();
		textFieldZipCode.setBounds(357, 118, 68, 20);
		textFieldZipCode.setColumns(10);
		contentPane.add(textFieldZipCode);

		textFieldHomePhone = new JTextField();
		textFieldHomePhone.setBounds(200, 158, 111, 20);
		textFieldHomePhone.setColumns(10);
		contentPane.add(textFieldHomePhone);

		textFieldMobile = new JTextField();
		textFieldMobile.setBounds(320, 158, 104, 20);
		textFieldMobile.setColumns(10);
		contentPane.add(textFieldMobile);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(200, 11, 74, 14);
		contentPane.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(297, 11, 74, 14);
		contentPane.add(lblLastName);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(200, 55, 74, 14);
		contentPane.add(lblAddress);

		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(200, 99, 74, 14);
		contentPane.add(lblCity);

		JLabel lblSt = new JLabel("ST");
		lblSt.setBounds(320, 99, 26, 14);
		contentPane.add(lblSt);

		JLabel lblZipcode = new JLabel("Zipcode");
		lblZipcode.setBounds(356, 99, 59, 14);
		contentPane.add(lblZipcode);

		JLabel lblHomePhone = new JLabel("Home Phone");
		lblHomePhone.setBounds(200, 143, 74, 14);
		contentPane.add(lblHomePhone);

		JLabel lblMobilePhone = new JLabel("Mobile Phone");
		lblMobilePhone.setBounds(321, 143, 104, 14);
		contentPane.add(lblMobilePhone);

		Button bttnNew = new Button("New");
		bttnNew.setBounds(200, 184, 70, 22);
		contentPane.add(bttnNew);

		Button bttnAdd = new Button("Add");
		bttnAdd.setBounds(276, 184, 70, 22);
		contentPane.add(bttnAdd);

		Button bttnDelete = new Button("Delete");
		bttnDelete.setBounds(352, 184, 73, 22);
		contentPane.add(bttnDelete);

		Button bttnUpdate = new Button("Update");
		bttnUpdate.setBounds(320, 209, 70, 22);
		contentPane.add(bttnUpdate);

		Button bttnSave = new Button("Save");
		bttnSave.setBounds(240, 209, 70, 22);
		contentPane.add(bttnSave);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 28, 180, 20);
		contentPane.add(comboBox);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		tabbedPane.setBounds(10, 55, 180, 174);
		contentPane.add(tabbedPane);

		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Family", null, layeredPane, null);

		JComboBox comboBox_Relationship = new JComboBox();
		comboBox_Relationship.setBounds(10, 22, 154, 20);
		layeredPane.add(comboBox_Relationship);

		JLabel lblRelationship = new JLabel("Relationship");
		lblRelationship.setBounds(10, 0, 100, 20);
		layeredPane.add(lblRelationship);

		textFieldBirthday = new JTextField();
		textFieldBirthday.setBounds(10, 73, 154, 20);
		layeredPane.add(textFieldBirthday);
		textFieldBirthday.setColumns(10);

		JLabel lblBirthday = new JLabel("Birthday (mm/dd/yyyy)");
		lblBirthday.setBounds(10, 53, 129, 20);
		layeredPane.add(lblBirthday);

		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Friends", null, layeredPane_1, null);

		textField = new JTextField();
		textField.setBounds(0, 28, 174, 76);
		layeredPane_1.add(textField);
		textField.setColumns(10);

		JLabel lblNotes = new JLabel("Notes");
		lblNotes.setBounds(10, 11, 46, 14);
		layeredPane_1.add(lblNotes);

		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane.addTab("Business", null, layeredPane_2, null);

		textFieldWorkPhone = new JTextField();
		textFieldWorkPhone.setBounds(10, 63, 154, 20);
		layeredPane_2.add(textFieldWorkPhone);
		textFieldWorkPhone.setColumns(10);

		textFieldCompany = new JTextField();
		textFieldCompany.setColumns(10);
		textFieldCompany.setBounds(10, 25, 155, 20);
		layeredPane_2.add(textFieldCompany);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(10, 97, 154, 20);
		layeredPane_2.add(textFieldEmail);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 84, 46, 14);
		layeredPane_2.add(lblEmail);

		JLabel lblCompany = new JLabel("Company");
		lblCompany.setBounds(10, 11, 74, 14);
		layeredPane_2.add(lblCompany);

		JLabel lblWorkPhone = new JLabel("Work Phone");
		lblWorkPhone.setBounds(10, 50, 74, 14);
		layeredPane_2.add(lblWorkPhone);
	}

	private static void addPopup(Component component, final JPopupMenu popup)
	{
		component.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				if (e.isPopupTrigger())
				{
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e)
			{
				if (e.isPopupTrigger())
				{
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e)
			{
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}