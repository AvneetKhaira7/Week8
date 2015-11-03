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
	}
	
	//PRIVATE METHODS +++++++++++++++++++++++++++++++++++
	private void _initialize(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		this._contentPane = new JPanel();
		this._contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this._contentPane);
		
		}

	private void _addUIComponents() {
		// Uses Absolute label
		this._contentPane.setLayout(null);
		
		//Hello Label
		this._helloLabel = new JLabel("New Label");
		this._helloLabel.setBounds(10, 10, 96, 23);
		this._contentPane.add(this._helloLabel);
		
		//Name Label
		this._nameLabel = new JLabel("Enter Name");
		this._nameLabel.setBounds(10, 38, 166, 40);
		this._contentPane.add(this._nameLabel);
		
		//Text Field
		this._nameTextField = new JTextField();
		this._nameTextField.setBounds(79, 48, 86, 20);
		this._contentPane.add(this._nameTextField);
		this._nameTextField.setColumns(10);
	}
}
