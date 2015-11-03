import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ExampleWindow extends JFrame {

	//PRIVATE INSTANCE VARIABLES +++++++++++++++++++++++++++++++++
	private JPanel _contentPane; 
	private JLabel _helloLabel;
	private JTextField _nameTextField;
	private JLabel _nameLabel;
	private NameTextFieldHandler _nameTextfieldHandler;
	

	//PUBLIC PROPERTIES ++++++++++++++++++++++++
	public JLabel getHelloLabel() {
		return this._helloLabel;
	}

	public void setHelloLabel(JLabel helloLabel) {
		this._helloLabel = helloLabel;
	}

	//CONSTRUCTOR ----------------------------
	public ExampleWindow() {
		this._initialize();
		this._addUIComponents();
		this._nameTextfieldHandler = new NameTextFieldHandler();
		this._nameTextField.addActionListener(this._nameTextfieldHandler);
	}
	
	//PRIVATE METHODS +++++++++++++++++++++++++++++++++++
	private void _initialize(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		this._contentPane = new JPanel();
		this._contentPane.setBackground(new Color(250, 250, 210));
		this._contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this._contentPane);
		
		}
	
	private void _addUIComponents() {
		
		//Absolute Layout
		this._contentPane.setLayout(null);
		
		//Hello Label
		this._helloLabel = new JLabel("New Label");
		this._helloLabel.setBounds(5, 0, 126, 27);
		this._contentPane.add(this._helloLabel);
		
		//Name Label
		this._nameLabel = new JLabel("Enter Name");
		_nameLabel.setBounds(5, 38, 132, 27);
		this._contentPane.add(this._nameLabel);
		
		//Text Field
		this._nameTextField = new JTextField();
		_nameTextField.setBounds(125, 38, 117, 27);
		this._contentPane.add(this._nameTextField);
		this._nameTextField.setColumns(10);
	}
}
